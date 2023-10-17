public class HashSet {

    int[] data=new int[10];

    public void add(int num) {

        int index=hash(num);
        data[index]=num;


    }

    public int hash(int num) {

        return num%data.length;
    }

    public boolean containsKey(int num) {

        int index=hash(num);
        return data[index]!=0;
    }
}