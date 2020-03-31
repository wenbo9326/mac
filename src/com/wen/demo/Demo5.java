package com.wen.demo;

/**
 * @ClassName Demo5
 * @Description switch多重选择
 * @Author wenBo
 * @Date 2020/3/26 0:11
 */
public class Demo5 {
    public static void main(String[] args) {
        int option=4;
        switch (option){
            case 1:
                System.out.println("Selected 1");
                break;
            case 2:
                System.out.println("Selected 2");
                break;
            case 3:
                System.out.println("Selected 3");
                break;
            default:
                System.out.println("Not Selected");
        }
    }
}
