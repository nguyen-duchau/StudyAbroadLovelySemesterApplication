import {Injectable} from '@angular/core';
import {HttpClient, HttpHeaders} from '@angular/common/http';
import {Observable} from 'rxjs/Observable';
import {Student} from "../salsa-model/student.model";


const httpOptions = {
    headers: new HttpHeaders({'Content-Type': 'application/json'})
};

@Injectable()
export class UserService {

    constructor(private httpClient: HttpClient) {
    }

    private login_student_url = 'http://localhost:9001/student';

    register(student: Student) {

        this.httpClient.post(
            this.login_student_url,
            student
        ).subscribe(
            (response) => {

            }
        )
    }
}
