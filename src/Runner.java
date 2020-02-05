public class Runner {
    public static void main(String[] args){
        Car myCar = new Car( 1979, "Volkswagen", 600000, "Beetle");
        System.out.println(myCar.toString());
        myCar.drive(10000);
        System.out.println(myCar.toString());

        Rectangle lilguy = new Rectangle(50, 50);
        System.out.println(lilguy.getArea());
        System.out.println(lilguy.getDiagonal());
        System.out.println(lilguy.isSquare());
    }
}
