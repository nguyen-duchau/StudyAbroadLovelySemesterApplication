import {Injectable} from '@angular/core';
import {University} from "../salsa-model/university.model";
import {Subject} from "rxjs";

@Injectable({
    providedIn: 'root'
})
export class UniversityService {

    private universities: University[] = [
        new University("INSA Toulouse", "address insa", "France"),
        new University("UQAC", "québec", "Canada"),
        new University("YOKO", "Tokyo adress ...", "Japan"),
        new University("Fuck you", "fuck me", "FuckYeah"),
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
