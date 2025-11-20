import java.util.Stack

class MinStack {
    private val stack = ArrayDeque<Int>()
    private val minStack = ArrayDeque<Int>()

    fun push(`val`: Int) {
        stack.add(`val`)
        if (minStack.isEmpty() || `val` <= minStack.last()) {
            minStack.add(`val`)
        }
    }

    fun pop() {
        val popVal = stack.removeLast()
        if (popVal == minStack.last()) {
            minStack.removeLast()
        }
    }

    fun top(): Int = stack.last()

    fun getMin(): Int = minStack.last()
}