package day15;
import java.util.*;
import java.util.ArrayList;
import java.util.List;

public class main {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(1,20);
        list.add(1,2);
        List<Integer> list2 = new ArrayList<>();
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.addAll(list);
        System.out.println(list);
    }
}

