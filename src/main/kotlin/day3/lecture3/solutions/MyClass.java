package day3.lecture3.solutions;



public class MyClass {

    public static void main(String[] args) {
//        Bear bear = new Bear();
        Colors.INSTANCE.getRandomColor();
        Bear.Companion.getDefaultColor();
//        Bear.Companion.getBearColor();

        Colors.getRandomColor();
        Bear.getDefaultColor();
//        Bear.getBearColor();




        new Bear("Yellow", "Salmon",  8);
        new Bear( "Salmon",  8);
    }
}
