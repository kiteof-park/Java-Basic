package javajungsuk.ch08;

public class Ex8_23_ChainedExceptionEx {
    public static void main(String[] args) {
        try{
            install();
        } catch (InstallException ie){
            System.out.println(ie.getMessage());
            ie.printStackTrace();
        } catch (Exception e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
    static void install() throws InstallException{
        try{
            startInstall();
            copyFiles();
            // 💡 SpaceException이 발생하면 InstallException에 포함
        } catch (SpaceException se){
            InstallException ie = new InstallException("설치 중 SpaceException 발생");
            ie.initCause(se);
            throw ie;
            // 💡 MemoryException이 발생하면 InstallException에 포함
        } catch(MemoryException me){
            InstallException ie = new InstallException("설치 중 SpaceException 발생");
            ie.initCause(me);
            throw ie;
        } finally {
            deleteTmpFiles();
        }
    }

    static void startInstall() throws SpaceException, MemoryException{
        if(!enoughMemory()){
            throw new MemoryException("메모리 부족");
            // throw new RuntimeException(new MemoryException("메모리 부족"));
        }
        if(!enoughSpace()){
            throw new SpaceException("설치 공간 부족");
        }

    }
    static void copyFiles(){ System.out.println("파일 복사"); }
    static void deleteTmpFiles(){ System.out.println("임시 파일 삭제"); }
    static boolean enoughSpace(){ return false; }
    static boolean enoughMemory(){ return true; }
}

class InstallException extends Exception{
    InstallException(String msg){super(msg);}
}

class SpaceException extends Exception{
    SpaceException(String msg){super(msg);}
}

class MemoryException extends Exception{
    MemoryException(String msg){super(msg);}
}
