package Day5.Assignment;

import java.util.*;

public class BoatToSavePeople {
    public static void main(String[] args) {
        int people[] = {3, 2, 2, 1}, limit = 3;
        System.out.println(numRescueBoats(people, limit));
    }

    public static int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int n = people.length;
        int i = 0;
        int j = n - 1;
        int cnt = 0;
        while (i <= j) {
            if (people[j] == limit) {
                cnt++;
                j--;
            } else if (people[j] + people[i] > limit) {
                cnt++;
                j--;
            } else {
                cnt++;
                j--;
                i++;
            }
        }
        return cnt;
    }
}
