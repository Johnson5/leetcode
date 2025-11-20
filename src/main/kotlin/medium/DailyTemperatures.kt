package medium

class DailyTemperatures {
    fun dailyTemperatures(temperatures: IntArray): IntArray {
        val answer = IntArray(temperatures.size)
        for(i in 0 until temperatures.size) {
            val temp = temperatures[i]
            var count = 1
            for(j in i + 1 until temperatures.size) {
                if(temperatures[j] > temp) {
                    answer[i] = count
                    break
                } else {
                    count++
                }
            }
        }
        return answer
    }

    fun dailyTemperaturesStack(temperatures: IntArray): IntArray {
        val stack = ArrayDeque<Int>()
        val answer = IntArray(temperatures.size)

        for ((i, temp) in temperatures.withIndex()) {
            while (stack.isNotEmpty() && temp > temperatures[stack.last()]) {
                val prevIndex = stack.removeLast()
                answer[prevIndex] = i - prevIndex
            }

            stack.addLast(i)
        }

        return answer
    }
}