import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class LongestConsecutiveSequenceTest {
    @Test
    fun longestConsecutiveSequenceTest() {
        val solver = LongestConsecutiveSequence()

        val list1 = intArrayOf(100,4,200,1,3,2)
        assertEquals(4, solver.longestConsecutiveSequence(list1))

        val list2 = intArrayOf(0,3,7,2,5,8,4,6,0,1)
        assertEquals(9, solver.longestConsecutiveSequence(list2))

        val list3 = intArrayOf(1,0,1,2)
        assertEquals(3, solver.longestConsecutiveSequence(list3))
    }
}