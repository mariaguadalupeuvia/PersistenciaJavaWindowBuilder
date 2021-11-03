package Principal;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;

public class Consultas extends JFrame {

	private JPanel contentPane;
	private int posicion = 0;
	
	public Consultas() 
	{
		ManejadorArchivos manager = new ManejadorArchivos();
		manager.leerTxt("nombres.txt");
		
		setTitle("Consultar nombres");
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("Nombre");
		lblNewLabel.setBounds(54, 57, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Apellido");
		lblNewLabel_1.setBounds(54, 88, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNombre = new JLabel("New label");
		lblNombre.setBounds(155, 57, 229, 14);
		contentPane.add(lblNombre);
		
		JLabel lblApellido = new JLabel("New label");
		lblApellido.setBounds(155, 88, 229, 14);
		contentPane.add(lblApellido);
		
		String linea = manager.leerLinea(posicion);
		posicion++;
		
		if(posicion >= manager.tamañoLineas())
		{
			posicion = 0;
		}
		String[] partes = linea.split("-");
		lblNombre.setText(partes[0]);
		lblApellido.setText(partes[1]);
		
		JButton btnAnterior = new JButton("Anterior");
		btnAnterior.setBounds(54, 157, 89, 23);
		contentPane.add(btnAnterior);
		btnAnterior.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				String linea = manager.leerLinea(posicion);
				posicion--;
				if(posicion < 0)
				{
					posicion = manager.tamañoLineas() -1;
				}
				String[] partes = linea.split("-");
				lblNombre.setText(partes[0]);
				lblApellido.setText(partes[1]);
			}
		});
		
		
		JButton btnSiguiente = new JButton("Siguiente");
		btnSiguiente.setBounds(186, 157, 89, 23);
		contentPane.add(btnSiguiente);
		btnSiguiente.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{

				String linea = manager.leerLinea(posicion);
				posicion++;
				if(posicion >= manager.tamañoLineas())
				{
					posicion = 0;
				}
				String[] partes = linea.split("-");
				lblNombre.setText(partes[0]);
				lblApellido.setText(partes[1]);
				
			}
		});
	}
}
