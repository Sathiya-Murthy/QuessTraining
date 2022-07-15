package JavaGroomingCodeChallenge;

import java.util.Scanner;

public class ArraySort {
    public static void main(String[] args) {
        int len;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the length of Array");
        len= scanner.nextInt();
        int[] nums=new int[len];
        System.out.println("Enter the element of array");
        for (int i=0;i<len;i++){
            nums[i]= scanner.nextInt();
        }
        for (int i = 0; i < nums.length; i++)
        {
            for (int j = i + 1; j < nums.length; j++)
            {
                int tmp = 0;
                if (nums[i] > nums[j])
                {
                    tmp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = tmp;
                }
            }
        }
        for (int i = 0; i < nums.length; i++)
        {
            System.out.print(nums[i]+ " ");
        }

    }

}
