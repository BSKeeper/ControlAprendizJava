import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;
import java.awt.*;

public class Licencia extends JFrame implements ChangeListener, ActionListener{

	private JLabel label1, label2;
	private JCheckBox chkBox1;
	private JScrollPane scrollPane1;
	private JTextArea txtArea1;
	private JButton boton1, boton2;
	String nombre = "";
	
	public Licencia() {
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Licencia de uso");
		getContentPane().setBackground(new Color(255,0,0));
		
		Bienvenida ventanaBienvenida = new Bienvenida();
		nombre = ventanaBienvenida.texto;
		 	
		label1 = new JLabel("TÉRMINOS Y CONDICIONES");
		label1.setBounds(180, 5, 250, 30);
		label1.setFont(new Font("Abduction2002", 1, 16));
		label1.setForeground(new Color(0,0,0));
		add(label1);
		
		
		txtArea1 = new JTextArea();
		txtArea1.setFont(new Font("Tahoma", 0, 9));
		txtArea1.setText("\n\n        				       TÉRMINOS Y CONDICIONES"+
						"\n\n    					 PARTE I"+
						"\n     				DE LOS DEBERES Y PROHIBICIONES"+
						"\n\n 1. Prohibida su venta o distribución sin autorización escrita de Duvan Ospina, ya sea directamente o a través de sus identificadores BSK o BSKeeper"+
						"\n 2. Prohibida la alteración del código fuente o el diseño de las interfaces gráficas."+
						"\n 3. Duvan Ospina no se hace responsable, de manera directa o a través de sus identificadores BSK o BSKeeper, del mal uso de este software."+
						"\n\n					PARTE II 	"+	
						"\n   			DE LOS COMPROMISOS COMO APRENDIZ DE PROGRAMACIÓN"+
						"\n 1. El aprendiz se compromete a tener en cuenta los consejos recibidos en este software y en su entorno personal y digital, los cuales sean brindados con buena fe y la intención de progreso del aprendiz"+
						"\n 2. El aprendiz se compromete a dedicar cada día, al menos unos minutos a su avance en el aprendizaje significativo -puede tomar descansos de máximo dos(2) días por semana-."+
						"\n 3. El aprendiz se compromete a nunca rendirse en su carrera hacia el obletivo de convertirse en un desarrollador o programador."+
						"\n\n Los acuerdos expuestos rigen el uso que usted haga de este software.	"+
						"\n Duvan Ospina y sus identificadores BSK o BSKeeper, no se responsabilizan del uso que el usuario o terceros"+
						"\n le den a este software y sus servivios."+
						"\n\n Para aceptar estos términos, seleccione la casilla de verificación de aceptación personal"+
						"\n luego haga clic en ACEPTAR Y CONTINUAR."+
						"\n\n Si no está de acuerdo con los TÉRMINOS Y CONDICIONES, haga clic en NO ACEPTO"+
						"\n y no utilice este software."+
						"\n\n Todos los derechos están reservados."
				);
		scrollPane1=new JScrollPane(txtArea1);
		scrollPane1.setBounds(10, 40, 575, 200);
		add(scrollPane1);
		
		chkBox1 = new JCheckBox("Yo " + nombre + " acepto.");
		chkBox1.setBounds(10, 250, 200, 30);
		chkBox1.addChangeListener(this);
		add(chkBox1);	
		
		boton1=new JButton("ACEPTAR Y CONTINUAR");
		boton1.setBounds(10, 290, 200, 30);
		boton1.setEnabled(false);
		add(boton1);
		boton1.addActionListener(this);
		
		boton2=new JButton("NO ACEPTO");
		boton2.setBounds(10, 325, 200, 30);
		add(boton2);
		boton2.addActionListener(this);
		
		ImageIcon imagen=new ImageIcon("img/BSK_Fuego.jpg");
		
		label2 = new JLabel(imagen);
		label2.setBounds(300, 230, 300, 136); 
		add(label2);
		
	}
	
	public void stateChanged(ChangeEvent Ce){
		
		if(chkBox1.isSelected()==true) {
    		boton1.setEnabled(true);
		}	else {
			boton1.setEnabled(false);
		}
		
		
		
	}
	
	public void actionPerformed(ActionEvent Ae){	
		
		if(Ae.getSource()==boton1) {
			Principal formularioP=new Principal();
			formularioP.setBounds(0, 0, 640, 560);
			formularioP.setVisible(true);
			formularioP.setLocationRelativeTo(null);
			formularioP.setResizable(false);
			this.setVisible(false);
		}else if(Ae.getSource()==boton2) {
			Bienvenida formulario1=new Bienvenida();
			formulario1.setBounds(0, 0, 600, 700);
			formulario1.setVisible(true);
			formulario1.setLocationRelativeTo(null);
			formulario1.setResizable(false);
			this.setVisible(false);
		}	
	}
	
	public static void main(String args[]) {
		Licencia formularioL=new Licencia();
		formularioL.setBounds(0, 0, 610, 400);
		formularioL.setVisible(true);
		formularioL.setLocationRelativeTo(null);
		formularioL.setResizable(false);
	}
}

	
	

