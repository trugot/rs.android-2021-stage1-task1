package subtask1

class HappyArray {

    // TODO: Complete the following function
   fun convertToHappy(sadArray: IntArray): IntArray {
    var happyArray: IntArray = sadArray
    var finalized = false
    while (!finalized) {
        finalized = true
        for ((index, value) in happyArray.withIndex()) {
            if (index == 0 || index == happyArray.size - 1)
                continue
            if (value > (happyArray[index - 1] + happyArray[index + 1])){
                happyArray = remove(happyArray, index)
                finalized = false
                break
            }
        }
    }
    return happyArray
    }
    private fun remove(arr: IntArray, index: Int): IntArray {
        return if (index < 0 || index >= arr.size) {
            arr
        } else (arr.indices)
            .filter { i: Int -> i != index }
            .map { i: Int -> arr[i] }
            .toIntArray()
    }
}
