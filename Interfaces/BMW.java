public class BMW implements ICarAssembly{
    public static String CarColor = "Yellow";

    @Override
    public void getCarModel() {
        System.out.println("Make is BMW and Car color is: " + CarColor);
    }
}
