class ValidAnagram() {
    fun validAnagram(s: String, t: String): Boolean {
        val mapS = s.groupingBy { it }.eachCount()
        val mapT = t.groupingBy { it }.eachCount()

        return mapS == mapT
    }
}