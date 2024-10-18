package sec06.chap07.ex01;

public class Main {
    public static void main(String[] args) {
        // Record의 항목을 순서에 따라 생성자로 작성해 사용
        ChildRecord child1 = new ChildRecord("홍길동", 2020, Gender.MALE);

        //  💡 toString 메소드 구현 (이후 배울 Object에서 상속받아 오버라이드)
        String childStr = child1.toString();

        ChildRecord[] children = new ChildRecord[]{
                new ChildRecord("김순이", 2021, Gender.FEMALE),
                new ChildRecord("이돌이", 2019, Gender.MALE),
                new ChildRecord("박철수", 2020, Gender.MALE),
                new ChildRecord("최영희", 2019, Gender.FEMALE),
        };

        for(ChildRecord child : children){
            System.out.printf(
                    "%s %d년생 %s 어린이 %n",
                    // Record의 항목에 각각 getter()메소드 자동으로 생성
                    child.gender().getEmoji(),  // 반환된 gender의 getEmoji() 사용
                    child.birthYear(),
                    child.name()
            );
        }
    }
}
