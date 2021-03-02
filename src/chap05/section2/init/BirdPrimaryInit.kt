package chap05.section2.init

class Bird4(var name:String, var wing:Int, var beak:String, var color:String) {
    init{
        println("----초기화 블록 시작----")
        println("이름은 $name / qnflsms $beak")
        this.sing(3)
        println("----초기화 블록 끝----")
    }
    fun fly()=println("Fly wing: $wing")
    fun sing(vol:Int)=println("Sing vol: $vol")
}
fun main(){
//    val coco=Bird4("mybird", 2, "short", "blue")
//    coco.color="yellow"
//    println("coco.color: ${coco.color}")
//    coco.fly()
    val coco=Bird5(beak="long", color="red")
    println("coco.name: ${coco.name} / coco.wing: ${coco.wing}")
    println("coco.color: ${coco.color} / coco.beak: ${coco.beak}")
}

class Bird5(var name:String="NONAME", var wing:Int=2, var beak:String, var color:String){
    fun fly()=println("Fly wing: $wing")
    fun sing(vol:Int)=println("Sing vol: $vol")
}