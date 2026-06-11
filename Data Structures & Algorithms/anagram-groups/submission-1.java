class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> map = new HashMap<>();

        for (String s : strs) {

            // step 1: frequency array for 26 letters
            int[] freq = new int[26];

            // step 2: count characters
            for (char c : s.toCharArray()) {
                freq[c - 'a']++;
            }

            // step 3: build key from frequency array
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < 26; i++) {
                sb.append('#');
                sb.append(freq[i]);
            }

            String key = sb.toString();

            // step 4: put into hashmap
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }

            map.get(key).add(s);
        }

        return new ArrayList<>(map.values());
    }
}