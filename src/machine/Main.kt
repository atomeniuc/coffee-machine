package machine

fun main() {
    val water = 200
    val milk = 50
    val beans = 15

    println("Write how many cups of coffee you will need:")
    val cups = readln().toInt()

    println("For $cups cups of coffee you will need:")
    println("${water * cups} ml of water")
    println("${milk * cups} ml of milk")
    println("${beans * cups} g of coffee beans")
}
