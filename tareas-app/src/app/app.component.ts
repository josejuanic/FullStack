import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent implements OnInit {
  title = 'tareas-app';

  tareas: any[] = [];


  constructor(
    private http: HttpClient
  ){}



  ngOnInit(){

    this.http
      .get<any[]>('http://localhost:8080/tareas')
      .subscribe({

        next: datos => {
          this.tareas = datos;
        },

        error: error => {
          console.error(error);
        }

      });

  }
}
