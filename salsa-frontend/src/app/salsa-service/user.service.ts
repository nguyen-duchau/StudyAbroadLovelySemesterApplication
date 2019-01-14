import {Injectable} from '@angular/core';
import {HttpClient, HttpErrorResponse, HttpHeaders} from '@angular/common/http';
import {Student} from "../salsa-model/student.model";
import {Subject} from "rxjs";
import {ActivatedRoute, Router} from "@angular/router";
import {MatSnackBar} from "@angular/material";

const httpOptions = {
    headers: new HttpHeaders({'Content-Type': 'application/json'})
};

@Injectable()
export class UserService {

    private user: Student;
    public subject: Subject<Student>;
    private callbackUrl : string;

    constructor(
        private httpClient: HttpClient,
        private activatedRoute: ActivatedRoute,
        private router: Router,
        public snackBar: MatSnackBar
    ) {
        this.subject = new Subject<Student>();
        this.callbackUrl = this.activatedRoute.snapshot.queryParams['callbackUrl'] || '/student';
    }

    isLoggedIn() {
        return this.user !== undefined;
    }

    login(student_input: Student) {

        this.httpClient.post<Student>(
            'http://localhost:9001/student/login',
            student_input

        ).subscribe(

            (student) => {
                this.user = student;
                this.emit();
                this.router.navigate([this.callbackUrl]);
            },

            (error: HttpErrorResponse) => {
                if(error.status == 0)
                    this.snackBar.open("No Intenet connection or server side is not operational", "I got it");
                else
                    this.snackBar.open(error.message, "Try again");
            }
        )

    }

    register(student_input: Student) {

        this.httpClient.post<Student>(
            'http://localhost:9001/student/register',
            student_input
        ).subscribe(
            (student) => {
                this.user = student;
                this.emit();
                this.router.navigate([this.callbackUrl]);
            },

            (error: HttpErrorResponse) => {
                if(error.status == 0)
                    this.snackBar.open("No Intenet connection or server side is not operational", "I got it");
                else
                   this.snackBar.open(error.message, "Try again");
            }
        )
    }

    emit() {
        this.subject.next(this.user);
    }
}
