package javajungsuk.ch08;


public class Ex8_20_TryWithResourceEx {
    public static void main(String[] args) {
        // try()에 객체 생성 -> try{}를 벗어나면 객체의 close() 자동 호출
        try(CloseableResource cr = new CloseableResource()){
            cr.exceptionWork(false);        // WorkException예외 발생❌
        }  // close() 호출 -> CloseException예외 발생⚠️
        catch(WorkException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        catch(CloseException e){            // CloseException 예외 처리✅
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

        try(CloseableResource cr = new CloseableResource()){
            cr.exceptionWork(true);         // WorkException예외 발생⭕
        } // close() 호출 -> CloseException예외 발생⚠️
        catch(WorkException e){            // WorkException 예외 처리✅
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        catch (CloseException e){           // Suppressed 예외로 기록✏️
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}

// AutoCloseable을 구현한 클래스 -> close() 자동 호출
class CloseableResource implements AutoCloseable{
    public void exceptionWork(boolean exception) throws WorkException{
        System.out.println("exceptionWork (" + exception + ")가 호출됨");

        if (exception){
            throw new WorkException("WorkException 발생");
        }
    }
    
    public void close() throws CloseException{
        System.out.println("close()가 호출됨");
        throw new CloseException("CloseException 발생");
    }
}

// 사용자 정의 예외 WorkException
class WorkException extends Exception{
    WorkException(String msg){ super(msg); }
}

// 사용자 정의 예외 CloseException
class CloseException extends Exception{
    CloseException(String msg){ super(msg); }
}
