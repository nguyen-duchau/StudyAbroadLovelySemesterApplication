import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { InsaDashboardComponent } from './insa-dashboard.component';

describe('InsaDashboardComponent', () => {
  let component: InsaDashboardComponent;
  let fixture: ComponentFixture<InsaDashboardComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ InsaDashboardComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(InsaDashboardComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
