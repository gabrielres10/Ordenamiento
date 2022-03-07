
public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = new int[] {-2, 80, -40, 10, 5, -90, 1};
		menorAMayor(arr);
		
		
	}
	
	public static void xd(int [] arr) {
		for (int rojo = 0; rojo<arr.length; rojo++) {
			for(int azul = rojo+1; rojo < arr.length; azul++ ) {
				if(arr[rojo] > arr[azul]) {
					int valorRojo = arr[rojo];
					int valorAzul = arr[azul];
					arr[rojo] = valorAzul;
					arr[azul] = valorRojo;
				}
			}
		}
	}
	
	public static int getMin(int [] arr) {
		int menor = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < menor) {
				menor = arr[i];
			}
		}
		return menor;
	}
	
	public static int getMax(int [] arr) {
		int mayor = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > mayor) {
				mayor = arr[i];
			}
		}
		return mayor;
	}
	
	public static void menorAMayor(int [] arr) {
		int menor = getMin(arr);
		int mayor = getMax(arr);
		for(int j = 0; j<arr.length; j++) {
			for (int i = 0; (i+1)<arr.length; i++) {
				int forward = arr[i+1];
				int backward = arr[i];
				if(forward < backward) {
					arr[i] = forward;
					arr[i+1] = backward;
				}
				if (arr[0] == menor && arr[arr.length-1] == mayor) {
					break;
				}
			}
		}
		
		for (int a: arr) {
		System.out.println(a);	
		}
	}


}
