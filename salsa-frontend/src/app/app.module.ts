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
import { InsaComponent } from './insa/insa.component';
import {UserService} from "./salsa-service/user.service";
import {UniversityService} from "./salsa-service/university.service";
import {HttpClientModule} from "@angular/common/http";
import { UniveristiesComponent } from './univeristies/univeristies.component';
import {AdminModule} from "./admin/admin.module";

@NgModule({
    declarations: [
        AppComponent,
        AdminComponent,
        ToolbarComponent,
        AuthenticationComponent,
        StudentComponent,
        InsaComponent,
        UniveristiesComponent
    ],
    imports: [
        BrowserModule,
        BrowserAnimationsModule,
        AppMaterialModule,
        HttpClientModule,

        AuthenticationModule,
        StudentModule,
        AdminModule,
        AppRouting
    ],
    providers: [ UserService, UniversityService ],
    bootstrap: [AppComponent]
})
export class AppModule {
}
