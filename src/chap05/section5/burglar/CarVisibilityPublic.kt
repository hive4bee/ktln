package chap05.section5.burglar

open class Car protected constructor(_year:Int, _model:String, _power:String, _wheel:String) {
    private var year:Int=_year
    public var model:String=_model
    protected open var power:String=_power
    internal var wheel:String=_wheel

    protected fun start(key:Boolean){
        if(key) println("Start the Engine!")
    }

    class Driver(_name:String, _license:String){
        private var name:String=_name
        var license:String=_license
        internal fun driving()=println("[Driver] Driving() - $name")
    }
}

class Tico(_year:Int, _model:String, _power:String, _wheel:String,
var name:String, private var key:Boolean):Car(_year, _model, _power, _wheel){
    override var power: String="50hp"
    val driver=Driver(name, "first class")

    constructor(_name:String, _key:Boolean)
            :this(2014,"basic","100hp","normal",_name,_key){
        name=_name
        key=_key
    }
    fun access(password:String){
        if(password=="gotico"){
            println("----[Tico] access() ----")
            //super.year//private접근 불가
            println("super.model=${super.model}")//public
            println("super.power=${super.power}")//protected
            println("super.wheel=${super.wheel}")//internal
            super.start(key)//protected

            //dirver.name//private접근 불가
            println("Driver().license=${driver.license}")//public
            driver.driving()//internal
        }else{
            println("You're a burglar")
        }
    }
}

class Burglar(){
    fun steal(anycar:Any){
        if(anycar is Tico){//인자가 Tico의 객체일 때
            println("----[Burglar] steal()----")
            //println(anycar.power)//protestartcted접근 불가
            //println(anycar.year)//private접근 불가
            println("anycar.name=${anycar.name}")//public접근
            println("anycar.wheel=${anycar.wheel}")//internal접근(같은 모듈 안에 있음)
            println("anycar.model=${anycar.model}")//public접근

            println(anycar.driver.license)//public접근
            anycar.driver.driving()//internal접근(같은 모듈 안에 있음)
            //println(Car.start())//protected접근 불가
            anycar.access("dontknow")
        }else{
            println("Nothing to steal")
        }
    }
}

fun main(){
    //val car = Car()//protect 생성 불가
    val tico=Tico("kildong", true)
    tico.access("gotico")

    val burglar=Burglar()
    burglar.steal(tico)
}