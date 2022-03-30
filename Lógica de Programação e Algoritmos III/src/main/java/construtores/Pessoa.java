package construtores;

public class Pessoa {


    private float peso;
    private float altura;

    //Construtores servem para poder executar algum trecho de código quando o objeto é criado, passar valores default
    // e também passar parâmetros específicos.
    public Pessoa(float peso, float altura){
        //this faz referência ao atributo
        this.peso = peso;
        this.altura = altura;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getPeso() {
        return peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float calcularIMC(){
        float imc = peso / (altura * altura);
        return imc;
    }
}
