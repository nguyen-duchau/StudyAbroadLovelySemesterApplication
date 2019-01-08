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
    username: string;
    password: string;

    ngOnInit() {
        this.buildForm();
    }

    buildForm() {
        this.loginForm = this.formBuilder.group({
            'email': ['', [
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
        if (this.username === 'admin' && this.password === 'admin') {
            this.router.navigate(['admin']);
        } else {
            alert('Invalide credentials');
        }
    }

}
