import java.util.Scanner;

public class Restaurant_Billing_System {
    public static void main(String[] args) {
        Items i = new Items();
        i.Search_Item();
        System.out.println();
        System.out.println("#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*\n");
        System.out.println("---------------Thank You For visit Taj Restaurant!--------------\n");
        System.out.println("#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*\n");
    }
}

class Items {
    Scanner input = new Scanner(System.in);
    double sum = 0;

    void Search_Item() {
        System.out.println("================================================================");
        System.out.println("----------------------------------------------------------------");
        System.out.println("=-=-=-=-=-=-=-=-=-Welcome To Taj Restaurant-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("----------------------------------------------------------------");
        System.out.println("================================================================");
        System.out.print("\t\t\tEnter your name:");
        String name = input.nextLine();
        System.out.print("\t\t\tEnter your Age:");
        int age = input.nextInt();
        input.nextLine();
        String[] s = name.split(" ");
        String Id = s[0] + age;
        System.out.println("\t\t\tyour Id is :" + Id);
        int num;
        while (true) {
            System.out.print("\t\t\tPlease Enter Your Id:");
            String ID = input.nextLine();
            if (Id.equals(ID)) {
                do {
                    System.out.println("                  -----------------------------------------          ");
                    System.out.println("                  |         1. GUJARATI ITEMS             |          ");
                    System.out.println("                  |         2. PUNJABI ITEMS              |          ");
                    System.out.println("                  |         3. CHINESE ITEMS              |          ");
                    System.out.println("                  |         4. FAST FOODS                 |          ");
                    System.out.println("                  |         5. COLD DRINKS                |          ");
                    System.out.println("                  |         6. Exit                       |          ");
                    System.out.println("                  -----------------------------------------          ");

                    System.out.println("                  |           Enter your choice           |          ");
                    System.out.print("                                      ");
                    num = input.nextInt();
                    System.out.println("                  -----------------------------------------         ");
                    System.out.println();
                    switch (num) {
                        case 1:
                            Gujarati();
                            break;
                        case 2:
                            Punjabi();
                            break;
                        case 3:
                            Chinese();
                            break;
                        case 4:
                            Fast_Food();
                            break;
                        case 5:
                            Cold_Drinks();
                            break;
                        case 6:
                            break;
                        default:
                            System.out.println("\t\t\tplease enter valid number (1 to 5)");
                    }
                } while (num != 6);
                break;
            } else {
                System.out.println("\t\t\tyour Id is wrong");
            }
        }
    }

    void Gujarati() {
        String[] s = new String[] { "Vagharelo Rotlo     ", "Vagharelu Dahi      ", "Tikhari(lasan fry)  ",
                "Dhokli Nu Shaak     ", "Lasaniya Bataka     ", "Bhindi Masala       ", "Totha               ",
                "Ringan Nu Bhartu    ", "Sev Tameta          ", "Sev Dungri          ", "Kaju Gathiya(Full)  ",
                "Gulab Jamun         ", "Gajar No Halvo      ", "Khichdi             ", "Vaghareli Khichdi   ",
                "Kadhi(Gujarati)     ", "Dal                 ", "Bhaat               ", "Rotli(EXTRA)        ",
                "Bhakhri(EXTRA)      ", "Gool                ", "Papad               ", "Chaas               ",
                "FIX GUJARATI THALI..", "BILL                " };
        int[] rate = new int[] { 90, 80, 85, 120, 75, 110, 80, 130, 130, 105, 120, 80, 85, 60, 80, 60, 50, 50, 10, 12,
                5, 10, 20, 160, 0 };
        int[] qt = new int[25];
        sum = 0;
        boolean quit = true;
        do {
            System.out.println("==============Those who want to order please press the number==============");
            System.out.println("\t\tITEMS(GUJARATI)" + "\t\t\tPRICE(rupees)");
            for (int i = 0; i < 25; i++)
                System.out.println("\t\t" + (i + 1) + "." + s[i] + "\t\t" + rate[i]);
            System.out.println("               |           Enter your choice           |          ");
            System.out.print("                                   ");
            int ch = input.nextInt();
            if (ch > 0 && ch < 25) {
                System.out.print("enter the no of quantites of " + s[ch - 1] + " :");
                int q = input.nextInt();
                qt[ch - 1] += q;
            } else if (ch == 25) {
                quit = false;
            } else {
                System.out.println("Please enter valid Number");
                continue;
            }
        } while (quit);
        Bill_Print(s, rate, qt);
    }

    void Punjabi() {
        String[] s = new String[] { "DayNight Special    ", "Paneer Butter Masala", "Panner Tikka        ",
                "Paneer Kadai        ", "PannerHandi         ", "Kaju Panner         ",
                "Palak Panner        ", "Panner Kolhapuri    ", "Shahi Panner        ",
                "Malai Kofta         ", "Cheese Kofta        ", "Veg.Jaipuri         ",
                "Mushroom Mutter     ", "Cheese Butter Masala", "Navratn Korma(Sweet)",
                "Khoya Kaju(Sweet)   ", "Kaju Curry(Spicy)   ", "Kaju Kadai Masala   ",
                "Kaju Cheese Masala  ", "Jeera Rice          ", "Dal fry             ",
                "Butter Naan(Extra)  ", "Lassi               ", "Papad               ",
                "BILL                " };
        int[] rate = new int[] { 200, 170, 160, 165, 140, 175, 160, 180, 180, 165, 170, 150, 90, 165, 180, 185, 170,
                155, 160, 120, 130, 30, 35, 10, 0 };
        int[] qt = new int[25];
        sum = 0;
        boolean quit = true;
        do {
            System.out.println("==============Those who want to order please press the number==============");
            System.out.println("\t\tITEMS(PUNJABI)" + "\t\t\tPRICE(rupees)");
            for (int i = 0; i < 25; i++)
                System.out.println("\t\t" + (i + 1) + "." + s[i] + "\t\t" + rate[i]);
            System.out.println("               |           Enter your choice           |          ");
            System.out.print("                                   ");
            int ch = input.nextInt();
            if (ch > 0 && ch < 25) {
                System.out.print("enter the no of quantites of " + s[ch - 1] + " :");
                int q = input.nextInt();
                qt[ch - 1] += q;
            } else if (ch == 25) {
                quit = false;
            } else {
                System.out.println("Please enter valid Number");
                continue;
            }
        } while (quit);
        Bill_Print(s, rate, qt);
    }

    void Chinese() {
        String[] s = new String[] { "Veg Manchurian      ", "Chilli paneer       ", "Veg. fried rice     ",
                "Veg spring rolls    ", "Hakka noodles       ", "Veg chopsuey        ",
                "Broccoli and garlic ", "Chinese eggplant    ", "Chinese soups       ",
                "Chow mein           ", "Dragon noodles      ", "Hot and sour soup   ",
                "Chinese vegetable   ", "Cucumber salad      ", "Honey chilli potato ",
                "Schezwan cauliflower", "Sesame noodles      ", "Asian tofu          ",
                "Mushroom Manchurian ", "Sichuan green beans ", "Chilli baby corn    ",
                "Chinese Idli        ", "Butter Milk         ", "Papad               ",
                "BILL                " };
        int[] rate = new int[] { 90, 70, 80, 70, 80, 85, 70, 100, 90, 100, 110, 95, 80, 70, 75, 80, 80, 90, 120, 90, 80,
                65, 30, 10, 0 };
        int[] qt = new int[25];
        sum = 0;
        boolean quit = true;
        do {
            System.out.println("==============Those who want to order please press the number==============");
            System.out.println("\t\tITEMS(CHINESE)" + "\t\t\t\tPRICE(rupees)");
            for (int i = 0; i < 25; i++)
                System.out.println("\t\t" + (i + 1) + "." + s[i] + "\t\t" + rate[i]);
            System.out.println("               |           Enter your choice           |          ");
            System.out.print("                                   ");
            int ch = input.nextInt();
            if (ch > 0 && ch < 25) {
                System.out.print("enter the no of quantites of " + s[ch - 1] + " :");
                int q = input.nextInt();
                qt[ch - 1] += q;
            } else if (ch == 25) {
                quit = false;
            } else {
                System.out.println("Please enter valid Number");
                continue;
            }
        } while (quit);
        Bill_Print(s, rate, qt);
    }

    void Fast_Food() {
        String[] s = new String[] { "Bombay Vadapaav     ", "Mayo Veg. Vadapaav  ", "Chatpata Vadapaav   ",
                "Schezwan Vadapaav   ", "Tandoori Vadapaav   ", "Ind.Sp.Vadapaav     ", "Dabeli              ",
                "Butter Dabeli       ", "CheezeDabeli        ", "Jumbo Dabeli        ", "Samosa              ",
                "Dahi Samosa         ", "Samosa Chat         ", "Kachori             ", "Dahi Kachori        ",
                "Kachori Chat        ", "Maggi               ", "Masala Maggi        ", "Veg.Masala Maggi    ",
                "Cholafari           ", "Jam Butter Sandwich ", "Aloo Matar Sandwich ", "Veg.Sandwich        ",
                "Chocolate Sandwich  ", "BILL                " };
        int[] rate = new int[] { 40, 45, 45, 50, 55, 60, 35, 40, 45, 50, 25, 30, 35, 30, 30, 35, 50, 60, 70, 40, 60, 70,
                60, 80, 0 };
        int[] qt = new int[25];
        sum = 0;
        boolean quit = true;
        do {
            System.out.println("==============Those who want to order please press the number==============");
            System.out.println("\t\tITEMS(FAST FOOD)" + "\t\tPRICE(rupees)");
            for (int i = 0; i < 25; i++)
                System.out.println("\t\t" + (i + 1) + "." + s[i] + "\t\t" + rate[i]);
            System.out.println("               |           Enter your choice           |          ");
            System.out.print("                                   ");
            int ch = input.nextInt();
            if (ch > 0 && ch < 25) {
                System.out.print("enter the no of quantites of " + s[ch - 1] + " :");
                int q = input.nextInt();
                qt[ch - 1] += q;
            } else if (ch == 25) {
                quit = false;
            } else {
                System.out.println("Please enter valid Number");
                continue;
            }
        } while (quit);
        Bill_Print(s, rate, qt);
    }

    void Cold_Drinks() {
        String[] s = new String[] { "Frooti              ", "Cold Coffee         ", "Mango Juice         ",
                "Milk Shake          ", "Maza                ", "Cocacola            ", "Lemon Water         ",
                "Dahi Lassi          ", "Cold Water          ", "Limca               ", "Slice               ",
                "Pepsi               ", "Miranda             ", "Mountain Dew        ", "Fenta               ",
                "Thumbs UP           ", "Orange Juice        ", "Bitter gourd Juice  ", "Sting               ",
                "Spinach Juice       ", "Cucumber Juice      ", "Appy Fizz           ", "Red Bull            ",
                "Cold Tea            ", "Bill                " };
        int[] rate = new int[] { 20, 60, 50, 70, 35, 30, 25, 45, 20, 40, 40, 35, 35, 35, 35, 35, 40, 45, 40, 60, 60, 60,
                110, 30, 0 };
        int[] qt = new int[25];
        sum = 0;
        boolean quit = true;
        do {
            System.out.println("==============Those who want to order please press the number==============");
            System.out.println("\t\tITEMS(COLD DRINK)" + "\t\tPRICE(rupees)");
            for (int i = 0; i < 25; i++)
                System.out.println("\t\t" + (i + 1) + "." + s[i] + "\t\t" + rate[i]);
            System.out.println("               |           Enter your choice           |          ");
            System.out.print("                                   ");
            int ch = input.nextInt();
            if (ch > 0 && ch < 25) {
                System.out.print("enter the no of quantites of " + s[ch - 1] + " :");
                int q = input.nextInt();
                qt[ch - 1] += q;
            } else if (ch == 25) {
                quit = false;
            } else {
                System.out.println("Please enter valid Number");
                continue;
            }
        } while (quit);
        Bill_Print(s, rate, qt);
    }

    void Discount(double sum) {
        if (sum > 500 && sum <= 1000) {
            System.out.println();
            System.out.println("Your bill\t\t\t\t\t\t" + sum);
            System.out.println();
            sum = sum - (sum * 0.1);
            System.out.println("Your total bill with 10% Discount\nbecuse your bill is above 500\t\t\t\t" + sum);
            System.out.println("================================================================");
            Payment(sum);
        } else if (sum > 1000 && sum <= 1500) {
            System.out.println();
            System.out.println("Your bill\t\t\t\t\t\t" + sum);
            System.out.println();
            sum = sum - (sum * 0.15);
            System.out.println("Your total bill with 15% Discount\nbecuse your bill is above 1000\t\t\t\t" + sum);
            System.out.println("================================================================");
            Payment(sum);
        } else if (sum > 1500 && sum <= 2000) {
            System.out.println();
            System.out.println("Your bill\t\t\t\t\t\t" + sum);
            System.out.println();
            sum = sum - (sum * 0.20);
            System.out.println("Your total bill with 20% Discount\nbecuse your bill is above 1500\t\t\t\t" + sum);
            System.out.println("================================================================");
            Payment(sum);
        } else if (sum > 2000 && sum <= 3000) {
            System.out.println();
            System.out.println("Your bill\t\t\t\t\t\t" + sum);
            System.out.println();
            sum = sum - (sum * 0.25);
            System.out.println("Your total bill with 25% Discount\nbecuse your bill is above 2000\t\t\t\t" + sum);
            System.out.println("================================================================");
            Payment(sum);
        } else if (sum > 3000) {
            System.out.println();
            System.out.println("Your bill\t\t\t\t\t\t" + sum);
            System.out.println();
            sum = sum - (sum * 0.30);
            System.out.println("Your total bill with 30% Discount\nbecuse your bill is above 3000\t\t\t\t" + sum);
            System.out.println("================================================================");
            Payment(sum);
        } else {
            System.out.println();
            System.out.println("Your bill\t\t\t\t\t\t" + sum);
            System.out.println();
            System.out.println("================================================================");
            Payment(sum);
        }
    }

    void Payment(double summ) {
        System.out.println();
        System.out.print("Plese Pay Your Bill\t\t\t\t\t");
        double bill_Rupee;
        boolean b = true;
        do {
            bill_Rupee = input.nextDouble();
            if (summ == 0) {
                b = true;
            }
            if (summ == bill_Rupee) {
                System.out.println("\t\t\tPayment Successful");
                System.out.println("================================================================");
                summ -= bill_Rupee;
                b = true;
            } else {
                summ -= bill_Rupee;
                System.out.println();
                System.out.println("Payment Sccessful Your bill is " + summ + " rupees outstanding");
                b = false;
            }
        } while (b == false);
    }

    void Bill_Print(String ss[], int ratee[], int qtt[]) {
        System.out.println("================================================================\n");
        System.out.println(" \t\t\t TAJ RESTAURANT \n");
        System.out.println("================================================================");
        System.out.println("Date:01/01/2024");
        System.out.println();
        System.out.println("ITEMS" + "\t\t\tPRICE(Rs)" + "\tQUANTITES" + "\tTOTAL");
        System.out.println("----------------------------------------------------------------");
        for (int i = 0; i < 25; i++) {
            if (qtt[i] != 0) {
                sum += qtt[i] * ratee[i];
                System.out.println(ss[i] + "\t" + ratee[i] + "\t\t" + qtt[i] + "\t\t" + qtt[i] * ratee[i] + ".Rs");
            }
        }
        System.out.println("----------------------------------------------------------------");
        Discount(sum);
    }

}
