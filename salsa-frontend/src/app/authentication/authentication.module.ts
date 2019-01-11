import {NgModule} from '@angular/core';
import {CommonModule} from '@angular/common';
import {LoginComponent} from "./authentication-login/login.component";
import {AppMaterialModule} from "../app-material.module";
import {FormsModule, ReactiveFormsModule} from "@angular/forms";
import { RegisterComponent } from './authentication-register/register.component';
import {FlexLayoutModule} from "@angular/flex-layout";

@NgModule({
    declarations: [
        LoginComponent,
        RegisterComponent,
    ],
    imports: [
        CommonModule,
        AppMaterialModule,
        FlexLayoutModule,
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
