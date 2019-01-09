import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { StudentAdvancementComponent } from './student-advancement.component';

describe('StudentAdvancementComponent', () => {
  let component: StudentAdvancementComponent;
  let fixture: ComponentFixture<StudentAdvancementComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ StudentAdvancementComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(StudentAdvancementComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
