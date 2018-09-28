package gift;

import java.util.Scanner;
import gift.sweets.*;

public class CreateGift {

    private static int countSweets (Sweets sweets){
        Scanner scanner = new Scanner(System.in);
        System.out.print(sweets.getName() + ": ");
        return scanner.nextInt();
    }
    public static void main(String[] args) {

        Sweets[] sweets = new Sweets[4];
        sweets[0] = new Candy();
        sweets[1] = new Jellybean();
        sweets[2] = new Chocolate();
        sweets[3] = new Cookie();

        Present present = new Present();

        System.out.println("Введите количество сладостей:");
        for (int i = 0; i < sweets.length; i++) {
            int amountSweets = countSweets(sweets[i]);
            sweets[i].setAmount(amountSweets);
            present.setTotalPrice(amountSweets, sweets[i].getPrice());
            present.setTotalWeight(amountSweets, sweets[i].getWeight());
        }

        System.out.println("Подарок содержит: ");

        for (int i = 0; i < sweets.length; i++) {
            System.out.println(sweets[i].getAmount() + "шт. x " + sweets[i].getName() + "(Вес шт.: " + sweets[i].getWeight() + " грамм, Цена за единицу: " + sweets[i].getPrice() + "$)");
        }

        System.out.println("Итого:\n" + "Общая стоимость: " + present.getTotalPrice() + "$ \n" + "Общий вес подарка: " + present.getTotalWeight() + " грамм.\n");
    }
}
