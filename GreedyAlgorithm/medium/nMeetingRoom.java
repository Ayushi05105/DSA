package GreedyAlgorithm.medium;
import java.util.*;

class Meeting{
        int start;
        int end;
        public Meeting(int s,int e){
            this.start = s;
            this.end = e;
        }
    }

public class nMeetingRoom {

    
    public static int N_MeetingRoom(int[] start,int[] end,int n){
        List<Meeting> meeting = new ArrayList<>();
        for(int i =0;i<n;i++){
            meeting.add(new Meeting(start[i],end[i]));
        }
        meeting.sort(Comparator.comparing(m->m.end));
        int last = -1;
        int count =0;
        for(Meeting meet: meeting){
            if(meet.start > last){
                last = meet.end;
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] start ={1,3,0,5,8,5};
        int[] end ={2,4,5,7,9,9};
        int ans = N_MeetingRoom(start, end,start.length);
        System.out.println(ans);
    }
    
}
