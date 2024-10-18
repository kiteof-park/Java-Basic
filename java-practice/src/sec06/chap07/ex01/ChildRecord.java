package sec06.chap07.ex01;

public record ChildRecord(
        // private, final의 특성을 가짐
        // 필드가 아님에 주의 !
        String name,
        int birthYear,
        Gender gender

) { }
