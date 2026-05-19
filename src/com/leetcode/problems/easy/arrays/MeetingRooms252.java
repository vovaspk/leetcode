package com.leetcode.problems.easy.arrays;

public class MeetingRooms252 {
    public static void main(String[] args) {
        System.out.println(canAttendMeetings(new int[][] {
                new int[] {0,30},
                new int[] {5,10},
                new int[] {15,20}
        }));

        System.out.println(canAttendMeetings(new int[][] {
                new int[] {7,10},
                new int[] {2,4}
        }));
    }

    public static boolean canAttendMeetings(int[][] intervals) {
        for (int i = 0; i < intervals.length - 1; i++) {
            int[] currentMeeting = intervals[i];
            int currentStart = currentMeeting[0];
            int currentEnd = currentMeeting[1];

            for (int j = i + 1; j < intervals.length - 1; j++) {
                int[] nextMeeting = intervals[j];
                int nextStart = nextMeeting[0];
                int nextEnd = nextMeeting[1];
                if((currentStart >= nextStart && currentStart <= nextEnd) || (nextStart > currentStart && nextStart < currentEnd)) {
                    return false;
                }
            }
        }
        return true;
    }
}
