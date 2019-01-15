import {NgModule} from '@angular/core';
import {CommonModule} from '@angular/common';
import {AdminUniversityEditComponent} from "./admin-university-edit/admin-university-edit.component";
import {FormsModule} from "@angular/forms";
import {AppMaterialModule} from "../../app-material.module";

@NgModule({
    declarations: [
        AdminUniversityEditComponent
    ],
    imports: [
        FormsModule,
        AppMaterialModule,
        CommonModule
    ],
    exports: [
        AdminUniversityEditComponent
    ],
    entryComponents: [AdminUniversityEditComponent]
})
export class AdminUniversityModule {
}
