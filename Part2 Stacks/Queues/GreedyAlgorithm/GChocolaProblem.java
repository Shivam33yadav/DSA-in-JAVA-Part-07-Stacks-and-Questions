import java.util.*;
public class GChocolaProblem {
    public static void main(String[] args) {
        int n = 4, m = 6; //m is columns
        Integer costVer[] ={2, 1, 3, 1, 4}; //n-1
        Integer costHor[] = {4, 1, 2}; //n-1

        Arrays.sort(costVer, Collections.reverseOrder());
        Arrays.sort(costHor, Collections.reverseOrder());

        int h =0, v =0;
        int hp = 1, vp = 1;
        int cost = 0;

        while (h< costHor.length && v < costVer.length) {
              // vertical cost < hor cost
              if(costVer[v] <= costHor[h]) {  // toh horiz cut legga
                       cost += (costHor[h] * vp);
                       hp++;  //horizontal pieces++
                       h++;
              }else{ // vertical cut
                cost += (costVer[v] * hp);
                vp++;
                v++;

              }
        }
        while(h < costHor.length) {
            cost += (costHor[h] * vp);
            hp++;
            h++;
        }
        while(v < costVer.length) {
              cost += (costVer[v] * hp);
              vp++;
              v++;

        }
        System.out.println("Min cost of cuts = " +cost);
    }
    
}
