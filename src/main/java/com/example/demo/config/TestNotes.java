package com.example.demo.config;

import com.example.demo.Exception.DuplicateException;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TestNotes {

    /*public static void main(String [] args)
    {
        List<String> arr= Arrays.asList("Tom", "Harry", "Tom", "Jamie", "Rob", "Rubie", "Mika", null, "Troy", "Mika");
       /*Set<String> removeDuplicates=new HashSet<>();
       removeDuplicates.addAll(arr);*/
        /*for(String name:arr)
        {
            if(name!=null) {
                System.out.println(name);
            }
            /*if( name!=null&& name.equals("Tom"))
            {
                int index= arr.indexOf(name);
                //System.out.println(index);
                arr.set(index,"Tomas");
            }
            else if( name!=null && name.equals("Rob"))
            {
                int index= arr.indexOf(name);
                //System.out.println(index);
                arr.set(index,"Robert");
            }*/
       // }

       /*
    print the numbers which are multiples of 3 and 5 in a comma separated string
    example: Arrays.asList(45, 20, 56, 15, 24, 75, 31, 18)
    expected output: 45, 15, 75 */
       /* public void findMultiples(List<Integer> numbers) {
            numbers.stream().filter(n-> n%3 == 0 && n%5 == 0).forEach(System.out::println);
System.out.println("\n0----From findMultiples----");
}
                /*
    Change name 'Rob' to 'Robert' and 'Tom' to 'Thomas'
   and then remove duplicate elements from ArrayList
   example: given Arrays.asList("Rob", "Harry", "Rob", "Tom")
   public void replace()
   expected output: [AA, BB, CC] */
                /*public static void replace()
                {
                    List<String> elements = Arrays.asList("Rob", "Harry", "Rob", "Tom");
                    elements.stream().map(c->{
                        if (c.equals("Rob"))
                            return "Robert";
                        else if (c.equals("Tom"))
                              return "Thomas";
                        else
                            return c;
                    }).forEach(System.out::println);
                }
    public void removeDuplicate(List<String> names) {
                    names.stream().filter(Objects::nonNull).distinct().forEach(n->System.out.println(n));
System.out.println("1----From removeDuplicate----");}
/*
    count each element from the String ArrayList
    example: given Arrays.asList("AA", "BB", "AA", "CC")
    expected output: {CC=1, BB=1, AA=2}
*/
                    /*public void countElements(List<String> elements) {
               Map<String,Long> countEachElement=elements.stream().filter(Objects::nonNull).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
System.out.println("2----From countElements----"+countEachElement);
}
                /*
    count of each character in a String
    example: given String "Alone, alone, all, all alone, Alone on a wide, wide sea"
    expected output: {a=8, l=8, o=5, n=5, e=7, ,=5,  =10, w=2, i=2, d=2, s=1} */
        /*public void countChar(String s) {
System.out.println("3----From countChar----");
   Map<Character, Long> charCountMap = s.chars()
                    .mapToObj(c -> (char) c).map(Character::toLowerCase)
                    .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
            System.out.println("3----From countChar----"+charCountMap);


            // Arrays.stream(arr).toList().stream().map(String::chars)..collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
}
        /*
    if numbers are duplicate in the list then throw a custom exception name as Duplicate_Numbers_Exception
    example: Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89, 56, 89);
    expected output: Duplicate_Numbers_Exception: Duplicate number found: 56
 */
               /* public void checkException(List<Integer> numbers) throws Exception {
                    Map<Integer, Long> frequencyMap = numbers.stream()
                            .collect(Collectors.groupingBy(i -> i, Collectors.counting()));

                    // Print duplicates
                    Integer duplicateNumber =frequencyMap.entrySet().stream()
                            .filter(entry -> entry.getValue() > 1).map(Map.Entry::getKey)
                            .findFirst()
                            .orElse(null);

                    // If duplicate number is found, throw exception with the number
                    if (duplicateNumber != null) {
                        throw new DuplicateException("Duplicate number found: " + duplicateNumber);
                    } else {
                        // If no duplicate number is found
                        System.out.println("No duplicate numbers found.");
                    }

}
                // Don't modify anything below this line
                public static void main(String[] args) throws Exception {
                     TestNotes notes = new TestNotes();
                     List<Integer> numbers = Arrays.asList(45, 20, 56, 15, 24, 75, 31, 89, 56, 18);
                     List<String> elements = Arrays.asList("Tom", "Harry", "Tom", "Jamie", "Rob", "Rubie", "Mika", null, "Troy", "Mika");
                     // List<String> elements = Arrays.asList();
                     String str="Alone, alone, all, all alone, Alone on a wide, wide sea";
                     //notes.findMultiples(numbers);
                     //notes.removeDuplicate(elements);
                     //notes.countElements(elements);
                     notes.countChar(str);
                     replace();
                    /* List<String> outputList = inputList.stream()
                .map(str -> str.split("-")[0].trim())  // Split at hyphen and get the first part, then trim whitespace
                .collect(Collectors.toList());*/

                     //notes.checkException(numbers);
              // }

}




