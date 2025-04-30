package Caso3;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ventana3 extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtRadio;
	private JLabel lblNewLabel;
	private JLabel lblAltura;
	private JTextField txtAltura;
	private JButton btnProcesar;
	private JScrollPane scrollPane;
	private JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana3 frame = new Ventana3();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Ventana3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		{
			txtRadio = new JTextField();
			txtRadio.setBounds(66, 34, 86, 20);
			contentPane.add(txtRadio);
			txtRadio.setColumns(10);
		}
		{
			lblNewLabel = new JLabel("Radio:");
			lblNewLabel.setBounds(10, 37, 46, 14);
			contentPane.add(lblNewLabel);
		}
		{
			lblAltura = new JLabel("Altura:");
			lblAltura.setBounds(10, 62, 46, 14);
			contentPane.add(lblAltura);
		}
		{
			txtAltura = new JTextField();
			txtAltura.setColumns(10);
			txtAltura.setBounds(66, 59, 86, 20);
			contentPane.add(txtAltura);
		}
		{
			btnProcesar = new JButton("Procesar");
			btnProcesar.addActionListener(this);
			btnProcesar.setBounds(172, 33, 89, 23);
			contentPane.add(btnProcesar);
		}
		{
			scrollPane = new JScrollPane();
			scrollPane.setBounds(20, 87, 241, 163);
			contentPane.add(scrollPane);
			{
				textArea = new JTextArea();
				scrollPane.setViewportView(textArea);
			}
		}
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnProcesar) {
			do_btnProcesar_actionPerformed(e);
		}
	}
	protected void do_btnProcesar_actionPerformed(ActionEvent e) {
		double radio = Double.parseDouble(txtRadio.getText());
		double altura = Double.parseDouble(txtAltura.getText());
		Cilindro c1=new Cilindro(radio, altura);
		Resultado(c1);
	}
	void Imprimir(String s) {
		textArea.append(s+"\n");
	}
	void Resultado(Cilindro c) {
		Imprimir("La altura es: "+ c.getAltura());
		Imprimir("El radio es: "+c.getRadio());
		Imprimir("El volumen es: "+c.Volumen());
	}
}
