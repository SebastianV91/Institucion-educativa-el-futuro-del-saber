import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HttpClientModule } from '@angular/common/http';
import { EstudianteListComponent } from './components/estudiante-list/estudiante-list.component';
import { EstudianteAddComponent } from './components/estudiante-add/estudiante-add.component';
import { FormsModule } from '@angular/forms';

@NgModule({
  declarations: [
    AppComponent,
    EstudianteListComponent,
    EstudianteAddComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [EstudianteAddComponent]
})
export class AppModule { }
