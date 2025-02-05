package Aquarium

class Fish(val friendly: Boolean = true, val volumeNeeded: Int){
    var size: Int = 0

    init {
        println("Initializing Fish...")
    }
    constructor(): this(false, 9){
        println("Initializing second...")
    }
    init {
        if (!friendly) {
            size = volumeNeeded
        }else{
            size = volumeNeeded * 2
        }
    }
    init {
        println("Constructed Fish or size")
    }
}


fun fishExample(){
    val fish  = Fish(true,20)
    println("Is the fish friendly? ${fish.friendly}. it needs volume ${fish.size}")
}