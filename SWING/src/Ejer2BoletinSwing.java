import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.function.DoubleConsumer;

public class Ejer2BoletinSwing extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejer2BoletinSwing frame = new Ejer2BoletinSwing();
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
	public Ejer2BoletinSwing() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel Eitqueta1 = new JLabel("Ingresar  el radio\r\n");
		Eitqueta1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		Eitqueta1.setBounds(33, 43, 111, 13);
		contentPane.add(Eitqueta1);
		
		JLabel Etiqueta2 = new JLabel("Ingresar la altura");
		Etiqueta2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		Etiqueta2.setBounds(33, 86, 111, 13);
		contentPane.add(Etiqueta2);
		
		textField = new JTextField();
		textField.addKeyListener(new KeyAdapter() {
			
			@Override
			public void keyReleased(KeyEvent e) {
				if(e.getKeyChar()>=65 && e.getKeyChar()<=122 ) {
					String frase ="";
					frase = textField.getText();
					char [] arr = frase.toCharArray();
					System.out.println(frase);
					
					frase="";
					for(int i=0; i<arr.length-1; i++) {
						frase+=arr[i];
					}
					textField.setText(frase);
					
				}
			}
		});
		
		textField.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				System.out.println("BIENVENIDO");
			}
			@Override
			public void focusLost(FocusEvent e) {
			System.out.println("ADIOOOOOOOOOOS");
			}
		});
		textField.setToolTipText("cosita");
		textField.setBounds(154, 40, 96, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				if(e.getKeyChar()>=65 && e.getKeyChar()<=122 ) {
					String frase ="";
					frase = textField_1.getText();
					char [] arr = frase.toCharArray();
					System.out.println(frase);
					
					frase="";
					for(int i=0; i<arr.length-1; i++) {
						frase+=arr[i];
					}
					textField_1.setText(frase);
					
				}
			}
		});
		textField_1.setBounds(154, 83, 96, 19);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel EtiquetaVolumen = new JLabel("Volumen");
		EtiquetaVolumen.setFont(new Font("Tahoma", Font.PLAIN, 14));
		EtiquetaVolumen.setBounds(33, 137, 85, 13);
		contentPane.add(EtiquetaVolumen);
		
		JLabel EtiquetaArea = new JLabel("Area");
		EtiquetaArea.setFont(new Font("Agency FB", Font.PLAIN, 17));
		EtiquetaArea.setBounds(33, 201, 45, 13);
		contentPane.add(EtiquetaArea);
		
		JButton btnNewButton = new JButton("Calcular ");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			if(textField.getText()=="" && textField_1.getText()== "") {
				System.out.println("Bobo zoel");
			}
			if(textField.getText()==null && textField_1.getText()== null) {
				System.out.println("bobo rafa");
			}
			}
		});
		btnNewButton.setBounds(308, 41, 85, 21);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Reiniciar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				textField_1.setText("");
				EtiquetaVolumen.setText("Volumen");
				EtiquetaArea.setText("Area");
			}
		});
		btnNewButton_1.setBounds(308, 84, 85, 21);
		contentPane.add(btnNewButton_1);
	}
}
