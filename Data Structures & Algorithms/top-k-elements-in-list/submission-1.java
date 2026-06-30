class Solution {
    public int[] topKFrequent(int[] nums, int k) {

       Map<Integer,Integer> hs= new HashMap<>(); for(int i=0;i<nums.length;i++){ if(hs.containsKey(nums[i])){ hs.put(nums[i],hs.getOrDefault(nums[i],0)+1); } else{ hs.put(nums[i],1); }}

        PriorityQueue<Integer> pq =
                new PriorityQueue<>((a, b) -> hs.get(a) - hs.get(b));

        for (int key : hs.keySet()) {
            pq.offer(key);

            if (pq.size() > k) {
                pq.poll();
            }
        }

        int[] ans = new int[k];

        for (int i = k - 1; i >= 0; i--) {
            ans[i] = pq.poll();
        }

        return ans;
    }
}