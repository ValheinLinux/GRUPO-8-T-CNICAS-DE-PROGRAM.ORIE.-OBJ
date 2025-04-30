package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import clase.Empleado;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class V1 extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JTextField txtCod;
	private JTextField txtNom;
	private JTextField txtSue;
	private JTextField txtHE;
	private JComboBox cboAreala;
	private JComboBox cboAfilia;
	private JScrollPane scrollPane;
	private JTextArea txtS;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					V1 frame = new V1();
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
	public V1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 832, 477);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		{
			lblNewLabel = new JLabel("CODIGO");
			lblNewLabel.setBounds(10, 8, 46, 14);
			contentPane.add(lblNewLabel);
		}
		{
			lblNewLabel_1 = new JLabel("NOMBRE");
			lblNewLabel_1.setBounds(10, 40, 63, 14);
			contentPane.add(lblNewLabel_1);
		}
		{
			lblNewLabel_2 = new JLabel("AREA LABORAL");
			lblNewLabel_2.setBounds(10, 74, 92, 14);
			contentPane.add(lblNewLabel_2);
		}
		{
			lblNewLabel_3 = new JLabel("SUELDO");
			lblNewLabel_3.setBounds(10, 105, 63, 14);
			contentPane.add(lblNewLabel_3);
		}
		{
			lblNewLabel_4 = new JLabel("HORAS EXTRAS");
			lblNewLabel_4.setBounds(10, 136, 92, 14);
			contentPane.add(lblNewLabel_4);
		}
		{
			lblNewLabel_5 = new JLabel("AFILIACION");
			lblNewLabel_5.setBounds(10, 167, 92, 14);
			contentPane.add(lblNewLabel_5);
		}
		{
			txtCod = new JTextField();
			txtCod.setBounds(103, 5, 86, 20);
			contentPane.add(txtCod);
			txtCod.setColumns(10);
		}
		{
			txtNom = new JTextField();
			txtNom.setColumns(10);
			txtNom.setBounds(103, 37, 86, 20);
			contentPane.add(txtNom);
		}
		{
			txtSue = new JTextField();
			txtSue.setColumns(10);
			txtSue.setBounds(103, 102, 86, 20);
			contentPane.add(txtSue);
		}
		{
			txtHE = new JTextField();
			txtHE.setColumns(10);
			txtHE.setBounds(103, 133, 86, 20);
			contentPane.add(txtHE);
		}
		{
			cboAreala = new JComboBox();
			cboAreala.setModel(new DefaultComboBoxModel(new String[] {"Administracion", "Sistema", "Marketing"}));
			cboAreala.setBounds(103, 70, 86, 22);
			contentPane.add(cboAreala);
		}
		{
			cboAfilia = new JComboBox();
			cboAfilia.setModel(new DefaultComboBoxModel(new String[] {"AFP", "SNP"}));
			cboAfilia.setBounds(103, 163, 86, 22);
			contentPane.add(cboAfilia);
		}
		{
			scrollPane = new JScrollPane();
			scrollPane.setBounds(10, 247, 414, 180);
			contentPane.add(scrollPane);
			{
				txtS = new JTextArea();
				scrollPane.setViewportView(txtS);
			}
		}
		{
			btnNewButton = new JButton("Procesar");
			btnNewButton.addActionListener(this);
			btnNewButton.setBounds(297, 163, 112, 23);
			contentPane.add(btnNewButton);
		}
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnNewButton) {
			do_btnNewButton_actionPerformed(e);
		}
	}
	protected void do_btnNewButton_actionPerformed(ActionEvent e) {
		String cod=txtCod.getText();
		String nom=txtNom.getText();
		String areala=cboAreala.getSelectedItem().toString();
		Double sue=Double.parseDouble(txtSue.getText());
		int he=Integer.parseInt(txtHE.getText());
		int afilia=cboAfilia.getSelectedIndex(); 
		Empleado e1= new Empleado(cod, nom, areala, sue, he, afilia);
		Listado (e1);
	}
	void Imprimir(String s) {
		txtS.append(s+"\n");
	}
	void Listado(Empleado e) {
		Imprimir("El codigo es : " + e.getCod());
		Imprimir("El nombre es : " + e.getNom());
		Imprimir("El area laboral es : " + e.getAreal());
		Imprimir("La afiliacion es : " + e.Bafilia());
		Imprimir("El sueldo bruto es : " + e.getSue());
		Imprimir("El sueldo neto es : " + e.SN() +"\n");
	}
}
