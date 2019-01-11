import {Component} from '@angular/core';
import {fadeAnimation} from "./salsa-animation/fade.animation";

@Component({
    selector: 'salsa-root',
    templateUrl: './app.component.html',
    styleUrls: ['./app.component.scss'],
    animations: [fadeAnimation]
})
export class AppComponent {
    title = 'salsa-frontend';
}
