package arrays;

public class JavaVectorTest {
	public static void main(String[] args) {
		JavaVector<Integer> array1 = new JavaVector<Integer>();
		
		System.out.println("array 1 is empty: " + array1.isEmpty());
		System.out.println("Capacity: " + array1.capacity());
		array1.push(2);
		array1.push(8);
		array1.push(10);
		array1.push(9);
		array1.push(8);
		array1.push(24);
		array1.push(17);
		array1.push(90);
		array1.push(87);
		
		System.out.println("Value of index 3 is: " + array1.get(3));
		System.out.println("Size of array1 is: " + array1.size());		
		
		array1.insert(8, 1);
		array1.prepend(20);
		array1.push(102);
		array1.push(890);
		
		System.out.println("Capacity: " + array1.capacity());
		System.out.println("Size of array1 is: " + array1.size());	
		
		for(Integer arr : array1) {
			System.out.print(arr + ", ");
		}
		System.out.println();
		
		System.out.println("Value of index 12 is: " + array1.get(12));
		
		array1.set(12, 900);
		
		System.out.println("Value of index 12 is: " + array1.get(12));
	}
}
