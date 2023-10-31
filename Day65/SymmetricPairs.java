public class SymmetricPairs {

    public static void main(String[] args) {
        int arr[][]=new int[5][2];

            arr[0][0] = 11;
            arr[0][1] = 20;
            arr[1][0] = 30;
            arr[1][1] = 40;
            arr[2][0] = 5;
            arr[2][1] = 10;
            arr[3][0] = 40;
            arr[3][1] = 30;
            arr[4][0] = 10;
            arr[4][1] = 5;

            for(int i=0;i<arr.length;i++) {

                for(int j=i+1;j<arr.length;j++) {

                    if(arr[i][0]==arr[j][1]  &&  (arr[i][1]==arr[j][0]))
                      System.out.println("("+arr[i][0]+","+arr[i][1]+")");

                }
            }
        
    }
    
}
