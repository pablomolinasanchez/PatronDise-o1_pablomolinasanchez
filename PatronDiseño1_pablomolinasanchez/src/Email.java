/**
 * @author Pablo Molina Sanchez
 */
import java.util.Date;

public class Email {
	public String from;
	public String subject;
	public Date date;
	public Priority priority;
	public String text;
	
	public Email(String from, String subject, Date date, Priority priority, String text) {
		this.from = from;
		this.subject = subject;
		this.date = date;
		this.priority = priority;
		this.text = text;
	}

	@Override
	public String toString() {
		return "from: " + from + ", subject: " + subject + ", date: " + date.toString() + ", priority: " + priority + ", text: "
				+ text + ".";
	}
}
