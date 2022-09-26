package cityState;




import java.util.ArrayList;
import java.util.List;

public class CityState {

        public static void main(String[] args){

            //Creating State list
            List<String> State = new ArrayList<String>();

            //Adding elements in the State list
            State.add("Maharashtra");
            State.add("Goa");
            State.add("Kerala");
            State.add("Haryana");
            State.add("Bhiar");

            //Creating City list
            List<String> City = new ArrayList<String>();

            //Adding elements in the City list
            City.add("Mumbai");
            City.add("Panaji");
            City.add("Thiruvananthapuram");
            City.add("Chandigarh");
            City.add("Patna");

            //Declaring a list can hold both list values that are city and state.
            List<String> CityAndState = new ArrayList<String>();

            int a = City.size();
            int b = State.size();

            for(int i=0;i<City.size();i++){
                String Cityparameter = City.get(i);
                String Stateparameter = State.get(i);
                System.out.println(Cityparameter+","+Stateparameter);
            }


        }
    }

