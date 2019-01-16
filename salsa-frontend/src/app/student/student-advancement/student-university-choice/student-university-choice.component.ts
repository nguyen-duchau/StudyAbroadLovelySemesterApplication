import {Component, OnDestroy, OnInit} from '@angular/core';
import {MatTableDataSource} from "@angular/material";
import {University} from "../../../salsa-model/university.model";
import {UniversityService} from "../../../salsa-service/university.service";
import {Subscription} from "rxjs";
import {SelectionModel} from "@angular/cdk/collections";

@Component({
    selector: 'salsa-student-university-choice',
    templateUrl: './student-university-choice.component.html',
    styleUrls: ['./student-university-choice.component.scss']
})
export class StudentUniversityChoiceComponent implements OnInit, OnDestroy {

    universities : University[];
    private universitySubscription: Subscription;

    // data table
    dataSource : MatTableDataSource<University>;
    displayedColumns = ['select','name', 'address'];
    selection = new SelectionModel<University>(true, []);

    constructor(
        private universityService: UniversityService
    ) { }

    ngOnInit() {
        this.universitySubscription = this.universityService.subject.subscribe(
            (universities: University[]) => {
                this.universities = universities;
                this.dataSource = new MatTableDataSource<University>(this.universities);
            }
        );
        this.universityService.emit();

    }

    applyFilter(filterValue: string) {
        this.dataSource.filter = filterValue.trim().toLowerCase();
    }

    ngOnDestroy(): void {
    }
}
