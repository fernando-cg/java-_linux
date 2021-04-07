package gui;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Marco extends JFrame {
	
	//atributos
	
	private JPanel panel ; //declaro el panel
	
	private JLabel etiqueta,imagen ; //declaro las etiquetas
	
	private JRadioButton r1,r2,r3 ; //botones radio
	
	private JButton b1 ; //boton
	
	private JTextField t1 ; //texto para escribir
	
	private JComboBox c1;

	public Marco() {
		
		setVisible(true) ; //visibilidad 
		//setSize(500,300) ; //dar tamaño
		setDefaultCloseOperation(EXIT_ON_CLOSE) ; //que se cierre cuando se pulse la x ;
		setTitle("Programacion") ; //poner titulo
		setResizable(false); //Bloquea que el usuario pueda cambiar el tamaño de la pantalla
		//setExtendedState(Frame.MAXIMIZED_BOTH); //hacer que la pantalla se abra a maxima resolución
		//setLocation(300,330); // ajustar la posicion del marco en la pantalla
		//setBounds(200,300,500,250); //setear posicion y tamaño de ventana en un solo metodo
		Toolkit monitor = Toolkit.getDefaultToolkit() ;
		
		Dimension dimension = monitor.getScreenSize() ; //obtener el tamaño de la pantalla ;
		
		int alturaM = dimension.height ;//sacar la altura
		int anchuraM = dimension.width ;//sacar anchura
		
		setBounds(anchuraM/4 , alturaM/4,anchuraM/2,alturaM/2) ;// setear posición en el centro
		
		Image iconoAPP = monitor.getImage("campo-de-futbol.png") ;  //seleccionar icono
		
		setIconImage(iconoAPP) ; //setear icono
		
		iniciarComponentes() ;
		
	}
	
	private void iniciarComponentes() {
		colocarPanel() ;//iniciamos el panel como primero
		colocarEtiquetas() ;//iniciamos el label como segundo
		ColocarElementos() ;//colocamos los elementos extras al final
	}
	
	private void colocarPanel() {
		panel = new JPanel() ; //instanciamos el panel
		panel.setLayout(null); //tal cual
		this.add(panel) ;		//se añade el panel
	}
	
	private void colocarEtiquetas() {
		
		etiqueta = new JLabel("Escoja el mejor amigo de Homer") ; // texto de la etiqueta
		
		etiqueta.setBounds(20,15,250,40) ; //posicion y tamaño
		
		etiqueta.setFont(new Font("Arial",0,17)); //tipo de letra
		panel.add(etiqueta) ;	//añadir etiqueta al panel 
	}

	private void ColocarElementos() {
		r1 = new JRadioButton("Carl") ; //creamos el boton y le damos nombre
		r1.setBounds(20,80,150,40); // tamaño
		panel.add(r1) ;
		
		r2 = new JRadioButton("Lenny") ; //creamos el boton y le damos nombre
		r2.setBounds(20,120,150,40); // tamaño
		panel.add(r2) ;
		
		r3 = new JRadioButton("Moe") ; //creamos el boton y le damos nombre
		r3.setBounds(20,160,150,40); // tamaño
		panel.add(r3) ;
		
		//para evitar que se seleccionen todos se crea un grupo de botones
		
		ButtonGroup grupo = new ButtonGroup() ;
		grupo.add(r1);
		grupo.add(r2);
		grupo.add(r3);
		
		t1 = new JTextField("Aqui puedes escribir") ; //se define y se introduce un texto ;
		
		t1.setBounds(20,200,150,40);//tamaño
		
		panel.add(t1) ;//añadir al panel principal
		
		b1 = new JButton("Aceptar") ;//crear botón con nombre
		
		b1.setBounds(190,200,150,40) ; //dar tamaño al boton
		
		panel.add(b1) ;//añadir al panel
		
		
		c1 = new JComboBox() ; //creo comboBox
		
		//añado items al ComboBox
		c1.addItem("enero") ;
		c1.addItem("febrero") ;
		c1.addItem("marzo") ;
		
		c1.setBounds(20,240,90,40);//añadir posicion y tamaño
		
		panel.add(c1) ;
		
	}
	
	private void eventoClic() {
		
		imagen = new JLabel() ;//crea label de la imagen
		
		imagen.setBounds(300,100,300,200); //tamaño de la imagen
		
		panel.add(imagen) ;//se añade al panel
		
		ImageIcon imagenCarl = new ImageIcon(getClass().getResource("/imagenes/Carl.png")) ; //se vinculan las imagenes
		ImageIcon imagenLenny = new ImageIcon(getClass().getResource("/imagenes/Leonard.png")) ;
		ImageIcon imagenMoe = new ImageIcon(getClass().getResource("/imagenes/moe.png")) ;
		
		ActionListener evento = new ActionListener() {//se crea un listener

			@Override
			public void actionPerformed(ActionEvent e) {
				imagen.setIcon(new ImageIcon(imagenCarl.getImage().getScaledInstance(imagen.getWidth(), imagen.getHeight(), Image.SCALE_SMOOTH))); //se setea el la imagen que queremos una vez se selecciona el boton
				
			}
			
			
		} ;
		
		r1.addActionListener(evento); //se añade el action listener al boton
		
		ActionListener evento1 = new ActionListener() {//se crea un listener

			@Override
			public void actionPerformed(ActionEvent e) {
				imagen.setIcon(new ImageIcon(imagenLenny.getImage().getScaledInstance(imagen.getWidth(), imagen.getHeight(), Image.SCALE_SMOOTH))); //se setea el la imagen que queremos una vez se selecciona el boton
				
			}
			
			
		} ;
		
		r2.addActionListener(evento1); //se añade el action listener al boton
		
		ActionListener evento2 = new ActionListener() {//se crea un listener

			@Override
			public void actionPerformed(ActionEvent e) {
				imagen.setIcon(new ImageIcon(imagenMoe.getImage().getScaledInstance(imagen.getWidth(), imagen.getHeight(), Image.SCALE_SMOOTH))); //se setea el la imagen que queremos una vez se selecciona el boton
				
			}
			
			
		} ;
		
		r3.addActionListener(evento); //se añade el action listener al boton
	}
}
