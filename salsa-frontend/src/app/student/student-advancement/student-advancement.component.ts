import {Component, OnInit} from '@angular/core';
import {FormBuilder, FormGroup, Validators} from "@angular/forms";

@Component({
    selector: 'salsa-student-advancement',
    templateUrl: './student-advancement.component.html',
    styleUrls: ['./student-advancement.component.scss']
})
export class StudentAdvancementComponent implements OnInit {

    firstFormGroup: FormGroup;
    secondFormGroup: FormGroup;

    constructor(
        private formBuilder: FormBuilder
    ) {}

    ngOnInit() {
        this.firstFormGroup = this.formBuilder.group({
            firstCtrl: ['', Validators.required]
        });
        this.secondFormGroup = this.formBuilder.group({
            secondCtrl: ['', Validators.required]
        });
    }

}
