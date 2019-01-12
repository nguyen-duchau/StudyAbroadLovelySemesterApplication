import {Speciality} from "./speciality.model";

export class Student {
    constructor(
        public username: string,
        public password: string,
        public name: string,
        public birth?: Date,
        public speciality?: Speciality
    ) { }

}
