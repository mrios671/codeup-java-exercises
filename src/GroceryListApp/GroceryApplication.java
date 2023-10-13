//package GroceryListApp;
//import java.util.HashMap;
//import java.util.Scanner;
//
//public class GroceryApplication {
//    public static void main(String[] args) {
//        HashMap<String, GroceryItem> groceryCategory = new HashMap<>();
//        Scanner localScanner = new Scanner(System.in);
//        boolean continueFlag = false;
//
////        groceryCategory.put("Produce", item1);
////        groceryCategory.put("Meat", item2);
////        groceryCategory.put("Bakery", item3);
////        groceryCategory.put("Dairy", item4);
////        groceryCategory.put("Pantry", item5);
//
//
//        System.out.println("Would you like to create a Grocery List? yes/no");
//        String userAnswer = localScanner.nextLine();
//
//        if(userAnswer.equalsIgnoreCase("y")||userAnswer.equalsIgnoreCase("yes")){
//
//            System.out.println("Would you like to enter a new item? yes/no");
//            String newItemPrompt = localScanner.nextLine();
//
//            if(newItemPrompt.equalsIgnoreCase("y")||newItemPrompt.equalsIgnoreCase("yes")){
//
//                System.out.println("Here is a list of different grocery categories: ");
//                for(String groceryItemsCategory : groceryCategory.keySet()){
//                    System.out.printf(" |%s| ", groceryItemsCategory);
//                }
//            } else {
//                continueFlag = false;
//            }
//
//        }else{
//            continueFlag = false;
//        }
//    }
//
//
//
//}
