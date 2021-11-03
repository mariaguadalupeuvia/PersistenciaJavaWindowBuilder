package Principal;

import javax.swing.JFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class VentanaPrincipal {

	private JFrame frame;

	public VentanaPrincipal() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnConsultar = new JButton("Consultar");
		btnConsultar.setBounds(128, 127, 89, 23);
		frame.getContentPane().add(btnConsultar);
		btnConsultar.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				Consultas frmConsultas = new Consultas();
				frmConsultas.setVisible(true);
			}
		});
		
		JButton btnAgregar = new JButton("Agregar");
		btnAgregar.setBounds(242, 127, 89, 23);
		frame.getContentPane().add(btnAgregar);
		btnAgregar.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				Agregar frmAgregar = new Agregar();
				frmAgregar.setVisible(true);
			}
		});
	}

	public void mostrarVentana()
	{
		frame.setVisible(true);
	}
}
