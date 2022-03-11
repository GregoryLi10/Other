package Other;

import java.util.HashMap;
import java.util.stream.IntStream;

public class Map {
	public static void main (String[] args) {
		HashMap<Integer, Character> map = new HashMap<>();
		IntStream.range(0,5).forEach(i -> map.put(i,(char)(i+97)));
	}
}
