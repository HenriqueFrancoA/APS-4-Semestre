
package Menu;

public class Metodos {

	public void bubbleCrescente(int v[]) {
		int ini = 1, fim, chg;
		while (ini < v.length) {
			fim = v.length - 1;
			while (fim >= ini) {
				if (v[fim - 1] > v[fim]) {
					chg = v[fim - 1];
					v[fim - 1] = v[fim];
					v[fim] = chg;
				}
				fim--;
			}
			ini++;
		}
	}

	public void insertionCrescente(int v[]) {
		int ini = 1, chg, men;
		while (ini < v.length) {
			men = v[ini];
			chg = ini - 1;
			while (chg >= 0 && men < v[chg]) {
				v[chg + 1] = v[chg];
				chg--;
			}
			v[chg + 1] = men;
			ini++;
		}
	}

	public void quickCrescente(int v[]) {
		quickCrescente(v, 0, v.length - 1);
	}

	private void quickCrescente(int v[], int lef, int rig) {
		int aPiv, aLef, aRig, piv;
		aLef = lef;
		aRig = rig;
		piv = v[lef];
		while (lef < rig) {
			while ((v[rig] >= piv) && (lef < rig)) {
				rig--;
			}
			if (lef != rig) {
				v[lef] = v[rig];
				lef++;
			}
			while ((v[lef] <= piv) && (lef < rig)) {
				lef++;
			}
			if (lef != rig) {
				v[rig] = v[lef];
				rig--;
			}
		}
		v[lef] = piv;
		aPiv = lef;
		if (aLef < aPiv)
			quickCrescente(v, aLef, aPiv - 1);
		if (aRig > aPiv)
			quickCrescente(v, aPiv + 1, aRig);

	}

	public void selectionCrescente(int v[]) {
		int ini = 0, sch, chg, men;
		while (ini < v.length - 1) {
			chg = ini;
			men = v[ini];
			sch = ini + 1;
			while (sch < v.length) {
				if (v[sch] < men) {
					chg = sch;
					men = v[sch];
				}
				sch++;
			}
			v[chg] = v[ini];
			v[ini] = men;
			ini++;
		}
	}

	public void bubbleDecrescente(int v[]) {
		for (int i = 1; i < v.length; i++) {
			for (int j = 0; j < i; j++) {
				if (v[i] > v[j]) {
					int temp = v[i];
					v[i] = v[j];
					v[j] = temp;
				}
			}
		}
	}

	public void insertionDecrescente(int v[]) {
		int x, j, temp;
		for (int i = 1; i < v.length; i++) {
			x = v[i];
			
			j = i - 1;
			while ((j >= 0) && v[j] < x) {
				v[j + 1] = v[j];
				j = j - 1;
			}
			v[j + 1] = x;
		}
	}

	public void quickDecrescente(int v[]) {
		quickDecrescente(v, 0, v.length - 1);
	}

	private void quickDecrescente(int v[], int lef, int rig) {
		int aPiv, aLef, aRig, piv;
		aLef = lef;
		aRig = rig;
		piv = v[lef];
		while (lef < rig) {
			while ((v[rig] <= piv) && (lef < rig)) {
				rig--;
			}
			if (lef != rig) {
				v[lef] = v[rig];
				lef++;
			}
			while ((v[lef] >= piv) && (lef < rig)) {
				lef++;
			}
			if (lef != rig) {
				v[rig] = v[lef];
				rig--;
			}
		}
		v[lef] = piv;
		aPiv = lef;
		if (aLef < aPiv)
			quickDecrescente(v, aLef, aPiv - 1);
		if (aRig > aPiv)
			quickDecrescente(v, aPiv + 1, aRig);
	}

	public void selectionDecrescente(int v[]) {
		int ini = 0, sch, chg, men;
		while (ini < v.length - 1) {
			chg = ini;
			men = v[ini];
			sch = ini + 1;
			while (sch < v.length) {
				if (v[sch] > men) {
					chg = sch;
					men = v[sch];
				}
				sch++;
			}
			v[chg] = v[ini];
			v[ini] = men;
			ini++;
		}
	}

	public String showVetor(int v[]) {
		int i;
		String msg = "";
		for (i = 0; i < 4; i++) {
			msg += v[i] + "   ";
		}
		msg += "...    ";
		for (i = v.length - 4; i < v.length; i++) {
			msg += v[i] + "   ";
		}
		return msg;
	}

}
