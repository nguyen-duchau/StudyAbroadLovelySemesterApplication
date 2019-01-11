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
        this.profile_card_flipped = false;
    }

    // Annimation flip
    profile_card_flipped: boolean;
    flip() {
        this.profile_card_flipped = !this.profile_card_flipped;
    }

}
