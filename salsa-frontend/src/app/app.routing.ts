import {NgModule} from '@angular/core';
import {Routes, RouterModule} from '@angular/router';
import {AdminComponent} from './admin/admin.component';
import {AuthenticationComponent} from "./authentication/authentication.component";
import {StudentComponent} from "./student/student.component";
import {InsaComponent} from "./insa/insa.component";

const routes: Routes = [
    {
        path: '',
        redirectTo: 'authentication',
        pathMatch: 'full'
    },
    {
        path: 'authentication',
        component: AuthenticationComponent
    },
    {
        path: 'admin',
        component: AdminComponent
    },
    {
        path: 'student',
        component: StudentComponent
    },
    {
        path: 'insa',
        component: InsaComponent
    }
];

@NgModule({
    imports: [RouterModule.forRoot(routes)],
    exports: [RouterModule]
})
export class AppRouting {
}
