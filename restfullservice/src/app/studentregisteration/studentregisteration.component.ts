import { Component, OnInit, ANALYZE_FOR_ENTRY_COMPONENTS } from '@angular/core';
import {HttpClient} from '@angular/common/http';
// tslint:disable-next-line:import-spacing
import  {User}  from '../user';
import { StudentService } from '../student.service';

@Component({
  selector: 'app-studentregisteration',
  templateUrl: './studentregisteration.component.html',
  styleUrls: ['./studentregisteration.component.css']
})
export class StudentregisterationComponent implements OnInit {
  user: User = new User('', '' , '0' , '');
  message: any;
  constructor(private service: StudentService) { }

  ngOnInit() {
  }
  registerNow() {
      this.service.registerUser(this.user).subscribe((data) => {
        this.message = data;
      });
  }
}
