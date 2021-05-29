package subtask2

class BillCounter {

    // TODO: Complete the following function
    // The output could be "Bon Appetit" or the string with number(e.g "10")
    fun calculateFairlySplit(bill: IntArray, k: Int, b: Int): String {
        val fairlySplit = "bon appetit"
        var tempArray: IntArray = deleteItemInArr(bill, k)
        var answer = tempArray.sum() /  2.0
        if (answer.toInt() == b)
            return fairlySplit
        return(b - answer.toInt()).toString()
    }

    private fun deleteItemInArr(array: IntArray, index: Int): IntArray {
        if (index < 0 || index >= array.size)
            return array

        var tempArray = IntArray(array.size - 1)
        for (i in 0 until index)
            tempArray[i] = array[i]
        for (i in index until array.size - 1)
            tempArray[i] = array[i + 1]
        return tempArray
    }
}
