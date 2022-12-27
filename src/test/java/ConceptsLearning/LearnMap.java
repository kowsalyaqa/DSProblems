package ConceptsLearning;
import java.util.*;
import java.util.function.BiConsumer;

public class LearnMap {

	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<>();

		Integer firstValue = map.put("Kowsalya", 10);
		Integer secondValue = map.put("Velumurgaun", 9);
		Integer thirdValyue = map.put("Fiyaz", 5);

		System.out.println(map.getOrDefault("Kowsalya",15));
		System.out.println(map.getOrDefault("TestLeaf",15));

		Integer integer = map.putIfAbsent("Kowsalya", 20);
		Integer integer1 = map.putIfAbsent("TestLeaf", 3);

		System.out.println(integer);
		System.out.println(integer1);

		System.out.println(map);

		List<String> list = new ArrayList<>();
		list.add("Nonsense");

		/*for (Map.Entry<String,Integer> entry:map.entrySet()) {
	            if(entry.getValue()>5)list.add(entry.getKey());
	        }*/

		BiConsumer<String,Integer> checkLengthGreaterFive = (a,b) -> {
			if(b>5)list.add(a);
		};

		//map.forEach((k,v)->{if(v>5)list.add(k);});
		map.forEach(checkLengthGreaterFive);

		System.out.println(list);


		System.out.println(firstValue);
		System.out.println(secondValue);
		System.out.println(thirdValyue);

		Integer prevValue = map.remove('d');
		System.out.println("Removed "+prevValue);

		System.out.println("Printing Map "+map);



		Map<Character,Integer> map2 = new HashMap<>();
		map2.put('v',1);
		map2.put('b',2);
		map2.put('z',3);
		map2.put('f',3);
		System.out.println(map2);

		System.out.println(map.size());

		map.isEmpty();
		Collection<Integer> values = map.values();


		/* Map<Character,Integer> map2 = new HashMap<>();

	        map.get('c');
	            //Default size - 16
	        boolean flag =map.containsKey('c');
	        map.put('v',2);
	        map.put('u',map.getOrDefault('u',0)+1);
	      //  System.out.println(map);
	        System.out.println(map.remove('v', 1));

	        System.out.println(map);
	        System.out.println(map.remove('v'));
	        System.out.println(map);//

	        Set<Map.Entry<Character, Integer>> entries = map.entrySet();
	        Set<Character> characters = map.keySet();
	        System.out.println(map.equals(map2));

	        System.out.println(values);


	        for (Map.Entry<Character,Integer> entry:entries) {
	            //System.out.println(entry.getKey() + " "+ entry.getValue());
	        }*/


		/*  System.out.println(map.getOrDefault('v',1));
	        map.putAll(map2);
	        System.out.println(map);
	        System.out.println(map2);*/
	}
}
