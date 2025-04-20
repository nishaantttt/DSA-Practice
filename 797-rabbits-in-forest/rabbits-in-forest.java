class Solution {
    public int numRabbits(int[] answers) {
        // Use HashMap to count frequency of each answer
        Map<Integer, Integer> count = new HashMap<>();
        for (int answer : answers) {
            count.put(answer, count.getOrDefault(answer, 0) + 1);
        }
        
        int totalRabbits = 0;
        // For each unique answer
        for (int key : count.keySet()) {
            // key = number of same-color rabbits reported
            // count.get(key) = number of rabbits giving this answer
            // group size = key + 1 (including the rabbit itself)
            // number of groups = ceil(count.get(key) / (key + 1))
            int groupSize = key + 1;
            int rabbits = count.get(key);
            int groups = (rabbits + groupSize - 1) / groupSize; // ceiling division
            totalRabbits += groups * groupSize;
        }
        
        return totalRabbits;
    }
}