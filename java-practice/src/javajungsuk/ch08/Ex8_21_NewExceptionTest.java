package javajungsuk.ch08;

//public class Ex8_21_NewExceptionTest {
//    public static void main(String[] args) {
//        try{
//            startInstall();
//            copyFiles();
//        } catch (SpaceException se){
//            System.out.println("에러 메세지: " + se.getMessage());
//            se.printStackTrace();
//            System.out.println("공간 확보 후 다시 설치");
//        } catch (MemoryException me){
//            System.out.println("에러 메세지: " + me.getMessage());
//            me.printStackTrace();
//            System.gc();            // 💡Garbage Collection을 수행해 메모리 증량
//            System.out.println("다시 설치 시도");
//        } finally {
//            deleteTmpFiles();
//        }
//    }
//
//    static void startInstall() throws SpaceException, MemoryException{
//        if(!enoughSpace()){ throw new SpaceException("설치할 공간 부족"); }
//        if(!enoughMemory()){ throw new MemoryException("설치할 메모리 부족"); }
//    }
//
//    static void copyFiles(){ System.out.println("파일 복사"); }
//    static void deleteTmpFiles(){ System.out.println("임시파일 삭제"); }
//    static boolean enoughSpace(){ return false; }
//    static boolean enoughMemory(){ return true; }
//}
//
//// 사용자 정의 예외 - Exception 상속
//class SpaceException extends Exception{
//    SpaceException(String msg){ super(msg); } // 예외 메시지를 매개변수로 받는 생성자 추가
//}
//
//// 사용자 정의 예외 - Exception 상속
//class MemoryException extends Exception{
//    MemoryException(String msg){ super(msg);}
//}
