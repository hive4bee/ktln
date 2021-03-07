package chap07.section2

interface Switcher{
    fun on():String
}

class SmartPhone(val model:String) {
    private val cpu="Exynos"

    inner class ExternalStorage(val size:Int){
        fun getInfo()="${model}: Installed on $cpu with ${size}Gb"//바깥 클래스의 프로퍼티 접근
    }

    fun powerOn():String{
        class Led(val color:String){//지역 클래스 선언
            fun blink():String="Blinking $color on $model"//외부의 프로퍼티는 접근 가능
        }
        val powerStatus=Led("Red")
        val powerSwitch=object:Switcher{
            override fun on(): String {
                return powerStatus.blink()
            }
        }
        return powerStatus.blink()
    }
}
fun main(){
    val mySdcard=SmartPhone("S7").ExternalStorage(32)
    println(mySdcard.getInfo())
    val myPhone=SmartPhone("Note9")
    println(myPhone.powerOn())
}
/**
 * 이너 클래스인 ExternalStorage는 SmartPhone클래스의 프로퍼티 model과 cpu에 접근하고 있다.
 * 특히 cpu는 private멤버이지만 접근이 가능한 것을 알 수 있다.
 */
