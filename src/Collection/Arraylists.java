package Collection;


    import java.util.*;
public class Arraylists {
        public static void main(String args[]){
            ArrayList<String> list=new ArrayList<String>();//Creating arraylist
            //Adding object in arraylist
            list.add("Ravi");
            list.add("Vijay");
            list.add("rohan");
            list.add("Ajay");
            System.out.println("-Main List: "+list);


                //getting objects from arraylist
                String element=list.get(2);
                System.out.println("-Get element 2: "+element);

                //Adding element in between
            list.add(0,"arjun");
            System.out.println("-Adding new element: "+list);

            //setting element in list/changing value
            list.set(1,"farhan");
            System.out.println("-Changing Value: "+list);

            //Deleting element
            list.remove(4);
            System.out.println("-Deleting element: " +list);

            //size of array list
            int size = list.size();
            System.out.println("-Size of list:"+size);
            }
        }




