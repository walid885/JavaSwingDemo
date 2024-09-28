package swingDemo;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Demo extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtName;
	private JTextField txtAge;
	JLabel txtHi;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Demo frame = new Demo();
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
	public Demo() {
		setTitle("Hi");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 829, 492);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtName = new JTextField();
		txtName.setBounds(373, 43, 153, 19);
		contentPane.add(txtName);
		txtName.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Name");
		lblNewLabel.setFont(new Font("Abyssinica SIL", Font.BOLD, 15));
		lblNewLabel.setBounds(232, 45, 70, 15);
		contentPane.add(lblNewLabel);
		
		txtAge = new JTextField();
		txtAge.setBounds(373, 117, 153, 19);
		contentPane.add(txtAge);
		txtAge.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Age");
		lblNewLabel_1.setFont(new Font("Abyssinica SIL", Font.BOLD, 15));
		lblNewLabel_1.setBounds(232, 119, 70, 15);
		contentPane.add(lblNewLabel_1);
		
		JButton btnOk = new JButton("OK");
		btnOk.setFont(new Font("Abyssinica SIL", Font.BOLD, 15));
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtHi.setText("Hello " +txtName.getText() + " " +"You are " +txtAge.getText()+ " years old ");

			}
		});
		btnOk.setBounds(232, 179, 117, 25);
		contentPane.add(btnOk);
		
		JButton btnReset = new JButton("Reset");
		btnReset.setFont(new Font("Abyssinica SIL", Font.BOLD, 15));
		
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			txtHi.setText("");
			txtAge.setText("");
			txtName.setText("");
			}
		});

		btnReset.setBounds(409, 179, 117, 25);
		contentPane.add(btnReset);
		
		 txtHi = new JLabel(" ");
		txtHi.setFont(new Font("Dialog", Font.BOLD, 25));
		txtHi.setBounds(88, 267, 673, 140);
		contentPane.add(txtHi);
	}
}
