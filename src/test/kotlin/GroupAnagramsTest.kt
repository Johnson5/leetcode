import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class GroupAnagramsTest {
    @Test
    fun groupAnagramsTest() {
        val solver = GroupAnagrams()

        val list = listOf("eat", "tea", "tan", "ate", "nat", "bat")
        val actual = solver.groupAnagrams(list)

        val expected = mutableListOf(mutableListOf("eat", "tea", "ate"), mutableListOf("tan", "nat"), mutableListOf("bat"))

        assertEquals(expected, actual)
    }
}