package Java8.streamAPI;

import java.util.Arrays;
import java.util.List;

public class PrintListUsingLamba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String>names=Arrays.asList("Alice","Bob");
		names.forEach(name->System.out.println(name));

	}

}
