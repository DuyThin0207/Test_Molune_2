package valiDate;

import input.Input;

import java.util.Scanner;

public class ValiDateStore {

    public static int inputId(){
        String regex = "^[0-9]{2}$";
        String id;
        do {
            System.out.println("---yêu cầu nhập 2 số--- ");
            id = Input.inputString();
            if (id.matches(regex)){
            break;}
        }while (true);
        return Integer.parseInt(id);
    }
}
