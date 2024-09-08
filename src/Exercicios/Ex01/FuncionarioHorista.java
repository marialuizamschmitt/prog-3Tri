package Exercicios.Ex01;

import Exercicios.Ex01.Funcionario;
import Exercicios.Ex01.Pagamento;

public class FuncionarioHorista extends Funcionario implements Pagamento {
    private int horasTrabalhadas;
    private double valorHora;
    public FuncionarioHorista(String nome, double salarioBase, int horasTrabalhadas, double valorHora) {
        super(nome, salarioBase);
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorHora = valorHora;
    }
    public double calcularSalario() {
        return horasTrabalhadas * valorHora;
    }
    @Override
    public double processarPagamento() {
        return calcularSalario();
    }
}


