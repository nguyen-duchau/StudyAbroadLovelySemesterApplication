# Salsa (User Interface)

This project was generated with [Angular CLI](https://github.com/angular/angular-cli) version 7.1.4.

## Development server

Run `sudo ng serve` for a dev server. Navigate to `http://localhost:4200/`. The app will automatically reload if you change any of the source files.

## Code scaffolding

Run `ng g c component-name --module app` to generate a new component. 
You can also use `ng generate directive|pipe|service|class|guard|interface|enum|module`.

### Generate sub-component:

Run `ng g c <mother-component>/<child-component> --module <mother-component>/<mother-component>`. Then go to the module to **export** the new sub-module.

Exemple:

In component **authentication** we want create a sub-component **login**,
first make sure the parent **authentication** already has a module file **authentication.module.ts**. 
Then run `ng g c authentication */login --module authentication/authentication`

Then modify the **authentication/authentication.module.ts** as follow:

```angular2
//...
@NgModule({
    declarations: [
        LoginComponent, // <-- automatic
        //...
    ],
    imports: [
        //...

    ],
    exports: [
        LoginComponent, // <-- manually
        //...
    ]
})
//...
```

## Build
Run `ng build` to build the project. The build artifacts will be stored in the `dist/` directory. Use the `--prod` flag for a production build.

## Running unit tests

Run `ng test` to execute the unit tests via [Karma](https://karma-runner.github.io).

## Running end-to-end tests

Run `ng e2e` to execute the end-to-end tests via [Protractor](http://www.protractortest.org/).

## Further help

To get more help on the Angular CLI use `ng help` or go check out the [Angular CLI README](https://github.com/angular/angular-cli/blob/master/README.md).
