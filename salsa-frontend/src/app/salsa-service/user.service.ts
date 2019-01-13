import {Injectable} from '@angular/core';
import {HttpClient, HttpHeaders} from '@angular/common/http';
import {Student} from "../salsa-model/student.model";
import {Subject} from "rxjs";

const httpOptions = {
    headers: new HttpHeaders({'Content-Type': 'application/json'})
};

@Injectable()
export class UserService {

    private user: Student;
    public subject: Subject<Student>;

    constructor(private httpClient: HttpClient) {
        this.subject = new Subject<Student>();
    }

    private login_student_url = 'http://localhost:9001/student/login';

    login(student_input: Student) {

        this.httpClient.post<Student>(
            this.login_student_url,
            student_input
        ).subscribe(
            (student) => {
                this.user = student;
                this.emit();
            },

            (error) => {
                console.log("Error when login : ",error);
            }
        )

    }

    register(student_input: Student) {

        this.httpClient.post<Student>(
            this.login_student_url,
            student_input
        ).subscribe(
            (student) => {
                this.user = student;
                this.emit();
            },

            (error) => {
                console.log("Error when register : ",error);
            }
        )
    }

    emit() {
        this.subject.next(this.user);
    }
}
