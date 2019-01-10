import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { InsaComponent } from './insa.component';

describe('InsaComponent', () => {
  let component: InsaComponent;
  let fixture: ComponentFixture<InsaComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ InsaComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(InsaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
