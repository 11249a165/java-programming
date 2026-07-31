

class Student{

    private final String name;
    private final int rollno;
    private double marks;
     
    public Student(String name, int rollno, double marks){
        this.name=name;
        this.rollno=rollno;
        this.marks=marks;
    }

    public void displayInfo() {
        System.out.println("---------------");
        System.out.println("Name     :"+name);
        System.out.println("Rollno  :"+rollno);
        System.out.println("Marks :"+marks);
        System.out.println("Grade   :"+calculateGrade());
        System.out.println("---------------");
    }
    
    public char calculateGrade(){
        if (marks>= 90){
            return 'A';
        }
        else if (marks>=75){
            return 'B';
        }
        else if (marks>=60){
            return 'C'; 
        }
        else if (marks>=40){
            return 'D';
        }
        else{
            return 'E';
        }
    }

    public static void main(String[] args){
        Student s1 = new Student("Aditi sharma",101,92.5);
        Student s2 = new Student("Rohan Varma", 102, 68.5);
        s1.displayInfo();
        s2.displayInfo();
    }

}