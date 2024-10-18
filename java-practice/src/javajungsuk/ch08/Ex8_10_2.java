package javajungsuk.ch08;

import java.io.File;
import java.io.IOException;

public class Ex8_10_2 {
    public static void main(String[] args) {
        File f = createFile("");
        System.out.println(f.getName() + " 파일이 성공적으로 생성");
    }

    static File createFile(String fileName) {
        try{
            if(fileName == null || fileName.equals(""));
            throw new Exception("파일 이름이 유효하지 않음");
        } catch (Exception e){
            fileName = "임시파일.txt";
        }

        File f = new File(fileName);

        // createNewFile()로 인해 try-catch로 작성
        try{
            f.createNewFile();
        } catch (IOException e){
            e.printStackTrace();
        }

        return f;
    }
}
