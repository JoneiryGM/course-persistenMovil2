fun main() {
    // List of spices
    val spices = listOf("curry", "pepper", "cayenne", "ginger", "red curry", "green curry", "red pepper")

    // Filter to get all curries and sort them by string length
    val curries = spices.filter { it.contains("curry") }.sortedBy { it.length }
    println("Curries sorted by length: $curries")

    // Filter the list to get all spices that start with "c" and end with "e" (First way)
    val spicesWithCE1 = spices.filter { it.startsWith("c") && it.endsWith("e") }
    println("Spices that start with 'c' and end with 'e' (Way 1): $spicesWithCE1")

    // Filter the list to get all spices that start with "c" and end with "e" (Second way)
    val spicesWithCE2 = spices.filter { it.matches(Regex("^c.*e$")) }
    println("Spices that start with 'c' and end with 'e' (Way 2): $spicesWithCE2")

    // Take the first three elements of the list and return those that start with 'c'
    val firstThreeWithC = spices.take(3).filter { it.startsWith("c") }
    println("First three elements that start with 'c': $firstThreeWithC")
}
