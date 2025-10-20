import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*

class MergeStringsAlternatelyTest {
    @Test
    fun test1() {
        val string1 = "AAA"
        val string2 = "BBB"

        val solution = MergeStringsAlternately()
        val result = solution.mergeStringsAlternately(string1, string2)
        assertEquals(result, "ABABAB")
    }
}