import {NgModule} from '@angular/core';
import {CommonModule} from '@angular/common';
import { StudentProfileComponent } from './student-profile/student-profile.component';
import {AppMaterialModule} from "../app-material.module";
import { StudentAdvancementComponent } from './student-advancement/student-advancement.component';
import {ReactiveFormsModule} from "@angular/forms";

@NgModule({
    declarations: [
        StudentProfileComponent,
        StudentAdvancementComponent
    ],
    imports: [
        ReactiveFormsModule,
        CommonModule,
        AppMaterialModule
    ],
    exports: [
        StudentProfileComponent,
        StudentAdvancementComponent
    ]
})
export class StudentModule {
}
