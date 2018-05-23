package cz.jankrejcarek.sample1;

import java.util.Date;

import javax.ejb.LocalBean;
import javax.ejb.Stateful;

/**
 * Session Bean implementation class DateEventBean
 */
@Stateful(mappedName = "datebean")
@LocalBean
public class DateEventBean {

	private Date date;
	
	/**
	 * Default constructor.
	 */
	public DateEventBean() {
		// TODO Auto-generated constructor stub
	}

	public void close() {

	}

	public void dateFromChanged() {
		System.out.println("date changed");
	}
}
