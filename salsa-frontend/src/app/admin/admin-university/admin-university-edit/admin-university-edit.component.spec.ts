import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AdminUniversityEditComponent } from './admin-university-edit.component';

describe('AdminUniversityEditComponent', () => {
  let component: AdminUniversityEditComponent;
  let fixture: ComponentFixture<AdminUniversityEditComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AdminUniversityEditComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AdminUniversityEditComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
