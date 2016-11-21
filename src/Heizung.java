/**
 * Created by Auron on 14.11.2016.
 */
public class Heizung {
    public static void main(String[] args){
        for(long value = 1; value < 1000000000; value+=2) {
            boolean bool = true;
            if (value <= 2) {
                bool = (value == 2);
            }
            for (long i = 2; i * i <= value; i++) {
                if (value % i == 0) {
                    bool = false;
                }
            }

            if (bool == true) System.out.println(value);

        }
    }
}
