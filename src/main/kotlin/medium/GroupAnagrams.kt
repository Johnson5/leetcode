class GroupAnagrams {
    fun groupAnagrams(list: List<String>): List<MutableList<String>> {
        val map = HashMap<List<Int>, MutableList<String>>()

        for(string in list) {
            val counts = MutableList(26) { 0 }
            for (char in string) {
                counts[char - 'a']++
            }
            map.getOrPut(counts) { mutableListOf() }.add(string)
        }

        return map.values.toList()
    }
}