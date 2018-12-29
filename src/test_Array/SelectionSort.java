package test_Array;

import java.util.ArrayList;
import java.util.Collections;

//—°‘Ò≈≈–Ú
public class SelectionSort {

	public static void main(String[] args) {
		/*int a[] = {21,3,5,31,4};
		int temp,min;
		for(int i=0;i<a.length;i++) {
			min = i;
			for(int j=i+1;j<a.length;j++) {
				if(a[j]<a[min]) {
					min = j;
				}
			}
			if(min!=i) {
				temp = a[i];
				a[i] = a[min];
				a[min] = temp;
			}
		}
		
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		*/
		ArrayList<Integer> al = new ArrayList<Integer>(); 
        al.add(2); 
        al.add(131); 
        al.add(1); 
        al.add(32); 
        al.add(6); 
        
		Collections.sort(al);
		System.out.println("List after the use of" + " Collection.sort() :\n" + al); 
		
	}
}

