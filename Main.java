import java.util.ArrayList;
import java.util.HashMap;

public class Main
{
  public static void main(String[] args)
  {
    // Feel free to test the code here
    ArrayList<String> strList = new ArrayList<>();
    strList.add("dogs");
    strList.add("monkeys");
    strList.add("cats");
    shiftLeft(strList);
    System.out.println(strList); // Expected output: [monkeys, cats, dogs]
    
    ArrayList<Integer> intList = new ArrayList<>();
    intList.add(2);
    intList.add(5);
    intList.add(7);
    intList.add(5);
    printStatistics(intList); // Expected output: Sum: 19, Average: 4.75, Mode: 5
  }

  public static void shiftLeft(ArrayList<String> arr)
  {
    if (arr == null || arr.size() <= 1) {
      return; // No need to shift if the list is empty or has one element
    }

    // Remove the first element and add it to the end
    String firstElement = arr.remove(0);
    arr.add(firstElement);
  }

  public static void printStatistics(final ArrayList<Integer> arr)
  {
    if (arr == null || arr.isEmpty()) {
      System.out.println("Sum: 0");
      System.out.println("Average: 0.0");
      System.out.println("Mode: no single mode");
      return;
    }

    // Calculate sum
    int sum = 0;
    for (int num : arr) {
      sum += num;
    }

    // Calculate average
    double average = (double) sum / arr.size();

    // Find mode using a HashMap
    HashMap<Integer, Integer> frequencyMap = new HashMap<>();
    for (int num : arr) {
      frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
    }

    // Find the mode
    int maxCount = 0;
    int mode = 0;
    boolean uniqueMode = true;

    for (int num : frequencyMap.keySet()) {
      int count = frequencyMap.get(num);
      if (count > maxCount) {
        maxCount = count;
        mode = num;
        uniqueMode = true; // New mode found
      } else if (count == maxCount) {
        uniqueMode = false; // More than one mode found
      }
    }

    // Print statistics
    System.out.println("Sum: " + sum);
    System.out.println("Average: " + average);
    System.out.println("Mode: " + (uniqueMode ? mode : "no single mode"));
  }
}
