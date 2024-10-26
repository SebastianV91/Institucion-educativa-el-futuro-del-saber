import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http'

@Injectable({
  providedIn: 'root'
})
export class EstudianteService {

  rutaGlobal = 'http://localhost:8084/estudiante'

  constructor(private http: HttpClient) { }



}
