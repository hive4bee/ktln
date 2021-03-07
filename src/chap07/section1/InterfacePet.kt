package chap07.section1

interface Pet {
    var category:String
    val msgTags:String
        get()="I'm your lovely pet!"

    var species:String
    fun feeding()
    fun patting(){
        println("Keep patting! ${species}")
    }
}
class Cat(name:String, override var category: String):Pet, Animal(name){
    override var species:String="Cat"
    override fun feeding() {
        println("Feed the cat a tuna can")
    }
}
