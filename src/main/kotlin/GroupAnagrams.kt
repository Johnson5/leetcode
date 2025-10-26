class GroupAnagrams {
    fun groupAnagrams(list: List<String>): MutableList<MutableList<String>> {
        val result = mutableListOf<MutableList<String>>()
        var items = list.toMutableList()
        while (items.isNotEmpty()) {
            val (head, tail) = items.first() to items.drop(1)
            val group = mutableListOf(head)
            val remain = mutableListOf<String>()
            tail.forEach { it ->
                if(it.length == head.length && areAnagrams(it, head)) {
                    group.add(it)
                } else {
                    remain.add(it)
                }
            }
            result.add(group)
            items = remain
        }
        return result
    }

    fun areAnagrams(str1: String, str2: String): Boolean {
        val map1 = str1.groupingBy { it }.eachCount()
        val map2 = str2.groupingBy { it }.eachCount()
        return map1 == map2
    }
}