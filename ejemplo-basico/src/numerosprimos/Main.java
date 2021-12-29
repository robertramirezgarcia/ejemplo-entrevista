package numerosprimos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Integer> arrayFinal = new ArrayList<Integer>();
		Integer[] array = {1, 2, 8, 23, 5, 15, 17, 15, 22, 43};
		Arrays.sort(array);
		
		for(int i=0;i<array.length;i++) {
			
			int cantidad = 1;
			for(int j=2;j<=array[i];j++) {
				if(array[i]%j==0) {
					cantidad++;
				}
			}
			
			if(cantidad==2) {
				
				arrayFinal.add(array[i]);
			}
		}
		
		arrayFinal.stream().forEach(System.out::println);
		
	}
	
}
