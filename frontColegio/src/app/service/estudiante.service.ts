import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Estudiante } from '../estudiante';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class EstudianteService {

  private api : string = 'http://localhost:8084/api/estudiante';

  constructor(private http:HttpClient) { }

  getStudentList():Observable<Estudiante []>{
    return this.http.get<Estudiante[]>(this.api)
  }

  createStudent(estudiante : Estudiante):Observable<Estudiante>{
    return this.http.post<Estudiante>(this.api, estudiante);
  }

}
