import { Component, OnInit } from '@angular/core';
import { StudentService } from '../student.service';
import { Observable } from 'rxjs';
@Component({
  selector: 'app-studentsearchbyname',
  templateUrl: './studentsearchbyname.component.html',
  styleUrls: ['./studentsearchbyname.component.css']
})
export class StudentsearchbynameComponent implements OnInit {
  email: string;
  usersearchByEmail: any[];
  constructor(private service: StudentService) { }

  ngOnInit() {
  }
  searchbyName() {
    const searchservice = this.service.getStudentByEmail(this.email);
    searchservice.subscribe((data: any[]) => {
      this.usersearchByEmail = data;
    });

  }
}
