package chap07.coffeeMaker

class CoffeeMaker(val coffeeModule:CoffeeModule) {
    fun brew(){
        val theSiphon:Thermosiphon=coffeeModule.getThermosiphon()
        theSiphon.on()
        theSiphon.pump()
        println("Coffee, herer! Enjoy!")
        theSiphon.off()
    }
}
fun main(){
    val coffeeMaker=CoffeeMaker(MyDripCoffeeModule())
    coffeeMaker.brew()
}