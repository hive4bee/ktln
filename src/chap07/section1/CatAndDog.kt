package chap07.section1

open class Animal(val name:String)

class Dog(name:String, override var category: String):Animal(name), Pet{
    override var species:String="dob"
    override fun feeding() {
        println("Feed the dog a bone")
    }
}

class Master{
    fun playWithPet(pet:Pet){
        println("Enjoy with my ${pet.species}")
        pet.patting()
    }
}
fun main(){
    val master=Master()
    val dog=Dog("Toto", "Small")
    println("--${dog.name}")
    val cat=Cat("Coco","BigFat")
    master.playWithPet(dog)
    master.playWithPet(cat)
}