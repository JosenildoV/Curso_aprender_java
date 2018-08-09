package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class OlaMundoJava extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OlaMundoJava frame = new OlaMundoJava();
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
	public OlaMundoJava() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbl_mensagem = new JLabel("Aqui parece a mensagem");
		lbl_mensagem.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_mensagem.setForeground(Color.RED);
		lbl_mensagem.setFont(new Font("Tahoma", Font.BOLD, 15));
		lbl_mensagem.setBounds(72, 58, 246, 40);
		contentPane.add(lbl_mensagem);
		
		JButton btn_mensagem = new JButton("Clique em mim!");
		btn_mensagem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				 lbl_mensagem.setText("Olá mundo!");
			}
		});
		btn_mensagem.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		btn_mensagem.setForeground(Color.BLACK);
		btn_mensagem.setBounds(131, 140, 145, 40);
		contentPane.add(btn_mensagem);
	}
}
