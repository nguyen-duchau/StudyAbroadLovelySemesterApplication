import {Component, OnInit} from '@angular/core';
import {FormBuilder, FormGroup, Validators} from "@angular/forms";
import {UserService} from "../../salsa-service/user.service";
import {Student} from "../../salsa-model/student.model";
import {Account} from "../../salsa-model/account.model";

@Component({
    selector: 'salsa-register',
    templateUrl: './authentication-register.component.html',
    styleUrls: ['./authentication-register.component.scss']
})
export class AuthenticationRegisterComponent implements OnInit {

    constructor(
        private formBuilder: FormBuilder,
        private userService: UserService
    ) {
    }

    registerForm: FormGroup;
    showSpinner = false;

    ngOnInit() {
        this.buildForm();
    }

    buildForm() {
        this.registerForm = this.formBuilder.group(new Student('','','',new Date()));
    }

    register() {
        let user : Student = this.registerForm.value;
        this.userService.register(user);
    }

}
