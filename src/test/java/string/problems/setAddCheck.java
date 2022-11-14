package string.problems;

import java.util.HashSet;
import java.util.Set;

public class setAddCheck {

	public static void main(String[] args) {
		String s1= "this apple is sweet"; 
		String s2= "this apple is sour"; 
		String[] s3=s1.split(" ");
		String[] s4=s2.split(" ");
		Set<String> set=new HashSet<>();

		for(int i=0;i<s3.length;i++) {
			boolean addStatus = set.add(s3[i]);
			System.out.println(i+" "+addStatus+":");
		}
		
		System.out.println();
		
		for(int i=0;i<s4.length;i++) {
			boolean addStatus = set.add(s4[i]);
			if(!addStatus) {
				System.out.println("Duplicate: "+s4[i]);
			}
			System.out.println(i+" "+addStatus+":");
		}

	}
}
