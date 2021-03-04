package Task02;

import java.util.Comparator;
import java.util.TreeSet;

public class CommoditySortingHeight implements Comparator<Commodity> {

	@Override
	public int compare(Commodity c1, Commodity c2) {
		if (c1.getHeight() > c2.getHeight()) {
			return 1;
		} else if (c1.getHeight() < c2.getHeight()) {
			return -1;
		} else {
			if (c1.getName().compareTo(c2.getName()) > 0) {
				return 1;
			} else if (c1.getName().compareTo(c2.getName()) < 0) {
				return -1;
			}
		}
		return 0;
	}

}
