import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JCheckBox;

public class Ejercicio6 extends JFrame implements ActionListener{

	private JPanel contentPane;
private JButton HolaTodos;
private JCheckBox checkHola;
private JCheckBox CheckPagina;
private JButton pagina;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio6 frame = new Ejercicio6();
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
	public Ejercicio6() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		 HolaTodos = new JButton("HolaATodos");
		HolaTodos.addActionListener(this );
		HolaTodos.setBounds(10, 61, 135, 43);
		contentPane.add(HolaTodos);
		
		pagina = new JButton("BIenvenidos a mi pagina\r\n");
		pagina.addActionListener(this);
		pagina.setBounds(252, 59, 150, 46);
		contentPane.add(pagina);
		
		JLabel lblNewLabel = new JLabel("Practica 5");
		lblNewLabel.setBounds(189, 10, 56, 27);
		contentPane.add(lblNewLabel);
		
		 checkHola = new JCheckBox("Hola a todos");
		 
		checkHola.setBounds(152, 145, 93, 21);
		contentPane.add(checkHola);
		
		 CheckPagina = new JCheckBox("Bienvenidos a mi pagina");
		CheckPagina.setBounds(152, 199, 150, 21);
		contentPane.add(CheckPagina);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if((e.getSource())==HolaTodos) {
			checkHola.setSelected(true);
			CheckPagina.setSelected(false);
		}
		if(e.getSource()==pagina) {
			checkHola.setSelected(false);
			CheckPagina.setSelected(true);
		}
		
	}
}
