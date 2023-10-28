import java.util.HashSet;

public class CanWatchTwoMovies {

    public static void main(String[] args) {

        int movieMin[] ={70,30,40,50};

        int exactTwoMoviesTiming=120;

        exactTwoMovies(movieMin,exactTwoMoviesTiming);


        

    }

    public static void exactTwoMovies(int arr[],int exacttime) {


        HashSet<Integer> set=new HashSet<>();

        for(var x: arr)
          set.add(x);

          for(int i=0;i<arr.length;i++) {

            int time=exacttime-arr[i];

            if(set.contains(time)) {
              System.out.println("Yes, we can watch exact two movies with in the time");
              return;
          }
        }


          System.out.println("No, we cannot watch given time");


    }


}