import {NgModule} from '@angular/core';
import {CommonModule} from '@angular/common';
import {AdminUniversityCreateComponent} from "./admin-university-create/admin-university-create.component";
import {FormsModule, ReactiveFormsModule} from "@angular/forms";
import {AppMaterialModule} from "../../app-material.module";

@NgModule({
    declarations: [
        AdminUniversityCreateComponent
    ],
    imports: [
        FormsModule,
        AppMaterialModule,
        CommonModule,

        FormsModule,
        ReactiveFormsModule
    ],
    exports: [
        AdminUniversityCreateComponent
    ],
    entryComponents: [AdminUniversityCreateComponent]
})
export class AdminUniversityModule {
}
