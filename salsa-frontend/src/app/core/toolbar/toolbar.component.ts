import {Component, Input, OnInit} from '@angular/core';
import {MatDrawer} from "@angular/material";
import {UserService} from "../../salsa-service/user.service";

@Component({
    selector: 'salsa-toolbar',
    templateUrl: './toolbar.component.html',
    styleUrls: ['./toolbar.component.scss']
})
export class ToolbarComponent implements OnInit {


    constructor(
    ) {}

    ngOnInit() {

    }

}
