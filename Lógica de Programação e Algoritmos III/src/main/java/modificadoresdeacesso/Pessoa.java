package modificadoresdeacesso;
//Abstração de IMC
public class Pessoa {

    //Atributos
    private float peso;
    private float altura;

    //Métodos acessores
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

    //Métodos
    public float calcularIMC(){
        float imc = peso / (altura * altura);
        return imc;
    }
}
