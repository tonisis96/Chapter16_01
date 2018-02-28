package Ch16_List;

public class Exercise1
{
    public static void main(String[] args)
    {
        LinkedIntList linkedIntList = new LinkedIntList();
        System.out.println(linkedIntList);

        for (int i = 0; i<10; i++)
        {
            linkedIntList.add(i);
        }
        System.out.println(linkedIntList);

        linkedIntList.add(5,23);
        System.out.println(linkedIntList);
    }
}
