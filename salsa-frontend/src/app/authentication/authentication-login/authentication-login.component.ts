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
        // this.loginForm = this.formBuilder.group({
        //     'username': ['', [
        //         Validators.required
        //     ]
        //     ],
        //     'password': ['', [
        //         Validators.required
        //     ]
        //     ],
        // });
        this.loginForm = this.formBuilder.group(new Account('', ''));
    }

    login(): void {

        // to recover data when submit:
        // const account = new Account(
        //      this.loginForm.value['username'],
        //      this.loginForm.value['password'],
        // );

        let user: Student = this.loginForm.value;
        this.userService.login(user);
        this.router.navigate(['student']);
    }

}
