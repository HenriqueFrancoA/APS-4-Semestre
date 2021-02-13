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
import javax.swing.SwingConstants;

@SuppressWarnings("serial")
public class ResultadoArquivo extends JFrame implements ActionListener {

	private JLabel lblQuick;
	private JLabel txtQuick, txtEspaco, txt2, txt3, txt4, txt5, txt6, txt7, txt8, txt9;
	private JButton btnVoltar;


	public ResultadoArquivo() {

		Arquivo arq = new Arquivo();
		
		setResizable(false);

		setTitle("Vetores Ordenados");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		ImageIcon icone = new ImageIcon("res\\icone.png");
		setIconImage(icone.getImage());

		lblQuick = new JLabel(" Array Sort: ");
		lblQuick.setHorizontalAlignment(SwingConstants.LEFT);
		
		txtQuick = new JLabel(arq.getmsgQuick());
		txt2 = new JLabel(arq.msg1);
		txt3 = new JLabel(arq.msg2);
		txt4 = new JLabel(arq.msg3);
		txt5 = new JLabel(arq.msg4);
		txtEspaco = new JLabel("...");
		txt6 = new JLabel(arq.msg5);
		txt7 = new JLabel(arq.msg6);
		txt8 = new JLabel(arq.msg7);
		txt9 = new JLabel(arq.msg8);

		btnVoltar = new JButton("Voltar");

		JPanel line1 = new JPanel();
		JPanel line2 = new JPanel();
		JPanel line3 = new JPanel();
		JPanel line4 = new JPanel();
		JPanel line5 = new JPanel();
		JPanel line6 = new JPanel();
		JPanel line7 = new JPanel();
		JPanel line8 = new JPanel();
		JPanel line9 = new JPanel();
		JPanel line10 = new JPanel();
		JPanel line11 = new JPanel();
		JPanel lineBtn = new JPanel(new FlowLayout(FlowLayout.CENTER));

		line1.setLayout(new GridLayout(0, 1, 0, 0));
		line1.add(lblQuick);
		line2.add(txt2);
		line3.add(txt3);
		line4.add(txt4);
		line5.add(txt5);
		line6.add(txtEspaco);
		line7.add(txt6);
		line8.add(txt7);
		line9.add(txt8);
		line10.add(txt9);
		line11.add(txtQuick);
		
		lineBtn.add(btnVoltar);

		JPanel linePanel = new JPanel(new GridLayout(11, 1));
		linePanel.add(line1);
		linePanel.add(line2);
		linePanel.add(line3);
		linePanel.add(line4);
		linePanel.add(line5);
		linePanel.add(line6);
		linePanel.add(line7);
		linePanel.add(line8);
		linePanel.add(line9);	
		linePanel.add(line10);
		linePanel.add(line11);

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

