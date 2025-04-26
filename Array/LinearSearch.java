package Array;

public class LinearSearch {
    public static int linearSearch(String[] menu, String key){
        for (int i = 0; i < menu.length; i++) {
            if(menu[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        String[] menu = {"Pizza","Pasta","Fries","Burger"};
        String key = "Burger";
        System.out.println(linearSearch(menu, key));
    }
}
