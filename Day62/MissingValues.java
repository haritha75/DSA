public class MissingValues {

    public static void main(String[] args) {
        
        int arr[]={11,15,13,19};
        int low=11,high=19;

        missingValues(arr,low,high);
    }



    public static void missingValues(int arr[],int low,int high) {

        for(int i=low+1;i<high;i++) {

            boolean flag=true;

            for(int j=0;j<arr.length;j++) {
                if(arr[j]==i) {
                    flag=false;
                    break;
                }
            }
            if(flag) 
              System.out.print(i+" ");
        }


        
    }
}