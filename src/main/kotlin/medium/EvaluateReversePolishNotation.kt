class EvaluateReversePolishNotation {
    fun evalRPN(tokens: Array<String>): Int {
        val stack = ArrayDeque<Int>()

        for (t in tokens) {
            when (val token = parseToken(t)) {

                is Token.Number -> stack += token.value

                Token.Plus -> stack.applyBinaryOp { a, b -> a + b }
                Token.Minus -> stack.applyBinaryOp { a, b -> a - b }
                Token.Times -> stack.applyBinaryOp { a, b -> a * b }
                Token.Divide -> stack.applyBinaryOp { a, b -> a / b }
            }
        }

        return stack.removeLast()
    }

    private fun ArrayDeque<Int>.applyBinaryOp(op: (Int, Int) -> Int) {
        val b = removeLast()
        val a = removeLast()
        addLast(op(a, b))
    }

    private fun parseToken(token: String): Token =
        when (token) {
            "+" -> Token.Plus
            "-" -> Token.Minus
            "*" -> Token.Times
            "/" -> Token.Divide
            else -> Token.Number(token.toInt())
        }

    sealed class Token {
        data class Number(val value: Int) : Token()
        object Plus : Token()
        object Minus : Token()
        object Times : Token()
        object Divide : Token()
    }

}
