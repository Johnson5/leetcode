class ProductOfArrayExceptSelf {
    fun productOfArrayExceptSelf(nums: IntArray): IntArray {
        val leftArray = IntArray(nums.size) { 1 }
        val rightArray = IntArray(nums.size) { 1 }

        var product = 1
        for (i in 1 until nums.size) {
            product *= nums[i-1]
            leftArray[i] = product
        }

        product = 1
        for (i in nums.size - 2 downTo 0) {
            product *= nums[i+1]
            rightArray[i] = product
        }

        return leftArray.zip(rightArray) { l, r -> l * r}.toIntArray()
    }
}