import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<String> readBinaryWatch(int turnedOn) {
        List<String> result = new ArrayList<>();
        
        for (int h = 0; h < 12; h++) {       // Hours: 0-11 (4-bit representation)
            for (int m = 0; m < 60; m++) {   // Minutes: 0-59 (6-bit representation)
                if (Integer.bitCount(h) + Integer.bitCount(m) == turnedOn) {
                    result.add(h + ":" + (m < 10 ? "0" : "") + m);
                }
            }
        }
        
        return result;
    }
}
