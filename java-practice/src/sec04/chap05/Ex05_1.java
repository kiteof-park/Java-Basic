package sec04.chap05;

public class Ex05_1 {
    static String descClass(int classNO, String teacher, String ... students ){
        return "%d반의 담임은 %s선생님, 원생들은 %s입니다."
                .formatted(classNO, teacher, String.join(",", students));
    }

    public static void main(String[] args) {

        String classDesc = descClass(3, "목아진", "짱구", "철수", "훈이");
        System.out.println(classDesc);

        String[] students = new String[] {"짱구", "유리", "맹구", "흰둥이"};
        String classDescByAry = descClass(2, "목아진", students);
        System.out.println(classDescByAry);
    }
}
