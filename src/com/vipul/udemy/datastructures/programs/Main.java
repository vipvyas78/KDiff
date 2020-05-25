package com.vipul.udemy.datastructures.programs;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int [] input = {8,12,16,4,0,20};
        int k= 4;

        //Step 1 -- Sort the array

        Arrays.sort(input);

//
//        for ( int i=0 ; i< input.length; i++ ) {
//            System.out.println(input[i]);
//        }


        int maxElement = input[input.length-1];

        // Do the outer loop till only maxElement - k
        // Anything after that will have a difference of less than k


        for (int i = 0; i< maxElement - k; i++)
        {

            // Do inner loop starting for the next element
            //break if the difference is equal to k

            for (int j=i+1;  j < input.length; j++)
            {
                //check diff
                //if diff = k then print pair and break from inner loop
                if(input[j] - input[i] == k)
                {
                    System.out.println("{"+input[i]+","+input[j]+"}");
                    break;
                }
                //If diff is > k then break from inner loop again
                if(input[j] - input[i] > k)
                {
                    break;
                }

                //IF diff <k then contnue with the next element
                if (input[j]-input[i]<k)
                {
                    continue;
                }

            }

        }


    }
}
