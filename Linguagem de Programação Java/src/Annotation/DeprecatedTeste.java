package Annotation;

public class DeprecatedTeste {
    void visualizar(){
        System.out.println("Método Visualização");
    }

    @Deprecated
    void exibir(){
        System.out.println("Mostrando que o método exibir é deprecated");
    }
}
