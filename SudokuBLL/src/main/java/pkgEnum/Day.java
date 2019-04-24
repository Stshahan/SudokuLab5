package pkgEnum;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public enum Day implements Serializable, Comparable<Day>{

	 MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY;
	
	private String abbreviation;
	
	private static Map<String,Day> lookup = new HashMap<String,Day>();

	public String getAbbreviation() {
		return abbreviation;
	}
	
	public static Day get (String abbreviation) {
		return lookup.get(abbreviation);
	}
}
