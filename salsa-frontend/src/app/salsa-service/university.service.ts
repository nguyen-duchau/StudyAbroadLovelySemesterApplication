import {Injectable} from '@angular/core';
import {University} from "../salsa-model/university.model";
import {Observable, Subject} from "rxjs";
import {HttpClient} from "@angular/common/http";
import {catchError, tap} from "rxjs/operators";

@Injectable({
    providedIn: 'root'
})
export class UniversityService {

    private universities: University[];
    public subject = new Subject<University[]>(); // or universitySubject

    constructor(
        private httpClient: HttpClient
    ) {

    }

    emit() {
        this.subject.next(this.universities.slice());
    }

    fetch(): Observable<University[]>  {
        return this.httpClient.get<University[]>(
            'http://localhost:9000/universities/',
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
