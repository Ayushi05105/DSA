
import java.util.*;
public class nMeetingRoom {

    public static List<Integer> meetingRoom(int[] start,int[] end){
        List<int[]> meeting = new ArrayList<>();
        for(int i =0;i<start.length;i++){
            meeting.add(new int[]{end[i],start[i],i+1});
        }
        meeting.sort(Comparator.comparingInt(a->a[0]));
        List<Integer> res = new ArrayList<>();
        int last =-1;
        for(int[] m : meeting){
            if(m[1]>last){
                res.add(m[2]);
                last = m[2];
            }
        }
        return res;

    }
    public static void main(String[] args) {
        int[] start = {1, 3, 0, 5, 8, 5};
        int[] end   = {2, 4, 6, 7, 9, 9};
        System.out.println(meetingRoom(start, end));
    }
    
}
