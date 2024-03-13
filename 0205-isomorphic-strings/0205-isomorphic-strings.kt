class Solution {
    fun isIsomorphic(s: String, t: String): Boolean {
        if(s.length != t.length) return false

        val mapStoT = HashMap<Char, Char>()
        val mapTtoS = HashMap<Char, Char>()

        for (i in s.indices) {
            val sChar = s[i]
            val tChar = t[i]

            if(mapStoT.containsKey(sChar) && mapStoT[sChar] != tChar) return false
            if(mapTtoS.containsKey(tChar) && mapTtoS[tChar] != sChar) return false

            mapStoT[sChar] = tChar
            mapTtoS[tChar] = sChar
        }
        return true
    }
}