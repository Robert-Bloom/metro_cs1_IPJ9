public class Pseudo_Random {

    public static void main(String[] args) {
        int seed = Integer.parseInt(args[0]);

        int loop = Integer.parseInt(args[1]);


        double pi = 314159262;

        double e = 271828182;

       int last = (int)((pi*seed+e)/1000000);



       System.out.println(last);

       for(int i = 0; i<loop; i++){

            last = (int)((pi*seed+e)/100000*i);

           System.out.println(last);
       }


    }


}
