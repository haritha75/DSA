public class FourSum {

    public static void main(String[] args) {
        

        int arr[]={0,1,2,3,4,5,6,7,8};

        for(int i=0;i<arr.length-3;i++) {
            for(int j=i+1;j<arr.length-2;j++) {
                for(int k=j+1;k<arr.length-1;k++) {
                    for(int h=k+1;k<arr.length;k++) {
                        
                       if( arr[i]+arr[j]==arr[k]+arr[h]) {
                        System.out.println(arr[i]+" "+arr[j]+" "+arr[k]+" "+arr[h]);
                        return;
                       }

                    }
                   
                      
                }
            }
        }
    }
    
}
