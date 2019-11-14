import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { StudentregisterationComponent } from './studentregisteration.component';

describe('StudentregisterationComponent', () => {
  let component: StudentregisterationComponent;
  let fixture: ComponentFixture<StudentregisterationComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ StudentregisterationComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(StudentregisterationComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
