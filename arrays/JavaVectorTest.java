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
		
		System.out.println("Value of index 0 is: " + array1.get(0));
		
		JavaVector<String> array2 = new JavaVector<String>();
		array2.push("hi");
		array2.push("hello");
		array2.push("seven");
		array2.insert(1, "no");
		array2.prepend("yes");
		
		System.out.println("Value of index 3 is: " + array2.get(3));
		System.out.println("Size of array2 is: " + array2.size());		
		System.out.println("Capacity: " + array2.capacity());
		
		for(String arr : array2) {
			System.out.print(arr + ", ");
		}

	}
}
