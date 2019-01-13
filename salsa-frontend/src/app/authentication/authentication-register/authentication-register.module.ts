import {NgModule} from '@angular/core';
import {CommonModule} from '@angular/common';
import {AppMaterialModule} from "../../app-material.module";
import {RouterModule} from "@angular/router";

@NgModule({
    declarations: [
    ],
    imports: [
        AppMaterialModule,
        RouterModule,
        CommonModule
    ],
    exports: [
    ]
})
export class AuthenticationRegisterModule {
}
