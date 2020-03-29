package subtask5

class HighestPalindrome {

    var k = k
        val str = StringBuilder(digitString)
        var diffNum = 0
        var prevDigitLength = digitString.length - 1
        var checkLength = digitString.length / 2

        (0..checkLength).forEach {
            if (it < checkLength && digitString[it] != digitString[prevDigitLength - it]) {
                ++diffNum
            }
        }
        diffNum = k - diffNum
        if (diffNum >= 0) {
            (0..checkLength).forEach {
                if (digitString[it] != digitString[prevDigitLength - it]) {
                    when (diffNum > 0 && digitString[it] != '9' && digitString[prevDigitLength - it] != '9') {
                        true -> {
                            str.setCharAt(it, '9')
                            str.setCharAt(prevDigitLength - it, '9')
                        }
                        false -> {
                            str.setCharAt(it, maxOf(digitString[it], digitString[prevDigitLength - it]))
                            str.setCharAt(prevDigitLength - it, maxOf(digitString[it], digitString[prevDigitLength - it]))
                        }
                    }
                }
            }
        } else {
            return "-1"
        }
        return str.toString()
    }
}
