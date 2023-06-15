package tester;

import java.util.LinkedHashMap;
import java.util.Map;
import static java.util.Map.Entry;

public class TestMap {

	public static void main(String[] args) {
		Map<String, Integer> map = new LinkedHashMap<>();
		map.put("one", 10);
		map.put("two", 20);
		map.put("three", 30);
		map.put("four", 40);
		//display all entries
		for(Entry e : map.entrySet())
			System.out.println(e.getKey()+" "+e.getValue());

	}

}
