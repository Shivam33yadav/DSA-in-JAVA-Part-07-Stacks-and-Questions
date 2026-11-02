
import java.util.*;
public class BFrAactionalKnapsack {
    public static void main(String[] args) {
        int val[] = {60, 100, 120};
        int weight[] = {10, 20, 30};
        int w = 50;

        // ek 2d array bnate h to sort the order
        double ratio[][] = new double[val.length][2];
        //0th col => idx; 1sr col=> ratio

        for(int i =0; i<val.length;i++) {
            ratio[i][0] = i;
            ratio[i][1] = val[i]/(double)weight[i];
        }
        //ascending order sorting  /pr chiye to descending m to suke liye ek ulta loop chla denge
       Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));
        
       int capacity = w;
       int finalVal = 0;
       for(int i = ratio.length-1; i>=0; i--){
             int idx = (int)ratio[i][0];
             if(capacity >= weight[idx]) {
                   finalVal += val[idx];
                   capacity -= weight[idx];
             }else{
                // include fractional item
                finalVal += (ratio[i][1] * capacity);
                capacity = 0;
                break;
             }
       }
       System.out.println("final value = " + finalVal);
    }
    
}
