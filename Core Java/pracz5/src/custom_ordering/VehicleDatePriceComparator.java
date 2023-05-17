package custom_ordering;

import java.util.Comparator;

import com.app.core.Vehicle;

public class VehicleDatePriceComparator implements Comparator<Vehicle>{
	@Override
	public int compare(Vehicle v1,Vehicle v2) {
		System.out.println("in compare -date n price1");
		int retVal=v1.getManufactureDate().compareTo(v2.getManufactureDate());
		if(retVal == 0) {
			//=< dates same --continue to price based comparison
			if(v1.getNetPrice()<v2.getNetPrice())
				return -1;
			if(v1.getNetPrice()==v2.getNetPrice())
				return 0;
			return 1;			
		}
		return retVal;
	}

}
