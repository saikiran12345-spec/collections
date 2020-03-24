import java.lang.*;
import java.util.*;
class Collect 
{
    public static void main(String args[])
    {
        ArrayList<Integer> list=new ArrayList<Integer>();//Array collection
        list.add(1);
        list.add(2);
        list.add(2);
        Iterator itr=list.iterator();  
        while(itr.hasNext())   //travesing the list through iterator
        {
            System.out.println(itr.next());
        }
        LinkedList<String> link=new LinkedList<String>();//Linkedlist collection
        link.add("ravi");
        link.add("sai");
        link.add("gopi");
        Iterator itr2=link.iterator();
        while(itr2.hasNext())    //traversing through list by iterator
        {
            System.out.println(itr2.next());
        }
        
        Vector<String> v=new Vector<String>();  //vector collection
        v.add("Ayush");  
        v.add("Amit");  
        v.add("Ashish");  
        v.add("Garima");  
        Iterator<String> itr3=v.iterator();  //traversing through vector by iterator
        while(itr3.hasNext()){  
        System.out.println(itr3.next()); 
        }
    }
}