import {BrowserModule} from '@angular/platform-browser';
import {NgModule} from '@angular/core';

import {AppRouting} from './app.routing';
import {AppComponent} from './app.component';
import {LoginComponent} from './login/login.component';
import {AdminComponent} from './admin/admin.component';

import {AngularMaterialModule} from './angular-material.module';
import {BrowserAnimationsModule} from '@angular/platform-browser/animations';

import {FormsModule, ReactiveFormsModule} from '@angular/forms';
import { ToolbarComponent } from './toolbar/toolbar.component';

@NgModule({
    declarations: [
        AppComponent,
        LoginComponent,
        AdminComponent,
        ToolbarComponent
    ],
    imports: [
        BrowserModule,
        BrowserAnimationsModule,
        AngularMaterialModule,
        AppRouting,

        FormsModule,
        ReactiveFormsModule
    ],
    providers: [],
    bootstrap: [AppComponent]
})
export class AppModule {
}
