import {NgModule} from '@angular/core';
import {CommonModule} from '@angular/common';
import {AdminUniversityComponent} from './admin-university/admin-university.component';
import {AdminRouting} from "./admin.routing";
import {AppMaterialModule} from "../app-material.module";

@NgModule({
    declarations: [
        AdminUniversityComponent
    ],
    imports: [
        AppMaterialModule,
        CommonModule,
        AdminRouting
    ]
})
export class AdminModule {
}
