package sec04.chap01;

public class Ex02 {
    public static void main(String[] args){
        boolean willOrderCoffee = false;
        boolean likeMilk = false;
        boolean likeIce = true;
        boolean likeSweet = false;
        boolean angry = true;
        int myRank = 2;

        if (willOrderCoffee){

            String toOrder ="";

            toOrder = likeMilk ? "라떼" : "아메리카노";
            if(likeIce) toOrder = "아이스" + toOrder;
            if(!likeSweet) toOrder += "안단티노";

            System.out.printf("저는 %s 로 주문할게요 %n", toOrder);
        } else{
            if(!angry || myRank>3 ) System.out.println("저는 괜찮아요");
            else System.out.println("너네들끼리 드세요");
        }
    }
}
