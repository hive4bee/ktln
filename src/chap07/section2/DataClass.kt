package chap07.section2

data class Customer(var name:String, var email:String) {
    var job:String="Unknown"
    constructor(name:String, email:String, _job:String):this(name, email){
        job=_job
    }
    init{
        //간단한 로직은 여기
    }
}

fun main(){
    val cus1=Customer("Sean", "sean@mail.com")
    val cus2=Customer("Sean", "sean@mail.com")

    println("cus1==cus2 : ${cus1==cus2}")
    println("cus1.equals(cus2) : ${cus1.equals(cus2)}")
    println("${cus1.hashCode()}, ${cus2.hashCode()}")

    val (name, email)=cus1
    println("name=${name}, email=${email}")
    val (_,email2)=cus1//특정 프로퍼티를 가져올 필요가 없는 경우 언더스코어를 사용해서 제외시킴
    println("${email2}")

    val bob=Customer("Bob", "bob@gmail.com")
    val erica=Customer("Erica", "erica@mail.com")

    val customers=listOf(cus1, cus2, bob, erica)
    for((name, email) in customers){
        println("naem=${name}, email=${email}")
    }
    val (myName, myEmail)=myFunc(bob)
    println("myName=${myName} / myEmail=${myEmail}")

    //람다식으로 디스트럭쳐링된 변수 출력
    val myLambda={
        (nameLa, emailLa):Customer->
            println(nameLa)
            println(emailLa)

    }
    myLambda(cus1)
}

fun myFunc(cus:Customer):Customer{
    return cus
}