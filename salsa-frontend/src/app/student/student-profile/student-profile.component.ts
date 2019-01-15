import {Component, Input, OnDestroy, OnInit} from '@angular/core';
import {Student} from "../../salsa-model/student.model";
import {UserService} from "../../salsa-service/user.service";
import {Subscription} from "rxjs";

@Component({
    selector: 'salsa-student-profile',
    templateUrl: './student-profile.component.html',
    styleUrls: ['./student-profile.component.scss']
})
export class StudentProfileComponent implements OnInit, OnDestroy {

    student : Student;
    userSubscription: Subscription;

    constructor(
        private userService : UserService
    ) { }

    ngOnInit() {

        this.userSubscription = this.userService.userSubject.subscribe(
            (student: Student) => {
                this.student = student;
            }
        );

        this.userService.emitUser();
    }

    ngOnDestroy(): void {
        this.userSubscription.unsubscribe();
    }
}
