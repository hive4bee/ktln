package chap07.section1

abstract class Printer {
    abstract fun print()//추상 메서드
}

val myPrinter=object:Printer(){
    override fun print() {
        TODO("Not yet implemented")
    }

}
