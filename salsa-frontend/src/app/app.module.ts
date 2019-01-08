import {BrowserModule} from '@angular/platform-browser';
import {NgModule} from '@angular/core';

import {AppRouting} from './app.routing';
import {AppComponent} from './app.component';
import {AdminComponent} from './admin/admin.component';

import {AngularMaterialModule} from './angular-material.module';
import {BrowserAnimationsModule} from '@angular/platform-browser/animations';

import {FormsModule, ReactiveFormsModule} from '@angular/forms';
import { ToolbarComponent } from './toolbar/toolbar.component';
import { AuthenticationComponent } from './authentication/authentication.component';
import {LoginComponent} from "./authentication/login/login.component";
//import {AuthenticationModule} from "./authentication/authentication.module";

@NgModule({
    declarations: [
        AppComponent,
        AdminComponent,
        ToolbarComponent,
        AuthenticationComponent,
        LoginComponent
    ],
    imports: [
        BrowserModule,
        BrowserAnimationsModule,
        AngularMaterialModule,

        FormsModule,
        ReactiveFormsModule,

        //AuthenticationModule,
        AppRouting,
    ],
    providers: [],
    bootstrap: [AppComponent]
})
export class AppModule {
}
