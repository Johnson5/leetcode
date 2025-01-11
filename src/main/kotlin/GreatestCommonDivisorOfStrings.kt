class GreatestCommonDivisorOfStrings {
    fun gcdOfStrings (str1: String, str2: String): String {
        var base = if (str1.length < str2.length) str1 else str2

        while(base.length >= 1) {
            if(isDivisor(base, str1) && isDivisor(base, str2)) {
                return base
            } else {
                base = base.dropLast(1)
            }
        }
        return ""
    }

    fun isDivisor(base: String, string: String): Boolean {
        val baseLength = base.length
        val stringLength = string.length
        if(stringLength % baseLength == 0) {
            val copies = stringLength / baseLength
            if(base.repeat(copies) == string) {
                return true
            }
        }
        return false
    }
}