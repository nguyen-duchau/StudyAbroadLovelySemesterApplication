import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { StudentUniversityChoiceComponent } from './student-university-choice.component';

describe('StudentUniversityChoiceComponent', () => {
  let component: StudentUniversityChoiceComponent;
  let fixture: ComponentFixture<StudentUniversityChoiceComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ StudentUniversityChoiceComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(StudentUniversityChoiceComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
