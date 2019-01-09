import {Component, OnDestroy, OnInit} from '@angular/core';
import {UniversityService} from "../salsa-service/university.service";
import {University} from "../salsa-model/university.model";
import {Subscription} from "rxjs";
import {MatTableDataSource} from "@angular/material";

@Component({
    selector: 'salsa-admin',
    templateUrl: './admin.component.html',
    styleUrls: ['./admin.component.scss']
})
export class AdminComponent implements OnInit, OnDestroy {

    universities : University[];
    private universitySubscription: Subscription;

    // data table
    dataSource : MatTableDataSource<University>;
    displayedColumns = ['name', 'address', 'country'];

    constructor(
        private universityService: UniversityService
    ) {}

    applyFilter(filterValue: string) {
        this.dataSource.filter = filterValue.trim().toLowerCase();
    }

    ngOnInit() {
        this.universitySubscription = this.universityService.subject.subscribe(
            (universities: University[]) => {
                this.universities = universities;
            }
        );
        this.universityService.emit();
        this.dataSource = new MatTableDataSource<University>(this.universities);
    }

    ngOnDestroy(): void {
    }


}
