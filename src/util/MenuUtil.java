package util;

import static util.InputUtil.inputRequiredInteger;

public class MenuUtil {
    public static int entry() {
        System.out.println("\n------ Library Management System ------\n" +
                "\n[0] Exit System" +
                "\n[1] Register" +
                "\n[2] Show books" +
                "\n[3] Update" +
                "\n[4] Delete" +
                "\n[5] Total Employee" +
                "\n[6] Find by Name\n"
        );
        return inputRequiredInteger("Chose option: ");
    }

}
