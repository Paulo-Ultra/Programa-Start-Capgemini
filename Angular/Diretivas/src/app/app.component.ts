import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {


  //Diretiva NGIF

  exibirTexto:boolean | undefined;

  acaoNgIf(){
    this.exibirTexto = !this.exibirTexto;
  }

  //Diretiva NGFOR
  cursos = ["HTML & CSS", "PHP Básico", "PHP Avançado", "Angular"];

  //Diretiva NGSWITCH
  curso_selecionado = "Angular";

  //Diretiva NGCLASS
  ligada:boolean = true;

}
