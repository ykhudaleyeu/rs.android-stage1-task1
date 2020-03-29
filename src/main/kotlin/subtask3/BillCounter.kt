package subtask3

class BillCounter {

    fun calculateFairlySplit(bill: IntArray, k: Int, b: Int): String {
        var array = bill.toCollection(ArrayList())
        var sum = 0
        var rest = ""
        for ((index, value) in array.withIndex()) {
            sum += value
        }
        var billSum = b * 2
        if (billSum == sum) {
            return (array[k] / 2).toString()
        } else if (billSum != sum && billSum > sum) {
            var extraBill = (sum / 2) - b
            rest = (array[k] / 2 + extraBill.absoluteValue).toString()
        } else {
            rest = "bon appetit"
        }
        return rest
    }
}
