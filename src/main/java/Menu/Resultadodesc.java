package Menu;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

@SuppressWarnings("serial")
public class Resultadodesc extends JFrame implements ActionListener {

	private JLabel lblBubble, lblSelection, lblInsertion, lblQuick;
	private JTextField txtBubble, txtSelection, txtInsertion, txtQuick;
	private JButton btnVoltar;

	public Resultadodesc() {

		Messagedesc messagedesc = new Messagedesc();
		
		setResizable(false);

		setTitle("Vetores Ordenados");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		ImageIcon icone = new ImageIcon("res\\icone.png");
		setIconImage(icone.getImage());

		lblBubble = new JLabel(" Bubble: ");
		lblBubble.setHorizontalAlignment(SwingConstants.LEFT);

		lblSelection = new JLabel(" Selection: ");
		lblSelection.setHorizontalAlignment(SwingConstants.LEFT);

		lblInsertion = new JLabel(" Insetion: ");
		lblInsertion.setHorizontalAlignment(SwingConstants.LEFT);

		lblQuick = new JLabel(" Quick: ");
		lblQuick.setHorizontalAlignment(SwingConstants.LEFT);

		txtBubble = new JTextField(messagedesc.getMsgBubbledesc());
		txtSelection = new JTextField(messagedesc.getMsgSelectiondesc());
		txtInsertion = new JTextField(messagedesc.getMsgInsertiondesc());
		txtQuick = new JTextField(messagedesc.getMsgQuickdesc());

		txtBubble.setEditable(false);
		txtSelection.setEditable(false);
		txtInsertion.setEditable(false);
		txtQuick.setEditable(false);

		btnVoltar = new JButton("Voltar");

		JPanel line1 = new JPanel();
		JPanel line2 = new JPanel();
		JPanel line3 = new JPanel();
		JPanel line4 = new JPanel();
		JPanel lineBtn = new JPanel(new FlowLayout(FlowLayout.CENTER));

		line1.setLayout(new GridLayout(0, 2, 0, 0));
		line1.add(lblBubble);
		line1.add(txtBubble);

		line2.setLayout(new GridLayout(0, 2, 0, 0));
		line2.add(lblSelection);
		line2.add(txtSelection);

		line3.setLayout(new GridLayout(0, 2, 0, 0));
		line3.add(lblInsertion);
		line3.add(txtInsertion);

		line4.setLayout(new GridLayout(0, 2, 0, 0));
		line4.add(lblQuick);
		line4.add(txtQuick);

		lineBtn.add(btnVoltar);

		JPanel linePanel = new JPanel(new GridLayout(4, 1));
		linePanel.add(line1);
		linePanel.add(line2);
		linePanel.add(line3);
		linePanel.add(line4);

		Container container = getContentPane();
		container.add(linePanel, BorderLayout.NORTH);
		container.add(lineBtn, BorderLayout.SOUTH);

		btnVoltar.addActionListener(this);

		pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		setVisible(false);
		Interface inter = new Interface();
		inter.voltarAoMenu();
	}

	public void mostrarResultado() {
		setVisible(true);
	}
}

