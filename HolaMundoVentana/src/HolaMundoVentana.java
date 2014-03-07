import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.CardLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class HolaMundoVentana extends JFrame {
//hereda de JFrame, es una ventana de Windows
	private JPanel contentPane;
	JLabel lblJulio;
	JButton btnPulsar ;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HolaMundoVentana frame = new HolaMundoVentana();
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
	public HolaMundoVentana() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 665, 491);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnPulsar = new JButton("Pulsar");
		btnPulsar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnPulsar.setBackground(Color.YELLOW);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnPulsar.setBackground(Color.GREEN);
			}
		});
		btnPulsar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lblJulio.setText("Hola");
			}
		});
		btnPulsar.setBackground(Color.RED);
		btnPulsar.setBounds(185, 113, 247, 126);
		contentPane.add(btnPulsar);
		
		JLabel lblHolaMundo = new JLabel("Hola Mundo");
		lblHolaMundo.setBounds(-10004, -10029, 432, 257);
		contentPane.add(lblHolaMundo);
		
		lblJulio = new JLabel("Julio");
		lblJulio.setAutoscrolls(true);
		lblJulio.setEnabled(false);
		lblJulio.setBackground(Color.RED);
		lblJulio.setBounds(25, 36, 46, 14);
		contentPane.add(lblJulio);
	}
}
