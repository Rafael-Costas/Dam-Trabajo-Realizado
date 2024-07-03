import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JEditorPane;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.TitledBorder;

public class Ejercicio8 extends JFrame {
	private JLabel lblNewLabel;
	private JPanel contentPane;
	private JTextField importe;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio8 frame = new Ejercicio8();
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
	public Ejercicio8() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		 lblNewLabel = new JLabel("Ingresar el importe Total");
		lblNewLabel.setBounds(20, 24, 139, 13);
		contentPane.add(lblNewLabel);
		
		importe = new JTextField();
		importe.setBounds(169, 21, 96, 19);
		contentPane.add(importe);
		importe.setColumns(10);
		
		JPanel panel = new JPanel();
		panel.setToolTipText("");
		panel.setBorder(new TitledBorder(null, "JPanel title", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(50, 53, 285, 94);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JRadioButton licenciatura = new JRadioButton("Licenciatura");
		licenciatura.setBounds(6, 15, 103, 21);
		panel.add(licenciatura);
		buttonGroup.add(licenciatura);
		
		JRadioButton Especialidad = new JRadioButton("Especialidad");
		Especialidad.setBounds(176, 15, 103, 21);
		panel.add(Especialidad);
		buttonGroup.add(Especialidad);
		
		JRadioButton maestria = new JRadioButton("Maestría");
		maestria.setBounds(6, 67, 103, 21);
		panel.add(maestria);
		buttonGroup.add(maestria);
		
		JRadioButton Doctorado = new JRadioButton("Doctorado\r\n");
		Doctorado.setBounds(176, 67, 103, 21);
		panel.add(Doctorado);
		buttonGroup.add(Doctorado);
		
		JLabel lblNewLabel_1 = new JLabel("El salario es: ");
		lblNewLabel_1.setBounds(10, 179, 180, 13);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("EL % de incremento ");
		lblNewLabel_2.setBounds(226, 179, 173, 13);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("El salario total es de: ");
		lblNewLabel_3.setBounds(10, 228, 155, 13);
		contentPane.add(lblNewLabel_3);
		
		JButton btnNewButton = new JButton("Calcular");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num=0;
				double res=0;
				if(maestria.isSelected()) {
				lblNewLabel_1.setText("El salario es: "+importe.getText());
				lblNewLabel_2.setText("EL % de incremento 5,3%");
				 
				 num=Integer.parseInt(importe.getText());
				 res=num+((num*5.3)/100);
				lblNewLabel_3.setText("El salario total es de: "+res);
			}
				if(licenciatura.isSelected()) {
					lblNewLabel_1.setText("El salario es: "+importe.getText());
					lblNewLabel_2.setText("EL % de incremento 3,5%");
					 
					 num=Integer.parseInt(importe.getText());
					 res=num+((num*3.5)/100);
					lblNewLabel_3.setText("El salario total es de: "+res);
				}
				if(Especialidad.isSelected()) {
					lblNewLabel_1.setText("El salario es: "+importe.getText());
					lblNewLabel_2.setText("EL % de incremento 4,6%");
					 
					 num=Integer.parseInt(importe.getText());
					 res=num+((num*4.6)/100);
					lblNewLabel_3.setText("El salario total es de: "+res);
				}
				if(Doctorado.isSelected()) {
					lblNewLabel_1.setText("El salario es: "+importe.getText());
					lblNewLabel_2.setText("EL % de incremento 6,8%");
					 
					 num=Integer.parseInt(importe.getText());
					 res=num+((num*6.8)/100);
					lblNewLabel_3.setText("El salario total es de: "+res);
				}
			
			}
			
		});
		btnNewButton.setBounds(169, 224, 85, 21);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Reiniciar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				importe.setText("");
				lblNewLabel_1.setText("El salario es: ");
				lblNewLabel_2.setText("EL % de incremento ");
				lblNewLabel_3.setText("El salario total es de: ");
				buttonGroup.clearSelection();
				
			}
		});
		btnNewButton_1.setBounds(314, 224, 85, 21);
		contentPane.add(btnNewButton_1);
	}
}
