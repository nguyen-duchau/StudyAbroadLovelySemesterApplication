import {Component} from '@angular/core';
import {fadeAnimation} from "./salsa-animation/fade.animation";
import {RouterOutlet} from "@angular/router";

@Component({
    selector: 'salsa-root',
    templateUrl: './app.component.html',
    styleUrls: ['./app.component.scss'],
    animations: [fadeAnimation]
})
export class AppComponent {

}
