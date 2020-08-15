package test;

import java.util.ArrayList;

public class SortedArraySorting {

	public static void main(String args[]) {
		int arr1[] = {1,2,4,7,9};
		int arr2[] = {3,5,6,8,12,34,40,57};

		ArrayList<Integer> al = new ArrayList<Integer>();

		int pntr1=0;
		int pntr2=0;

		int arr1Last = arr1.length;
		int arr2Last = arr2.length;		

		boolean flag =false;

		while(true) {


			if(arr1[pntr1]<arr2[pntr2]) {


				al.add(arr1[pntr1]);

				if(pntr1<arr1.length) {
					pntr1++;

				}

			}else  {

				al.add(arr2[pntr2]);

				if(pntr2<arr2.length) {
					pntr2++;	
				}



			}


			if(pntr1 == arr1.length) {

				for(int i = pntr2;i<arr2.length;i++) {
					al.add(arr2[pntr2]);
					pntr2++;
				}

				break;
			}

			if(pntr2 == arr2.length) {

				for(int i = pntr1;i<arr1.length;i++) {
					al.add(arr1[pntr1]);
					pntr1++;
				}
				break;
			}

		}



		for(Integer i :al) {

			System.out.println(i);
		}

	}


}
