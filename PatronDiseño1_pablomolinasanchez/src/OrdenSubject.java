/**
 * @author Pablo Molina Sanchez
 */
public class OrdenSubject implements Orden{
	@Override
	public Boolean before(Email m1, Email m2) {
		if(m1.subject.compareToIgnoreCase(m2.subject) < 0 ) {
			return true;
		}
		return false;
	}
}
