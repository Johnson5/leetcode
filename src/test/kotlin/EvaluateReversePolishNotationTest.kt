import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class EvaluateReversePolishNotationTest {
    @Test
    fun evaluateReversePolishNotationTest() {
        val s = EvaluateReversePolishNotation()
        assertEquals(9, s.evalRPN(arrayOf("2", "1", "+", "3", "*")))
        assertEquals(6, s.evalRPN(arrayOf("4", "13", "5", "/", "+")))
        assertEquals(22, s.evalRPN(arrayOf("10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+")))
    }
}