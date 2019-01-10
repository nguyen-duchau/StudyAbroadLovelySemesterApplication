import {NgModule} from '@angular/core';
import {CommonModule} from '@angular/common';
import {InsaDashboardComponent} from './insa-dashboard/insa-dashboard.component';
import {AppMaterialModule} from "../app-material.module";

@NgModule({
    declarations: [InsaDashboardComponent],
    imports: [
        CommonModule,
        AppMaterialModule
    ],
    exports: [
        InsaDashboardComponent
    ]
})
export class InsaModule {
}
