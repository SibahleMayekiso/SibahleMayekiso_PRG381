public class VW implements ICarAssembly{
    public static String CarColor = "Green";

    @Override
    public void getCarModel() {
        System.out.println("Make is VW and Car color is: " + CarColor);
    }
}
