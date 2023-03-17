package com.example.answer2.arrayList;

public class ArrayListUsage {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("apple");
        list.add("banana");
        list.add("cherry");
        list.add("beer");
        list.add("milk");
        System.out.println("Список: " + list);

        list.addAt(2, "orange");
        System.out.println("Список после добавления по индексу: " + list);

        String element = list.get(3);
        System.out.println("Элемент по индексу 3: " + element);

        int index = list.indexOf("banana");
        System.out.println("Индекс элемента 'banana': " + index);

        boolean removed = list.remove("cherry");
        System.out.println("Список после удаления 'cherry': " + list);
        System.out.println("Удален ли элемент 'cherry'? " + removed);

        String removedElement = list.removeAt(2);
        System.out.println("Список после удаления элемента по индексу 2: " + list);
        System.out.println("Удаленный элемент: " + removedElement);

    }

}

