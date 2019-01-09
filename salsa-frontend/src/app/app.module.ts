import {BrowserModule} from '@angular/platform-browser';
import {NgModule} from '@angular/core';

import {AppRouting} from './app.routing';
import {AppComponent} from './app.component';
import {AdminComponent} from './admin/admin.component';

import {AngularMaterialModule} from './angular-material.module';
import {BrowserAnimationsModule} from '@angular/platform-browser/animations';

import { ToolbarComponent } from './core/toolbar/toolbar.component';
import { AuthenticationComponent } from './authentication/authentication.component';
import { AuthenticationModule } from "./authentication/authentication.module";

@NgModule({
    declarations: [
        AppComponent,
        AdminComponent,
        ToolbarComponent,
        AuthenticationComponent
    ],
    imports: [
        BrowserModule,
        BrowserAnimationsModule,
        AngularMaterialModule,

        AuthenticationModule,
        AppRouting,
    ],
    providers: [],
    bootstrap: [AppComponent]
})
export class AppModule {
}
