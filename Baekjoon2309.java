import java.util.Arrays;
import java.util.Scanner;

public class Baekjoon2309 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] dwarfs = new int[9];
        int sum = 0;
        int liar1= 0, liar2 = 0;

        for (int i = 0; i < dwarfs.length; i++)  {
            dwarfs[i] = sc.nextInt();
            sum += dwarfs[i]; // sum = sum + arr[i];
        }

        for (int i = 0; i < dwarfs.length; i++)  {
            for (int j = i + 1; j < dwarfs.length; j++)  {
                if(sum - dwarfs[i] - dwarfs[j] == 100)    {
                    liar1 = dwarfs[i];
                    liar2 = dwarfs[j];

                    i= dwarfs.length;
                    j= dwarfs.length;
                }
            }
        }

        Arrays.sort(dwarfs);

        for (int i = 0; i < dwarfs.length; i++) {
            if (dwarfs[i] != liar1 && dwarfs[i] != liar2) {
                System.out.println(dwarfs[i]);
            }
        }
    }
}