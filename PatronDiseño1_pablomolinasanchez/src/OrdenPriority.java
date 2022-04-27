/**
 * @author Pablo Molina Sanchez
 */
public class OrdenPriority implements Orden{
	@Override
	public Boolean before(Email m1, Email m2) {
		if(m1.priority.compareTo(m2.priority) < 0 ) {
			return true;
		}
		return false;
	}
}
