import {Component, OnInit} from '@angular/core';
import {Router} from '@angular/router';
import {FormBuilder, FormGroup, Validators} from "@angular/forms";

@Component({
    selector: 'salsa-login',
    templateUrl: './authentication-login.component.html',
    styleUrls: ['./authentication-login.component.scss']
})
export class AuthenticationLoginComponent implements OnInit {

    constructor(
        private router: Router,
        private formBuilder: FormBuilder
    ) { }

    loginForm: FormGroup;
    showSpinner = false;

    ngOnInit() {
        this.buildForm();
    }

    buildForm() {
        this.loginForm = this.formBuilder.group({
            'username': ['', [
                Validators.required
            ]
            ],
            'password': ['', [
                Validators.required
            ]
            ],
        });
    }

    login(): void {

        // to recover data when submit:
        // const account = new Account(
        //      this.loginForm.value['username'],
        //      this.loginForm.value['password'],
        // );

        this.router.navigate(['student']);
    }

}
