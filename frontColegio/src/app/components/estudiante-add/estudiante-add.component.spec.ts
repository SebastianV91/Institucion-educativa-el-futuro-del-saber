import { ComponentFixture, TestBed } from '@angular/core/testing';

import { EstudianteAddComponent } from './estudiante-add.component';

describe('EstudianteAddComponent', () => {
  let component: EstudianteAddComponent;
  let fixture: ComponentFixture<EstudianteAddComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [EstudianteAddComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(EstudianteAddComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
