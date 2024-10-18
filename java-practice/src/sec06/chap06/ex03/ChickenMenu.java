package sec06.chap06.ex03;

public enum ChickenMenu {
    FR("후라이드", 10000, 0),
    YN("양념치킨", 12000, 1),
    GJ("간장치킨", 12000, 0),
    RS("로제치킨", 14000, 0),
    PP("땡초치킨", 13000, 2),
    XX("폭렬치킨", 13000, 3);
    
    // enum의 필드
    private String name;
    private int price;
    private int spicyLevel;
    
    // enum의 생성자
    ChickenMenu(String name, int price, int spicyLevel){
        this.name = name;
        this.price = price;
        this. spicyLevel = spicyLevel;
    }

    // enum의 메소드
    public String getName(){return name;}
    public int getPrice(){return price;}
    public void setPrice(int price){
        this.price = price;
    }
    public String getDesc(){
        String peppers ="";
        if(this.spicyLevel > 0 ){
            peppers = "\uD83C\uDF36\uFE0F".repeat(this.spicyLevel);
        }

        return "%s %d원 %s".formatted(name, price, peppers);
    }
}
