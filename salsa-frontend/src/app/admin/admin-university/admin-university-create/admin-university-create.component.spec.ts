import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AdminUniversityCreateComponent } from './admin-university-edit.component';

describe('AdminUniversityEditComponent', () => {
  let component: AdminUniversityCreateComponent;
  let fixture: ComponentFixture<AdminUniversityCreateComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AdminUniversityCreateComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AdminUniversityCreateComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
