import { Component, OnInit } from '@angular/core';
import { Estudiante } from '../../estudiante';
import { EstudianteService } from '../../service/estudiante.service';

@Component({
  selector: 'app-estudiante-list',
  templateUrl: './estudiante-list.component.html',
  styleUrl: './estudiante-list.component.css'
})
export class EstudianteListComponent implements OnInit {

  estudiantes : Estudiante [] = [];

  constructor(private estudianteService : EstudianteService){}

  ngOnInit(): void {
    this.listStudents();
  }

  listStudents(){
    this.estudianteService.getStudentList().subscribe(
      data => {
        this.estudiantes = data;
        console.log(this.estudiantes);
      }
    );
  }



}
