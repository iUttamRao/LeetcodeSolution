class Solution {
	public int findKthLargest(int[] nums, int k) {

		PriorityQueue<Integer> pq=new PriorityQueue<Integer>();
		int ans=Integer.MIN_VALUE;
		for(int i=0;i<nums.length;i++)
		{
			pq.add(nums[i]);
		}

		 for(int i=0;i<nums.length-k;i++) {
			pq.poll();
		}
        // System.out.println(pq);
        // pq.poll();
        // System.out.println(pq.peek());

		return pq.peek();
	}


}