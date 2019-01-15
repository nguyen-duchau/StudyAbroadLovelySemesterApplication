import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { UniveristiesComponent } from './univeristies.component';

describe('UniveristiesComponent', () => {
  let component: UniveristiesComponent;
  let fixture: ComponentFixture<UniveristiesComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ UniveristiesComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(UniveristiesComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
