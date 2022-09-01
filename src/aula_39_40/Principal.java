package aula_39_40;

import java.sql.Date;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

import aula_39_40.dao.PessoaDAO;
import aula_39_40.model.Pessoa;
import helpers.Helpers;

public class Principal {

	static SimpleDateFormat fd = new SimpleDateFormat("dd/MM/yyyy");

	static NumberFormat fm = NumberFormat.getCurrencyInstance();

	static private Scanner sc = new Scanner(System.in);

	static PessoaDAO dao = new PessoaDAO();

	public static void main(String[] args) {
		menu();
	}

	public static void menu() {

		int opcao = 0;

		while (opcao != 6) {
			System.out.println();
			System.out.println("-------[ Menu do sistema ]--------");
			System.out.println("1. Incluir pessoa");
			System.out.println("2. Alterar pessoa");
			System.out.println("3. Excluir pessoa");
			System.out.println("4. Listar pessoas");
			System.out.println("5. Consultar pessoa");
			System.out.println();
			System.out.println("6. Sair");
			Helpers.divisorMenor();
			System.out.print("Selecione uma opção do menu acima: ");
			opcao = sc.nextInt();

			switch (opcao) {
			case 1:
				incluir();
				break;
			case 2:
				alterar();
				break;
			case 3:
				excluir();
				break;
			case 4:
				listar();
				break;
			case 5:
				consultar();
				break;
			case 6:
				sair();
				break;
			default:
				System.out.println("Opção inválida!");
				break;
			}
		}

	}

	public static void incluir() {
		Pessoa p = new Pessoa();

		p.setIdPessoa(null);
		System.out.print("Informe o nome: ");
		p.setNomePessoa(sc.next());
		System.out.print("Informe o salário: R$");
		p.setSalario(sc.nextBigDecimal());
		sc.nextLine();
		p.setDataNascimento(Date.valueOf(LocalDate.now()));
		System.out.println();
		System.out.println("Confira os dados informados abaixo:");
		System.out.println("Nome: " + p.getNomePessoa());
		System.out.println("Data de nascimento: " + fd.format(p.getDataNascimento()));
		System.out.println("Salário: " + fm.format(p.getSalario()));
		System.out.print("Confirma a inclusão? (s/n): ");
		String ok = sc.nextLine();

		if (ok.equals("s")) {
			dao.adicionar(p);
		}
	}

	public static void alterar() {
		Pessoa p = solicitarPessoa();
		int opcao = 0;

		if (p != null) {
			while (opcao != 5) {
				System.out.println("");
				System.out.println("1. Nome: " + p.getNomePessoa());
				System.out.println("2. Data de Nascimento: " + fd.format(p.getDataNascimento()));
				System.out.println("3. Salário: " + fm.format(p.getSalario()));
				System.out.println("4. Cancelar");
				System.out.print("Selecione um campo acima para alterar: ");
				opcao = sc.nextInt();
				sc.nextLine();

				try {
					switch (opcao) {
					case 1:
						System.out.print("Informe o novo nome: ");
						p.setNomePessoa(sc.nextLine());
						break;
					case 2:
						System.out.print("Informe a nova data de nascimento: ");
						try {
							String novaData = sc.nextLine();
							long dataHora = fd.parse(novaData).getTime();
							p.setDataNascimento(new java.sql.Date(dataHora));
						} catch (ParseException e) {
							System.out.println("Formato inválido! Formato deve ser dd/mm/aaaa");
						}
						break;
					case 3:
						System.out.print("Informe o valor do novo salário: ");
						p.setSalario(sc.nextBigDecimal());
						sc.nextLine();
					case 4:
						menu();
					default:
						System.out.println("Opção inválida!");
						break;
					}
				} catch (RuntimeException e) {
					System.out.println("Ocorreu um erro durante a execução do programa!");
					System.out.println(e.getMessage());
				}
			}

			System.out.print("Confirma a alteração? (s/n): ");
			String ok = sc.nextLine();

			if (ok.equals("s")) {
				dao.alterar(p);
			}
		} else {
			System.out.println("Pessoa não encontrada!");
		}
	}

	public static void excluir() {
		Pessoa p = solicitarPessoa();
		mostrarPessoa(p);

		System.out.print("Confirma a exclusão? (s/n): ");
		String ok = sc.nextLine();

		if (ok.equals("s")) {
			dao.excluir(p.getIdPessoa());
		}
	}

	public static void listar() {
		List<Pessoa> lista = dao.listarTodas();

		for (Pessoa pessoa : lista) {
			mostrarPessoa(pessoa);
		}
	}

	public static void consultar() {
		Pessoa p = solicitarPessoa();

		if (p != null) {
			mostrarPessoa(p);
		} else {
			System.out.println("Pessoa não encontrada!");
		}
	}

	public static Pessoa solicitarPessoa() {
		System.out.print("Informe o ID da pessoa: ");
		int id = sc.nextInt();
		sc.nextLine();

		Pessoa p = dao.buscarPorId(id);

		return p;
	}

	public static void mostrarPessoa(Pessoa p) {
		System.out.println();
		System.out.println("---[ Dados da pessoa ]---");
		System.out.println("ID: " + p.getIdPessoa());
		System.out.println("Nome: " + p.getNomePessoa());
		System.out.println("Data de Nascimento: " + fd.format(p.getDataNascimento()));
		System.out.println("Salário: " + fm.format(p.getSalario()));
	}

	public static void sair() {
		System.out.println("Goodbye, friend!");
		System.exit(0);
	}

}
