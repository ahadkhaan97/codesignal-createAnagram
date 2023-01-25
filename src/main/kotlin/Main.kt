fun main() {
    print(solution("AABAA", "BBAAA"))
}


//to retain git
fun solution(s: String, t: String): Int {
    val myMap1 = IntArray(26) { 0 }
    val myMap2 = IntArray(26) { 0 }

    for (i in s.indices) {
        myMap1[s[i] - 'A']++
        myMap2[t[i] - 'A']++
    }

    var count = 0

    for (i in 0 until 26) {
        if (myMap2[i] > myMap1[i])
            count += myMap2[i] - myMap1[i]
    }
    return count
}
