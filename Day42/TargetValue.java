public class TargetValue {
    public static void main(String[] args) {
        int a[]={2,5,7,8,3,12,10};
        int target=15;
        for(int i=0;i<a.length-1;i++) {
            for(int j=i+1;j<a.length;j++) {
                if(a[i]+a[j]==target) 
                  System.out.println(a[i]+" "+a[j]);
            }
        }
    }
}