package aula_18_19_20.lista_01;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextPane;

public class App {

	private JFrame frmLista;
	private JTextField textInput;
	private JTextField textKmPercorrido;
	private JTextField textCombustivelGasto;
	private JTextField textAnosFumando;
	private JTextField textFumandoDia;
	private JTextField textValorCarteira;
	private JTextField textCigarosCarteira;
	private JTextField textN1;
	private JTextField textN2;
	private JTextField textNome;
	private JTextField textIdade;
	private JTextField textIdade2;
	private JTextField textBase;
	private JTextField textExpoente;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					App window = new App();
					window.frmLista.setVisible(true);
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
		Exercicio01 exercicio01 = new Exercicio01();
		Exercicio02 exercicio02 = new Exercicio02();
		Exercicio03 exercicio03 = new Exercicio03();
		Exercicio04 exercicio04 = new Exercicio04();
		Exercicio05 exercicio05 = new Exercicio05();
		Exercicio06 exercicio06 = new Exercicio06();
		Exercicio07 exercicio07 = new Exercicio07();
		Exercicio08 exercicio08 = new Exercicio08();
		frmLista = new JFrame();
		frmLista.getContentPane().setFont(new Font("JetBrains Mono", Font.PLAIN, 14));
		frmLista.setTitle("Lista 01 - Java Swing Danimar");
		frmLista.setBounds(100, 100, 522, 306);
		frmLista.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmLista.getContentPane().setLayout(null);

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setFont(new Font("JetBrains Mono", Font.PLAIN, 14));
		tabbedPane.setBounds(10, 11, 486, 245);
		frmLista.getContentPane().add(tabbedPane);

		JPanel panel = new JPanel();
		panel.setFont(new Font("JetBrains Mono", Font.PLAIN, 14));
		tabbedPane.addTab("Exercício 01", null, panel, null);
		panel.setLayout(null);

		JLabel lblNewLabel = new JLabel("Digite um número:");
		lblNewLabel.setFont(new Font("JetBrains Mono", Font.PLAIN, 14));
		lblNewLabel.setBounds(50, 73, 139, 14);
		panel.add(lblNewLabel);

		JLabel lblSucessor = new JLabel("...");
		lblSucessor.setFont(new Font("JetBrains Mono", Font.PLAIN, 14));

		textInput = new JTextField();
		textInput.setBounds(199, 71, 112, 20);
		panel.add(textInput);
		textInput.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				try {
					int aux = exercicio01.getSucessor(Integer.parseInt(textInput.getText()));
					lblSucessor.setText(Integer.toString(aux));
				} catch (Exception err) {
					lblSucessor.setText("O número informado deve ser do tipo inteiro!");
				}
			}
		});
		textInput.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("Seu sucessor é:");
		lblNewLabel_1.setFont(new Font("JetBrains Mono", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(50, 110, 139, 14);
		panel.add(lblNewLabel_1);

		lblSucessor.setBounds(199, 110, 200, 14);
		panel.add(lblSucessor);
		
		JTextPane textPane = new JTextPane();
		textPane.setEnabled(false);
		textPane.setEditable(false);
		textPane.setBounds(10, 11, 461, 20);
		panel.add(textPane);

		JPanel panel_1 = new JPanel();
		panel_1.setFont(new Font("JetBrains Mono", Font.PLAIN, 14));
		tabbedPane.addTab("Exercício 02", null, panel_1, null);
		panel_1.setLayout(null);

		JLabel lblNewLabel_2 = new JLabel("Quilometros percorridos:");
		lblNewLabel_2.setBounds(10, 11, 148, 30);
		panel_1.add(lblNewLabel_2);

		JLabel lblNewLabel_2_1 = new JLabel("Combustível gasto:");
		lblNewLabel_2_1.setBounds(10, 52, 148, 30);
		panel_1.add(lblNewLabel_2_1);

		JLabel lblMedia = new JLabel("...");

		textKmPercorrido = new JTextField();
		textKmPercorrido.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				try {
					double aux = exercicio02.mediaCarro(Double.parseDouble(textKmPercorrido.getText()),
							Double.parseDouble(textCombustivelGasto.getText()));
					lblMedia.setText(Double.toString(aux));
				} catch (Exception err) {
					lblMedia.setText("Quilometragem e combustível deve ter formato '0.00'!");
				}
			}
		});
		textKmPercorrido.setBounds(168, 16, 86, 20);
		panel_1.add(textKmPercorrido);
		textKmPercorrido.setColumns(10);

		textCombustivelGasto = new JTextField();
		textCombustivelGasto.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				try {
					double aux = exercicio02.mediaCarro(Double.parseDouble(textKmPercorrido.getText()),
							Double.parseDouble(textCombustivelGasto.getText()));
					lblMedia.setText(Double.toString(aux));
				} catch (Exception err) {
					lblMedia.setText("Quilometragem e combustível deve ter formato '0.00'!");
				}
			}
		});
		textCombustivelGasto.setColumns(10);
		textCombustivelGasto.setBounds(168, 57, 86, 20);
		panel_1.add(textCombustivelGasto);

		JLabel lblNewLabel_2_1_1 = new JLabel("Média:");
		lblNewLabel_2_1_1.setBounds(10, 104, 126, 30);
		panel_1.add(lblNewLabel_2_1_1);

		lblMedia.setBounds(167, 104, 126, 30);
		panel_1.add(lblMedia);

		JPanel panel_2 = new JPanel();
		panel_2.setFont(new Font("JetBrains Mono", Font.PLAIN, 14));
		tabbedPane.addTab("Exercício 03", null, panel_2, null);
		panel_2.setLayout(null);

		JLabel lblNewLabel_3 = new JLabel("Quantidade de anos fumando:");
		lblNewLabel_3.setBounds(10, 11, 141, 14);
		panel_2.add(lblNewLabel_3);

		JLabel lblNewLabel_3_1 = new JLabel("Cigarros fumados por dia:");
		lblNewLabel_3_1.setBounds(10, 43, 141, 14);
		panel_2.add(lblNewLabel_3_1);

		JLabel lblNewLabel_3_1_1 = new JLabel("Valor da carteira cigarro:");
		lblNewLabel_3_1_1.setBounds(10, 71, 141, 14);
		panel_2.add(lblNewLabel_3_1_1);

		JLabel lblNewLabel_3_1_1_1 = new JLabel("Quantidade de cigarros por carteira:");
		lblNewLabel_3_1_1_1.setBounds(10, 96, 215, 27);
		panel_2.add(lblNewLabel_3_1_1_1);

		JLabel lblNewLabel_3_1_1_1_1 = new JLabel("Valor total gasto:");
		lblNewLabel_3_1_1_1_1.setBounds(10, 179, 75, 27);
		panel_2.add(lblNewLabel_3_1_1_1_1);

		JLabel lblTotalGasto = new JLabel("...");
		lblTotalGasto.setHorizontalAlignment(SwingConstants.CENTER);
		lblTotalGasto.setBounds(104, 179, 295, 27);
		panel_2.add(lblTotalGasto);

		textAnosFumando = new JTextField();
		textAnosFumando.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				try {
					Double aux = exercicio03.gastoFumando(Double.parseDouble(textCigarosCarteira.getText()),
							Double.parseDouble(textFumandoDia.getText()), Double.parseDouble(textAnosFumando.getText()),
							Double.parseDouble(textValorCarteira.getText()));
					lblTotalGasto.setText(Double.toString(aux));
				} catch (Exception err) {
					lblTotalGasto.setText("Informar todos os campos no formato '0.00'");
				}
			}
		});
		textAnosFumando.setBounds(259, 11, 86, 20);
		panel_2.add(textAnosFumando);
		textAnosFumando.setColumns(10);

		textFumandoDia = new JTextField();
		textFumandoDia.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				try {
					Double aux = exercicio03.gastoFumando(Double.parseDouble(textCigarosCarteira.getText()),
							Double.parseDouble(textFumandoDia.getText()), Double.parseDouble(textAnosFumando.getText()),
							Double.parseDouble(textValorCarteira.getText()));
					lblTotalGasto.setText(Double.toString(aux));
				} catch (Exception err) {
					lblTotalGasto.setText("Informar todos os campos no formato '0.00'!");
				}
			}
		});
		textFumandoDia.setColumns(10);
		textFumandoDia.setBounds(259, 43, 86, 20);
		panel_2.add(textFumandoDia);

		textValorCarteira = new JTextField();
		textValorCarteira.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				try {
					Double aux = exercicio03.gastoFumando(Double.parseDouble(textCigarosCarteira.getText()),
							Double.parseDouble(textFumandoDia.getText()), Double.parseDouble(textAnosFumando.getText()),
							Double.parseDouble(textValorCarteira.getText()));
					lblTotalGasto.setText(Double.toString(aux));
				} catch (Exception err) {
					lblTotalGasto.setText("Informar todos os campos no formato '0.00'!");
				}
			}
		});
		textValorCarteira.setColumns(10);
		textValorCarteira.setBounds(259, 71, 86, 20);
		panel_2.add(textValorCarteira);

		textCigarosCarteira = new JTextField();
		textCigarosCarteira.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				try {
					Double aux = exercicio03.gastoFumando(Double.parseDouble(textCigarosCarteira.getText()),
							Double.parseDouble(textFumandoDia.getText()), Double.parseDouble(textAnosFumando.getText()),
							Double.parseDouble(textValorCarteira.getText()));
					lblTotalGasto.setText(Double.toString(aux));
				} catch (Exception err) {
					lblTotalGasto.setText("Informar todos os campos no formato '0.00'!");
				}
			}
		});
		textCigarosCarteira.setColumns(10);
		textCigarosCarteira.setBounds(259, 102, 86, 20);
		panel_2.add(textCigarosCarteira);

		JPanel panel_3 = new JPanel();
		panel_3.setFont(new Font("JetBrains Mono", Font.PLAIN, 14));
		tabbedPane.addTab("Exercício 04", null, panel_3, null);
		panel_3.setLayout(null);

		JLabel lblNewLabel_4 = new JLabel("2º número:");
		lblNewLabel_4.setBounds(10, 11, 91, 25);
		panel_3.add(lblNewLabel_4);

		JLabel lblNewLabel_4_1 = new JLabel("1º número:");
		lblNewLabel_4_1.setBounds(10, 47, 91, 25);
		panel_3.add(lblNewLabel_4_1);

		JLabel lblResultado = new JLabel("...");
		lblResultado.setBounds(81, 89, 228, 35);
		panel_3.add(lblResultado);

		textN2 = new JTextField();
		textN2.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				try {
					String aux = exercicio04.numeroMaior(Double.parseDouble(textN1.getText()),
							Double.parseDouble(textN2.getText()));
					lblResultado.setText(aux);
				} catch (Exception err) {
					lblResultado.setText("Informe números no formato '0.00'!");
				}
			}
		});

		textN1 = new JTextField();
		textN1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				try {
					String aux = exercicio04.numeroMaior(Double.parseDouble(textN1.getText()),
							Double.parseDouble(textN2.getText()));
					lblResultado.setText(aux);
				} catch (Exception err) {
					lblResultado.setText("Informe números no formato '0.00'!");
				}
			}
		});
		textN1.setBounds(125, 13, 86, 20);
		panel_3.add(textN1);
		textN1.setColumns(10);

		textN2.setColumns(10);
		textN2.setBounds(125, 47, 86, 20);
		panel_3.add(textN2);

		JPanel panel_4 = new JPanel();
		panel_4.setFont(new Font("JetBrains Mono", Font.PLAIN, 14));
		tabbedPane.addTab("Exercício 05", null, panel_4, null);
		panel_4.setLayout(null);

		JLabel lblNewLabel_5 = new JLabel("Nome:");
		lblNewLabel_5.setBounds(20, 11, 75, 26);
		panel_4.add(lblNewLabel_5);

		JLabel lblNewLabel_5_1 = new JLabel("Idade:");
		lblNewLabel_5_1.setBounds(20, 48, 75, 26);
		panel_4.add(lblNewLabel_5_1);

		JLabel lblResultado2 = new JLabel("...");
		lblResultado2.setBounds(86, 96, 215, 34);
		panel_4.add(lblResultado2);

		textNome = new JTextField();
		textNome.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				try {
					String aux = exercicio05.podeVotar(Integer.parseInt(textIdade.getText()), textNome.getText());
					lblResultado2.setText(aux);
				} catch (Exception err) {
					lblResultado2.setText("Idade deve ser do tipo inteiro!");
				}
			}
		});
		textNome.setBounds(166, 14, 233, 20);
		panel_4.add(textNome);
		textNome.setColumns(10);

		textIdade = new JTextField();
		textIdade.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				try {
					String aux = exercicio05.podeVotar(Integer.parseInt(textIdade.getText()), textNome.getText());
					lblResultado2.setText(aux);
				} catch (Exception err) {
					lblResultado2.setText("Idade deve ser do tipo inteiro!");
				}
			}
		});
		textIdade.setColumns(10);
		textIdade.setBounds(166, 51, 86, 20);
		panel_4.add(textIdade);

		JPanel panel_5 = new JPanel();
		panel_5.setFont(new Font("Javanese Text", Font.PLAIN, 14));
		tabbedPane.addTab("Exercício 06", null, panel_5, null);
		panel_5.setLayout(null);

		JLabel lblNewLabel_5_1_1 = new JLabel("Idade:");
		lblNewLabel_5_1_1.setBounds(32, 11, 75, 26);
		panel_5.add(lblNewLabel_5_1_1);

		JLabel lblResultado3 = new JLabel("...");

		textIdade2 = new JTextField();
		textIdade2.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				try {
					String aux = exercicio06.doarSangue(Integer.parseInt(textIdade2.getText()));
					lblResultado3.setText(aux);
				} catch (Exception err) {
					lblResultado3.setText("Informe a idade:");
				}
			}
		});
		textIdade2.setColumns(10);
		textIdade2.setBounds(178, 14, 86, 20);
		panel_5.add(textIdade2);

		lblResultado3.setBounds(77, 71, 214, 14);
		panel_5.add(lblResultado3);

		JPanel panel_6 = new JPanel();
		panel_6.setFont(new Font("JetBrains Mono", Font.PLAIN, 14));
		tabbedPane.addTab("Exercício 07", null, panel_6, null);
		panel_6.setLayout(null);

		JLabel lblResultado4 = new JLabel("...");

		JCheckBox chBoxZeChico = new JCheckBox("Calcular");
		chBoxZeChico.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					if (chBoxZeChico.isSelected()) {
						String aux = exercicio07.atv7();
						lblResultado4.setText(aux);
					} else {
						lblResultado4.setText("...");
					}
				} catch (Exception err) {
					lblResultado4.setText("Erro inesperado");
				}

			}
		});
		chBoxZeChico.setBounds(52, 26, 298, 23);
		panel_6.add(chBoxZeChico);

		lblResultado4.setBounds(26, 77, 324, 14);
		panel_6.add(lblResultado4);

		JPanel panel_7 = new JPanel();
		panel_7.setFont(new Font("JetBrains Mono", Font.PLAIN, 14));
		tabbedPane.addTab("Exercício 08", null, panel_7, null);
		panel_7.setLayout(null);

		JLabel lblNewLabel_6 = new JLabel("Base:");
		lblNewLabel_6.setBounds(20, 21, 101, 19);
		panel_7.add(lblNewLabel_6);

		JLabel lblNewLabel_6_1 = new JLabel("Expoente:");
		lblNewLabel_6_1.setBounds(20, 51, 101, 19);
		panel_7.add(lblNewLabel_6_1);

		JLabel lblResultado5 = new JLabel("...");
		lblResultado5.setBounds(30, 94, 317, 19);
		panel_7.add(lblResultado5);

		textBase = new JTextField();
		textBase.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				try {
					String aux = exercicio08.potencia(Integer.parseInt(textBase.getText()),
							Integer.parseInt(textExpoente.getText()));
					lblResultado5.setText(aux);
				} catch (Exception err) {
					lblResultado5.setText("Informe base e expoente inteiro!");
				}
			}
		});
		textBase.setBounds(126, 20, 86, 20);
		panel_7.add(textBase);
		textBase.setColumns(10);

		textExpoente = new JTextField();
		textExpoente.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				try {
					String aux = exercicio08.potencia(Integer.parseInt(textBase.getText()),
							Integer.parseInt(textExpoente.getText()));
					lblResultado5.setText(aux);
				} catch (Exception err) {
					lblResultado5.setText("Informe base e expoente inteiro");
				}
			}
		});
		textExpoente.setColumns(10);
		textExpoente.setBounds(126, 50, 86, 20);
		panel_7.add(textExpoente);
	}
}
