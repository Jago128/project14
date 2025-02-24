package windows;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.border.*;

public class Window3 extends JDialog implements ActionListener {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JButton btnExit;

	/**
	 * Create the dialog.
	 */
	public Window3(JDialog window2, String name, int corrects) {
		super(window2, true);
		setBounds(100, 100, 333, 195);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Gracias por jugar, "+name);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(66, 22, 167, 30);
		contentPanel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Este es el numero de respuestas correctas: "+corrects);
		lblNewLabel_1.setBounds(47, 52, 227, 30);
		contentPanel.add(lblNewLabel_1);
		
		btnExit = new JButton("Salir");
		btnExit.setBounds(106, 93, 89, 23);
		contentPanel.add(btnExit);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==btnExit) {
			dispose();
		}
	}
}
