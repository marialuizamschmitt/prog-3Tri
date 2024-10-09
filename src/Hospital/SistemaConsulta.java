package Hospital;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Scanner;

public class SistemaConsulta {
    private static ArrayList<Paciente> pacientes = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao;
        do {
            System.out.println("\nSistema de Consulta Médica");
            System.out.println("1 - Incluir Paciente;");
            System.out.println("2 - Alterar Paciente;");
            System.out.println("3 - Realizar Atendimento;");
            System.out.println("4 - Listar Pacientes;");
            System.out.println("5 - Mostrar Paciente;");
            System.out.println("6 - Apagar Paciente.");
            System.out.println("7 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    incluirPaciente();
                    break;
                case 2:
                    alterarPaciente();
                    break;
                case 3:
                    realizarAtendimento();
                    break;
                case 4:
                    listarPacientes();
                    break;
                case 5:
                    mostrarPaciente();
                    break;
                case 6:
                    apagarPaciente();
                    break;
                case 7:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 0);
    }

    private static void incluirPaciente() {
        System.out.print("Digite o nome do paciente: ");
        String nome = scanner.nextLine();

        if (nome.isEmpty()) {
            System.out.println("Nome não pode ser vazio!");
            return;
        }
        LocalDate dataNascimento = lerData("Digite a data de nascimento (dd/mm/aaaa): ");
        Paciente paciente = new Paciente(nome, dataNascimento);
        pacientes.add(paciente);
        System.out.println("Paciente incluído com sucesso!");
    }


    private static void alterarPaciente() {
        System.out.print("Digite o nome do paciente que deseja alterar: ");
        String nome = scanner.nextLine();
        for (Paciente paciente : pacientes) {
            if (paciente.getNome().equalsIgnoreCase(nome)) {
                System.out.print("Digite o novo nome: ");
                String novoNome = scanner.nextLine();
                paciente.nome = novoNome; // Usando o método setter se necessário
                System.out.println("Paciente alterado com sucesso!");
                return;
            }
        }
        System.out.println("Paciente não encontrado.");
    }

    private static void realizarAtendimento() {
        System.out.print("Digite o nome do paciente: ");
        String nome = scanner.nextLine();
        for (Paciente paciente : pacientes) {
            if (paciente.getNome().equalsIgnoreCase(nome) && paciente.isAtivo()) {
                LocalDate data = lerData("Digite a data do atendimento (dd/mm/aaaa): ");
                System.out.print("Digite a descrição do atendimento: ");
                String descricao = scanner.nextLine();
                Atendimento atendimento = new Atendimento(data, descricao);
                paciente.addAtendimento(atendimento);
                System.out.println("Atendimento registrado com sucesso!");
                return;
            }
        }
        System.out.println("Paciente não encontrado ou inativo.");
    }

    private static void listarPacientes() {
        System.out.println("\nPacientes ativos:");
        for (Paciente paciente : pacientes) {
            if (paciente.isAtivo()) {
                System.out.println(paciente);
            }
        }
    }

    private static void mostrarPaciente() {
        System.out.print("Digite o nome do paciente: ");
        String nome = scanner.nextLine();
        for (Paciente paciente : pacientes) {
            if (paciente.getNome().equalsIgnoreCase(nome)) {
                System.out.println(paciente);
                System.out.println("Atendimentos:");
                int count = 0;
                for (Atendimento atendimento : paciente.getAtendimentos()) {
                    if (count % 5 == 0 && count != 0) {
                        System.out.print("Pressione Enter para continuar...");
                        scanner.nextLine();
                    }
                    System.out.println(atendimento);
                    count++;
                }
                return;
            }
        }
        System.out.println("Paciente não encontrado!");
    }

    private static void apagarPaciente() {
        System.out.print("Digite o nome do paciente que deseja apagar: ");
        String nome = scanner.nextLine();
        for (Paciente paciente : pacientes) {
            if (paciente.getNome().equalsIgnoreCase(nome)) {
                paciente.desativar();
                System.out.println("Paciente desativado com sucesso!");
                return;
            }
        }
        System.out.println("Paciente não encontrado!");
    }

    private static LocalDate lerData(String mensagem) {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/mm/aaaa");
        LocalDate data = null;
        boolean valida = false;
        while (!valida) {
            System.out.print(mensagem);
            String dataStr = scanner.nextLine();
            try {
                data = LocalDate.parse(dataStr, formato);
                valida = true;
            } catch (DateTimeParseException e) {
                System.out.println("Formato inválido! " + e.getMessage());
            }
        }
        return data;
    }
}
