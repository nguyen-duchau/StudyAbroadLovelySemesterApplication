import {NgModule} from '@angular/core';
import {CommonModule} from '@angular/common';
import {AdminUniversityComponent} from './admin-university/admin-university.component';
import {AdminRouting} from "./admin.routing";

@NgModule({
    declarations: [AdminUniversityComponent],
    imports: [
        CommonModule,
        AdminRouting
    ]
})
export class AdminModule {
}
