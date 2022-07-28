package aula_18_19_20;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

public class AppTeste {

	private JFrame App;
	private JTextField textField;
	private JTextField txtExercicio;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AppTeste window = new AppTeste();
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
	public AppTeste() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		App = new JFrame();
		App.getContentPane().setFont(new Font("JetBrains Mono", Font.PLAIN, 14));
		App.setFont(new Font("JetBrains Mono", Font.PLAIN, 14));
		App.setTitle("Java Swing - Danimar");
		App.setBounds(100, 100, 920, 554);
		App.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setFont(new Font("JetBrains Mono", Font.PLAIN, 14));
		App.getContentPane().add(tabbedPane, BorderLayout.CENTER);
		
		JTabbedPane tab_lista_01 = new JTabbedPane(JTabbedPane.TOP);
		tab_lista_01.setFont(new Font("JetBrains Mono", Font.PLAIN, 12));
		tabbedPane.addTab("Lista 01", null, tab_lista_01, null);
		
		JPanel panel_lst01_ex01 = new JPanel();
		panel_lst01_ex01.setFont(new Font("JetBrains Mono", Font.PLAIN, 14));
		tab_lista_01.addTab("Exercício 01", null, panel_lst01_ex01, null);
		panel_lst01_ex01.setLayout(null);

		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setFont(new Font("JetBrains Mono", Font.PLAIN, 14));
		textField.setBounds(405, 164, 94, 26);
		panel_lst01_ex01.add(textField);
		textField.setColumns(10);
		
		JLabel lblNumeroExercicio01 = new JLabel("Informe um número abaixo:");
		lblNumeroExercicio01.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNumeroExercicio01.setHorizontalAlignment(SwingConstants.CENTER);
		lblNumeroExercicio01.setFont(new Font("JetBrains Mono", Font.PLAIN, 14));
		lblNumeroExercicio01.setBounds(345, 121, 214, 16);
		panel_lst01_ex01.add(lblNumeroExercicio01);
		
		JLabel lblResultadoFraseExercicio01 = new JLabel("O sucessor é:");
		lblResultadoFraseExercicio01.setFont(new Font("JetBrains Mono", Font.PLAIN, 14));
		lblResultadoFraseExercicio01.setHorizontalTextPosition(SwingConstants.CENTER);
		lblResultadoFraseExercicio01.setHorizontalAlignment(SwingConstants.CENTER);
		lblResultadoFraseExercicio01.setBounds(393, 256, 118, 16);
		panel_lst01_ex01.add(lblResultadoFraseExercicio01);
		
		JLabel lblResultadoExercicio01 = new JLabel("Resultado");
		lblResultadoExercicio01.setBorder(UIManager.getBorder("TextField.border"));
		lblResultadoExercicio01.setHorizontalTextPosition(SwingConstants.CENTER);
		lblResultadoExercicio01.setHorizontalAlignment(SwingConstants.CENTER);
		lblResultadoExercicio01.setFont(new Font("JetBrains Mono", Font.PLAIN, 14));
		lblResultadoExercicio01.setBounds(415, 284, 74, 22);
		panel_lst01_ex01.add(lblResultadoExercicio01);
		
		JLabel lblDescricaoExercicio01 = new JLabel("Exercício 01 - Leia um número e exiba o seu sucessor");
		lblDescricaoExercicio01.setFont(new Font("JetBrains Mono", Font.PLAIN, 14));
		lblDescricaoExercicio01.setHorizontalTextPosition(SwingConstants.CENTER);
		lblDescricaoExercicio01.setHorizontalAlignment(SwingConstants.CENTER);
		lblDescricaoExercicio01.setBounds(6, 35, 892, 16);
		panel_lst01_ex01.add(lblDescricaoExercicio01);
		
		JPanel panel_lst01_ex02 = new JPanel();
		tab_lista_01.addTab("Exercício 02", null, panel_lst01_ex02, null);
		panel_lst01_ex02.setLayout(null);
		
		txtExercicio = new JTextField();
		txtExercicio.setHorizontalAlignment(SwingConstants.CENTER);
		txtExercicio.setEditable(false);
		txtExercicio.setFont(new Font("JetBrains Mono", Font.PLAIN, 14));
		txtExercicio.setText("Exercício 02 - Dada uma distância percorrida (em quilômetros), bem como o total de combustível gasto (em litros), informe o consumo do veículo");
		txtExercicio.setBounds(6, 31, 892, 22);
		panel_lst01_ex02.add(txtExercicio);
		txtExercicio.setColumns(10);
		
		JPanel panel_lst01_ex03 = new JPanel();
		tab_lista_01.addTab("Exercício 03", null, panel_lst01_ex03, null);
		
		JPanel panel_lst01_ex04 = new JPanel();
		tab_lista_01.addTab("Exercício 04", null, panel_lst01_ex04, null);
		
		JPanel panel_lst01_ex05 = new JPanel();
		tab_lista_01.addTab("Exercício 05", null, panel_lst01_ex05, null);
		
		JPanel panel_lst01_ex06 = new JPanel();
		tab_lista_01.addTab("Exercício 06", null, panel_lst01_ex06, null);
		
		JPanel panel_lst01_ex07 = new JPanel();
		tab_lista_01.addTab("Exercício 07", null, panel_lst01_ex07, null);
		
		JPanel panel_lst01_ex08 = new JPanel();
		tab_lista_01.addTab("Exercício 08", null, panel_lst01_ex08, null);
		
		JTabbedPane tab_lista_02 = new JTabbedPane(JTabbedPane.TOP);
		tab_lista_02.setFont(new Font("JetBrains Mono", Font.PLAIN, 12));
		tabbedPane.addTab("Lista 02", null, tab_lista_02, null);
		
		JPanel panel_lst02_ex01 = new JPanel();
		tab_lista_02.addTab("Exercício 01", null, panel_lst02_ex01, null);
		
		JPanel panel_lst02_ex02 = new JPanel();
		tab_lista_02.addTab("Exercício 02", null, panel_lst02_ex02, null);
		
		JPanel panel_lst02_ex03 = new JPanel();
		tab_lista_02.addTab("Exercício 03", null, panel_lst02_ex03, null);
		
		JTabbedPane tab_lista_03 = new JTabbedPane(JTabbedPane.TOP);
		tab_lista_03.setFont(new Font("JetBrains Mono", Font.PLAIN, 12));
		tabbedPane.addTab("Lista 03", null, tab_lista_03, null);
		
		JPanel panel_lst03_ex01 = new JPanel();
		tab_lista_03.addTab("Exercício 01", null, panel_lst03_ex01, null);
		
		JPanel panel_lst03_ex02 = new JPanel();
		tab_lista_03.addTab("Exercício 02", null, panel_lst03_ex02, null);
		
		JPanel panel_lst03_ex03 = new JPanel();
		tab_lista_03.addTab("Exercício 03", null, panel_lst03_ex03, null);
	}
}
