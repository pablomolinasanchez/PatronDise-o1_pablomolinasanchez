/**
 * @author Pablo Molina Sanchez
 */
public class OrdenDate implements Orden{
	@Override
	public Boolean before(Email m1, Email m2) {
		if(m1.date.compareTo(m2.date) < 0 ) {
			return true;
		}
		return false;
	}
}
