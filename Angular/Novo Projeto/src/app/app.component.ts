import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {

  //Criar variáveis
  nome:string = "Ralf";
  imagem:string = "https://caosplanejado.com/wp-content/uploads/2021/01/homoge.jpg";
  valor1:number = 1;
  valor2:number = 2;

  //Função de Clique

  mensagem(){
    window.alert("Olá Mundo!");
  }

  //Objeto
  pessoa:any={
    nome: "Ralf",
    idade: 29,
    cidade: "Blumenau"
  }

}
