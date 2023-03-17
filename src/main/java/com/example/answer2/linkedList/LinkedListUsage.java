package com.example.answer2.linkedList;

public class LinkedListUsage {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.add("apple");
        list.add("banana");
        list.add("cherry");
        list.add("beer");
        list.add("orange");

        System.out.println("Список: " + list);

        String element = list.get(3);
        System.out.println("Элемент по индексу 1: " + element);

        int index = list.indexOf("banana");
        System.out.println("Индекс элемента 'banana': " + index);

        list.remove("banana");
        System.out.println("Список после удаления элемента 'banana': " + list);

        list.removeAt(2);
        System.out.println("Список после удаления элемента по индексу 2: " + list);

        list.addAt(1, "milk");
        System.out.println("Список после добавления элемента по индексу 1: " + list);
    }
}
