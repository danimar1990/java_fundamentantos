package aula_18_19_20.lista_02;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class App {

	private JFrame App;
	private JTextField txtPrimeiroNumero;
	private JTextField txtSegundoNumero;
	private JTextField txtNome;
	private JTextField txtIdade;
	private JTextField txtNota1;
	private JTextField txtNota3;
	private JTextField txtNota2;
	private JTextField txtDeposito;
	private JTextField txtSaque;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					App window = new App();
					window.App.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public App() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		Calculadora calculadora = new Calculadora();

		App = new JFrame();
		App.getContentPane().setFont(new Font("JetBrains Mono", Font.PLAIN, 14));
		App.setName("app");
		App.setBounds(100, 100, 613, 495);
		App.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		App.getContentPane().setLayout(null);

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setFont(new Font("JetBrains Mono", Font.PLAIN, 14));
		tabbedPane.setBounds(10, 11, 577, 434);
		App.getContentPane().add(tabbedPane);

		JPanel panelLista02Exercicio01 = new JPanel();
		panelLista02Exercicio01.setFont(new Font("JetBrains Mono", Font.PLAIN, 14));
		tabbedPane.addTab("Exercício 01", null, panelLista02Exercicio01, null);
		panelLista02Exercicio01.setLayout(null);

		JLabel lblPrimeiroNumero = new JLabel("1º número");
		lblPrimeiroNumero.setFont(new Font("JetBrains Mono", Font.PLAIN, 14));
		lblPrimeiroNumero.setBounds(243, 71, 86, 21);
		panelLista02Exercicio01.add(lblPrimeiroNumero);

		JLabel lblSegundoNumero = new JLabel("2º número");
		lblSegundoNumero.setFont(new Font("JetBrains Mono", Font.PLAIN, 14));
		lblSegundoNumero.setBounds(243, 134, 86, 21);
		panelLista02Exercicio01.add(lblSegundoNumero);

		JLabel lblResultados = new JLabel("Resultados");
		lblResultados.setFont(new Font("JetBrains Mono", Font.BOLD, 14));
		lblResultados.setBounds(10, 219, 100, 21);
		panelLista02Exercicio01.add(lblResultados);

		JLabel lblResultadoSoma = new JLabel();
		lblResultadoSoma.setFont(new Font("JetBrains Mono", Font.PLAIN, 14));
		lblResultadoSoma.setBounds(55, 251, 507, 21);
		panelLista02Exercicio01.add(lblResultadoSoma);

		JLabel lblResultadoSubtracao = new JLabel();
		lblResultadoSubtracao.setFont(new Font("JetBrains Mono", Font.PLAIN, 14));
		lblResultadoSubtracao.setBounds(93, 283, 469, 21);
		panelLista02Exercicio01.add(lblResultadoSubtracao);

		JLabel lblResultadoDivisao = new JLabel();
		lblResultadoDivisao.setBounds(78, 344, 484, 21);
		panelLista02Exercicio01.add(lblResultadoDivisao);

		JLabel lblResultadoMultiplicao = new JLabel();
		lblResultadoMultiplicao.setFont(new Font("JetBrains Mono", Font.PLAIN, 14));
		lblResultadoMultiplicao.setBounds(126, 315, 436, 18);
		panelLista02Exercicio01.add(lblResultadoMultiplicao);

		JLabel lblSoma = new JLabel("Soma:");
		lblSoma.setFont(new Font("JetBrains Mono", Font.PLAIN, 14));
		lblSoma.setBounds(10, 251, 100, 21);
		panelLista02Exercicio01.add(lblSoma);

		JLabel lblSubtrao = new JLabel("Subtração:");
		lblSubtrao.setFont(new Font("JetBrains Mono", Font.PLAIN, 14));
		lblSubtrao.setBounds(10, 283, 100, 21);
		panelLista02Exercicio01.add(lblSubtrao);

		JLabel lblDivisao = new JLabel("Divisão:");
		lblDivisao.setFont(new Font("JetBrains Mono", Font.PLAIN, 14));
		lblDivisao.setBounds(10, 344, 100, 21);
		panelLista02Exercicio01.add(lblDivisao);

		JLabel lblMultiplicao = new JLabel("Multiplicação:");
		lblMultiplicao.setFont(new Font("JetBrains Mono", Font.PLAIN, 14));
		lblMultiplicao.setBounds(10, 315, 122, 18);
		panelLista02Exercicio01.add(lblMultiplicao);

		txtPrimeiroNumero = new JTextField();
		txtPrimeiroNumero.setFont(new Font("JetBrains Mono", Font.PLAIN, 14));
		txtPrimeiroNumero.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				try {
					String aux = calculadora.somar(Double.parseDouble(txtPrimeiroNumero.getText()),
							Double.parseDouble(txtSegundoNumero.getText()));
					lblResultadoSoma.setText(aux);
					aux = calculadora.dividir(Double.parseDouble(txtPrimeiroNumero.getText()),
							Double.parseDouble(txtSegundoNumero.getText()));
					lblResultadoDivisao.setText(aux);
					aux = calculadora.multiplicar(Double.parseDouble(txtPrimeiroNumero.getText()),
							Double.parseDouble(txtSegundoNumero.getText()));
					lblResultadoMultiplicao.setText(aux);
					aux = calculadora.subtrair(Double.parseDouble(txtPrimeiroNumero.getText()),
							Double.parseDouble(txtSegundoNumero.getText()));
					lblResultadoSubtracao.setText(aux);
				} catch (Exception err) {
					lblResultadoSoma.setText("Verifique os números digitados!");
					lblResultadoDivisao.setText("Verifique os números digitados!");
					lblResultadoMultiplicao.setText("Verifique os números digitados!");
					lblResultadoSubtracao.setText("Verifique os números digitados!");
				}
			}
		});
		txtPrimeiroNumero.setBounds(231, 92, 110, 20);
		panelLista02Exercicio01.add(txtPrimeiroNumero);
		txtPrimeiroNumero.setColumns(10);

		txtSegundoNumero = new JTextField();
		txtSegundoNumero.setFont(new Font("JetBrains Mono", Font.PLAIN, 14));
		txtSegundoNumero.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				try {
					String aux = calculadora.somar(Double.parseDouble(txtPrimeiroNumero.getText()),
							Double.parseDouble(txtSegundoNumero.getText()));
					lblResultadoSoma.setText(aux);
					aux = calculadora.dividir(Double.parseDouble(txtPrimeiroNumero.getText()),
							Double.parseDouble(txtSegundoNumero.getText()));
					lblResultadoDivisao.setText(aux);
					aux = calculadora.multiplicar(Double.parseDouble(txtPrimeiroNumero.getText()),
							Double.parseDouble(txtSegundoNumero.getText()));
					lblResultadoMultiplicao.setText(aux);
					aux = calculadora.subtrair(Double.parseDouble(txtPrimeiroNumero.getText()),
							Double.parseDouble(txtSegundoNumero.getText()));
					lblResultadoSubtracao.setText(aux);
				} catch (Exception err) {
					lblResultadoSoma.setText("Ver números");
					lblResultadoDivisao.setText("Ver números");
					lblResultadoMultiplicao.setText("Ver números");
					lblResultadoSubtracao.setText("Ver números");
				}
			}
		});
		txtSegundoNumero.setColumns(10);
		txtSegundoNumero.setBounds(231, 160, 110, 20);
		panelLista02Exercicio01.add(txtSegundoNumero);

		JLabel lblTituloLista02Exercicio01 = new JLabel("CALCULADORA");
		lblTituloLista02Exercicio01.setHorizontalAlignment(SwingConstants.CENTER);
		lblTituloLista02Exercicio01.setFont(new Font("JetBrains Mono", Font.BOLD, 16));
		lblTituloLista02Exercicio01.setBounds(10, 11, 552, 21);
		panelLista02Exercicio01.add(lblTituloLista02Exercicio01);

		JSeparator separator = new JSeparator();
		separator.setBounds(10, 58, 552, 2);
		panelLista02Exercicio01.add(separator);

		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 191, 552, 2);
		panelLista02Exercicio01.add(separator_1);

		JPanel panelLista02Exercicio02 = new JPanel();
		panelLista02Exercicio02.setFont(new Font("JetBrains Mono", Font.PLAIN, 14));
		tabbedPane.addTab("Exercício 02", null, panelLista02Exercicio02, null);
		panelLista02Exercicio02.setLayout(null);

		JLabel lblNomeAluno = new JLabel("Aluno:");
		lblNomeAluno.setFont(new Font("JetBrains Mono", Font.PLAIN, 14));
		lblNomeAluno.setBounds(10, 84, 99, 14);
		panelLista02Exercicio02.add(lblNomeAluno);

		JLabel lblIdadeAluno = new JLabel("Idade:");
		lblIdadeAluno.setFont(new Font("JetBrains Mono", Font.PLAIN, 14));
		lblIdadeAluno.setBounds(10, 109, 99, 14);
		panelLista02Exercicio02.add(lblIdadeAluno);

		JLabel lblNota1 = new JLabel("Nota 1:");
		lblNota1.setFont(new Font("JetBrains Mono", Font.PLAIN, 14));
		lblNota1.setBounds(10, 134, 99, 14);
		panelLista02Exercicio02.add(lblNota1);

		JLabel lblNota2 = new JLabel("Nota 2:");
		lblNota2.setFont(new Font("JetBrains Mono", Font.PLAIN, 14));
		lblNota2.setBounds(10, 159, 99, 14);
		panelLista02Exercicio02.add(lblNota2);

		JLabel lblNota3 = new JLabel("Nota 3:");
		lblNota3.setFont(new Font("JetBrains Mono", Font.PLAIN, 14));
		lblNota3.setBounds(10, 184, 99, 14);
		panelLista02Exercicio02.add(lblNota3);

		JLabel lblMedia = new JLabel("Média:");
		lblMedia.setFont(new Font("JetBrains Mono", Font.PLAIN, 14));
		lblMedia.setBounds(10, 236, 99, 14);
		panelLista02Exercicio02.add(lblMedia);

		JLabel lblAprovacao = new JLabel("Situação:");
		lblAprovacao.setFont(new Font("JetBrains Mono", Font.PLAIN, 14));
		lblAprovacao.setBounds(10, 265, 99, 14);
		panelLista02Exercicio02.add(lblAprovacao);

		JLabel lblResultadoMedia = new JLabel("");
		lblResultadoMedia.setFont(new Font("JetBrains Mono", Font.PLAIN, 14));
		lblResultadoMedia.setBounds(119, 236, 443, 14);
		panelLista02Exercicio02.add(lblResultadoMedia);

		JLabel lblResultadoAprovacao = new JLabel("");
		lblResultadoAprovacao.setFont(new Font("JetBrains Mono", Font.PLAIN, 14));
		lblResultadoAprovacao.setBounds(119, 265, 443, 14);
		panelLista02Exercicio02.add(lblResultadoAprovacao);

		txtNome = new JTextField();
		txtNome.setFont(new Font("JetBrains Mono", Font.PLAIN, 14));
		txtNome.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {

			}
		});
		txtNome.setBounds(118, 81, 280, 20);
		panelLista02Exercicio02.add(txtNome);
		txtNome.setColumns(10);

		txtIdade = new JTextField();
		txtIdade.setFont(new Font("JetBrains Mono", Font.PLAIN, 14));
		txtIdade.setColumns(10);
		txtIdade.setBounds(119, 106, 63, 20);
		panelLista02Exercicio02.add(txtIdade);

		txtNota1 = new JTextField();
		txtNota1.setFont(new Font("JetBrains Mono", Font.PLAIN, 14));
		txtNota1.setColumns(10);
		txtNota1.setBounds(119, 131, 63, 20);
		panelLista02Exercicio02.add(txtNota1);

		txtNota3 = new JTextField();
		txtNota3.setFont(new Font("JetBrains Mono", Font.PLAIN, 14));
		txtNota3.setColumns(10);
		txtNota3.setBounds(119, 181, 63, 20);
		panelLista02Exercicio02.add(txtNota3);

		txtNota2 = new JTextField();
		txtNota2.setFont(new Font("JetBrains Mono", Font.PLAIN, 14));
		txtNota2.setColumns(10);
		txtNota2.setBounds(119, 156, 63, 20);
		panelLista02Exercicio02.add(txtNota2);

		JButton btnVerificarSituacaoAluno = new JButton("Verificar situação do aluno");
		btnVerificarSituacaoAluno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Aluno aluno = new Aluno(txtNome.getText(), Integer.parseInt(txtIdade.getText()));
					String aux = aluno.calcularMedia(Double.parseDouble(txtNota1.getText()),
							Double.parseDouble(txtNota2.getText()), Double.parseDouble(txtNota3.getText()));
					lblResultadoMedia.setText(aux);
					aux = aluno.verificarAprovacao();
					lblResultadoAprovacao.setText(aux);
				} catch (Error err) {
					JOptionPane.showMessageDialog(null, "Informe todos os campos corretamente!");
				}
			}
		});
		btnVerificarSituacaoAluno.setBounds(193, 336, 186, 32);
		panelLista02Exercicio02.add(btnVerificarSituacaoAluno);

		JSeparator Lista02Exercicio02Separador01 = new JSeparator();
		Lista02Exercicio02Separador01.setBounds(10, 60, 552, 2);
		panelLista02Exercicio02.add(Lista02Exercicio02Separador01);

		JSeparator Lista02Exercicio02Separador02 = new JSeparator();
		Lista02Exercicio02Separador02.setBounds(10, 212, 552, 2);
		panelLista02Exercicio02.add(Lista02Exercicio02Separador02);

		JSeparator Lista02Exercicio02Separador03 = new JSeparator();
		Lista02Exercicio02Separador03.setBounds(10, 304, 552, 2);
		panelLista02Exercicio02.add(Lista02Exercicio02Separador03);

		JLabel lblNewLabel = new JLabel("MÉDIA DO ALUNO");
		lblNewLabel.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("JetBrains Mono", Font.BOLD, 16));
		lblNewLabel.setBounds(10, 11, 552, 38);
		panelLista02Exercicio02.add(lblNewLabel);

		JPanel panelLista02Exercicio03 = new JPanel();
		panelLista02Exercicio03.setFont(new Font("JetBrains Mono", Font.PLAIN, 14));
		tabbedPane.addTab("Exercício 03", null, panelLista02Exercicio03, null);
		panelLista02Exercicio03.setLayout(null);

		JLabel lblValorDoDeposito = new JLabel("Informe o valor do depósito:");
		lblValorDoDeposito.setHorizontalTextPosition(SwingConstants.CENTER);
		lblValorDoDeposito.setHorizontalAlignment(SwingConstants.CENTER);
		lblValorDoDeposito.setFont(new Font("JetBrains Mono", Font.PLAIN, 14));
		lblValorDoDeposito.setBounds(10, 92, 552, 14);
		panelLista02Exercicio03.add(lblValorDoDeposito);

		txtDeposito = new JTextField();
		txtDeposito.setHorizontalAlignment(SwingConstants.CENTER);
		txtDeposito.setFont(new Font("JetBrains Mono", Font.PLAIN, 14));
		txtDeposito.setBounds(225, 117, 121, 32);
		panelLista02Exercicio03.add(txtDeposito);
		txtDeposito.setColumns(10);

		JLabel lblValorDoSaque = new JLabel("Informe o valor do saque:");
		lblValorDoSaque.setHorizontalAlignment(SwingConstants.CENTER);
		lblValorDoSaque.setHorizontalTextPosition(SwingConstants.CENTER);
		lblValorDoSaque.setFont(new Font("JetBrains Mono", Font.PLAIN, 14));
		lblValorDoSaque.setBounds(10, 214, 552, 14);
		panelLista02Exercicio03.add(lblValorDoSaque);

		txtSaque = new JTextField();
		txtSaque.setHorizontalAlignment(SwingConstants.CENTER);
		txtSaque.setFont(new Font("JetBrains Mono", Font.PLAIN, 14));
		txtSaque.setColumns(10);
		txtSaque.setBounds(225, 239, 121, 32);
		panelLista02Exercicio03.add(txtSaque);

		Conta conta = new Conta("29873-0", "Corrente", "Danimar Henrique Varisa");

		JButton btnDepositar = new JButton("Depositar");
		btnDepositar.setHorizontalTextPosition(SwingConstants.CENTER);
		btnDepositar.setFont(new Font("JetBrains Mono", Font.PLAIN, 14));
		btnDepositar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String aux = conta.depositar(Double.parseDouble(txtDeposito.getText()));
					JOptionPane.showMessageDialog(null, aux);
				} catch (Exception err) {
					JOptionPane.showMessageDialog(null, "Verificar o valor depositado!");
				}
			}
		});
		btnDepositar.setBounds(225, 154, 121, 33);
		panelLista02Exercicio03.add(btnDepositar);

		JButton btnSacar = new JButton("Sacar");
		btnSacar.setHorizontalTextPosition(SwingConstants.CENTER);
		btnSacar.setFont(new Font("JetBrains Mono", Font.PLAIN, 14));
		btnSacar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String aux = conta.sacar(Double.parseDouble(txtSaque.getText()));
					JOptionPane.showMessageDialog(null, aux);
				} catch (Exception err) {
					JOptionPane.showMessageDialog(null, "Verificar o valor depositado!");
				}
			}
		});
		btnSacar.setBounds(225, 275, 121, 33);
		panelLista02Exercicio03.add(btnSacar);

		JButton btnExibirInformacoesConta = new JButton("Exibir informações da conta");
		btnExibirInformacoesConta.setFont(new Font("JetBrains Mono", Font.PLAIN, 14));
		btnExibirInformacoesConta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String aux = conta.verificarSaldo();
				JOptionPane.showMessageDialog(null, aux);
			}
		});
		btnExibirInformacoesConta.setBounds(152, 344, 267, 33);
		panelLista02Exercicio03.add(btnExibirInformacoesConta);

		JSeparator Lista02Exercicio03Separador01 = new JSeparator();
		Lista02Exercicio03Separador01.setBounds(10, 54, 552, 2);
		panelLista02Exercicio03.add(Lista02Exercicio03Separador01);

		JSeparator Lista02Exercicio03Separador02 = new JSeparator();
		Lista02Exercicio03Separador02.setBounds(146, 198, 279, 2);
		panelLista02Exercicio03.add(Lista02Exercicio03Separador02);

		JLabel lblTituloContaBancaria = new JLabel("CONTA BANCÁRIA");
		lblTituloContaBancaria.setFont(new Font("JetBrains Mono", Font.BOLD, 16));
		lblTituloContaBancaria.setHorizontalTextPosition(SwingConstants.CENTER);
		lblTituloContaBancaria.setHorizontalAlignment(SwingConstants.CENTER);
		lblTituloContaBancaria.setBounds(10, 11, 552, 32);
		panelLista02Exercicio03.add(lblTituloContaBancaria);

		JLabel lblOperacoesBancarias = new JLabel("Operações");
		lblOperacoesBancarias.setHorizontalTextPosition(SwingConstants.CENTER);
		lblOperacoesBancarias.setHorizontalAlignment(SwingConstants.CENTER);
		lblOperacoesBancarias.setFont(new Font("JetBrains Mono", Font.BOLD, 14));
		lblOperacoesBancarias.setBounds(10, 67, 552, 14);
		panelLista02Exercicio03.add(lblOperacoesBancarias);

		JSeparator Lista02Exercicio03Separador03 = new JSeparator();
		Lista02Exercicio03Separador03.setBounds(10, 319, 552, 2);
		panelLista02Exercicio03.add(Lista02Exercicio03Separador03);
	}
}
