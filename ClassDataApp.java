public class ClassDataApp 
{
    public static void main(String[] args)
    {
        int maxSize = 100;
        ClassDataArray arr;
        arr = new ClassDataArray(maxSize);

        arr.insert("Evens", "Patty", 24);
        arr.insert("Smith", "Lorraine", 37);
        arr.insert("Yee", "Tom", 43);
        arr.insert("Adams", "Henry", 63);
        arr.insert("hashimoto", "Sato", 21);
        arr.insert("Stimson", "Henry", 29);
        arr.insert("velasquez", "Jose", 72);
        arr.insert("Lamarque", "Henry", 54);
        arr.insert("Vang", "Minh", 22);
        arr.insert("Creswell", "Lucinda", 18);

        arr.displayA();

        String searchKey = "Stimson";
        Person found;
        found=arr.find(searchKey);
        if(found != null)
        {
            System.out.println("Found ");
            found.displayPerson();
        }

        else
        System.out.println("Can't find " + searchKey);
        System.out.println("Deleting Smith, Yee, and Creswell");
        arr.delete("Smith");
        arr.delete("Yee");
        arr.delete("Creswell");

        arr.displayA();


        }
}
