class Main {
public static void main(String[] args) {   
 
       int[] numbers = new int[]{22, 32, 26, 48, 52, 60, 100, 120,180,250};
       int sum = 0;
       for(int i=0; i < numbers.length ; i++)
        sum = sum + numbers[i];
       
        double average = sum / numbers.length;
        System.out.println("Average value of the array elements is : " + average); 
   }
}
