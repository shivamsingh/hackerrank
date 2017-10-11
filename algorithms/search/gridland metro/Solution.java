import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    class Track {
        int start, end;

        public Track(int start, int end) {
            this.start = start;
            this.end = end;
        }

        public int getStart() {
            return start;
        }

        public void setStart(int start) {
            this.start = start;
        }

        public int getEnd() {
            return end;
        }

        public void setEnd(int end) {
            this.end = end;
        }

        public boolean contains(int cell) {
            return cell >= this.start && cell <= end;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long n, m, k;
        n = scan.nextInt();
        m = scan.nextInt();
        k = scan.nextInt();

        Map<Integer, List<Track>> trackMap = new HashMap<>();
        for (int i = 0; i < k; i++) {
            int trackRow = scan.nextInt();
            List<Track> tracks;
            if (trackMap.containsKey(trackRow)) {
                tracks = trackMap.get(trackRow);
                int start = scan.nextInt();
                int end = scan.nextInt();
                boolean isNewTrack = true;
                for (Track track : tracks) {
                    if (track.contains(start)) {
                        track.setEnd(Math.max(end, track.getEnd()));
                        isNewTrack = false;
                        break;
                    }
                }
                if (isNewTrack)
                    tracks.add(new Solution().new Track(start, end));
            } else {
                tracks = new ArrayList<>();
                tracks.add(new Solution().new Track(scan.nextInt(), scan.nextInt()));
            }
            trackMap.put(trackRow, tracks);
        }

        long occupiedCells = 0;
        for (Integer trackRow : trackMap.keySet()) {
            List<Track> tracks = trackMap.get(trackRow);
            for (Track track : tracks)
                occupiedCells += track.getEnd() - track.getStart() + 1;
        }
        System.out.print(n * m - occupiedCells);
    }
}