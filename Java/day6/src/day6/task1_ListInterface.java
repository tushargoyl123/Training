/*
 Implement a method that takes a list as an argument and removes every second element from the list then prints the resulting list.
 */

package day6;

import java.util.ArrayList;
import java.util.List;

public class task1_ListInterface {

	public static void main(String[] args) {
		List<Integer> nums = List.of(1,2,3,4,5,6,7,8,9,10);
		listInterface l1 = new listInterface();
		l1.removeEverySecondElement(nums);

	}

}

class listInterface{
	public static void removeEverySecondElement(List<?> list) {
		List<Object> resultList = new ArrayList<>(); 
		for(int i=0; i<list.size(); i+=2) {
			resultList.add(list.get(i));
		}
		System.out.println("List after removing every second element: "+resultList);
	}
}
