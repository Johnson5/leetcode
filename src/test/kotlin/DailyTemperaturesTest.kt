import medium.DailyTemperatures
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class DailyTemperaturesTest {

    @Test
    fun dailyTemperaturesTest() {
        val s = DailyTemperatures()
        val list1 = intArrayOf(73,74,75,71,69,72,76,73)
        assertTrue(intArrayOf(1,1,4,2,1,1,0,0).contentEquals(s.dailyTemperatures(list1)))

        val list2 = intArrayOf(30,40,50,60)
        assertTrue(intArrayOf(1,1,1,0).contentEquals(s.dailyTemperatures(list2)))

        val list3 = intArrayOf(30,60,90)
        assertTrue(intArrayOf(1,1,0).contentEquals(s.dailyTemperatures(list3)))
    }

    @Test
    fun dailyTemperaturesStackTest() {
        val s = DailyTemperatures()
        val list1 = intArrayOf(73,74,75,71,69,72,76,73)
        assertTrue(intArrayOf(1,1,4,2,1,1,0,0).contentEquals(s.dailyTemperaturesStack(list1)))

        val list2 = intArrayOf(30,40,50,60)
        assertTrue(intArrayOf(1,1,1,0).contentEquals(s.dailyTemperaturesStack(list2)))

        val list3 = intArrayOf(30,60,90)
        assertTrue(intArrayOf(1,1,0).contentEquals(s.dailyTemperaturesStack(list3)))
    }
}