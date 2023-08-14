//here we have three types of problem solving we always select best case here 0(1) is the best one so we select that one.
class SumOfNaturalNums {
    public static void main(String[] args) {

        int n = 10;
        int sum = 0;
        for(int i = 1; i <= n; i++) {          // time complexity O(n)
            sum += i;
        }
        System.out.println(sum);


        int s = (n*(n+1))/2;           // time complexity O(1)
        System.out.println(s);


        int s1 = 0;
        for(int i = 1; i <= n; i++) {          // time complexity O(n^2)
            for(int j = i; j <= i; j++) {
                s1 += j;
            }
        }
        System.out.println(s1);
       
    }
}

