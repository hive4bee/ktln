package chap10.section1

import java.io.FileOutputStream
import java.io.PrintWriter

/**
 * 보통 특정 객체가 사용된 후 닫아야 하는 경우가 생기는데 이때 use()함수를 사용하면
 * 객체를 사용한 후 close()함수를 자동적으로 호출해 닫아 줄 수 있다.
 */
fun main(){
    PrintWriter(FileOutputStream("/home/seongjin/imsi.txt")).use{
        it.println("hello")
    }
}