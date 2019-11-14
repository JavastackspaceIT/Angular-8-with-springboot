import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { StudentsearchbynameComponent } from './studentsearchbyname.component';

describe('StudentsearchbynameComponent', () => {
  let component: StudentsearchbynameComponent;
  let fixture: ComponentFixture<StudentsearchbynameComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ StudentsearchbynameComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(StudentsearchbynameComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
