import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*
class ProductOfArrayExceptSelfTest {
    @Test
    fun test1() {
        val s = ProductOfArrayExceptSelf()
        assertEquals(s.productOfArrayExceptSelf(nums = intArrayOf(1,2,3,4)).toList(), intArrayOf(24, 12, 8, 6).toList())
        assertEquals(s.productOfArrayExceptSelf(nums = intArrayOf(-1, 1, 0, -3, 3)).toList(), intArrayOf(0, 0, 9, 0, 0).toList())
    }
}