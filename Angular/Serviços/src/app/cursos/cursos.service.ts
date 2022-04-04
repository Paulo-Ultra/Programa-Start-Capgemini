import { Curso } from './Curso';
import { Injectable } from '@angular/core';

//Acesso total do serviço
@Injectable({
  providedIn: 'root'
})
//Classe
export class CursosService {

  //Construtor
  constructor() { }

  //Vetor de Cursos
  private vetorCursos:Curso[] = [
    new Curso("Angular", 800, "Desenvolvimento"),
    new Curso("PHP", 590, "Desenvolvimento"),
    new Curso("Photoshop", 470, "Design"),
  ];

  //Cadastro de Cursos
  public cadastrar(curso:Curso){
    this.vetorCursos.push(curso);
  }

  //Seleção de Cursos
  public listar(){
    return this.vetorCursos;
  }

  //Alteração de Cursos
  public alterar(id:number, curso:Curso){
    this.vetorCursos[id] = curso;
  }

  //Exclusão de Cursos
  public excluir(id:number){
    this.vetorCursos.splice(id, 1);
  }
}
