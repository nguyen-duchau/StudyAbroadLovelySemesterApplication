import {Component, Inject} from '@angular/core';
import {MAT_DIALOG_DATA, MatDialogRef} from "@angular/material";

export interface DialogData {
    animal: string;
    name: string;
}

@Component({
  selector: 'salsa-admin-university-edit',
  templateUrl: './admin-university-edit.component.html',
  styleUrls: ['./admin-university-edit.component.scss']
})
export class AdminUniversityEditComponent {

    constructor(
        public dialogRef: MatDialogRef<AdminUniversityEditComponent>,
        @Inject(MAT_DIALOG_DATA) public data: DialogData
    ) {}

    onNoClick(): void {
        this.dialogRef.close();
    }

}
