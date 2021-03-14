package chap08.section2

import java.util.Arrays

fun main(){
    val arr = intArrayOf(1,2,3,4,5)
    println("arr: ${Arrays.toString(arr)}")
    println("size: ${arr.size}")
    println("sum(): ${arr.sum()}")
    println(arr.get(2))
    println(arr[2])

    arr.set(2,7)
    arr[0]=8
    println("size: ${arr.size} / arr[0]: ${arr[0]} / arr[2]: ${arr[2]}")
    println()
    //표현식을 통해 배열 생성하기
    val arr3=Array(5, {i->i*2})
    println("arr3: ${Arrays.toString(arr3)}")//toString()을 사용하면 한꺼번에 출력가능
    var a = arrayOfNulls<Int>(100)//100개의 null로 채워진 정수 배열
    var b = Array(100, {0})//0으로 채워진 배열
    println("a: ${a.toString()} / b: ${b.toString()}")
    var c = Array(100, {i->myClass(i)})
    println("c: ${c.toString()}")
    println()
    println(arr3.first())
    println(arr3.last())
    println(arr3.indexOf(2))
    println(arr3.average())
    println(arr3.count())
    println(arr3.contains(4))
    println(4 in arr3)
}
class myClass(val i:Int)