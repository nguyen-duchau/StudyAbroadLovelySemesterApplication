import {Component, OnInit} from '@angular/core';
import {University} from "../salsa-model/university.model";
import {Subscription} from "rxjs";
import {MatTableDataSource} from "@angular/material";
import {UniversityService} from "../salsa-service/university.service";

@Component({
    selector: 'salsa-univeristies',
    templateUrl: './univeristies.component.html',
    styleUrls: ['./univeristies.component.scss']
})
export class UniveristiesComponent implements OnInit {


    universities: University[];
    private universitySubscription: Subscription;

    // data table
    dataSource : MatTableDataSource<University>;
    displayedColumns = ['name', 'address', 'country'];

    constructor(
        private universityService: UniversityService
    ) { }

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
        this.universitySubscription.unsubscribe();
    }

}
