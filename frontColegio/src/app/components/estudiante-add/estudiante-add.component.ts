import { Component, OnInit } from '@angular/core';
import { Estudiante } from '../../estudiante';
import { EstudianteService } from '../../service/estudiante.service';

@Component({
  selector: 'app-estudiante-add',
  templateUrl: './estudiante-add.component.html',
  styleUrl: './estudiante-add.component.css'
})
export class EstudianteAddComponent implements OnInit {

  id!: number; 
  tipoDocumento: string = '';
  numeroIdentidad: string = '';
  nombres: string = '';
  apellidos: string = '';
  fechaNacimiento!: Date;
  edad!: number;
  grado!: number;
  email: string = '';
  telefonoFijo: string = '';
  celular: string = '';

  constructor(private estudianteService : EstudianteService ){

  }

  ngOnInit(): void {

  }

  addStudent(){
    let estudiante = new Estudiante(this.id, this.tipoDocumento, this.numeroIdentidad, this.nombres, this.apellidos, this.fechaNacimiento, this.edad, this.grado, this.email, this.telefonoFijo, this.celular);
    console.log(estudiante);
    this.estudianteService.createStudent(estudiante).subscribe(
      res => console.log(res)
    );
  }

}
