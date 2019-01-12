import {Component, OnInit} from '@angular/core';
import {FormBuilder, FormGroup, Validators} from "@angular/forms";

@Component({
    selector: 'salsa-register',
    templateUrl: './authentication-register.component.html',
    styleUrls: ['./authentication-register.component.scss']
})
export class AuthenticationRegisterComponent implements OnInit {

    constructor(
        private formBuilder: FormBuilder
    ) {
    }

    registerForm: FormGroup;
    showSpinner = false;

    ngOnInit() {
        this.buildForm();
    }

    buildForm() {
        this.registerForm = this.formBuilder.group({
            'username': ['', [
                Validators.required
            ]
            ],
            'password': ['', [
                Validators.required
            ]
            ],
            'name': ['', []],
            'birthday': ['', []],
            'speciality': ['', []]
        });
    }

}
