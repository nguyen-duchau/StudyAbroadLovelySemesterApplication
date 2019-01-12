import {Component, OnInit} from '@angular/core';
import {Student} from "../salsa-model/student.model";
import {Speciality} from "../salsa-model/speciality.model";

@Component({
    selector: 'salsa-student',
    templateUrl: './student.component.html',
    styleUrls: ['./student.component.scss']
})
export class StudentComponent implements OnInit {

    private user : Student;

    constructor() {
    }

    ngOnInit() {
        this.user = new Student(
            "adrien",
            "password",
            "Adrien",
            new Date(),
            new Speciality(5, "SDBD")
        );
    }

}
