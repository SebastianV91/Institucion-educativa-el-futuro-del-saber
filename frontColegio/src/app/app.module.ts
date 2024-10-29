import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HttpClientModule } from '@angular/common/http';
import { EstudianteListComponent } from './components/estudiante-list/estudiante-list.component';

@NgModule({
  declarations: [
    AppComponent,
    EstudianteListComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [EstudianteListComponent]
})
export class AppModule { }
