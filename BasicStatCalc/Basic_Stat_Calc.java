
import java.util.Scanner;

public class StatCalc {

    private int count;   
    private double sum;  
    private double squareSum;
    private double max;
    private double min;  
   

    public void enter(double num) {
        count++;
        sum += num;
        squareSum += num*num;
        if(num > max){
            max = num;
        if(num > min){
            min = num;
        }

    }   
  
}                                   

   
    public int getCount() {
        return count;
    }

   
    public double getSum() {
        return sum;
    }

    
    public double getMean() {
        return sum / count;  
    }

    
    public double getStandardDeviation() {  
        double mean = getMean();
        return Math.sqrt( squareSum/count - mean*mean );
    }

    public double getMax(){
        return max;
    }
    public double getMin(){
        return min;
    }

    public static void main(String[] args){
        StatCalc Object = new StatCalc();
        Scanner scn = new Scanner(System.in);
        double numbers;

        do {
             System.out.print("? ");
             numbers = scn.nextDouble();
             if (numbers != 0)
                Object.enter(numbers);
          } while (numbers!= 0);
        
        System.out.println(Object.getSum());
        System.out.println(Object.getCount());
        System.out.println(Object.getMean());
        System.out.println(Object.getMax());
        System.out.println(Object.getMin());
        System.out.println(Object.getStandardDeviation());
    }

} 
