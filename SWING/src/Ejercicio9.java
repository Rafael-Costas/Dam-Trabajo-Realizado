import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ejercicio9 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio9 frame = new Ejercicio9();
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
	public Ejercicio9() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 219);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Ingrese el Valor de T:\r\n");
		lblNewLabel.setBounds(10, 38, 123, 13);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(143, 35, 69, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
		
		JLabel lblNewLabel_1 = new JLabel("Opcion\r\n");
		lblNewLabel_1.setBounds(10, 85, 69, 13);
		contentPane.add(lblNewLabel_1);
		
		JComboBox opcion = new JComboBox();
		opcion.setModel(new DefaultComboBoxModel(new String[] {"OPCION 1", "OPCION 2", "OPCION 3"}));
		opcion.setToolTipText("");
		opcion.setBounds(143, 81, 85, 21);
		contentPane.add(opcion);
		
		JLabel lblNewLabel_2 = new JLabel("Resultado\r\n");
		lblNewLabel_2.setBounds(10, 152, 150, 13);
		contentPane.add(lblNewLabel_2);

		JButton btnNewButton = new JButton("Calcular\r\n");
		btnNewButton.addActionListener(new ActionListener() {
			int num=0;
			double res;
			public void actionPerformed(ActionEvent e) {
				if(opcion.getSelectedIndex()==0) {
					num=Integer.parseInt((textField.getText()));
					res=num/5;
					lblNewLabel_2.setText(lblNewLabel_2.getText()+res);
				}
				if(opcion.getSelectedIndex()==1) {
					num=Integer.parseInt((textField.getText()));
					res=Math.pow(num, num);;
					lblNewLabel_2.setText(lblNewLabel_2.getText()+res);
					
			}
				if(opcion.getSelectedIndex()==2) {
					num=Integer.parseInt((textField.getText()));
					res=6*(num/2);
					lblNewLabel_2.setText(lblNewLabel_2.getText()+res);
				
				}
					
			}		
		});
		btnNewButton.setBounds(241, 34, 85, 21);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Reiniciar\r\n");
		btnNewButton_1.setBounds(341, 34, 85, 21);
		contentPane.add(btnNewButton_1);
	}
}
