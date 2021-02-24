public class Toyota implements ICarAssembly{
    public static String CarColor = "Black";

    @Override
    public void getCarModel() {
        System.out.println("Make is Toyota and Car color is: " + CarColor);
    }
}
