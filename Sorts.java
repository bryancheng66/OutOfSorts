import java.util.Arrays;

public class Sorts{
	public static void bubbleSort(int[] data){
		boolean sorted = false;
		for (int i = 1; !sorted && i < data.length; i++){
			for (int j = 0; j < data.length - i; j++){
				if (data[j] > data[j+1]){
					int newValue = data[j];
					data[j] = data[j+1];
					data[j+1] = newValue;
				}
			}

			sorted = true;
			for (int j = 0; sorted && j < data.length - i; j++){
				if (data[j] > data[j+1]){
					sorted = false;
				}
			}
		}
	}
}
