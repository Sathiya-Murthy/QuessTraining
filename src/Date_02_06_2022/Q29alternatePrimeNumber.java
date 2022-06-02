package Date_02_06_2022;

import java.util.ArrayList;
import java.util.Scanner;

public class Q29alternatePrimeNumber {
    public static void main(String[] args) {
        int end;
        ArrayList<Integer> List=new ArrayList<>();
        Scanner scanner=new Scanner(System.in);
        end=scanner.nextInt();
        int count=0;
        for(int i=2;i<=end;i++)
        {
            for(int j=2;j<i;j++)    {
                if(i%j==0)
                    count++;
            }
            if(count==0) {
                List.add(i);
            }
            count=0;
        }
        for(int i=1;i<= List.size();i++)
        {
            if(i%2==0)
                continue;
            else {
                System.out.print(List.get(i-1)+" ");
            }
        }

    }
}
