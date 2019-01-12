import {NgModule} from '@angular/core';
import {CommonModule} from '@angular/common';
import {AuthenticationLoginComponent} from "./authentication-login/authentication-login.component";
import {AppMaterialModule} from "../app-material.module";
import {FormsModule, ReactiveFormsModule} from "@angular/forms";
import { AuthenticationRegisterComponent } from './authentication-register/authentication-register.component';
import {FlexLayoutModule} from "@angular/flex-layout";
import {AuthenticationRegisterModule} from "./authentication-register/authentication-register.module";

@NgModule({
    declarations: [
        AuthenticationLoginComponent,
        AuthenticationRegisterComponent,
    ],
    imports: [
        CommonModule,
        AppMaterialModule,
        FlexLayoutModule,
        FormsModule,
        ReactiveFormsModule,

        AuthenticationRegisterModule
    ],
    exports: [

        AuthenticationRegisterModule,

        AuthenticationLoginComponent,
        AuthenticationRegisterComponent
    ]
})
export class AuthenticationModule {
}
