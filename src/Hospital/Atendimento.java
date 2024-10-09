package Hospital;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class Atendimento {
    private LocalDate data;
    private String descricao;

    public Atendimento(LocalDate data, String descricao) {
        this.data = data;
        this.descricao = descricao;
    }

    public LocalDate getData() {
        return data;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/mm/aaaa");
        return "Data: " + data.format(formato) + ", Descrição: " + descricao;
    }
}
