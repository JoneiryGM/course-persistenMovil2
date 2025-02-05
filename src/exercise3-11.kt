fun canAddFish(tankSize: Double, currentFish: List<Int>, fishSize: Int = 5, hasDecorations: Boolean = true): Boolean {
    val effectiveTankSize = if (hasDecorations) tankSize * 0.8 else tankSize
    val currentFishLength = currentFish.sum()
    return currentFishLength + fishSize <= effectiveTankSize
}

fun main() {
    println(canAddFish(10.0, listOf(3, 3, 3))) // false
    println(canAddFish(8.0, listOf(2, 2, 2), hasDecorations = false)) // true
    println(canAddFish(9.0, listOf(1, 1, 3), 3)) // false
    println(canAddFish(10.0, listOf(), 7, true)) // true
}
