package arrays;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class JavaVector<T> implements Iterable<T>{
	private static final int INIT_CAPACITY = 10;
	private T[] arr;
	private int size;
	
	public JavaVector() {
		arr = (T[]) new Object[INIT_CAPACITY];
		size = 0;
	}
	
	public int size() {
		return size;
	}
	
	public int capacity() {
		return arr.length;
	}
	
	public boolean isEmpty() {
		if(arr.length == 0) {
			return true;
		}
		return false;
	}

	public T get(int index) {
		if(index < 0 || index >= size) {
			System.out.println("ERROR: index out of range");
		} 
			return arr[index];
	}
	
	public T set(int index, T val) {
		if(index < 0 || index >= size) {
			System.out.println("ERROR: index out of range");
		}
		return arr[index] = val;
	}
	
	public T[] insert(int index, T val) {
		T[] newArr = (T[]) new Object[arr.length+1];
		
		for(int i = 0; i < index; i++) {
			newArr[i] = arr[i];
		}
		newArr[index] = val;
		for(int i = index + 1; i <= arr.length; i++) {
			newArr[i] = arr[i - 1];
		}
		arr = newArr;
		size++;
		return arr;
	}
	
	public T[] prepend(T val) {
		return insert(0, val);
	}
	
	private void resize(int capacity) {
		if(capacity >= size) {
			T[] newArr = (T[]) new Object[capacity];
			for(int i = 0; i < size; i++) {
				newArr[i] = arr[i];
			}
			arr = newArr;
		}		
	}
	
	public void push(T val) {
		if (size == arr.length) {
			resize(2 * arr.length);
		}
		arr[size++] = val;
	}

	@Override
	public Iterator<T> iterator() {
		return new ReverseJavaVector();
		// TODO Auto-generated method stub
		
	}
	
	private class ReverseJavaVector implements Iterator<T> {
		private int i;
		
		public ReverseJavaVector() {
			i = size - 1;
		}

		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return i >= 0;
		}

		@Override
		public T next() {
			// TODO Auto-generated method stub
			if (!hasNext()) throw new NoSuchElementException();
			return arr[i--];
		}
		
	}
}
