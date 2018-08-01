import java.util.ArrayList;
import java.util.Comparator;
import java.util.Hashtable;
import java.util.List;
import java.util.function.Consumer;

public final class Occurences {
	public static String findOccurences(int[] array) {
		Hashtable<Integer, Boolean> recordTable = new Hashtable<>();
		List<Integer> repeatedElements  = new ArrayList<>();

		// Declare The two Pointer Indexes
		int a = 0, z = array.length - 1;

		while( a < array.length / 2) {
			int pointerOne = array[a], pointerTwo = array[z];

			if (!recordTable.containsKey(pointerOne)) {
				// Make the value false for when multiple values are seen
				recordTable.put(pointerOne, false);
			} else {
				// If no multiple values have` been found before
				if(!recordTable.get(pointerOne)) {
					repeatedElements.add(pointerOne);
					recordTable.replace(pointerOne, true);
				}
			}

			if (!recordTable.containsKey(pointerTwo)) {
				recordTable.put(pointerTwo, false);
			} else {
				if(!recordTable.get(pointerTwo)) {
					repeatedElements.add(pointerTwo);
					recordTable.replace(pointerTwo, true);
				}
			}
			// increment or decrement loop variables
			a++; z--;
		}

		return buildElements(repeatedElements);
	}

	private static String buildElements(List<Integer> repeatedElements) {

		repeatedElements.sort(new Comparator<Integer>() {

			@Override
			public int compare(Integer arg0, Integer arg1) {
				// TODO Auto-generated method stub
				return arg0.compareTo(arg1);
			}
		});

		StringBuilder strBuilder = new StringBuilder();
		strBuilder.append("[ ");
		repeatedElements.forEach(new Consumer<Integer>() {

			@Override
			public void accept(Integer value) {
				// TODO Auto-generated method stub
				strBuilder.append(value + ", ");
			}

		});
		// lazy way of trimming the string, instead of a proper forloop :-)
		strBuilder.deleteCharAt(strBuilder.length() - 2);
		strBuilder.append("]");

		return strBuilder.toString();
	}
}
