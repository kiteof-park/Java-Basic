package javajungsuk.ch08;

import java.io.File;

public class Ex8_10_1 {
    public static void main(String[] args) {
        // main()은 예외 발생 가능성이 있는 메서드를 사용
        // 따라서 예외를 처리할 수 있는 코드를 try-catch로 작성
        try{
            // File f = createFile("createFileTest.txt");
            // File f = createFile("");
            File f = createFile(args[0]);
            System.out.println(f.getName() + " 파일이 성공적으로 생성");
        } catch (Exception e){
            System.out.println(e.getMessage() +" 다시 입력");
        }
    }
    // throws - 이 메서드 내부에서 예외 발생하면 호출한 곳으로 던질거임
    static File createFile(String fileName) throws Exception {
        // if조건식이 false일 경우, 메서드를 호출한 곳으로 예외객체를 생성해서 던짐
        if(fileName == null || fileName.equals(""))
            throw new Exception("파일 이름이 유효하지 않음");      // throw - 예외 생성
        File f = new File(fileName);
        f.createNewFile();
        return f;
    }
}
