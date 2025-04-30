package Caso1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ventana1 extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JTextField txtBase;
	private JTextField txtAltura;
	private JButton btnPorcesar;
	private JButton btnBorrar;
	private JScrollPane scrollPane;
	private JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana1 frame = new Ventana1();
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
	public Ventana1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		{
			lblNewLabel = new JLabel("Base:");
			lblNewLabel.setBounds(20, 28, 46, 14);
			contentPane.add(lblNewLabel);
		}
		{
			lblNewLabel_1 = new JLabel("Altura:");
			lblNewLabel_1.setBounds(20, 53, 46, 14);
			contentPane.add(lblNewLabel_1);
		}
		{
			txtBase = new JTextField();
			txtBase.setBounds(76, 25, 86, 20);
			contentPane.add(txtBase);
			txtBase.setColumns(10);
		}
		{
			txtAltura = new JTextField();
			txtAltura.setBounds(76, 50, 86, 20);
			contentPane.add(txtAltura);
			txtAltura.setColumns(10);
		}
		{
			btnPorcesar = new JButton("Procesar");
			btnPorcesar.addActionListener(this);
			btnPorcesar.setBounds(20, 87, 89, 23);
			contentPane.add(btnPorcesar);
		}
		{
			btnBorrar = new JButton("Borrar");
			btnBorrar.addActionListener(this);
			btnBorrar.setBounds(20, 121, 89, 23);
			contentPane.add(btnBorrar);
		}
		{
			scrollPane = new JScrollPane();
			scrollPane.setBounds(133, 87, 291, 163);
			contentPane.add(scrollPane);
			{
				textArea = new JTextArea();
				scrollPane.setViewportView(textArea);
			}
		}
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnBorrar) {
			do_btnBorrar_actionPerformed(e);
		}
		if (e.getSource() == btnPorcesar) {
			do_btnPorcesar_actionPerformed(e);
		}
	}
	protected void do_btnPorcesar_actionPerformed(ActionEvent e) {
		double base=Double.parseDouble(txtBase.getText());
		double altura=Double.parseDouble(txtAltura.getText());
		Triángulo t1= new Triángulo(base, altura);
		Resultado(t1);
		t1.setAltura(t1.getAltura()+3);
		t1.setBase(t1.getBase()-2);
		Resultado(t1);
	}
	void Imprimir(String s) {
		textArea.append(s+"\n");
	}
	void Resultado(Triángulo t) {
		Imprimir("La base es : "+t.getBase() + " y la altura es: "+t.getAltura());
		Imprimir("El área es: "+t.Area());
	}
	protected void do_btnBorrar_actionPerformed(ActionEvent e) {
		txtBase.setText("");
		txtAltura.setText("");
		textArea.setText("");
		txtBase.grabFocus();
	}
}
