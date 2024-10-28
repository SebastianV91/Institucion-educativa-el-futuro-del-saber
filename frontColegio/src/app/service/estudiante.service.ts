import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http'
import { Estudiante } from '../model/Estudiante';

@Injectable({
  providedIn: 'root'
})
export class EstudianteService {

  rutaGlobal = 'http://localhost:8084/estudiante/'

  constructor(private http: HttpClient) { }

  crearEstudiantes(estudiante: Estudiante){
    return this.http.post<Estudiante>(this.rutaGlobal + 'nuevo', estudiante, {
      observe: 'response'
    })
  }

  getEstudiantes(){
    return this.http.get<Estudiante[]>(this.rutaGlobal + 'mostrar')
  }

  actualizarEstudiante(estudiante: Estudiante){
    return this.http.post<Estudiante>(this.rutaGlobal + 'update', estudiante, {
      observe: 'response'
    })
  }

  eliminarEstudiante(id: number){
    this.http.post<Boolean>(this.rutaGlobal + id, {
      observe: 'response'
    }) 
  }

}
