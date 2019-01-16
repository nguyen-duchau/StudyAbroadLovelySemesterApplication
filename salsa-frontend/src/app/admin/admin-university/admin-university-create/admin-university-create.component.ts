import {Component, Inject} from '@angular/core';
import {MAT_DIALOG_DATA, MatDialogRef} from "@angular/material";
import {University} from "../../../salsa-model/university.model";
import {FormBuilder, FormGroup} from "@angular/forms";
import {UniversityService} from "../../../salsa-service/university.service";

@Component({
  selector: 'salsa-admin-university-create',
  templateUrl: './admin-university-create.component.html',
  styleUrls: ['./admin-university-create.component.scss']
})
export class AdminUniversityCreateComponent {

    createUniversityForm: FormGroup;

    constructor(
        public dialogRef: MatDialogRef<AdminUniversityCreateComponent>,
        @Inject(MAT_DIALOG_DATA) public data: University,
        private formBuilder: FormBuilder,
        private universityService: UniversityService
    ) {
        this.createUniversityForm = this.formBuilder.group(data);
    }

    createUniversity() {
        this.universityService.put(
            this.createUniversityForm.value
        );
    }
}
