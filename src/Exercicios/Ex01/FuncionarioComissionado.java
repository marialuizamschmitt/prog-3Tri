package Exercicios.Ex01;

import Exercicios.Ex01.Funcionario;
import Exercicios.Ex01.Pagamento;

public class FuncionarioComissionado extends Funcionario implements Pagamento {

    private double vendas;
    private double taxaComissao;
    public FuncionarioComissionado(String nome, double salarioBase, double vendas, double taxaComissao) {
        super(nome, salarioBase);
        this.vendas = vendas;
        this.taxaComissao = taxaComissao;
    }
    public double calcularSalario() {
        return salarioBase + (vendas * taxaComissao);
    }
    @Override
    public double processarPagamento() {
        return calcularSalario();
    }


}
