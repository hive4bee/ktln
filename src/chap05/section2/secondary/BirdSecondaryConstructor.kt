package chap05.section2.secondary

class Bird2 {
    var name:String
    var wing:Int
    var beak:String
    var color: String

    constructor(name:String, wing:Int, beak:String, _color:String){
        this.name=name
        this.wing=wing
        this.beak=beak
        color=_color//_를 매개변수에 사용하고 프로퍼티에 this를 생략할 수 있음
    }

    constructor(_name:String, _beak:String){
        name=_name
        wing=2
        beak=_beak
        color="grey"
    }

    fun fly() = println("Fly wing: $wing")
    fun sing(vol:Int)=println("Sing vol: $vol")
}

fun main(){
    val coco=Bird2("mybird", 2, "short", "blue")

    coco.color="yellow"
    println("coco.color: ${coco.color}")
    coco.fly()
    coco.sing(3)

    val bird1=Bird2("mybird", 2, "short", "blue")
    val bird2=Bird2("mybird2", "long")

}