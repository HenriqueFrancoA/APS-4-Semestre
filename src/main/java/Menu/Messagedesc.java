
package Menu;

import javax.swing.JOptionPane;

public class Messagedesc {
	public int v[];
	public String msgBubbledesc, msgSelectiondesc, msgInsertiondesc, msgQuickdesc;

	public Messagedesc() {
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
		msgBubbledesc = "";
		msgSelectiondesc = "";
		msgInsertiondesc = "";
		msgQuickdesc = "";
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
			long tempoInicial5 = System.currentTimeMillis();
			met.bubbleDecrescente(vBub);
			long tempoFinal5 = System.currentTimeMillis();

			long tempoInicial6 = System.currentTimeMillis();
			met.selectionDecrescente(vSel);
			long tempoFinal6 = System.currentTimeMillis();
			
			long tempoInicial7 = System.currentTimeMillis();
			met.insertionDecrescente(vIns);
			long tempoFinal7 = System.currentTimeMillis();

			long tempoInicial8 = System.currentTimeMillis();
			met.quickDecrescente(vQui);
			long tempoFinal8 = System.currentTimeMillis();

			

			msgBubbledesc += met.showVetor(vBub) + (tempoFinal5 - tempoInicial5) + "ms";
			msgSelectiondesc += met.showVetor(vSel) + (tempoFinal6 - tempoInicial6) + "ms";
			msgInsertiondesc += met.showVetor(vIns) + (tempoFinal7 - tempoInicial7) + "ms";
			msgQuickdesc += met.showVetor(vQui) + (tempoFinal8 - tempoInicial8) + "ms";
		}

	public String getMsgBubbledesc() {
		return msgBubbledesc;
	}

	public String getMsgSelectiondesc() {
		return msgSelectiondesc;
	}

	public String getMsgInsertiondesc() {
		return msgInsertiondesc;
	}

	public String getMsgQuickdesc() {
		return msgQuickdesc;
	}
}
