/**
 * @author Pablo Molina Sanchez
 */
public class OrdenText implements Orden{
	@Override
	public Boolean before(Email m1, Email m2) {
		if(m1.text.compareToIgnoreCase(m2.text) < 0 ) {
			return true;
		}
		return false;
	}
}
