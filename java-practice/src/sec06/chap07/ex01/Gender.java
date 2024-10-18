package sec06.chap07.ex01;

public enum Gender {
    MALE("👦🏻"), FEMALE("\uD83D\uDC67\uD83C\uDFFC");

    // enum 필드
    private String emoji;

    // enum 생성자
    Gender(String emoji){ this.emoji = emoji; }

    // enum 메소드
    public String getEmoji(){ return emoji; }
}
