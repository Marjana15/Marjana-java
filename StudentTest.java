public class StudentTest 
{
    public static void main(String[] args)
    {
        Student ac1= new Student("Aqsa",93.5 );
        Student ac2 = new Student("Ayra",72.75 );

        System.out.printf("%s's letter grade is:%s%n",ac1.getName(),ac1.getLetterGrade());
        System.out.printf("%s's letter grade is:%s%n",ac2.getName(),ac2.getLetterGrade());
    }
}
