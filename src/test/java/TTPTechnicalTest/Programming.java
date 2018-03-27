package TTPTechnicalTest;

import org.testng.annotations.Test;

public class Programming {

    /*
    Given an unordered array of integers of length N > 0, calculate the length of the
    longest ordered (ascending from left [lower index] to right [higher index]) subsequence
    within the array.
     */

    @Test
    public void programming() {
        int [] a = {1,4,1,4,2,1,3,5,6,2,3,7}; //Expected Output = 4
        int [] b = {3,1,4,1,5,9,2,6,5,3,5}; //Expected Output = 3
        int [] c = {2,7,1,8,2,8,1}; //Expected Output = 2


        System.out.println("Length of the longest ordered sub-sequence of array [a] is "+calculateLength(a));
        System.out.println("Length of the longest ordered sub-sequence of array [b] is "+calculateLength(b));
        System.out.println("Length of the longest ordered sub-sequence of array [c] is "+calculateLength(c));


    }

    public int calculateLength(int[] input){

        int result = 0;
        int current = 0;
        for (int i = 0; i < input.length; i++) {
            if (i > 0 && input[i] <= input[i - 1])
                current = 0;
            current++;
            result = Math.max(result, current);
        }
        return result;
    }

}
