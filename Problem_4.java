public class Problem_4 {
    public static void main(String[] args) {
        int[] num = {1,2,8,9,12,46,76,82,15,20,30};

        for (int i = 1; i <= 9; i++) {
            int count = 0;
             for (int j : num){
                if (j % i == 0) {
                    count++;
                }
            }
            System.out.println(i+ " "+ count);
        }

    }
}
