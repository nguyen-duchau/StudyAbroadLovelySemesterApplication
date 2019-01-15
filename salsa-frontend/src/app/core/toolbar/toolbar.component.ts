import {Component, Input, OnInit} from '@angular/core';
import {MatDrawer} from "@angular/material";
import {UserService} from "../../salsa-service/user.service";

@Component({
    selector: 'salsa-toolbar',
    templateUrl: './toolbar.component.html',
    styleUrls: ['./toolbar.component.scss']
})
export class ToolbarComponent implements OnInit {

    @Input() sidemenu_drawer: MatDrawer;
    button_activate : boolean;

    constructor(
        private userService : UserService
    ) {}

    ngOnInit() {
        this.userService.adminSubject.subscribe(
            isAdmin => {
                this.button_activate = isAdmin;
            }
        );
    }

}
