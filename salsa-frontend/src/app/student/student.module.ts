import {NgModule} from '@angular/core';
import {CommonModule} from '@angular/common';
import { StudentProfileComponent } from './student-profile/student-profile.component';
import {AppMaterialModule} from "../app-material.module";
import { StudentAdvancementComponent } from './student-advancement/student-advancement.component';
import {FormsModule, ReactiveFormsModule} from "@angular/forms";
import {FlexLayoutModule} from "@angular/flex-layout";
import {StudentAdvancementModule} from "./student-advancement/student-advancement.module";

@NgModule({
    declarations: [
        StudentProfileComponent,
        StudentAdvancementComponent
    ],
    imports: [
        ReactiveFormsModule,
        CommonModule,
        AppMaterialModule,
        FormsModule,
        FlexLayoutModule,
        StudentAdvancementModule
    ],
    exports: [
        StudentProfileComponent,
        StudentAdvancementComponent,
        StudentAdvancementModule
    ]
})
export class StudentModule {
}
