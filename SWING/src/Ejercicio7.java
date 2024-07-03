import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

public class Ejercicio7 extends JFrame {
	ImageIcon   img1 = new ImageIcon  (getClass().getResource("/Imagen/gato.jpeg"));
	ImageIcon   img3 = new ImageIcon  (getClass().getResource("/Imagen/dragon.jpg"));
	ImageIcon   img2 = new ImageIcon  (getClass().getResource("/Imagen/buho.jpg"));
	ImageIcon   img4 = new ImageIcon  (getClass().getResource("/Imagen/tejon.jpeg"));
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio7 frame = new Ejercicio7();
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

	public Ejercicio7() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		String [] alumnos2= {"Gato","Buho","Tejon","Dragon"};

		
		JComboBox comboBox = new JComboBox(alumnos2);
		
		comboBox.setBounds(51, 43, 191, 22);
		contentPane.add(comboBox);
		comboBox.setSelectedIndex(-1);
		
		
		
		
		JLabel imagen = new JLabel("");
		imagen.setBounds(188, 89, 218, 139);
		contentPane.add(imagen);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (comboBox.getSelectedItem()=="Gato") {
					Image image = img1.getImage().getScaledInstance(imagen.getWidth(), imagen.getHeight(), Image.SCALE_SMOOTH);
					 ImageIcon resizedImage = new ImageIcon(image);
					imagen.setIcon(resizedImage);
					
				}
				if (comboBox.getSelectedItem()=="Buho") {
					Image image = img2.getImage().getScaledInstance(imagen.getWidth(), imagen.getHeight(), Image.SCALE_SMOOTH);
					 ImageIcon resizedImage = new ImageIcon(image);
					imagen.setIcon(resizedImage);
				}
				if (comboBox.getSelectedItem()=="Dragon") {
					Image image = img3.getImage().getScaledInstance(imagen.getWidth(), imagen.getHeight(), Image.SCALE_SMOOTH);
					 ImageIcon resizedImage = new ImageIcon(image);
					imagen.setIcon(resizedImage);
				}
				if (comboBox.getSelectedItem()=="Tejon") {
					Image image = img4.getImage().getScaledInstance(imagen.getWidth(), imagen.getHeight(), Image.SCALE_SMOOTH);
					 ImageIcon resizedImage = new ImageIcon(image);
					imagen.setIcon(resizedImage);
				}
			
				
			}
		});
		btnNewButton.setBounds(51, 114, 89, 23);
		contentPane.add(btnNewButton);
	}
}