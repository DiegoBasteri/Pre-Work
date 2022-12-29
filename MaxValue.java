import java.util.Arrays;
import java.util.List;

class Main {
  
    public static void main(String[] args)
    {
  
   List<Integer> intList = Arrays.asList(20, 30, 40, 140, 1140, 440);
  
   Integer maxValue = 0;
  
    for (int i = 0; i < intList.size(); i++){
    if (intList.get(i) > maxValue)
                maxValue = intList.get(i);
        }
        System.out.println("The maximum value is "
                           + maxValue);
    }
}
