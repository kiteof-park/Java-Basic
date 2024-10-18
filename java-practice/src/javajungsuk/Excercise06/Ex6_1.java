package javajungsuk.Excercise06;

class SutdaCard{
    int num = (int)(Math.random()*10) + 1;
    boolean isKwang;

    SutdaCard(){}

    SutdaCard(int num, boolean isKwang){
        this.num = num;
        this.isKwang = isKwang;
    }

//    public void info(){
//
//    }



//    SutdaCard(){
//        this("");
//    }
//
//    SutdaCard(String kwang){
//        num = (int)(Math.random()*10)+1;
//        if(kwang.equals("광"))
//            isKwang = true;
//    }

//    public String info(){
//        return;
//
//    }

    public String toString(){
        return "num: %d, isKwang : %b".formatted(num, isKwang);
    }
}

public class Ex6_1 {
    public static void main(String[] args) {
//        SutdaCard sc1 = new SutdaCard("광");
//        SutdaCard sc2 = new SutdaCard();
//        SutdaCard sc3 = new SutdaCard("광");


    }
}
