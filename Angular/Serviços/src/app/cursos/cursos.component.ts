import { CursosService } from './cursos.service';
import { Curso } from './Curso';
import { Component, OnInit } from '@angular/core';


@Component({
  selector: 'app-cursos',
  templateUrl: './cursos.component.html',
  styleUrls: ['./cursos.component.css']
})
export class CursosComponent implements OnInit {

  //Atributos

  public vetorCursos: Curso[];
  public curso: Curso;
  public id: number;

  //Construtor
  constructor(private servico:CursosService) { }

  //Inicialização
  ngOnInit(){
    this.id= -1;
    this.curso = new Curso();
    this.vetorCursos = this.servico.listar();
  }

  //Cadastrar
  cadastrar(){
   this.servico.cadastrar(this.curso);
   this.curso = new Curso();
  }

  //Exluir
  excluir(id:number){
    this.servico.excluir(id);
    this.id = -1;
  }

  //Editar
  editar(id:number){
    this.id = id;

    this.curso = new Curso(
      this.vetorCursos[id].nomeCurso,
      this.vetorCursos[id].valorCurso,
      this.vetorCursos[id].areaCurso
      );
  }

  //Atualizar
  atualizar(){
    this.servico.alterar(this.id, this.curso);
    this.curso = new Curso();
    this.id = -1;
  }
}
