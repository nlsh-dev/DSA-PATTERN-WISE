package StackQueueProblema;

public class sum {


    public static void main(String[] args) {


        int[] arr = {1, 2,3 , 4, 5 };


        int i = 0 ;
        int  n = arr.length;

        int  j = n-1;
        int target = 5;



        while(i<=j){


            int sum  = arr[i]+arr[j];


            if(sum == target){
                return int[]{i , j };

            }
        }

    }
}
