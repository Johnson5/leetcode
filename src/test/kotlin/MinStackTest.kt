import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class MinStackTest {
    @Test
    fun minStackTest1() {
        val s = MinStack()
        s.push(-2)
        s.push(0)
        s.push(-3)
        assertEquals(-3, s.getMin())
        s.pop()
        assertEquals(0, s.top())
        assertEquals(-2,s.getMin())
    }

    @Test
    fun minStackTest2() {
        val s = MinStack()
        s.push(-1)
        assertEquals(-1, s.top())
        assertEquals(-1, s.getMin())
    }
}