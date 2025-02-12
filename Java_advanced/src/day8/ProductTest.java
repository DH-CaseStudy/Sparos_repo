package day8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ProductTest {
    public static void main(String[] args) {
        Product p1 = new Product("갤럭시S25", 1200000);
        Product p2 = new Product("아이폰15Pro", 1370000);
        Product p3 = new Product("샤오미", 1000000);
        Product p4 = new Product("갤럭시S25(중고)", 900000);
        Product p5 = new Product("아이폰15Pro(중고)", 9500000);
        Product p6 = new Product("샤오미(중고)", 300000);

        List<Product> productList = new ArrayList<>();
        productList.add(p1);
        productList.add(p2);
        productList.add(p3);

        System.out.println("List 정렬 전");

        productList.forEach(System.out::println);
        Collections.sort(productList);

        System.out.println("List 정렬 후");
        productList.forEach(System.out::println);

        Product[] products = {p1,p2,p3,p4,p5,p6};
        System.out.println("배열정렬 전");
        Arrays.stream(products).forEach(System.out::println);
        Arrays.sort(products);

        System.out.println("배열정렬 후");
        Arrays.stream(products).forEach(System.out::println);
    }
}
