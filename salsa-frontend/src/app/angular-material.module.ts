import {NgModule} from '@angular/core';
import {CommonModule} from '@angular/common';

import {
    MatButtonModule,
    MatCardModule,
    MatDialogModule,
    MatIconModule,
    MatInputModule,
    MatMenuModule,
    MatProgressSpinnerModule,
    MatTableModule,
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
        MatInputModule,
        MatDialogModule,
        MatTableModule,
        MatMenuModule,
        MatIconModule,
        MatProgressSpinnerModule,
        FlexLayoutModule
    ], exports: [
        CommonModule,
        MatToolbarModule,
        MatButtonModule,
        MatCardModule,
        MatInputModule,
        MatDialogModule,
        MatTableModule,
        MatMenuModule,
        MatIconModule,
        MatProgressSpinnerModule,
        FlexLayoutModule
    ]
})
export class AngularMaterialModule {
}
