package Vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.GridBagConstraints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Frame extends JFrame {

	private JPanel contentPane;
	private static final long serialVersionUID = 1L;
	
	GridBagConstraints config = new GridBagConstraints();
	
	static Ventana1 Ventana1 = new Ventana1();
	static Ventana2 Ventana2 = new Ventana2();

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public Frame() {
		this.setSize(770,670);  
		this.setLocationRelativeTo(null);  
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		Ventana1.setBounds(0, 0, 434, 262);
		contentPane.add(Ventana1);
		Ventana1.setVisible(true);
////		Ventana1.addMouseListener(new MouseAdapter() {
////	   	 @Override
////	   	 public void mouseClicked(MouseEvent arg0) {
////	   		 if(Ventana1.isVisible()){
////	       	 
////	        	Ventana2.setVisible(true);
////	        	
////	        	Ventana1.setVisible(false);           	 
////	   	 
////	   		 }   	 
//	   		 
//	   	// }
//		});
		Ventana2.setBounds(0, 0, 434, 262);
		getContentPane().add(Ventana2);
		Ventana2.setLayout(null);
		Ventana2.setVisible(false);
		
	}

}
