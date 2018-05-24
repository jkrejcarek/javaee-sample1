package cz.jankrejcarek.sample1;

import java.io.Serializable;
import java.util.Date;
import java.util.logging.Logger;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;



@Named(value="datebean")
@SessionScoped
public class DateEventBean implements Serializable {

	private static transient Logger logger = Logger.getLogger(DateEventBean.class.getPackage().getName());
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Date dateFrom;
	private Date dateTo;
	private long daysDifference = 0;
	
	public DateEventBean() {
	}

	public void close() {
	}

	public void dateFromChanged() {
		System.out.println("Console: date from changed to " + dateFrom);
		logger.info("'Date from' changed to " + dateFrom);
		computeDifference();
	}
	
	public void dateToChanged() {
		System.out.println("Console: date to changed to " + dateTo);
		logger.info("'Date to' changed to " + dateTo);
		computeDifference();
	}

	public void computeDifference() {
		if (dateFrom != null && dateTo != null) {
			daysDifference = DateDifference.compute(dateFrom, dateTo);
		}
		
	}

	public Date getDateFrom() {
		return dateFrom;
	}

	public void setDateFrom(Date dateFrom) {
		this.dateFrom = dateFrom;
	}

	public Date getDateTo() {
		return dateTo;
	}

	public void setDateTo(Date dateTo) {
		this.dateTo = dateTo;
	}

	public long getDaysDifference() {
		return daysDifference;
	}
	
	
}
