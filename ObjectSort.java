package ObjectPack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ObjectSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] myarr= {6,3,8,5,11,2,99,4};
		Arrays.sort(myarr);
		System.out.println(Arrays.toString(myarr));
		
		//sort Strings
		
		List<String> mystrlist=new ArrayList<>();
		mystrlist.add("Fir         st");
		mystrlist.add("Second");
		mystrlist.add("Accent");
		mystrlist.add("Fourth");
		mystrlist.add("Fifth");
		
		Collections.sort(mystrlist);
		for(String s:mystrlist) {
			
			System.out.println(" "+s);
		}

		
	}

}
