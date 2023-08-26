import java.util.*;
public class MergeList
{
    public static void main(String[] args)
    {
        List<Integer> list1=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<5;i++)
        {
           int x=sc.nextInt();
           list1.add(x);
        }
        System.out.println(list1);
        List<Integer> list2=new ArrayList<>();
        for(int j=0;j<5;j++)
        {
           int y=sc.nextInt();
           list2.add(y);
        }
        System.out.println(list2);
        List<Integer> Merged=new ArrayList<>();
        Merged.addAll(list1);
        Merged.addAll(list2);
        System.out.println(Merged);
        Set<Integer> set1=new HashSet<>(Merged);
        System.out.print(set1);
    }
}