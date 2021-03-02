package chap05.section2.primary

/*
class Bird3 Constructor(_name:String, _wing:Int, _beak:String, _color:String){
    //Constructor키워드 생략 가능
    var name:String=_name
    var wing:Int=_wing
    var beak:String=_beak
    var color:String=_color
}
 */

class Bird3(var name:String, var wing:Int, var beak:String, var color:String) {
    //프로퍼티는 매개변수 안에 var를 사용해 프로퍼티로서 선언되어서 생략됨

    fun fly()=println("Fly wing: $wing")
    fun sing(vol:Int)=println("Sing vol: $vol")
}

fun main(){
    val coco=Bird3("mybird", 2, "short", "blue")
    coco.color="yellow"
    println("coco.color: ${coco.color}")
    coco.fly()
    coco.sing(3)
}