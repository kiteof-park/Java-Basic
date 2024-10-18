package javajungsuk.ch06;


public class Ex6_27_BlockTest {
    
    static{
        System.out.println("static{} 초기화");
    }
    
    {
        System.out.println("{} 초기화");
    }
    
    public Ex6_27_BlockTest(){
        System.out.println("생성자 초기화");
    }

    
    public static void main(String[] args) {
        System.out.println("BlockTest bt = new BlockTest()");
        Ex6_27_BlockTest blockTest = new Ex6_27_BlockTest();
    }
}
