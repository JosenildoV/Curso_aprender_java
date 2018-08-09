package telarelogio;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.util.Date;
import java.awt.event.ActionEvent;

public class TelaRelogio extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaRelogio frame = new TelaRelogio();
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
	public TelaRelogio() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(TelaRelogio.class.getResource("/com/sun/javafx/scene/control/skin/modena/HTMLEditor-Background-Color@2x.png")));
		lblNewLabel.setBounds(10, 11, 40, 32);
		contentPane.add(lblNewLabel);
		
		JLabel lblDataEHora = new JLabel("Data e Hora Atuais");
		lblDataEHora.setFont(new Font("Sitka Display", Font.BOLD, 14));
		lblDataEHora.setBounds(160, 11, 144, 32);
		contentPane.add(lblDataEHora);
		
		JLabel lblCliqueNoBoto = new JLabel("Clique no Bot\u00E3o");
		lblCliqueNoBoto.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblCliqueNoBoto.setHorizontalAlignment(SwingConstants.CENTER);
		lblCliqueNoBoto.setForeground(Color.GRAY);
		lblCliqueNoBoto.setBounds(101, 100, 215, 45);
		contentPane.add(lblCliqueNoBoto);
		
		JButton btnCliqueAqui = new JButton("Clique Aqui");
		btnCliqueAqui.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Date relogio = new Date();
				
				lblCliqueNoBoto.setText(relogio.toString());
			}
		});
		btnCliqueAqui.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnCliqueAqui.setBounds(141, 191, 114, 32);
		contentPane.add(btnCliqueAqui);
	}
}
