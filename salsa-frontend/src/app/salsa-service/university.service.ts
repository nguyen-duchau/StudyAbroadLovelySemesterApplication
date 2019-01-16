import {Injectable} from '@angular/core';
import {University} from "../salsa-model/university.model";
import {Observable, Subject, throwError} from "rxjs";
import {HttpClient, HttpErrorResponse} from "@angular/common/http";
import {tap} from "rxjs/operators";
import {MatSnackBar} from "@angular/material";
import {SalsaConfig} from "../core/app-config";

@Injectable({
    providedIn: 'root'
})
export class UniversityService {

    private universities: University[];
    public subject = new Subject<University[]>(); // or universitySubject

    constructor(
        private httpClient: HttpClient,
        public snackBar: MatSnackBar
    ) {

        this.universities = [];

        this.httpClient.get<University[]>(
            SalsaConfig.PARTNER_URL,
        ).subscribe(
            (universities) => {
                this.universities = universities;
                this.emit();
            },

            (error: HttpErrorResponse) => {
                if (error.status == 0)
                    this.snackBar.open("No Intenet connection or server side is not operational", "I got it");
                else
                    this.snackBar.open(error.message, "Try again");
            }
        );
    }

    emit() {
        this.subject.next(this.universities.slice());
    }

    put(university: University): void {
        this.httpClient.put<University>(
            SalsaConfig.PARTNER_URL,
            university
        ).subscribe(
            (university) => {
                this.universities.push(university);
                this.emit();
            },

            (error: HttpErrorResponse) => {
                return this.handleError(error);
            }

        );

    }

    private handleError(error: HttpErrorResponse) {

        if (error.status == 0)
            this.snackBar.open("No Intenet connection or server side is not operational", "I got it");
        else
            this.snackBar.open(error.error.message, "Try again");

        // return an observable with a user-facing error message
        return throwError(
            'Something bad happened; please try again later.');
    };
}
