import {Component, OnDestroy, OnInit} from '@angular/core';
import {University} from "../../salsa-model/university.model";
import {Subscription} from "rxjs";
import {MatDialog, MatTableDataSource} from "@angular/material";
import {UniversityService} from "../../salsa-service/university.service";
import {AdminUniversityCreateComponent} from "./admin-university-create/admin-university-create.component";

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
    displayedColumns = ['name', 'address'];

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
                this.dataSource = new MatTableDataSource<University>(this.universities);

            }
        );
        this.universityService.emit();
    }

    ngOnDestroy(): void {
        this.universitySubscription.unsubscribe();
    }

    openCreateDialog(): void {
        const dialogRef = this.dialog.open(AdminUniversityCreateComponent, {
            // width: '250px',
            data: new University("", "")
        });

        dialogRef.afterClosed().subscribe(university => {
            console.log('The dialog was closed');
            this.universities.push(university);
        });
    }

}
