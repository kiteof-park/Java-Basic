package javajungsuk.Excercise06;

class Student{
    String name;
    int ban;
    int no;
    int kor;
    int eng;
    int math;

    public Student(String name, int ban, int no, int kor, int eng, int math){
        this.name = name;
        this.ban = ban;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    public int getTotal(){
        return kor + eng + math;
    }

    public float getAverage(){
//        int sum = getTotal();
//        float avg = sum / 3.0f;
//
//        // 소수점 둘째 자리에서 반올림
//        return avg;

        return (int)(getTotal()/3.0f * 10 + 0.5) / 10.f;

    }

    public String info(){
        return "%s, %d, %d, %d, %d, %d, %d, %.1f"
                .formatted(name, ban, no, kor, eng, math, getTotal(), getAverage());
    }

}

public class Ex6_3 {
    public static void main(String[] args) {
        Student s = new Student("홍길동", 1, 1, 100, 60, 76);

        System.out.println("이름: " + s.name);
        System.out.println("총점: " + s.getTotal());
        System.out.println("평균: " + s.getAverage());

        System.out.println(s.info());
    }
}
