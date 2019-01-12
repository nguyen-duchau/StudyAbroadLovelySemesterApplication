import {NgModule} from '@angular/core';
import {CommonModule} from '@angular/common';

import {
    MatButtonModule,
    MatCardModule, MatCheckboxModule, MatDatepickerModule,
    MatDialogModule, MatDividerModule, MatGridListModule,
    MatIconModule,
    MatInputModule, MatListModule,
    MatMenuModule, MatNativeDateModule,
    MatProgressSpinnerModule, MatSelectModule, MatStepperModule,
    MatTableModule, MatTabsModule,
    MatToolbarModule
} from '@angular/material';
import {FlexLayoutModule} from "@angular/flex-layout";

@NgModule({
    declarations: [],
    imports: [
        CommonModule,
        MatToolbarModule,
        MatButtonModule,
        MatCardModule,
        MatTabsModule,
        MatInputModule,
        MatDialogModule,
        MatTableModule,
        MatMenuModule,
        MatIconModule,
        MatProgressSpinnerModule,
        MatDividerModule,
        MatGridListModule,
        FlexLayoutModule,
        MatStepperModule,
        MatListModule,
        MatCheckboxModule,
        MatSelectModule,
        MatDatepickerModule,
        MatNativeDateModule // for MatDatepickerModule
    ], exports: [
        CommonModule,
        MatToolbarModule,
        MatButtonModule,
        MatCardModule,
        MatTabsModule,
        MatInputModule,
        MatDialogModule,
        MatTableModule,
        MatMenuModule,
        MatIconModule,
        MatProgressSpinnerModule,
        MatDividerModule,
        MatGridListModule,
        FlexLayoutModule,
        MatStepperModule,
        MatListModule,
        MatCheckboxModule,
        MatSelectModule,
        MatDatepickerModule,
        MatNativeDateModule // for MatDatepickerModule
    ]
})
export class AppMaterialModule {
}
