package com.wip.automation.excercise4;

public class ArrayOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] numbers = new int[] { 17, 8, 22, 14, 5, 2, 87};

        // find minimum value
		
        int minValue = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < minValue) {
                minValue = numbers[i];
            }

        }

        System.out.println("Minimum Value of numbers array is:" + minValue);

     // find minimum value
        int maxValue = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > maxValue) {
                maxValue = numbers[i];
            }
        }
        System.out.println("maximum Value of numbers array is:" + maxValue);

     // Find sum of the array using for loop
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum=sum+numbers[i];

        }

        System.out.println("The sum of numbers array is:" + sum);
        
        // copy to new array
        
        int[] oldArray = {1,2,3,4,5};
        int[] newArray;
        newArray = oldArray;
 
        for(int i=0; i<newArray.length;i++)
        {
        System.out.println("The value of new Array are:" +newArray[i]);
        }
        
        //copy to a new array from end
        
        int[] oldArray1 = {1,2,3,4,5};
        int[] newArray1;
        newArray1 = oldArray1;
 
        for(int x=newArray1.length-1;x>=0;x--)
        {
        System.out.println("The value of Array from end are:" +newArray1[x]);
        }
        
        // Reverse an array in place
        
        System.out.print("Reverse in place copy of Numebrs array is:");
        for (int i = 0; i < numbers.length / 2; i++) {

            int temp = numbers[i];
            numbers[i] = numbers[numbers.length - 1 - i];
            numbers[numbers.length - 1 - i] = temp;

        }
       
        for (int j = 0; j < numbers.length; j++) {
            System.out.print(numbers[j] + ",");

        }
        
	}

}
