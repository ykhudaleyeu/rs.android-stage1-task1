package subtask2

class MiniMaxSum {

    var array = input.toCollection(ArrayList())
        var arrayLast = ArrayList<Int>()
        var sumMin = 0
        var sumMax = 0
        for ((index, value) in array.withIndex()) {
            if (value < array.max()!!) {
                sumMin += value
            }
        }
        arrayLast.add(sumMin)
        for ((index, value) in array.withIndex()) {
            if (value > array.min()!!) {
                sumMax += value
            }
        }
        arrayLast.add(sumMax)
        return arrayLast.toIntArray()
    }
}
