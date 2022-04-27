/**
 * @author Pablo Molina Sanchez
 */
public class OrdenFrom implements Orden {
	@Override
	public Boolean before(Email m1, Email m2) {
		if(m1.from.compareToIgnoreCase(m2.from) < 0 ) {
			return true;
		}
		return false;
	}
}
