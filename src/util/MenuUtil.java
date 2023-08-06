package util;

public class MenuUtil {
    public static int entryMenu() {
        System.out.println("------------------\n" +
                "[0]. Exit Program!\n" +
                "[1]. Register\n" +
                "[2]. Show Customer");
        int option = InputUtil.inputRequiredInt("Choose option: ");
        return option;
    }
}
