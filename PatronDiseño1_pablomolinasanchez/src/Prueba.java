import java.sql.Date;

public class Prueba {

	public static void main(String[] args) {
Mailbox mb = new Mailbox();
		Email m1 = new Email("Alicia", "P�game", Date.valueOf("2020-04-15"), Priority.IMPORTANTE, "Hazme Bizum");
		Email m2 = new Email("Mar�a", "Pendientes",Date.valueOf("2003-08-21"), Priority.SPAM, "Compra estos pendientes y llevatye un 15% de escuento en tu pr�xima compra");
		Email m3 = new Email("Gustavo", "Trabajo acabado", Date.valueOf("1997-09-07"), Priority.RECIBIDO, "Acab� el trabajo ayer, este es el resultado");
		Email m4 = new Email("Antonio", "Urgencias", Date.valueOf("2022-08-25"), Priority.DESTACADO, "Su amigo est� fuera de peligro");

		mb.anyadirEmail(m1);
		mb.anyadirEmail(m2);
		mb.anyadirEmail(m3);
		mb.anyadirEmail(m4);
		mb.show();

		mb.setOrden(new OrdenDate());
		System.out.println(mb.getOrden());
		mb.show();
		mb.setOrden(new OrdenFrom());
		System.out.println(mb.getOrden());
		mb.show();
		mb.setOrden(new OrdenPriority());
		System.out.println(mb.getOrden());
		mb.show();
		mb.setOrden(new OrdenSubject());
		System.out.println(mb.getOrden());
		mb.show();
		mb.setOrden(new OrdenText());
		System.out.println(mb.getOrden());
		mb.show();

	}

}
