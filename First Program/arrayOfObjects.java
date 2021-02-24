public class arrayOfObjects {
    public static void main(String[] args) {
        Student[] arr = new Student[4];

        arr[0] = new Student(100, "Simba");
        arr[1] = new Student(101, "Themba");
        arr[2] = new Student(102, "Anila");
        arr[3] = new Student(103, "Lawrence");

        for(int i = 0 ; i < arr.length; i++){
            System.out.println("Student index: " + arr[i].StudentNumber + ", " + arr[i].name);
        }
    }
    
}

//Class containing student constructor
/*
class Student{
    int StudentNumber;
    String name;

    public Student(int _stdNumber, String _Name) {
       this.StudentNumber = _stdNumber;
       this.name = _Name;
    }
}
*/