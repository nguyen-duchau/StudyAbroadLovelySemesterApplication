import {Component, OnDestroy, OnInit} from '@angular/core';
import {UniversityService} from "../salsa-service/university.service";
import {University} from "../salsa-model/university.model";
import {Subscription} from "rxjs";

@Component({
    selector: 'salsa-admin',
    templateUrl: './admin.component.html',
    styleUrls: ['./admin.component.scss']
})
export class AdminComponent implements OnInit, OnDestroy {

    private universities : University[];
    private universitySubscription: Subscription;

    constructor(
        private universityService: UniversityService
    ) {
    }

    ngOnInit() {
        this.universitySubscription = this.universityService.subject.subscribe(
            (universities: University[]) => {
                this.universities = universities;
            }
        )
        this.universityService.emit();
    }

    ngOnDestroy(): void {
    }


}
