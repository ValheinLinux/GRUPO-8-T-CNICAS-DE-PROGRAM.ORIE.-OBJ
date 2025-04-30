package Caso_4;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import java.awt.TextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ventana1 extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JButton btn_Realizar;
	private JTextField txtcat1;
	private JTextField txtcat2;
	private JScrollPane scrollPane;
	private TextArea txtS;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ventana1 frame = new ventana1();
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
	public ventana1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		{
			lblNewLabel = new JLabel("Ingrese el cateto 1:");
			lblNewLabel.setBounds(10, 11, 125, 14);
			contentPane.add(lblNewLabel);
		}
		{
			lblNewLabel_1 = new JLabel("Ingrese el \r\ncateto 2:");
			lblNewLabel_1.setBounds(10, 36, 125, 21);
			contentPane.add(lblNewLabel_1);
		}
		{
			btn_Realizar = new JButton("REALIZAR");
			btn_Realizar.addActionListener(this);
			btn_Realizar.setBounds(272, 7, 125, 23);
			contentPane.add(btn_Realizar);
		}
		{
			txtcat1 = new JTextField();
			txtcat1.setBounds(172, 8, 86, 20);
			contentPane.add(txtcat1);
			txtcat1.setColumns(10);
		}
		{
			txtcat2 = new JTextField();
			txtcat2.setBounds(172, 36, 86, 20);
			contentPane.add(txtcat2);
			txtcat2.setColumns(10);
		}
		{
			scrollPane = new JScrollPane();
			scrollPane.setBounds(10, 68, 414, 182);
			contentPane.add(scrollPane);
			{
				txtS = new TextArea();
				scrollPane.setViewportView(txtS);
			}
		}
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btn_Realizar) {
			do_btn_Realizar_actionPerformed(e);
		}
	}
	protected void do_btn_Realizar_actionPerformed(ActionEvent e) {
		double cateto1=Double.parseDouble(txtcat1.getText());
		double cateto2=Double.parseDouble(txtcat2.getText());
		Triangulo_Rectangulo tr=new Triangulo_Rectangulo(cateto1, cateto2);
		Listado(tr);		
	}
	void Imprimir(String s) {
		txtS.append(s+"\n");	
	}
	void Imprimir() {
    	txtS.append("--------------------\n");
    }
	void Listado(Triangulo_Rectangulo tr)
	{
		Imprimir("El área es "+tr.Area());
		Imprimir("La hipotenusa es "+tr.Hipotenusa());
		Imprimir("El perimetro es "+tr.Perimetro());
		Imprimir();
	}
	
}
