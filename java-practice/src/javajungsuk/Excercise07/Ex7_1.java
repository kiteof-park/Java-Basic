package javajungsuk.Excercise07;

// 💡배열 인덱스와 관련해서 '20'과 같은 하드코딩이 아니라 cards.length를 통해 얻었다는 점


class SutdaDeck{
    final int CARD_NUM = 20;
    SutdaCard[] cards = new SutdaCard[CARD_NUM];

    // 1부터 10까지의 숫자 카드가 한 쌍씩, 숫자 1, 3, 8인 경우 둘 중의 한 장은 무조관 광(true)
    SutdaDeck(){
        // 20장의 카드 초기화 -> 20번 반복
        for(int i = 0; i<cards.length; i++){
            cards[i] = new SutdaCard((i % 10 + 1), (i == 0 || i == 2 || i == 7 ? true : false));
        }
        // 모범 답안
//        for(int i = 0; i < cards.length; i++){
//            int num = i % 10 + 1;
//            boolean isKwang = (i < 10) && (num == 1 || num == 3 || num == 8);
//            card[i] = new SutdaCard(num, isKwang);
//        }

    }

    // 7-2
    public void shuffle(){

        System.out.println("---카드가 섞이기 전---");
        for(SutdaCard card : cards){
            System.out.print(card + " ");
        }
        System.out.println();

        // cards에 담긴 카드의 위치를 뒤섞는다.
        for(int i = 0; i < cards.length; i++){
            int random = (int)(Math.random() * 20);
            SutdaCard tmp = cards[random];
            cards[random] = cards[0];
            cards[0] = tmp;
        }
        // 모범 답안
//        int i = (int)(Math.random() * cards.length);    // 배열 index범위 내의 임의의 두값을 얻는다.
//        int j = (int)(Math.random() * cards.length);
//
//        SutdaCard tmp = cards[i];                       // cards[i]와 cards[j]의 값을 서로 바꾼다.
//        cards[i] = cards[j];
//        cards[j] = cards[i];


        System.out.println("---카드가 섞인 후---");
        for(SutdaCard card : cards){
            System.out.print(card + " ");
        }
        System.out.println();

    }

    public SutdaCard pick(int index){
        // 모범 답안
//        if(index < 0 || index >= CARD_NUM) return null;     // 💡 index의 유효성 검사
//        return cards[index];

        return cards[index];
    }

    public SutdaCard pick(){
        // 모범 답안
//        return pick((int)(Math.random()*cards.length));

       return pick((int)(Math.random() * 20));


    }
}

class SutdaCard{
    int num;
    boolean isKwang;

    SutdaCard(){
        this(1, true);
    }
    SutdaCard(int num, boolean isKwang){
        this.num = num;
        this.isKwang = isKwang;
    }

    @Override
    public String toString() {
        // isKwang이 true -> num + K, false -> num
        return num + (isKwang ? "K" : "");
    }
}

public class Ex7_1 {
    public static void main(String[] args) {
        SutdaDeck deck = new SutdaDeck();

        System.out.println("deck.pick(0): " + deck.pick(0));
        System.out.println("deck.pick(): " + deck.pick());

        deck.shuffle();

//        for(SutdaCard card : deck.cards){
//            System.out.print(card + ", ");
//        }
        System.out.println("deck.pick(0): " + deck.pick(0));
    }
}
