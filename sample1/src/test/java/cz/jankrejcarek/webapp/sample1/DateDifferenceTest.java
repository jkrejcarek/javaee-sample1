package cz.jankrejcarek.webapp.sample1;

import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

import cz.jankrejcarek.sample1.DateDifference;
import junit.framework.TestCase;

public class DateDifferenceTest extends TestCase {

	@Test
	public void testDateDifference_sameDay_returnsOne() {
		Calendar calFrom = Calendar.getInstance();
		Date fromDate = calFrom.getTime();
				
		Date toDate = calFrom.getTime();
		
		long diff = DateDifference.compute(fromDate, toDate);
		assertEquals(1, diff);
	}
	
	@Test
	public void testDateDifference_oneWeek_returnsSeven() {
		int days = 7;
		
		Calendar calFrom = Calendar.getInstance();
		Date fromDate = calFrom.getTime();
		
		calFrom.add(Calendar.DAY_OF_MONTH, days);
		Date toDate = calFrom.getTime();
		
		long diff = DateDifference.compute(fromDate, toDate);
		assertEquals(days + 1, diff);
	}
	
	@Test
	public void testDateDifference_overMonth_returnsSeven() {
		int days = 40;
		
		Calendar calFrom = Calendar.getInstance();
		Date fromDate = calFrom.getTime();
		
		calFrom.add(Calendar.DAY_OF_MONTH, days);
		Date toDate = calFrom.getTime();
		
		long diff = DateDifference.compute(fromDate, toDate);
		assertEquals(days + 1, diff);
	}
	
}
