import {Component, OnDestroy, OnInit} from '@angular/core';
import {UniversityService} from "../salsa-service/university.service";
import {University} from "../salsa-model/university.model";
import {Subscription} from "rxjs";
import {MatTableDataSource} from "@angular/material";
import {UserService} from "../salsa-service/user.service";

@Component({
    selector: 'salsa-admin',
    templateUrl: './admin.component.html',
    styleUrls: ['./admin.component.scss']
})
export class AdminComponent implements OnInit, OnDestroy {

    constructor(
    ) {}

    ngOnInit() {

    }

    ngOnDestroy() {
    }

}
