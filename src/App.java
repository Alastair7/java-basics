import java.util.Scanner;
import java.util.ArrayList;
import java.util.NoSuchElementException;

public class App {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            String menu = ShowMenu();
            boolean isSuccess;

            ArrayList <String> champList = new ArrayList <String> ();
            int option = 0;

            do {
                System.out.println(menu);

                System.out.print("Choose a option: ");
                option = sc.nextInt();
                sc.nextLine();

                switch(option){
                    case 1 :{
                        isSuccess = CreateChamp(champList, sc);
                        System.out.println("");
                        System.out.println(isSuccess ? "Champ Created!" : "Error creating champion.");
                    }
                    break;
                    case 2 : {
                        isSuccess = UpdateChamp(champList, sc);
                        System.out.println("");
                        System.out.println(isSuccess ? "Champ Renamed!" : "Error renaming champion.");
                    break;
                    }
                    case 3 :{
                        isSuccess = DeleteChamp(champList, sc);
                        System.out.println("");
                        System.out.println(isSuccess ? "Champ removed!" : "Error removing champion.");
                     break;
                    }
                     case 4 : {
                      System.out.print(champList);
                      break;
                     }
                      default :
                      System.out.println("not a option. ");        

                }
            } while (option !=5);
            System.out.println("EXIT");
            sc.close();
        }

        private static String ShowMenu() {
            return """
                        MENU
                        1.- Create a new champion.
                        2.- Edit the name of the champion.
                        3.- Delete the champion.
                        4.- Show the champions.
                        5.- Exit.
                    """;
        }

        private static boolean CreateChamp(ArrayList<String> championList, Scanner sc) {
            String championName = "";
            boolean canCreate = true;
                    System.out.print("Create a new champion: ");
                    try {
                        championName = sc.nextLine();
                    } catch (NoSuchElementException ex) {
                        canCreate = false;
                    } catch (IllegalStateException ex) {
                        canCreate = false;
                    }

                    if (canCreate) championList.add(championName);

                return canCreate;
        }
        private static boolean UpdateChamp(ArrayList<String> championList, Scanner sc) {
                    String championNewName; 
                    String championName; 

                    int championIndex = 0;

                    System.out.print("Select the champion's index which you want to rename: ");
                    championName  = sc.nextLine();

                    if (!championList.contains(championName)) {
                        System.out.println("Champion not found.");
                        return false;
                    }
                    
                    championIndex = championList.indexOf(championName);

                    if (championIndex == -1) {
                        System.out.println("Champion not found in ChampionPool.");
                        return false;
                    }

                    System.out.print("Insert the new name: ");
                    championNewName = sc.nextLine();
                    championList.set(championIndex, championNewName);

                    return true;
        }
        private static boolean DeleteChamp(ArrayList<String> championList, Scanner sc) {
            String championName = "";
            System.out.print("Select a champion to delete: ");
            championName = sc.nextLine();

            if (!championList.contains(championName)) {
                System.out.println("Champion not found.");
                return false;
            }

            championList.remove(championName);
            return true;
        }
    }

