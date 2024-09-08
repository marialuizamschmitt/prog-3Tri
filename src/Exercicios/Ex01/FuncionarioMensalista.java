package Exercicios.Ex01;

import Exercicios.Ex01.Funcionario;
import Exercicios.Ex01.Pagamento;

public class FuncionarioMensalista extends Funcionario implements Pagamento {

    public FuncionarioMensalista(String nome, double salarioBase) {
        super(nome, salarioBase);
    }
    public double calcularSalario() {
        return this.salarioBase;
    }
    @Override
    public double processarPagamento() {
        return calcularSalario();
    }
}
