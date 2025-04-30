package Caso4;

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

public class Ventana4 extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JTextField txtCat1;
	private JTextField txtCat2;
	private JButton btnNewButton;
	private JScrollPane scrollPane;
	private JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana4 frame = new Ventana4();
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
	public Ventana4() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		{
			lblNewLabel = new JLabel("Cateto 1:");
			lblNewLabel.setBounds(40, 32, 46, 14);
			contentPane.add(lblNewLabel);
		}
		{
			lblNewLabel_1 = new JLabel("Cateto 2:");
			lblNewLabel_1.setBounds(40, 57, 46, 14);
			contentPane.add(lblNewLabel_1);
		}
		{
			txtCat1 = new JTextField();
			txtCat1.setBounds(107, 29, 86, 20);
			contentPane.add(txtCat1);
			txtCat1.setColumns(10);
		}
		{
			txtCat2 = new JTextField();
			txtCat2.setBounds(107, 54, 86, 20);
			contentPane.add(txtCat2);
			txtCat2.setColumns(10);
		}
		{
			btnNewButton = new JButton("Procesar");
			btnNewButton.addActionListener(this);
			btnNewButton.setBounds(68, 86, 89, 23);
			contentPane.add(btnNewButton);
		}
		{
			scrollPane = new JScrollPane();
			scrollPane.setBounds(40, 114, 151, 136);
			contentPane.add(scrollPane);
			{
				textArea = new JTextArea();
				scrollPane.setViewportView(textArea);
			}
		}
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnNewButton) {
			do_btnNewButton_actionPerformed(e);
		}
	}
	protected void do_btnNewButton_actionPerformed(ActionEvent e) {
		double cateto1 = Double.parseDouble(txtCat1.getText());
		double cateto2 = Double.parseDouble(txtCat2.getText());
		TrianguloRectangulo tr1 = new TrianguloRectangulo(cateto1, cateto2);
		Resultado(tr1);
	}
	void Imprimir(String s) {
		textArea.append(s+"\n");
	}
	void Resultado(TrianguloRectangulo tr) {
		Imprimir("El cateto 1 es: "+tr.getCateto1());
		Imprimir("El cateto 2 es: "+tr.getCateto2());
		Imprimir("El área es: "+tr.Area());
		Imprimir("La hipotenusa es: "+tr.Hipotenusa());
		Imprimir("El perímetro es: "+tr.Perimetro());
	}
}
