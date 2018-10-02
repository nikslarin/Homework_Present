package gift;

import java.util.Scanner;

import gift.sweets.*;

public class CreateGift {

    public static void main(String[] args) {

        Present present = new Present();
        System.out.println("Введите количество сладостей:");
        try (Scanner scanner = new Scanner(System.in)) {
            while (scanner.hasNext()) {
                int amountOfSweets;
                if (scanner.hasNextInt()) {
                    amountOfSweets = scanner.nextInt();
                } else {
                    System.out.println("Ошибка: Введите число!");
                    System.out.println("Введите количество сладостей:");
                    scanner.next();
                    continue;
                }
                if (amountOfSweets < 1) {
                    System.out.println("Ошибка: Введите хотя бы одну сладость!");
                    System.out.println("Введите количество сладостей:");
                    scanner.next();
                    continue;
                }
                try {
                    for (int i = 0; i < amountOfSweets; i++) {
                        System.out.println("Введите название сладости, которую хотели бы добавить в подарок:");
                        String candyName = scanner.next();
                        switch (candyName.toLowerCase()) {
                            case "candy":
                                present.addSweet(new Candy());
                                break;
                            case "chocolate":
                                present.addSweet(new Chocolate());
                                break;
                            case "jellybean":
                                present.addSweet(new Jellybean());
                                break;
                            case "cookie":
                                present.addSweet(new Cookie());
                                break;
                            default:
                                System.out.println("Такой сладости нет!");
                        }
                    }
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
                try {
                    System.out.println("Хотите удалить сладости из подарка? Yes/No:");
                    Scanner scanner2 = new Scanner(System.in);
                    String answer = scanner2.next();
                    if (answer.equals("yes"))
                        present.deleteSweets();
                } catch (Exception ex) {
                    System.out.println(ex.getMessage());
                }

                present.printSweets();
                present.printPresent();
            }
        }
    }
}
