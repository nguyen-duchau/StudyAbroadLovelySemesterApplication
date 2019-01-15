import {NgModule} from '@angular/core';
import {CommonModule} from '@angular/common';
import {AdminUniversityComponent} from './admin-university/admin-university.component';
import {AdminRouting} from "./admin.routing";
import {AppMaterialModule} from "../app-material.module";
import {AdminUniversityModule} from "./admin-university/admin-university.module";

@NgModule({
    declarations: [
        AdminUniversityComponent,
    ],
    imports: [
        AppMaterialModule,
        CommonModule,
        AdminRouting,

        AdminUniversityModule
    ],
    exports: [
        AdminUniversityModule
    ]
})
export class AdminModule {
}
