package Task02;

import java.util.Comparator;

public class CommoditySortingWidth implements Comparator<Commodity> {

	@Override
	public int compare(Commodity c1, Commodity c2) {
		if(c1.getWidth()>c2.getWidth()) {
			return 1;
		}
		else if(c1.getWidth()<c2.getWidth()) {
			return -1;
		}
		else {
			if(c1.getName().compareTo(c2.getName())>0) {
				return 1;
			}
			else if(c1.getName().compareTo(c2.getName())<0) {
				return -1;
			}
		}
		return 0;
	}

}
