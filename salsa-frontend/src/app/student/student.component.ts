import {Component, OnDestroy, OnInit} from '@angular/core';
import {Student} from "../salsa-model/student.model";
import {Subscription} from "rxjs";
import {UserService} from "../salsa-service/user.service";

@Component({
    selector: 'salsa-student',
    templateUrl: './student.component.html',
    styleUrls: ['./student.component.scss']
})
export class StudentComponent implements OnInit {

    constructor() {  }

    ngOnInit() {

    }


}
