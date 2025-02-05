import java.util.*

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main(args: Array<String>) {
    println("Hello, ${args[0]}")
    feedTheFish()
    eagerExample()

}

fun swim(){}
fun eagerExample() {
    val decorations = listOf("rock", "pagoda", "plastic plant", "pear")
    val eager = decorations.filter { it[0] == 'p'}
    println(eager)

    //apply filter lazily
    val filtered = decorations.filter { it[0] == 'p' }
    println(filtered.toList())

    //apply map lazily
    val lazyMap = decorations.asSequence().map { println("map: $it")}
    println(lazyMap)
    println(lazyMap.first())
}
fun getDirtySensorReading() = 20
fun shouldChangeWater(day: String, temperature: Int=22, dirty: Int=getDirtySensorReading()): Boolean {
    val isTooHot = temperature >30
    val isDirty = dirty>30
    val isSunday = day == "Sunday"
    return when{
        isTooHot -> true
        isDirty -> true
        isSunday -> true

        else -> false
    }
}



fun feedTheFish(){
    val day = randomDay();
    val food = fistFood(day)
    println("Today is $day and the fish eat $food")
    shouldChangeWater(day,20,50)
    shouldChangeWater(day)
    shouldChangeWater(day, dirty = 50)

    if (shouldChangeWater(day)) {
        println("Change the water today")
    }
}

fun randomDay() : String {
    val week = listOf("Monday", "Tuesday", "Wednesday", "Thursday","Friday", "Saturday", "Sunday");
    return week[Random().nextInt(7)]
}

fun fistFood(day: String) : String {
     return when (day) {
        "Monday" ->"flakes";
        "Tuesday" -> "pellets";
        "Wednesday" -> "pan";
        "Thursday" -> "cheetos";
        "Friday" -> "granules";
        "Saturday" -> "plankton";
        "Sunday" ->"lettuce";
         else -> "fasting";
    }
}

fun makeNewAquarium() = println("Building a new aquarium")
fun aquariumStatusReport(aquarium: Any = makeNewAquarium()){

}
fun dayOfWeek() {
    println("What day is it today?")
    val day = Calendar.getInstance().get(Calendar.DAY_OF_WEEK)
    println( when (day) {
        1 -> "Sunday"
        2 -> "Monday"
        3 -> "Tuesday"
        4 -> "Wednesday"
        5 -> "Thursday"
        6 -> "Friday"
        7 -> "Saturday"
        else -> "Time has stopped"
    })
}