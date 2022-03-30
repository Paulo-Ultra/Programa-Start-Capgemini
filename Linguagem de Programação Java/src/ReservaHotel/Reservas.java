package ReservaHotel;

import java.util.ArrayList;
import java.util.List;

public class Reservas {

    private List<Hospedes> lista;
    private Suites suite;
    private Integer quantidadePessoas;
    private Integer quantidadeDias;

    public Reservas() {
        lista = new ArrayList<>();
    }

    public void incluirHospedes(Hospedes hospedes){
        lista.add(hospedes);
    }
}
