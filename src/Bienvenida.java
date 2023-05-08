import javax.swing.*;
import javax.swing.JFrame;
import java.awt.event.*;
import java.awt.*;

public class Bienvenida extends JFrame implements ActionListener {

	private JTextField textField1;
	private JLabel label1, label2, label3, label4, label5;
	private JButton boton1;
	public static String texto = "";
	
	public Bienvenida() {
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Bienvenido(a)");
		getContentPane().setBackground(new Color(0,0,0));
		
		
		ImageIcon imagen=new ImageIcon("img/BSK_Viento.png");
		 	
		label1 = new JLabel(imagen);
		label1.setBounds(0, 15, 600, 375);
		add(label1);
		
		label2 = new JLabel("Sistema de control al aprendiz de programación");
		label2.setBounds(20, 390, 600, 30);
		label2.setFont(new Font("Abduction2002", 3, 18));
		label2.setForeground(new Color(255,255,255));
		add(label2);
		
		label3 = new JLabel("Escribe tu nombre");
		label3.setBounds(45, 350, 200, 300);
		label3.setFont(new Font("Tahoma", 1, 12));
		label3.setForeground(new Color(255,255,255));
		add(label3);
		
		label4 = new JLabel("2023");
		label4.setBounds(100, 630, 300, 30);
		label4.setFont(new Font("Tahoma", 1, 12));
		label4.setForeground(new Color(255,255,255));
		add(label4);
		
		label5 = new JLabel("BSK");
		label5.setBounds(140, 629, 300, 30);
		label5.setFont(new Font("Wonton", 1, 17));
		label5.setForeground(new Color(255,255,255));
		add(label5);
		
		textField1 = new JTextField();
		textField1.setBounds(160, 490, 255, 25);
		textField1.setBackground(new Color(224,224,224));
		textField1.setFont(new Font("Tahoma", 1, 14 ));
		textField1.setForeground(new Color(255,0,0));
		add(textField1);
		
		boton1=new JButton("Ingresar");
		boton1.setBounds(250, 550, 100, 30);
		boton1.setBackground(new Color(255,255,255));
		boton1.setFont(new Font("Tahoma", 1, 14 ));
		boton1.setForeground(new Color(255,0,0));
		add(boton1);
		boton1.addActionListener(this);
		
		
	}
	
public void actionPerformed(ActionEvent Ae){
			
		if(Ae.getSource()==boton1) {
			texto=textField1.getText().trim();
			if(texto.equals("")) {
				JOptionPane.showMessageDialog(null, "Debes ingresar tu nombre.");
			}else {
				Licencia formularioL=new Licencia();
				formularioL.setBounds(0, 0, 610, 400);
				formularioL.setVisible(true);
				formularioL.setLocationRelativeTo(null);
				formularioL.setResizable(false);
				this.setVisible(false);
			}
			
			
		}	
	}
	
	public static void main(String args[]) {
		Bienvenida formulario1=new Bienvenida();
		formulario1.setBounds(0, 0, 600, 700);
		formulario1.setVisible(true);
		formulario1.setLocationRelativeTo(null);
		formulario1.setResizable(false);
	}
	
}
