import {Injectable} from '@angular/core';
import {University} from "../salsa-model/university.model";
import {Subject} from "rxjs";

@Injectable({
    providedIn: 'root'
})
export class UniversityService {

    private lorem_ipsum: string = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aenean at fermentum risus." +
        " Duis et odio lacus. Quisque facilisis massa et vehicula euismod. Pellentesque in metus pellentesque, variu" +
        "s massa non, elementum dolor. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubi" +
        "lia Curae; Nunc eget quam sed velit consequat bibendum. Pellentesque ultrices vehicula nibh, id faucibus lo" +
        "rem mollis at."

    private universities: University[] = [
        new University("INSA Lyon", "address insa", "France",
            this.lorem_ipsum),
        new University("UQAC", "québec", "Canada",
            this.lorem_ipsum),
        new University("YOKO", "Tokyo adress ...", "Japan",
            this.lorem_ipsum),
        new University("Fuck you", "fuck me", "FuckYeah", this.lorem_ipsum),
    ];

    subject = new Subject<University[]>(); // or universitySubject

    constructor() {
    }

    emit() {
        this.subject.next(this.universities.slice());
    }

    add(university: University) {
        this.universities.push(university);
        this.emit();
    }
}
