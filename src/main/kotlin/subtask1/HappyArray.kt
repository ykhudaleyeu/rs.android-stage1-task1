package subtask1

class HappyArray {

        var array = sadArray.toCollection(ArrayList())
        var arrayLast = ArrayList<Int>()
        var result = true

        while (result) {
            result = false
            for ((index, value) in array.withIndex()) {
                if (index == 0 || index == array.lastIndex) {
                    arrayLast.add(value)
                }
                if (index !== 0 && index < array.lastIndex) {
                    var prevVal = array.get(index - 1)
                    var nextVal = array.get(index + 1)
                    if (value < prevVal + nextVal) {
                        arrayLast.add(value)
                    } else if (value > prevVal + nextVal) {
                        result = true
                    }
                }
            }
            if (result) {
                array = arrayLast
                arrayLast = ArrayList()
            }
        }
        return arrayLast.toIntArray()
    }
}
