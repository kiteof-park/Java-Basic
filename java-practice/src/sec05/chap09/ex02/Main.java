package sec05.chap09.ex02;

public class Main {
    public static void main(String[] args) {
        FoodSafety.announcement();

        YalcoChicken store1 = new YalcoChicken();

        store1.cleanKitchen();
        store1.employeeEducation();
        store1.regularInstpection();
    }
}
