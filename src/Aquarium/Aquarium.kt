package Aquarium

fun main(args: Array<String>) {
    val myAquarium:Aquarium = buildAquarium()
    println("Volume: ${myAquarium.volume}")
}

internal fun buildAquarium() = Aquarium()

class Aquarium (private val width:Int = 0, private var height : Int = 40, private var length : Int = 100){

    var volume: Int
        get() = (width * height * length/1000)
        set(value) {height = (value * 1000)/(width * length)}
}