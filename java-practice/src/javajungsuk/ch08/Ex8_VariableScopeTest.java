package javajungsuk.ch08;

public class Ex8_VariableScopeTest {
    public static void main(String[] args) {
        int num = 10;
        System.out.println("num in main() : " + num);

        try{
            num += 20;
            System.out.println("num in try{} : " + num);
            throw new Exception();
        }catch(Exception e){
            num += 30;
            System.out.println("num in catch{} : " + num);
        } finally {
            num += 40;
            System.out.println("num in finally{} : " + num );
        }

        System.out.println("num in main() : " + num);
    }
}
