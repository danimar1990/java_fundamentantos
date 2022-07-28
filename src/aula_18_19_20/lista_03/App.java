package aula_18_19_20.lista_03;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
	private JTextField txtNovaCor;
	private JTextField txtNovaAnotacao;

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
		App = new JFrame();
		App.getContentPane().setFont(new Font("JetBrains Mono", Font.PLAIN, 14));
		App.setBounds(100, 100, 530, 339);
		App.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		App.getContentPane().setLayout(null);

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setFont(new Font("JetBrains Mono", Font.PLAIN, 14));
		tabbedPane.setBounds(10, 11, 494, 278);
		App.getContentPane().add(tabbedPane);

		JPanel panelLista03Exercicio01 = new JPanel();
		panelLista03Exercicio01.setFont(new Font("JetBrains Mono", Font.PLAIN, 14));
		tabbedPane.addTab("Exercício 01", null, panelLista03Exercicio01, null);
		panelLista03Exercicio01.setLayout(null);

		Veiculo veiculo = new Veiculo(2010, "Hyundai", "Branca", 129642);

		JButton btnVerificarManutencao = new JButton("Verificar manutenção");
		btnVerificarManutencao.setFont(new Font("JetBrains Mono", Font.PLAIN, 14));
		btnVerificarManutencao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String aux = veiculo.verificarManutencao();
				JOptionPane.showMessageDialog(null, aux);
			}
		});
		btnVerificarManutencao.setBounds(143, 197, 203, 28);
		panelLista03Exercicio01.add(btnVerificarManutencao);

		txtNovaCor = new JTextField();
		txtNovaCor.setFont(new Font("JetBrains Mono", Font.PLAIN, 14));
		txtNovaCor.setBounds(143, 85, 96, 28);
		panelLista03Exercicio01.add(txtNovaCor);
		txtNovaCor.setColumns(10);

		JLabel lblNovaCor = new JLabel("Nova cor:");
		lblNovaCor.setFont(new Font("JetBrains Mono", Font.PLAIN, 14));
		lblNovaCor.setBounds(68, 85, 72, 28);
		panelLista03Exercicio01.add(lblNovaCor);

		JButton btnAlterarCor = new JButton("Alterar");
		btnAlterarCor.setFont(new Font("JetBrains Mono", Font.PLAIN, 14));
		btnAlterarCor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String aux = veiculo.mudarCor(txtNovaCor.getText());
				JOptionPane.showMessageDialog(null, aux);
			}
		});
		btnAlterarCor.setBounds(249, 85, 97, 28);
		panelLista03Exercicio01.add(btnAlterarCor);

		JButton btnExibirCor = new JButton("Exibir cor atual");
		btnExibirCor.setFont(new Font("JetBrains Mono", Font.PLAIN, 14));
		btnExibirCor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String aux = veiculo.exibirCor();
				JOptionPane.showMessageDialog(null, aux);
			}
		});
		btnExibirCor.setBounds(143, 158, 203, 28);
		panelLista03Exercicio01.add(btnExibirCor);
		
		JSeparator Exercicio01Separador02 = new JSeparator();
		Exercicio01Separador02.setBounds(10, 135, 469, 2);
		panelLista03Exercicio01.add(Exercicio01Separador02);
		
		JSeparator Exercicio01Separador01 = new JSeparator();
		Exercicio01Separador01.setBounds(10, 63, 469, 2);
		panelLista03Exercicio01.add(Exercicio01Separador01);
		
		JLabel lblTituloLista03Exercicio01 = new JLabel("MANUTENÇÃO DO VEÍCULO");
		lblTituloLista03Exercicio01.setFont(new Font("JetBrains Mono", Font.BOLD, 16));
		lblTituloLista03Exercicio01.setHorizontalTextPosition(SwingConstants.CENTER);
		lblTituloLista03Exercicio01.setHorizontalAlignment(SwingConstants.CENTER);
		lblTituloLista03Exercicio01.setBounds(10, 11, 469, 28);
		panelLista03Exercicio01.add(lblTituloLista03Exercicio01);

		JPanel panelLista03Exercicio02 = new JPanel();
		panelLista03Exercicio02.setFont(new Font("JetBrains Mono", Font.PLAIN, 14));
		tabbedPane.addTab("Exercício 02", null, panelLista03Exercicio02, null);
		panelLista03Exercicio02.setLayout(null);

		JLabel lblNovaAnotacao = new JLabel("Nova anotação");
		lblNovaAnotacao.setFont(new Font("JetBrains Mono", Font.PLAIN, 14));
		lblNovaAnotacao.setBounds(186, 59, 117, 24);
		panelLista03Exercicio02.add(lblNovaAnotacao);

		txtNovaAnotacao = new JTextField();
		txtNovaAnotacao.setBounds(147, 92, 195, 30);
		panelLista03Exercicio02.add(txtNovaAnotacao);
		txtNovaAnotacao.setColumns(10);

		CadernoAnotacoes cadernoAnotacao = new CadernoAnotacoes();

		JButton btnAdicionarAnotacao = new JButton("Adicionar");
		btnAdicionarAnotacao.setFont(new Font("JetBrains Mono", Font.PLAIN, 14));
		btnAdicionarAnotacao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String aux = cadernoAnotacao.adicionarAnotacao(txtNovaAnotacao.getText());
				JOptionPane.showMessageDialog(null, aux);
			}
		});
		btnAdicionarAnotacao.setBounds(176, 133, 137, 36);
		panelLista03Exercicio02.add(btnAdicionarAnotacao);

		JButton btnExibirAnotacoes = new JButton("Exibir anotações");
		btnExibirAnotacoes.setFont(new Font("JetBrains Mono", Font.PLAIN, 14));
		btnExibirAnotacoes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String aux = cadernoAnotacao.visualizarAnotacoes();
				JOptionPane.showMessageDialog(null, aux);
			}
		});
		btnExibirAnotacoes.setBounds(10, 193, 176, 38);
		panelLista03Exercicio02.add(btnExibirAnotacoes);

		JButton btnExcluirAnotacoes = new JButton("Excluir anotações");
		btnExcluirAnotacoes.setFont(new Font("JetBrains Mono", Font.PLAIN, 14));
		btnExcluirAnotacoes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String aux = cadernoAnotacao.apagarAnotacoes();
				JOptionPane.showMessageDialog(null, aux);
			}
		});
		btnExcluirAnotacoes.setBounds(303, 193, 176, 38);
		panelLista03Exercicio02.add(btnExcluirAnotacoes);
		
		JSeparator Exercicio02Separador02 = new JSeparator();
		Exercicio02Separador02.setBounds(10, 180, 469, 2);
		panelLista03Exercicio02.add(Exercicio02Separador02);
		
		JSeparator Exercicio02Separador01 = new JSeparator();
		Exercicio02Separador01.setBounds(10, 46, 469, 2);
		panelLista03Exercicio02.add(Exercicio02Separador01);
		
		JLabel lblTituloCadernoDeAnotacoes = new JLabel("CADERNO DE ANOTAÇÕES");
		lblTituloCadernoDeAnotacoes.setHorizontalAlignment(SwingConstants.CENTER);
		lblTituloCadernoDeAnotacoes.setHorizontalTextPosition(SwingConstants.CENTER);
		lblTituloCadernoDeAnotacoes.setFont(new Font("JetBrains Mono", Font.BOLD, 16));
		lblTituloCadernoDeAnotacoes.setBounds(10, 11, 469, 24);
		panelLista03Exercicio02.add(lblTituloCadernoDeAnotacoes);

		JPanel panelLista03Exercicio03 = new JPanel();
		panelLista03Exercicio03.setFont(new Font("JetBrains Mono", Font.PLAIN, 14));
		tabbedPane.addTab("Exercício 03", null, panelLista03Exercicio03, null);
		panelLista03Exercicio03.setLayout(null);

		Produto produto = new Produto("Melancia", 20.0, 3.55);

		JButton btnCalcularPrecoVenda = new JButton("Calcular preço de venda");
		btnCalcularPrecoVenda.setFont(new Font("JetBrains Mono", Font.PLAIN, 14));
		btnCalcularPrecoVenda.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String aux = produto.aumentarPreco();
				JOptionPane.showMessageDialog(null, aux);
			}
		});
		btnCalcularPrecoVenda.setBounds(130, 184, 229, 34);
		panelLista03Exercicio03.add(btnCalcularPrecoVenda);
		
		JLabel lblTituloLista03Exercicio03 = new JLabel("PREÇO DE VENDA DE PRODUTOS");
		lblTituloLista03Exercicio03.setHorizontalTextPosition(SwingConstants.CENTER);
		lblTituloLista03Exercicio03.setHorizontalAlignment(SwingConstants.CENTER);
		lblTituloLista03Exercicio03.setFont(new Font("JetBrains Mono", Font.BOLD, 16));
		lblTituloLista03Exercicio03.setBounds(10, 11, 469, 34);
		panelLista03Exercicio03.add(lblTituloLista03Exercicio03);
		
		JLabel lblNomeProduto = new JLabel("Produto: Melancia");
		lblNomeProduto.setFont(new Font("JetBrains Mono", Font.PLAIN, 14));
		lblNomeProduto.setBounds(10, 94, 469, 14);
		panelLista03Exercicio03.add(lblNomeProduto);
		
		JLabel lblPrecoCustoProduto = new JLabel("Preço de custo: R$ 3,55");
		lblPrecoCustoProduto.setFont(new Font("JetBrains Mono", Font.PLAIN, 14));
		lblPrecoCustoProduto.setBounds(10, 119, 469, 14);
		panelLista03Exercicio03.add(lblPrecoCustoProduto);
		
		JSeparator Exercicio03Separador02 = new JSeparator();
		Exercicio03Separador02.setBounds(10, 155, 469, 5);
		panelLista03Exercicio03.add(Exercicio03Separador02);
		
		JSeparator Exercicio03Separador01 = new JSeparator();
		Exercicio03Separador01.setBounds(10, 68, 469, 5);
		panelLista03Exercicio03.add(Exercicio03Separador01);
	}
}
