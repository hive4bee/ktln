package chap10.section1;

import java.nio.charset.StandardCharsets;

public class ByteTest {
    public static void main(String[] args) {
        String str="안녕하세요";
        byte[] by = str.getBytes(StandardCharsets.UTF_8);
        System.out.println("str: "+str);
        System.out.println("byte: "+by);
    }
}
