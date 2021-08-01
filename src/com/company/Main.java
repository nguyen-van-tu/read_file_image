package com.company;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên :");
        final String MY_NAME = "NGUYEN VAN TU";
        String name;

        do {
            name = scanner.nextLine();
            if (name.equals(MY_NAME)){
                break;
            }
            System.out.println("Nhập sai rồi,nhập lại:");
        } while (true);

        System.out.println("Nhập ngày sinh :");
        final String  MY_DATE_OF_BIRTH = "29/07/2002";
        String dateOfBirth;

        do {
            dateOfBirth = scanner.nextLine();
            if (dateOfBirth.equals(MY_DATE_OF_BIRTH)){
                break;
            }
            System.out.println("Nhập sai rồi,nhập lại:");
        } while (true);

        loading();

        String fileName = "input.txt";
        int[] i = {0};
        try (Stream<String> stream = Files.lines(Paths.get(fileName), StandardCharsets.UTF_8)) {
            stream.forEach(line -> {

//				System.out.println(line +" is number line "+ i[0]++);//in ra cả nội dung file và dòng thứ mấy ta vừa in, bắt đầu từ 0
                System.out.println(line);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void loading() throws InterruptedException {
        for (int i = 1; i < 11; i++) {
            System.out.println("loading " + i + "0%...");
            Thread.sleep(200);
        }
    }
}
