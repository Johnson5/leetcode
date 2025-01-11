import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*

class GreatestCommonDivisorOfStringsTest {
    @Test
    fun test1() {
        val string1 = "ABABAB"
        val string2 = "ABAB"

        val solution = GreatestCommonDivisorOfStrings()
        val result = solution.gcdOfStrings(string1, string2)
        assertEquals(result, "AB")
    }
}