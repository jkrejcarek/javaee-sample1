package cz.jankrejcarek.sample1;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.Date;

/**
 * Výpočet počtu dnů od počátečního do koncového data. Pokud se počáteční i koncové datum shodují, vrací hodnotu 1,
 * protože se jedná o jeden den. Používá se k výpočtu počtu dnů např. nepřítomnosti na pracovišti. 
 *
 */
public class DateDifference {

	/**
	 * Určí počet dnů, které zabírají rozpětí od fromDate do toDate. Pokud se data shodují, vrací 1. Pokud je toDate menší než fromDate, vrací záporné číslo.
	 * @param fromDate Počáteční den
	 * @param toDate Koncový den
	 * @return Počet dní, které zahrnuje období od počátku do konce.
	 */
	public static long compute(Date fromDate, Date toDate) {
		LocalDate date1 = fromDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		LocalDate date2 = toDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		
		long daysBetween = ChronoUnit.DAYS.between(date1, date2) + 1;
		return daysBetween;
	}

}
