import {NgModule} from '@angular/core';
import {CommonModule} from '@angular/common';
import {StudentUniversityChoiceComponent} from './student-university-choice/student-university-choice.component';
import {AppMaterialModule} from "../../app-material.module";

@NgModule({
    declarations: [
        StudentUniversityChoiceComponent
    ],
    imports: [
        AppMaterialModule,
        CommonModule
    ],
    exports: [
        StudentUniversityChoiceComponent
    ]
})
export class StudentAdvancementModule {
}
