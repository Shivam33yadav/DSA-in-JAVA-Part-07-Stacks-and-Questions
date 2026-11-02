
import java.util.*;   // important-
public class AActivitySelection {  // t.c nlogn
    public static void main(String[] args) {
        int start[] = {1, 3, 0, 5, 8, 5};
        int end[] = {2, 4, 6, 7, 9, 9}; // it is already sorted but if it  is not sorted
        //sorting
        int activities[][] = new int[start.length][3];
        for(int i =0; i<start.length;i++) {
            activities[i][0] = i;   // i[0] pr i store
            activities[i][1] = start[i];
            activities[i][2] =  end[i];      
         }
              //lambda function ... it is a short form of big function(comparator)  comparator is an interfacwe to sort an objects how sorting occurs
         Arrays.sort(activities, Comparator.comparingDouble(o -> o[2]));
        
        //end time basis sorted
        int maxAct = 0; // max Activity
        ArrayList<Integer> ans = new ArrayList<>();
        
        //1st activity  isko to perform krna hi h kyuki sbse jldi ye khtam 
        maxAct = 1;
        ans.add(activities[0][0]);
        int lastEnd = activities[0][2];

        for(int i = 1; i<end.length; i++) {
             if(activities[i][1] >= lastEnd) {
                //activity  select aur ans m add i
                maxAct++;
                ans.add(activities[i][0]);
                lastEnd = activities[i][2];
             }
        }
        System.out.println("max activities = " +maxAct);
        for(int i =0; i<ans.size(); i++) {
            System.out.println("A"+ans.get(i));
        }

    }
    
}
