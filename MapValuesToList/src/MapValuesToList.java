import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapValuesToList {

	public static void main(String[] args) {

		HashMap<String, Integer> hashMap = new HashMap<>();
		hashMap.put("a", 1);
		hashMap.put("b", 2);
		hashMap.put("c", 3);
		hashMap.put("d", 4);
		hashMap.put("e", 5);
		MapValuesToList object = new MapValuesToList();
		List<Integer> mapValuesToList = object.mapValuesToList(hashMap);
		mapValuesToList.forEach(System.out::println);
	

	}

	public List<Integer> mapValuesToList(Map<String, Integer> map) {
		ArrayList<Integer> arrayList = new ArrayList<>(map.values());

		return arrayList;

	}

}
