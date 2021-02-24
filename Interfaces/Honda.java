public class Honda implements ICarAssembly{
    public static String CarColor = "Red";

    @Override
    public void getCarModel() {
        System.out.println("Make is Honda and Car color is: " + CarColor);
    }
}
