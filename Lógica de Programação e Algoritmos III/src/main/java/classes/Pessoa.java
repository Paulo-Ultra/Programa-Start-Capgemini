package classes;
//Abstração de IMC
public class Pessoa {

    //Atributos
    float peso;
    float altura;

    //Métodos
    public float calcularIMC(){
       float imc = peso / (altura * altura);
       return imc;
    }
}
