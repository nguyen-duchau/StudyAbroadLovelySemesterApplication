import {Component, OnDestroy, OnInit} from '@angular/core';
import {University} from "../../salsa-model/university.model";
import {Subscription} from "rxjs";
import {MatDialog, MatTableDataSource} from "@angular/material";
import {UniversityService} from "../../salsa-service/university.service";
import {AdminUniversityEditComponent} from "./admin-university-edit/admin-university-edit.component";

export interface DialogData {
    animal: string;
    name: string;
}

@Component({
    selector: 'salsa-admin-university',
    templateUrl: './admin-university.component.html',
    styleUrls: ['./admin-university.component.scss']
})
export class AdminUniversityComponent implements OnInit, OnDestroy {

    universities: University[];
    private universitySubscription: Subscription;

    // data table
    dataSource: MatTableDataSource<University>;
    displayedColumns = ['name', 'address', 'country'];

    loading: boolean;

    constructor(
        private universityService: UniversityService,
        public dialog: MatDialog
    ) {
        this.loading = true;
    }

    ngOnInit() {
        this.universitySubscription = this.universityService.subject.subscribe(
            (universities: University[]) => {
                this.universities = universities;
                this.loading = false;
            }
        );
        this.universityService.emit();
        this.dataSource = new MatTableDataSource<University>(this.universities);
    }

    ngOnDestroy(): void {
        this.universitySubscription.unsubscribe();
    }

    animal: string;
    name: string;

    openDialog(): void {
        const dialogRef = this.dialog.open(AdminUniversityEditComponent, {
            width: '250px',
            data: {name: this.name, animal: this.animal}
        });

        dialogRef.afterClosed().subscribe(result => {
            console.log('The dialog was closed');
            this.animal = result;
        });
    }

}
