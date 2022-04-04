import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {

  //Variável da página 1
  p1: boolean = true;

  //Função para alterar a página
  alterarPagina(){
    this.p1 = !this.p1;
  }
}
