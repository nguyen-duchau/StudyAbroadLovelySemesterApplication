import {Component, Input, OnInit} from '@angular/core';
import {Student} from "../../salsa-model/student.model";

@Component({
    selector: 'salsa-student-profile',
    templateUrl: './student-profile.component.html',
    styleUrls: ['./student-profile.component.scss']
})
export class StudentProfileComponent implements OnInit {

    @Input() student: Student;

    constructor() {
    }

    ngOnInit() {
    }

}
