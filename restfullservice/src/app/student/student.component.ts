import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import {User} from '../user';
@Component({
  selector: 'app-student',
  templateUrl: './student.component.html',
  styleUrls: ['./student.component.css']
})
export class StudentComponent implements OnInit {
   users = [];
  constructor(private http: HttpClient) { }

  ngOnInit() {
   this.http.get('http://localhost:8080/student/getAll').subscribe((data: any[]) => {
this.users = data;
  });
  }

}
