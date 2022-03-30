package heranca;

import java.util.Date;

public class Vendedor extends Funcionario {

    private int totalItensVendidos;
    private float comissaoPorItem;
//    private String nome;
//    private String cpf;
//    private Date dataNascimento;
//    private float salario;
//
    public Vendedor() {
        super();
    }
//
//    public String getNome() {
//        return nome;
//    }
//
//    public void setNome(String nome) {
//        this.nome = nome;
//    }
//
//    public String getCpf() {
//        return cpf;
//    }
//
//    public void setCpf(String cpf) {
//        this.cpf = cpf;
//    }
//
//    public Date getDataNascimento() {
//        return dataNascimento;
//    }
//
//    public void setDataNascimento(Date dataNascimento) {
//        this.dataNascimento = dataNascimento;
//    }
//
//    public float getSalario() {
//        return salario;
//    }
//
//    public void setSalario(float salario) {
//        this.salario = salario;
//    }


    public int getTotalItensVendidos() {
        return totalItensVendidos;
    }

    public void setTotalItensVendidos(int totalItensVendidos) {
        this.totalItensVendidos = totalItensVendidos;
    }

    public float getComissaoPorItem() {
        return comissaoPorItem;
    }

    public void setComissaoPorItem(float comissaoPorItem) {
        this.comissaoPorItem = comissaoPorItem;
    }

    public float calcularSalario(){
        return super.getSalario() + (this.comissaoPorItem * this.totalItensVendidos);
    }

}
