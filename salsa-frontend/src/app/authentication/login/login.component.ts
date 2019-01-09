import {Component, OnInit} from '@angular/core';
import {Router} from '@angular/router';
import {FormBuilder, FormGroup, Validators} from "@angular/forms";

@Component({
    selector: 'salsa-login',
    templateUrl: './login.component.html',
    styleUrls: ['./login.component.scss']
})
export class LoginComponent implements OnInit {

    constructor(private router: Router, private formBuilder: FormBuilder) {
    }

    loginForm: FormGroup;
    showSpinner = true;

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

        this.router.navigate(['admin']);
    }

}
