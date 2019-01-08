import {NgModule} from '@angular/core';
import {CommonModule} from '@angular/common';
import {LoginComponent} from "./login/login.component";
import {AuthenticationRoutingModule} from "./authentication.routing";
import {AngularMaterialModule} from "../angular-material.module";

@NgModule({
    declarations: [
        LoginComponent
    ],
    imports: [
        CommonModule,
        AngularMaterialModule
        //AuthenticationRoutingModule
    ]
})
export class AuthenticationModule {
}
