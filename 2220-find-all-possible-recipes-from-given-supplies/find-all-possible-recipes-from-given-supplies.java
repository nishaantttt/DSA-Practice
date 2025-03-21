import java.util.*;

class Solution {
    public List<String> findAllRecipes(String[] recipes, List<List<String>> ingredients, String[] supplies) {
        Map<String, Integer> indegree = new HashMap<>();
        Map<String, List<String>> graph = new HashMap<>();
        Set<String> available = new HashSet<>(Arrays.asList(supplies));
        Queue<String> queue = new LinkedList<>();
        List<String> result = new ArrayList<>();

        for (int i = 0; i < recipes.length; i++) {
            indegree.put(recipes[i], ingredients.get(i).size());
            for (String ing : ingredients.get(i)) {
                graph.computeIfAbsent(ing, k -> new ArrayList<>()).add(recipes[i]);
            }
        }

        for (String supply : supplies) queue.offer(supply);

        while (!queue.isEmpty()) {
            String item = queue.poll();
            if (indegree.containsKey(item)) result.add(item);
            if (!graph.containsKey(item)) continue;
            for (String next : graph.get(item)) {
                indegree.put(next, indegree.get(next) - 1);
                if (indegree.get(next) == 0) queue.offer(next);
            }
        }

        return result;
    }
}
