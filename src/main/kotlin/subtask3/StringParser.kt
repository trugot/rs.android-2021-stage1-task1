package subtask3

class StringParser {

    // TODO: Complete the following function
    fun getResult(inputString: String): Array<String> {
        val leftIndexes = charArrayOf('<', '(', '[')
        val rightIndexes = charArrayOf('>', ')', ']')
        var result = ArrayList<String>()

        for (i in inputString.indices) {
            if (inputString[i] in leftIndexes) {
                var count = 0
                var ind = leftIndexes.indexOf(inputString[i])
                var positionIndexes: Pair<Int?, Int?> = Pair(null, null)
                for (j in i + 1 until inputString.length) {
                    if (inputString[j] == rightIndexes[ind] && count == 0) {
                        positionIndexes = Pair(i + 1, j)
                        break
                    }
                    if (inputString[j] == leftIndexes[ind])
                        count++

                    if (inputString[j] == rightIndexes[ind])
                        count--
                }
                result.add(inputString.substring(positionIndexes.first!!, positionIndexes.second!!))
            }
        }
        return result.toTypedArray()
    }
}
