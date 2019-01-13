import {Speciality} from "./speciality.model";
import {Account} from "./account.model";

export class Student extends Account{
    constructor(
        public username: string,
        public password: string,
        public name: string,
        public birth?: Date,
        public speciality?: Speciality
    ) {
        super(username, password);
    }

}
