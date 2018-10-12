package gift;

import gift.sweets.Sweets;

import java.util.*;

public class Present {

    private double totalPrice;
    private double totalWeight;


    public Present() {
        this.totalPrice = 0;
        this.totalWeight = 0;
    }

    private List<Sweets> sweetsList = new ArrayList<>();

    public void addSweet(Sweets sweets) {
        sweetsList.add(sweets);
    }

//    public void countPrice() {
//        double price = 0;
//        for (int i = 0; i < sweetsList.size(); i++) {
//            Sweets sweets = sweetsList.get(i);
//            price += sweets.getPrice();
//        }
//        System.out.println(price);
//    }

    public void printSweets() {
        System.out.println("Подарок содержит: ");
//        for (int i = 0; i < sweetsList.size(); i++) {
//            Sweets sweet = sweetsList.get(i);
//            System.out.println("Название сладости: " + sweet.getName() + " (Вес сладости: " + sweet.getWeight() + " грамм" + " Цена сладости: " + sweet.getPrice() + "$")
//            + " Особенная характеристика: " + sweet.getClass().getAnnotation(Special.class).special());
//        }
        sweetsList.stream()
                .filter(item->item.getName().equals("Candy"))
                .forEach(item-> System.out.println(("Название сладости: " + "Candy" + " (Вес сладости: " + item.getWeight() + " грамм" + " Цена сладости: " + item.getPrice() + "$)")));
        sweetsList.stream()
                .filter(item->item.getName().equals("Cookie"))
                .forEach(item-> System.out.println(("Название сладости: " + "Cookie" + " (Вес сладости: " + item.getWeight() + " грамм" + " Цена сладости: " + item.getPrice() + "$)")));
        sweetsList.stream()
                .filter(item->item.getName().equals("Jellybean"))
                .forEach(item-> System.out.println(("Название сладости: " + "Jellybean" + " (Вес сладости: " + item.getWeight() + " грамм" + " Цена сладости: " + item.getPrice() + "$)")));
        sweetsList.stream()
                .filter(item->item.getName().equals("Chocolate"))
                .forEach(item-> System.out.println(("Название сладости: " + "Chocolate" + " (Вес сладости: " + item.getWeight() + " грамм" + " Цена сладости: " + item.getPrice() + "$)")));
       }

    public void printPresent() {
        for (int i = 0; i < sweetsList.size(); i++) {
            Sweets sweets = sweetsList.get(i);
            totalWeight += sweets.getWeight();
            totalPrice += sweets.getPrice();
        }
        System.out.println("--------------------");
        System.out.println("Итого:\n" + "Общая стоимость: " + totalPrice + "$ \n" + "Общий вес подарка: " + totalWeight + " грамм.\n");
    }


    public void deleteSweets() {
        for (ListIterator<Sweets> iter = sweetsList.listIterator(); iter.hasNext();) {
            System.out.println("Хотите удалить " + iter.next().getName() + " ?");
            Scanner scanner3 = new Scanner(System.in);
            String answer2 = scanner3.next();
            if (answer2.toLowerCase().equals("yes"))
                iter.remove();
        }


    }
}