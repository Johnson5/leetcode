class LongestConsecutiveSequence {
    fun longestConsecutiveSequence(nums: IntArray): Int {
        val set = nums.toHashSet()

        val startingNums = set.filter { it - 1 !in set}
        var longest = 0;
        for (num in startingNums) {
            var curr = num
            var count = 1
            while(++curr in set) {
                count++
            }
            longest = maxOf(count, longest)
        }
        return longest
    }
}