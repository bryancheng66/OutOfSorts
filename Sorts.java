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

	public static void selectionSort(int[] data){
		for (int i = 0; i < data.length - 1; i++){
			int swapValue = data[i];
			int swapIndex = i;
			for (int j = i; j < data.length; j++){
				if (data[j] < swapValue){
					swapValue = data[j];
					swapIndex = j;
				}
			}

			for (int k = swapIndex; k >  i; k--){
				data[k] = data[k-1];
			}
			data[i] = swapValue;
		}
	}

	public static void insertionSort(int[] data){
		int position;
		int currentValue;
		for (int i = 1; i < data.length; i++){
			position = i;
			currentValue = data[i];
			for (int j = 0; position == i && j < i; j++){
				if (data[j] > data[i]){
					position = j;
				}
			}

			for (int k = i; k > position; k--){
				data[k] = data[k-1];
			}
			data[position] = currentValue;
		}
	}
}
