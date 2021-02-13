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
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;


	public class Interface extends JFrame implements ActionListener {

		private static int quantidade;
		private JLabel lblVetor, lblOrdenar;
		private JTextField txtVetor;
		private JButton btnCrescente, btnDecrescente, btnTxt;
		public static void main(String[] args) {

			Interface menu = new Interface();
			menu.setVisible(true);
		}

		public Interface() {

			setTitle("Ordenação de Vetor");
			setDefaultCloseOperation(EXIT_ON_CLOSE);
			setResizable(false);
			setLocationRelativeTo(null);
			ImageIcon icone = new ImageIcon("res\\icone.png");
			setIconImage(icone.getImage());

			lblVetor = new JLabel("Insira o tamanho do vetor");
			txtVetor = new JTextField(20);
			btnCrescente = new JButton("Crescente");
			btnDecrescente = new JButton("Decrescente");
			btnTxt = new JButton("Arquivo de texto");
			lblOrdenar = new JLabel("Escolha a forma de ordenação:");

			JPanel line1 = new JPanel(new FlowLayout(FlowLayout.LEFT));
			JPanel line2 = new JPanel(new FlowLayout(FlowLayout.CENTER));
			JPanel line3 = new JPanel(new FlowLayout(FlowLayout.CENTER));

			line1.add(lblVetor);
			line1.add(txtVetor);

			line2.add(lblOrdenar);

			line3.add(btnCrescente);
			line3.add(btnDecrescente);
			line3.add(btnTxt);
			
			JPanel linePanel = new JPanel(new GridLayout(3, 1));
			linePanel.add(line1);
			linePanel.add(line2);
			linePanel.add(line3);

			Container container = getContentPane();
			container.add(linePanel, BorderLayout.NORTH);
			
			
			btnCrescente.addActionListener(this);
			btnDecrescente.addActionListener(this);
			btnTxt.addActionListener(this);
			pack();
			
		}

	@Override
    public void actionPerformed(ActionEvent e) {
        try {      
        Object botaoAcionado = e.getSource();
		if(botaoAcionado == btnCrescente) {
			quantidade = Integer.parseInt(txtVetor.getText()); 
			Resultado resultado = new Resultado();
			resultado.mostrarResultado();
		}if(botaoAcionado == btnDecrescente){
			quantidade = Integer.parseInt(txtVetor.getText()); 
			Resultadodesc resultadodesc = new Resultadodesc();
			resultadodesc.mostrarResultado();
		} 
		if(botaoAcionado == btnTxt){
	        ResultadoArquivo resultadoArquivo = new ResultadoArquivo();
			resultadoArquivo.mostrarResultado();
		} 
	    this.setVisible(false);
        }
        catch(NumberFormatException quantidade) {
            JOptionPane.showMessageDialog(null, "Não é permitido inserir letras ou caracteres especiais, informe apenas números inteiros.", "Erro 402", JOptionPane.ERROR_MESSAGE);
        }
        catch(NegativeArraySizeException quantidade) {
            JOptionPane.showMessageDialog(null, "Informe apenas números inteiros positivos.", "Erro 336", JOptionPane.ERROR_MESSAGE);
        }
        catch(RuntimeException quantidade) {
        	JOptionPane.showMessageDialog(null, "Erro inesperado.", "Erro 404",JOptionPane.ERROR_MESSAGE);
        }
    }

    public static int getQuantidade() {
        return quantidade;
    }
    public void voltarAoMenu() {
		setVisible(true);
	}
    
}

