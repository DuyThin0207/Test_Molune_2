package valiDate;

import input.Input;

import java.util.Scanner;

public class ValiDateStore {
    public static Scanner input = new Scanner(System.in);
    public static int inputId(){
        String regex = "^[0-9]{3}$";
        String id;
        do {
            System.out.println("---yêu cầu nhập 3 số--- ");
            id = Input.inputString();
            if (id.matches(regex)){
            break;}
        }while (true);
        return Integer.parseInt(id);
    }
    public static String inputName(){
        String regex = "^[a-zA-Z0-9]{6,8}$";
        String name;
        do {
            System.out.println("6 - 8 chu cai : ");
            name = input.nextLine();
            if (name.matches(regex)){
                break;
            }else {
                System.out.println("!! Error....Nhap ten 6 - 8 chu cai :");
            }
        }while (true);
        return name;
    }
    public static int inputQuantity(){
        String regex = "^(0*[1-9][0-9]?|100)$";
        String quantity;
        do {
            System.out.println("nho hon 100 : ");
            quantity = input.nextLine();
            if (quantity.matches(regex)){
                break;
            }else {
                System.out.println("!! Error... So luong tu 0 > 100. ");
            }
        }while (true);
        return Integer.parseInt(quantity);
    }
    public static int inputPrice(){
        String regex = "^(0*[1-9][0-9]{0,2}|1000)$";
        String price;
        do {
            System.out.println("gia duoi 1000k : ");
            price = input.nextLine();
            if (price.matches(regex)){
                break;
            }else {
                System.out.println("!! Error... Gia tu 0k > 1000k.");
            }
        }while (true);
        return Integer.parseInt(price);
    }
}
