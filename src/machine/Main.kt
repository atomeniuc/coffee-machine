package machine

fun main() {
    // Amount of ingredients per cup
    val water = 200
    val milk = 50
    val beans = 15

    println("Write how many ml of water the coffee machine has:")
    val waterSupply = readln().toInt()
    println("Write how many ml of milk the coffee machine has:")
    val milkSupply = readln().toInt()
    println("Write how many grams of coffee beans the coffee machine has:")
    val beanSupply = readln().toInt()
    println("Write how many cups of coffee you will need:")
    val numCups = readln().toInt()

    // Amount of cups that can be made
    val madeWater: Int = waterSupply / water
    val madeMilk: Int = milkSupply / milk
    val madeBeans: Int = beanSupply / beans

    // Minimum
    val erg = minOf(madeWater, madeMilk, madeBeans)

    // Output
    if (erg == numCups) {
        println("Yes, I can make that amount of coffee")
    } else if (erg > numCups) {
        println("Yes, I can make that amount of coffee (and even ${erg - numCups} more than that)")
    } else {
        println("No, I can make only $erg cup(s) of coffee")
    }

}
