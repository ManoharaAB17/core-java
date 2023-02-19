/**
 * 
 */
package com.xworkz.taskapp;

/**
 * @author DELL
 *
 */
public class ThirdLarg {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {

      int arr[]= {10,2,23,45,543,34,3423,543,234,546,354};
      
      for(int i=0;i<arr.length;i++) {
    	  for(int j=i+1;j<arr.length;j++) {
    		  int temp=0;
    		  if(arr[i] < arr[j]) {
    			  temp=arr[i];
    			  arr[i]=arr[j];
    			  arr[j]=temp;
    		  }
    	  }
      }
         for(int m=0;m<arr.length;m++) {
    	  System.out.print(" " +arr[m]);
    	  System.out.println("");
      }
      
      System.out.println(" Third largest number in the array is : " +arr[2]);
	}

}
