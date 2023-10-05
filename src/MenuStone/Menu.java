package MenuStone;

import Manager.Manager;
import Store.Store;
import input.Input;
import valiDate.ValiDateStore;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
    Manager manager = new Manager();
    Scanner inputStr = new Scanner(System.in);
    Scanner inputNum = new Scanner(System.in);

    public void showMenuStudent() {
        int choice;
        do {
            System.out.println("=====Menu chức năng=====");
            System.out.println("1: Thêm mới sản phẩm\n2: Sửa sản phẩm theo ID\n3: Xóa sản phẩm theo ID\n4: Tìm sản phẩm theo ID\n5: Tìm sản phẩm theo tên\n6: Hiển thị sản phẩm cùng loại\n7: Hiển thị tất cả sản phẩm\n0: OUT");
            choice = inputNumber();
            switch (choice) {
                case 1:
                    showAdd();
                    break;
                case 2:
                    showEdit();
                    break;
                case 3:
                    showDelete();
                    break;
                case 4:
                    showStoreId();
                    break;
                case 5:
                    showName();
                    break;
                case 6:
                    showName2();
                    break;
                case 7:
                    showAll();
                    break;
            }
        } while (choice != 0);
    }

    public int inputNumber() {
        int number;
        do {
            try {
                number = Integer.parseInt(inputNum.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("----Yêu cầu chỉ nhập số----");
            }
        } while (true);
        return number;
    }

    public void showAdd() {
        System.out.println("Nhập ID:");
        int id = ValiDateStore.inputId();
        System.out.println("Nhập tên sản phẩm:");
        String name = ValiDateStore.inputName();
        System.out.println("Nhập số lượng:");
        int quantity = ValiDateStore.inputQuantity();
        System.out.println("Nhập giá:");
        int price = ValiDateStore.inputPrice();
        System.out.println("Nhập loại sản phẩm:");
        String product = inputStr.nextLine();
        Store store = new Store(id, name, quantity, price, product);
        manager.add(store);
        System.out.println("====Thêm mới thành công====");
    }

    public void showEdit() {
        System.out.println("Nhập ID sản phẩm muốn sửa:");
        int checkId = ValiDateStore.inputId();
        System.out.println("Nhập ID:");
        int id = ValiDateStore.inputId();
        System.out.println("Nhập tên sản phẩm:");
        String name = ValiDateStore.inputName();
        System.out.println("Nhập số lượng:");
        int quantity = ValiDateStore.inputQuantity();
        System.out.println("Nhập giá:");
        int price = ValiDateStore.inputPrice();
        System.out.println("Nhập loại sản phẩm:");
        String product = inputStr.nextLine();
        try {
            Store store = new Store(id, name, quantity, price, product);
            manager.edit(checkId, store);
            System.out.println("===> Sửa mới thành công");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Sửa mới ko thành công, yêu cầu nhập đúng ID.");
        }
    }

    public void showDelete() {
        System.out.println("Nhập ID sản phẩm muốn xóa:");
        int checkId = ValiDateStore.inputId();
        try {
            manager.delete(checkId);
            System.out.println("Xóa thành công học sinh có ID là: " + checkId);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Không có học sinh nào mang ID là: " + checkId);
        }
    }

    public void showStoreId() {
        System.out.println("Nhập ID sản phẩm muốn tìm:");
        int checkId = ValiDateStore.inputId();
        System.out.println(manager.searchId(checkId));
    }

    public void showName() {
        System.out.println("Nhập tên mặt hàng muốn tìm:");
        String checkName = inputStr.nextLine();
        List<Store> arr = manager.searchName(checkName);
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }
    }

    public void showName2() {
        System.out.println("Nhập loại mặt hàng muốn tìm:");
        String checkName = inputStr.nextLine();
        List<Store> arr = manager.searchProductType(checkName);
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }
    }

    public void showAll() {
        System.out.println(manager.findAll());
    }
}
