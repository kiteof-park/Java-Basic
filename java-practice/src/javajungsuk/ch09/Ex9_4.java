package javajungsuk.ch09;

import java.util.Objects;

class Card{
    String kind;
    int number;

    Card(){
        this("Spade", 1);
    }

    Card(String kind, int number){
        this.kind = kind;
        this.number = number;
    }

    // equals()결과가 true면 hashCode()결과가 동일함
    @Override
    public int hashCode() {
        return Objects.hash(kind, number);
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Card))
            return false;
        Card card = (Card)obj;
        return (this.kind == card.kind) && (this.number == card.number);
    }

    @Override
    public String toString() {
        return "Card kind : %s, number : %d ".formatted(kind, number);
    }
}
public class Ex9_4 {
    public static void main(String[] args) {
        Card card1 = new Card();
        Card card2 = new Card();

        System.out.println(card1.equals(card2));
        System.out.println(card1.hashCode());
        System.out.println(card2.hashCode());
        System.out.println(card1.toString());
    }
}
