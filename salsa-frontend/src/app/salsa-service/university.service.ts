import {Injectable} from '@angular/core';
import {University} from "../salsa-model/university.model";
import {Observable, Subject} from "rxjs";
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
                if(error.status == 0)
                    this.snackBar.open("No Intenet connection or server side is not operational", "I got it");
                else
                    this.snackBar.open(error.message, "Try again");
            }

        );
    }

    emit() {
        this.subject.next(this.universities.slice());
    }

    fetch(): Observable<University[]>  {
        return this.httpClient.get<University[]>(
            SalsaConfig.PARTNER_URL,
        ).pipe(

            tap(
                (universities) => {
                    this.universities = universities;
                    this.emit();
                }
            )
        );
    }

    add(university: University) {
        this.universities.push(university);
        this.emit();
    }
}
