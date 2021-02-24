public class Program {
    public static void main(String[] args) {
        
        ICarAssembly obj = CarFactory.GetCarInstance(2);
        obj.getCarModel();
        
    }

}
