import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.TextField;

import javax.swing.SwingConstants;
import javax.swing.JCheckBox;
import javax.swing.JLabel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ButtonGroup;

public class ContadorClicksJcCheckBOx extends JFrame implements ActionListener{
	private JLabel invisible;
	private JPanel contentPane;
	private JTextField Contador;
	private JCheckBox box2;
	private JCheckBox box1;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ContadorClicksJcCheckBOx frame = new ContadorClicksJcCheckBOx();
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
	public ContadorClicksJcCheckBOx() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Contador = new JTextField();
		Contador.setHorizontalAlignment(SwingConstants.CENTER);
		Contador.setFont(new Font("Tahoma", Font.PLAIN, 22));
		Contador.setText("10");
		Contador.setEditable(false);
		Contador.setBounds(166, 30, 96, 69);
		contentPane.add(Contador);
		Contador.setColumns(10);
		
		 box1 = new JCheckBox("Rafa lo flipa");
		box1.addActionListener(this);
		buttonGroup.add(box1);
		
		box1.setBounds(6, 129, 93, 21);
		contentPane.add(box1);
		
		box2 = new JCheckBox("Eloy lo flipa");
		box2.addActionListener(this);
		
		buttonGroup.add(box2);
		box2.setBounds(289, 129, 93, 21);
		contentPane.add(box2);
		
		 invisible = new JLabel("Hemos muerto");
		 invisible.setEnabled(false);
		 invisible.setVisible(false);
		invisible.setBounds(166, 200, 108, 13);
		contentPane.add(invisible);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		int contador=Integer.parseInt(Contador.getText());
		if(contador>0) {
		Contador.setText(String.valueOf(--contador));
		}else {
			invisible.setVisible(true);
			box1.setEnabled(false);
			box2.setEnabled(false);
		}
		}
}
