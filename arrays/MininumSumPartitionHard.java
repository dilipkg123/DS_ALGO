package dsandalgo.com.dilip.arrays;

import java.util.Scanner;

public class MininumSumPartitionHard {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-- > 0) {
                int n = sc.nextInt();
                int[] arr = new int[n];
                int sum = 0;
                for(int i=0;i<n;i++) {
                    arr[i] = sc.nextInt();
                    sum += arr[i];
                }

                boolean[][] dp = new boolean[sum+1][n+1];
                for(int j=0;j<n+1;j++) dp[0][j] = true;
                for(int i=1;i<sum+1;i++) dp[i][0] = false;
                for(int s=1;s<sum+1;s++) {
                    for(int num=1;num<n+1;num++) {
                        boolean including = false;
                        boolean excluding = false;
                        if(arr[num-1] <= s) including = dp[s-arr[num-1]][num-1];
                        excluding = dp[s][num-1];
                        dp[s][num] = including || excluding;
                    }
                }

                for(int j=sum/2;j>=0;j--) {
                    if(dp[j][n] == true) {
                        System.out.println(sum - 2*j);
                        break;
                    }
                }

            }
        }
    }
