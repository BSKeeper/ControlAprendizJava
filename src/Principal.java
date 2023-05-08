import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Principal extends JFrame implements ActionListener{

	private JMenuBar menuBar;
	private JMenu menuOpciones, menuCalcular, menuAcercaDe, menuColorFondo;
	private JMenuItem miCalculo, miRojo, miNegro, miAzul, miElCreador, miSalir, miInicio, miNuevo;
	private JLabel labelLogo, labelBienvenido, labelAdmin, labelTitle, labelNombre, labelAPaterno, labelAMaterno, labelCamino, labelAntiguedad, labelResultado, labelFooter;
	private JTextField txtNombreAprendiz, txtAPaternoAprendiz, txtAMaternoAprendiz;
	private JComboBox comboCamino, comboAntiguedad;
	private JScrollPane scrollPane1;
	private JTextArea txtArea1;
	String nombreAdmin= "";
	
	public Principal() {
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Interfaz principal");
		getContentPane().setBackground(new Color(0,0,250));
		
		Bienvenida ventanaBienvenida= new Bienvenida();
		nombreAdmin= ventanaBienvenida.texto;
		
		menuBar=new JMenuBar();
		menuBar.setBackground(new Color(0,0,250));
		setJMenuBar(menuBar);
		
		
		menuOpciones = new JMenu("Opciones");
		menuOpciones.setBackground(new Color(0,0,250));
		menuOpciones.setFont(new Font("Tahoma", 1, 14));
		menuOpciones.setForeground(new Color(255,255,255));
		menuBar.add(menuOpciones);		
		
		menuCalcular = new JMenu("Recomendar");
		menuCalcular.setBackground(new Color(0,0,250));
		menuCalcular.setFont(new Font("Tahoma", 1, 14));
		menuCalcular.setForeground(new Color(255,255,255));
		menuBar.add(menuCalcular);	

		menuAcercaDe = new JMenu("Acerca de");
		menuAcercaDe.setBackground(new Color(0,0,250));
		menuAcercaDe.setFont(new Font("Tahoma", 1, 14));
		menuAcercaDe.setForeground(new Color(255,255,255));
		menuBar.add(menuAcercaDe);	
		
		menuColorFondo = new JMenu("Color de fondo");
		menuColorFondo.setBackground(new Color(0,0,250));
		menuColorFondo.setFont(new Font("Tahoma", 1, 14));
		menuColorFondo.setForeground(new Color(25,25,25));
		menuOpciones.add(menuColorFondo);

		miCalculo = new JMenuItem("Consejo");
		miCalculo.setBackground(new Color(0,0,250));
		miCalculo.setFont(new Font("Tahoma", 1, 14));
		miCalculo.setForeground(new Color(255,255,255));
		menuCalcular.add(miCalculo);
		miCalculo.addActionListener(this);
		
		miRojo = new JMenuItem("Rojo");
		miRojo.setBackground(new Color(0,0,250));
		miRojo.setFont(new Font("Tahoma", 1, 14));
		miRojo.setForeground(new Color(255,255,255));
		menuColorFondo.add(miRojo);
		miRojo.addActionListener(this);
		
		miNegro = new JMenuItem("Negro");
		miNegro.setBackground(new Color(0,0,250));
		miNegro.setFont(new Font("Tahoma", 1, 14));
		miNegro.setForeground(new Color(255,255,255));
		menuColorFondo.add(miNegro);
		miNegro.addActionListener(this);
		
		miAzul = new JMenuItem("Azul");
		miAzul.setBackground(new Color(0,0,250));
		miAzul.setFont(new Font("Tahoma", 1, 14));
		miAzul.setForeground(new Color(255,255,255));
		menuColorFondo.add(miAzul);
		miAzul.addActionListener(this);
		
		miNuevo = new JMenuItem("Nuevo");
		miNuevo.setBackground(new Color(0,0,250));
		miNuevo.setFont(new Font("Tahoma", 1, 14));
		miNuevo.setForeground(new Color(255,255,255));
		menuOpciones.add(miNuevo);
		miNuevo.addActionListener(this);
		
		miElCreador = new JMenuItem("Creador");
		miElCreador.setBackground(new Color(0,0,250));
		miElCreador.setFont(new Font("Tahoma", 1, 14));
		miElCreador.setForeground(new Color(255,255,255));
		menuAcercaDe.add(miElCreador);
		miElCreador.addActionListener(this);
		
		miInicio = new JMenuItem("Inicio");
		miInicio.setBackground(new Color(0,0,250));
		miInicio.setFont(new Font("Tahoma", 1, 14));
		miInicio.setForeground(new Color(255,255,255));
		menuOpciones.add(miInicio);
		miInicio.addActionListener(this);
		
		miSalir = new JMenuItem("Salir");
		miSalir.setBackground(new Color(0,0,250));
		miSalir.setFont(new Font("Tahoma", 1, 14));
		miSalir.setForeground(new Color(255,255,255));
		menuOpciones.add(miSalir);
		miSalir.addActionListener(this);
		
		ImageIcon imagen=new ImageIcon("img/BSK_Electro.png");
		labelLogo = new JLabel(imagen);
		labelLogo.setBounds(5, 5, 250, 150); 
		add(labelLogo);
		
		labelBienvenido = new JLabel("Bienvenido(a)");
		labelBienvenido.setBounds(280, 30, 300, 50);
		labelBienvenido.setFont(new Font("Tahoma", 1, 32));
		labelBienvenido.setForeground(new Color(255,255,255));
		add(labelBienvenido);
		
		labelAdmin = new JLabel(nombreAdmin);
		labelAdmin.setBounds(280, 65, 300, 50);
		labelAdmin.setFont(new Font("Tahoma", 1, 32));
		labelAdmin.setForeground(new Color(255,255,255));
		add(labelAdmin);
		
		labelTitle = new JLabel("Datos del aprendiz para un consejo en su camino");
		labelTitle.setBounds(45, 160, 900, 30);
		labelTitle.setFont(new Font("Tahoma", 0, 24));
		labelTitle.setForeground(new Color(255,255,255));
		add(labelTitle);
		
		labelNombre = new JLabel("Nombres:");
		labelNombre.setBounds(25, 208, 180, 25);
		labelNombre.setFont(new Font("Tahoma", 1, 12));
		labelNombre.setForeground(new Color(255,255,255));
		add(labelNombre);
		
		txtNombreAprendiz = new JTextField();
		txtNombreAprendiz.setBounds(25, 233, 150, 25);
		txtNombreAprendiz.setBackground(new Color(224,224,224));
		txtNombreAprendiz.setFont(new Font("Tahoma", 1, 14));
		txtNombreAprendiz.setForeground(new Color(0,0,250));
		add(txtNombreAprendiz);
		
		labelAPaterno = new JLabel("Primer apellido");
		labelAPaterno.setBounds(25, 268, 180, 25);
		labelAPaterno.setFont(new Font("Tahoma", 1, 12));
		labelAPaterno.setForeground(new Color(255,255,255));
		add(labelAPaterno);
		
		txtAPaternoAprendiz = new JTextField();
		txtAPaternoAprendiz.setBounds(25, 293, 150, 25);
		txtAPaternoAprendiz.setBackground(new Color(224,224,224));
		txtAPaternoAprendiz.setFont(new Font("Tahoma", 1, 14));
		txtAPaternoAprendiz.setForeground(new Color(0,0,250));
		add(txtAPaternoAprendiz);
		
		labelAMaterno = new JLabel("Segundo apellido");
		labelAMaterno.setBounds(25, 328, 180, 25);
		labelAMaterno.setFont(new Font("Tahoma", 1, 12));
		labelAMaterno.setForeground(new Color(255,255,255));
		add(labelAMaterno);
		
		txtAMaternoAprendiz = new JTextField();
		txtAMaternoAprendiz.setBounds(25, 354, 150, 25);
		txtAMaternoAprendiz.setBackground(new Color(224,224,224));
		txtAMaternoAprendiz.setFont(new Font("Tahoma", 1, 14));
		txtAMaternoAprendiz.setForeground(new Color(0,0,250));
		add(txtAMaternoAprendiz);
		
		labelCamino = new JLabel("Selecciona tu camino");
		labelCamino.setBounds(220, 208, 180, 25);
		labelCamino.setFont(new Font("Tahoma", 1, 12));
		labelCamino.setForeground(new Color(255,255,255));
		add(labelCamino);
		
		comboCamino = new JComboBox();
		comboCamino.setBounds(220, 233, 220, 25);
		comboCamino.setBackground(new java.awt.Color(224,224,224));
		comboCamino.setFont(new java.awt.Font("Tahoma", 1, 14));
		comboCamino.setForeground(new java.awt.Color(0,0,250));
		add(comboCamino);
		comboCamino.addItem("");
		comboCamino.addItem("Frontend");
		comboCamino.addItem("Backend");
		comboCamino.addItem("Fullstack");
		
		labelAntiguedad = new JLabel("Selecciona tu antigüedad");
		labelAntiguedad.setBounds(220, 268, 180, 25);
		labelAntiguedad.setFont(new Font("Tahoma", 1, 12));
		labelAntiguedad.setForeground(new Color(255,255,255));
		add(labelAntiguedad);
		
		comboAntiguedad = new JComboBox();
		comboAntiguedad.setBounds(220, 293, 220, 25);
		comboAntiguedad.setBackground(new java.awt.Color(224,224,224));
		comboAntiguedad.setFont(new java.awt.Font("Tahoma", 1, 14));
		comboAntiguedad.setForeground(new java.awt.Color(0,0,250));
		add(comboAntiguedad);
		comboAntiguedad.addItem("");
		comboAntiguedad.addItem("Menos de 1 mes de estudios");
		comboAntiguedad.addItem("1 a 6 meses de estudios");
		comboAntiguedad.addItem("Más de 6 meses de estudios");
		
		labelResultado = new JLabel("El camino del aprendiz");
		labelResultado.setBounds(220, 327, 180, 25);
		labelResultado.setFont(new Font("Tahoma", 1, 12));
		labelResultado.setForeground(new Color(255,255,255));
		add(labelResultado);
		
		txtArea1 = new JTextArea();
		txtArea1.setEditable(false);
		txtArea1.setBackground(new Color(224,224,224));
		txtArea1.setFont(new Font("Tahoma", 1, 11));
		txtArea1.setForeground(new Color(0,0,250));
		txtArea1.setText("\n Aquí aparece el consejo al aprendiz de programación");
		scrollPane1=new JScrollPane(txtArea1);
		scrollPane1.setBounds(220, 353, 385, 90);
		add(scrollPane1);
		
		labelFooter = new JLabel("2023 BSK | Todos los derechos reservados");
		labelFooter.setBounds(135, 465, 500, 30);
		labelFooter.setFont(new Font("Tahoma", 1, 12));
		labelFooter.setForeground(new Color(255,255,255));
		add(labelFooter);
		
	
		
	}
	
	
public void actionPerformed(ActionEvent Ae){
				
	Container fondo=this.getContentPane();
	
		if(Ae.getSource()==miCalculo) {
			
			String nombreAprendiz = txtNombreAprendiz.getText();
			String AP = txtAPaternoAprendiz.getText();
			String AM = txtAMaternoAprendiz.getText();
			String Camino = comboCamino.getSelectedItem().toString();
			String Antiguedad = comboAntiguedad.getSelectedItem().toString();
			
			if(nombreAprendiz.equals("")||AP.equals("")||AM.equals("")||Camino.equals("")||Antiguedad.equals("")) {
				
				JOptionPane.showMessageDialog(null, "Debes llenar todos los campos.");
			}else {
				if (Camino.equals("Frontend")) {
					if (Antiguedad.equals("Menos de 1 mes de estudios")) {
						txtArea1.setText("\n "+nombreAprendiz+" "+AP+" "+AM+
										"\n Has escogido "+Camino+", el camino de la estética."+
										"\n "+Antiguedad+" es apenas el inicio"+
										"\n HTML y CSS, pueden ser un buen inicio.");
					}else if (Antiguedad.equals("1 a 6 meses de estudios")) {
						txtArea1.setText("\n "+nombreAprendiz+" "+AP+" "+AM+
								"\n Has escogido "+Camino+", el camino de la estética."+
								"\n "+Antiguedad+" te dan una idea de dónde estás"+
								"\n Javascript podría darte más herramientas para crear.");
					}else if (Antiguedad.equals("Más de 6 meses de estudios")) {
						txtArea1.setText("\n "+nombreAprendiz+" "+AP+" "+AM+
								"\n Has escogido "+Camino+", el camino de la estética."+
								"\n "+Antiguedad+" ya te dan una formación útil."+
								"\n Los frameworks podrían abrirte puertas.");
					}
				}else if (Camino.equals("Backend")) {
					if (Antiguedad.equals("Menos de 1 mes de estudios")) {
						txtArea1.setText("\n "+nombreAprendiz+" "+AP+" "+AM+
										"\n Has escogido "+Camino+", el camino de la lógica dura."+
										"\n "+Antiguedad+" es apenas el inicio"+
										"\n HTML y CSS, pueden ser un buen inicio.");
					}else if (Antiguedad.equals("1 a 6 meses de estudios")) {
						txtArea1.setText("\n "+nombreAprendiz+" "+AP+" "+AM+
								"\n Has escogido "+Camino+", el camino de la lógica dura."+
								"\n "+Antiguedad+" te dan una idea de dónde estás"+
								"\n Javascript podría darte más herramientas para crear.");
					}else if (Antiguedad.equals("Más de 6 meses de estudios")) {
						txtArea1.setText("\n "+nombreAprendiz+" "+AP+" "+AM+
								"\n Has escogido "+Camino+", el camino de la lógica dura."+
								"\n "+Antiguedad+" ya te dan una formación útil."+
								"\n Lenguajes como Java o Phyton podrían abrirte puertas.");
					}
				}else if (Camino.equals("Fullstack")) {
					if (Antiguedad.equals("Menos de 1 mes de estudios")) {
						txtArea1.setText("\n "+nombreAprendiz+" "+AP+" "+AM+
										"\n Has escogido "+Camino+", el camino mixto."+
										"\n "+Antiguedad+" es apenas el inicio"+
										"\n HTML y CSS, pueden ser un buen inicio.");
					}else if (Antiguedad.equals("1 a 6 meses de estudios")) {
						txtArea1.setText("\n "+nombreAprendiz+" "+AP+" "+AM+
								"\n Has escogido "+Camino+", el camino mixto."+
								"\n "+Antiguedad+" te dan una idea de dónde estás"+
								"\n Javascript podría darte más herramientas para crear.");
					}else if (Antiguedad.equals("Más de 6 meses de estudios")) {
						txtArea1.setText("\n "+nombreAprendiz+" "+AP+" "+AM+
								"\n Has escogido "+Camino+", el camino mixto."+
								"\n "+Antiguedad+" ya te dan una formación útil."+
								"\n Escoge un lenguaje, trabaja con él y agrega frameworks. "
							+ "\n La imaginación es el límite.");
					}
				}
			}
					
		}
			
			
		
		if(Ae.getSource()==miRojo) {
			fondo.setBackground(new Color(255,0,0));
		}	
		
		if(Ae.getSource()==miNegro) {
			fondo.setBackground(new Color(0,0,0));
		}	
		if(Ae.getSource()==miAzul) {
			fondo.setBackground(new Color(0,0,255));
		}	
		if(Ae.getSource()==miNuevo) {
			
			txtNombreAprendiz.setText("");
			txtAPaternoAprendiz.setText("");
			txtAMaternoAprendiz.setText("");
			comboCamino.setSelectedIndex(0);
			comboAntiguedad.setSelectedIndex(0);
			txtArea1.setText("\n Aquí aparece el consejo al aprendiz de programación");
			
		}	
		
		if(Ae.getSource()==miInicio) {
			Bienvenida formulario1=new Bienvenida();
			formulario1.setBounds(0, 0, 600, 700);
			formulario1.setVisible(true);
			formulario1.setLocationRelativeTo(null);
			formulario1.setResizable(false);
			this.setVisible(false);
		}	
		
		if(Ae.getSource()==miSalir) {
			System.exit(0);
		}	
		if(Ae.getSource()==miElCreador) {
			JOptionPane.showMessageDialog(null, "Creado Por Duvan Ospina."
										+ "\n 2023 BSK");
		}	
		
		
		
		
		
	}
	public static void main(String args[]) {
		Principal formularioP=new Principal();
		formularioP.setBounds(0, 0, 640, 560);
		formularioP.setVisible(true);
		formularioP.setLocationRelativeTo(null);
		formularioP.setResizable(false);
}
	
}
