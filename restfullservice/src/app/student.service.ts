import { Injectable } from '@angular/core';
import { HttpClient, HttpParams} from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class StudentService {

  constructor(private httpClient: HttpClient) { }

  registerUser(user) {
    return this.httpClient.post('http://localhost:8080/student/register',  user, {responseType: 'text' as 'json'});
  }

  getStudentByEmail(email) {
    const param1 = new HttpParams().set('email', email);
    return  this.httpClient.get('http://localhost:8080/student/getEmailById', {params: param1});
   //  return this.httpClient.get()
  }
}
