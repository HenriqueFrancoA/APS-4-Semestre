
package Menu;

import javax.swing.JOptionPane;

public class Message {
	public int v[];
	public String msgBubble, msgSelection, msgInsertion, msgQuick;

	public Message() {
		if (Interface.getQuantidade() >= 300000) {
			JOptionPane.showMessageDialog(null,
					"Estamos organizando, porém o \n número que digitou é grande \n então pode demorar um pouco...");
		}
		if ((Interface.getQuantidade() < 4) && (Interface.getQuantidade() > 0)) {
			JOptionPane.showMessageDialog(null, "O número é muito pequeno, tente um número maior que 4", "Erro 338",
					JOptionPane.ERROR_MESSAGE);
		}
		Metodos met = new Metodos();
		int[] vBub, vIns, vQui, vSel;
		int i;
		msgBubble = "";
		msgSelection = "";
		msgInsertion = "";
		msgQuick = "";
		vBub = new int[Interface.getQuantidade()];
		vIns = new int[Interface.getQuantidade()];
		vQui = new int[Interface.getQuantidade()];
		vSel = new int[Interface.getQuantidade()];

		for (i = 0; i < vBub.length - 1; i++) {
			vBub[i] = (int) (Math.random() * Interface.getQuantidade());
			vIns[i] = vBub[i];
			vQui[i] = vBub[i];
			vSel[i] = vBub[i];
		}
			long tempoInicial = System.currentTimeMillis();
			met.bubbleCrescente(vBub);
			long tempoFinal = System.currentTimeMillis();

			long tempoInicial2 = System.currentTimeMillis();
			met.insertionCrescente(vIns);
			long tempoFinal2 = System.currentTimeMillis();

			long tempoInicial3 = System.currentTimeMillis();
			met.quickCrescente(vQui);
			long tempoFinal3 = System.currentTimeMillis();

			long tempoInicial4 = System.currentTimeMillis();
			met.selectionCrescente(vSel);
			long tempoFinal4 = System.currentTimeMillis();

			msgBubble += met.showVetor(vBub) + (tempoFinal - tempoInicial) + "ms";
			msgSelection += met.showVetor(vSel) + (tempoFinal4 - tempoInicial4) + "ms";
			msgInsertion += met.showVetor(vIns) + (tempoFinal2 - tempoInicial2) + "ms";
			msgQuick += met.showVetor(vQui) + (tempoFinal3 - tempoInicial3) + "ms";
		

	}

	public String getmsgBubble() {
		return msgBubble;
	}

	public String getmsgSelection() {
		return msgSelection;
	}

	public String getmsgInsertion() {
		return msgInsertion;
	}

	public String getmsgQuick() {
		return msgQuick;
	}

}