import java.util.*;
public class Main{
    public static void main(String[] args){
        boolean enough_factor = false;
        long num = 1;
        long runner = 1;
        int num_of_factors = 0;
        int highest_factors = 0;
        while(!enough_factor){
            num_of_factors = 0;
            for(int i=1;i<(int) Math.sqrt(num);i++){
                if((num%i) == 0){
                    num_of_factors += 1;
                }
            }
            if(num_of_factors > 500){
                enough_factor = true;
                System.out.println(num);
            }
            runner +=1;
            num += runner;
        }
    }
}