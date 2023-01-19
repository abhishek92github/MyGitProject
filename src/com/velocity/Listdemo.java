package com.velocity;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Listdemo {
	
	
	


	public static void main(String[] args) {
		int [] a = {1,4,2,6};
		
		List<Integer> list= new	ArrayList<Integer>();
		list.add(35);
		list.add(25);
		list.add(15);
		list.add(12);
	
		List list1 = Arrays.asList(a);
		System.out.println(Arrays.toString(a));
		System.out.println(list1);
		
		for(Integer l : list) {
			System.out.print(" "+l);
		}
	}

}
