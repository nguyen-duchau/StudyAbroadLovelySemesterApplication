import {NgModule} from '@angular/core';
import {CommonModule} from '@angular/common';
import {LoginComponent} from "./login/login.component";
import {AngularMaterialModule} from "../angular-material.module";
import {FormsModule, ReactiveFormsModule} from "@angular/forms";
import {AuthenticationComponent} from "./authentication.component";
import { RegisterComponent } from './register/register.component';

@NgModule({
    declarations: [
        LoginComponent,
        RegisterComponent,
    ],
    imports: [
        CommonModule,
        AngularMaterialModule,
        FormsModule,
        ReactiveFormsModule
    ],
    exports: [
        LoginComponent,
        RegisterComponent
    ]
})
export class AuthenticationModule {
}
