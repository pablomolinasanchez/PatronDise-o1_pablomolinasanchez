/**
 * @author Pablo Molina Sanchez
 */
import java.util.ArrayList;
import java.util.List;

public class Mailbox {
	private Orden definoOrden;
	private List<Email> email = new ArrayList<Email>();
	
	public void setOrden(Orden definoOrden) {
		this.definoOrden = definoOrden;
	}

	//Lo usamos para coger la clase según la ordenación que queramos usar
	public Class<? extends Orden> getOrden() {
		return definoOrden.getClass();
	}
	

	private void sort() {
		
		for (int i = 1; i < email.size(); i++) {
			for (int j = email.size()-1; j >= i; j--) {
				if (before(email.get(j),email.get(j-1))) {
					Email emailParaCambio = email.get(j);
					email.set(j, email.get(j-1));
					email.set(j-1, emailParaCambio);
				}
			}
		}

	}
	public void show() {
		for (int i = 0; i < email.size(); i++) {
			System.out.println(i + ". " + email.get(i).toString());
		}
	}
	public void show(Orden definoOrden) {
		setOrden(definoOrden);
		sort();
		show();
	}
	
	private Boolean before(Email m1, Email m2) {
		return definoOrden.before(m1, m2);
		
	}
}
