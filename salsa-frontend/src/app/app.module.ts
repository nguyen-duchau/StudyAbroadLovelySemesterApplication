import {BrowserModule} from '@angular/platform-browser';
import {NgModule} from '@angular/core';

import {AppRouting} from './app.routing';
import {AppComponent} from './app.component';
import {AdminComponent} from './admin/admin.component';

import {AppMaterialModule} from './app-material.module';
import {BrowserAnimationsModule} from '@angular/platform-browser/animations';

import { ToolbarComponent } from './core/toolbar/toolbar.component';
import { AuthenticationComponent } from './authentication/authentication.component';
import { AuthenticationModule } from "./authentication/authentication.module";
import { StudentComponent } from './student/student.component';
import {StudentModule} from "./student/student.module";
import {FlexLayoutModule} from "@angular/flex-layout";

@NgModule({
    declarations: [
        AppComponent,
        AdminComponent,
        ToolbarComponent,
        AuthenticationComponent,
        StudentComponent
    ],
    imports: [
        BrowserModule,
        BrowserAnimationsModule,
        AppMaterialModule,

        AuthenticationModule,
        StudentModule,
        AppRouting
    ],
    providers: [],
    bootstrap: [AppComponent]
})
export class AppModule {
}
