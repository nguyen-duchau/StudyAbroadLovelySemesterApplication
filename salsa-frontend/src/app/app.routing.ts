import {NgModule} from '@angular/core';
import {Routes, RouterModule} from '@angular/router';
import {AdminComponent} from './admin/admin.component';
import {AuthenticationComponent} from "./authentication/authentication.component";
import {StudentComponent} from "./student/student.component";
import {InsaComponent} from "./insa/insa.component";
import {UniversitiesComponent} from "./universities/universities.component";
import {AuthGuardService} from "./salsa-policy/auth-guard.service";

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
        component: StudentComponent,
        canActivate: [ AuthGuardService ]
    },
    {
        path: 'insa',
        component: InsaComponent
    },
    {
        path: 'universities',
        component: UniversitiesComponent
    }
];

@NgModule({
    imports: [RouterModule.forRoot(routes)],
    exports: [RouterModule]
})
export class AppRouting {
}
