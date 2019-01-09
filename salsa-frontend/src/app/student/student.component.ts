import {Component, OnInit} from '@angular/core';
import {Student} from "../salsa-model/student.model";

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
            "Student username",
            "Student password",
            "Adrien",
            new Date(),
            "5SDBD"
        );
    }

}
