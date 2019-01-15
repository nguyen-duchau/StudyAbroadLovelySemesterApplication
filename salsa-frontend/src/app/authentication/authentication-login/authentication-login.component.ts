import {Component, OnInit} from '@angular/core';
import {Router} from '@angular/router';
import {FormBuilder, FormGroup, Validators} from "@angular/forms";
import {Account} from "../../salsa-model/account.model";
import {UserService} from "../../salsa-service/user.service";
import {Student} from "../../salsa-model/student.model";

@Component({
    selector: 'salsa-login',
    templateUrl: './authentication-login.component.html',
    styleUrls: ['./authentication-login.component.scss'],
})
export class AuthenticationLoginComponent implements OnInit {

    constructor(
        private router: Router,
        private formBuilder: FormBuilder,
        private userService: UserService
    ) { }

    loginForm: FormGroup;
    showSpinner = false;

    ngOnInit() {
        this.buildForm();
    }

    buildForm() {
        this.loginForm = this.formBuilder.group({
            'username': ['',
                [
                    Validators.required
                ]
            ],
            'password': ['',
                [
                    Validators.required
                ]
            ],
        });
    }

    login(): void {

        this.userService.login(new Student(
            this.loginForm.value['username'],
            this.loginForm.value['password']
        ));
    }

}
