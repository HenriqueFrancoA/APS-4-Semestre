package Menu;

import java.io.*;
import java.util.*;
import javax.swing.*;

public class Arquivo {
	private String nome;
	private String[] vQui;
	RandomAccessFile objeto;
	private String msgQuick;
	public String msg1, msg2, msg3, msg4, msg5, msg6, msg7, msg8;

	public Arquivo() {
		try {
			nome = "res\\DadosImagem.txt";
			File arq = new File(nome);
			objeto = new RandomAccessFile(arq, "rw");
			LineNumberReader lnr = new LineNumberReader(new FileReader(nome));
			lnr.skip(Long.MAX_VALUE);
			int retorno = lnr.getLineNumber();
			vQui = new String[retorno - 1];
			for (int i = 0; i < retorno - 1; i++) {
				vQui[i] = objeto.readLine();
				if (vQui[i] == null) {
					break;
				}
			}

			long tempoInicial = System.currentTimeMillis();
			Arrays.sort(vQui);
			long tempoFinal = System.currentTimeMillis();

			msgQuick = "";
			msg1 = vQui[1];
			msg2 = vQui[2];
			msg3 = vQui[3];
			msg4 = vQui[4];
			msg5 = vQui[vQui.length - 4];
			msg6 = vQui[vQui.length - 3];
			msg7 = vQui[vQui.length - 2];
			msg8 = vQui[vQui.length - 1];
			msgQuick += (tempoFinal - tempoInicial) + "ms ";

		} catch (FileNotFoundException ex) {
			JOptionPane.showMessageDialog(null, "O programa não está respondendo.", "Erro 404",
					JOptionPane.ERROR_MESSAGE);
		} catch (IOException ex) {
			JOptionPane.showMessageDialog(null, "Ocorreu algum erro inesperado.", "Erro 402",
					JOptionPane.ERROR_MESSAGE);
		}
	}

	public String[] getvQui() {
		return vQui;
	}

	public String getmsgQuick() {
		return msgQuick;
	}

}