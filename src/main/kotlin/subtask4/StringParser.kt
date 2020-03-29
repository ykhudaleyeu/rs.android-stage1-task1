package subtask4

class StringParser {

    var arr = ArrayList<String>()
        val openSymbol = "<[("
        val closedSymbol = ">])"
        var inputLenght = inputString.length
        var count = 0
        inputString.indices.forEach { i ->
            var tmp = ""
            var value = inputString[i]
            if (openSymbol.indexOf(value) >= 0) {
                for (i in i + 1 until inputLenght) {
                    if (count == 0 && inputString[i] == closedSymbol[openSymbol.indexOf(value)]) break
                    if (inputString[i] == openSymbol[openSymbol.indexOf(value)]) ++count
                    if (inputString[i] == closedSymbol[openSymbol.indexOf(value)]) --count
                    tmp += inputString[i].toString()
                }
                arr.add(tmp)
            }
        }
        return arr.toTypedArray()
    }
}
