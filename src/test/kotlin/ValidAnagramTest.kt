import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*
class ValidAnagramTest {
    @Test
    fun test1() {
        val s = ValidAnagram()
        assert(s.validAnagram("anagram", "nagaram"))
        assert(!s.validAnagram("car", "rat"))
    }
}