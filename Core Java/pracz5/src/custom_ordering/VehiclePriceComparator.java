package custom_ordering;

import java.util.Comparator;

import com.app.core.Vehicle;

public class VehiclePriceComparator implements Comparator<Vehicle> {
	@Override
	public int compare(Vehicle v1, Vehicle v2) {
		System.out.println("in compare : price");
		if (v1.getNetPrice() < v2.getNetPrice())
			return -1;
		if (v1.getNetPrice() == v2.getNetPrice())
			return 0;
		return 1;
	}

}
