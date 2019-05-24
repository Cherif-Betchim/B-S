import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.ArrayList;
import java.util.Scanner;

public class Creation {
    public void create() {
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);
        ArrayList<Guerrier> tabGuerriers = new ArrayList();
        ArrayList<Magicien> tabMagicien = new ArrayList();


        boolean GMCreation = true;

        while (GMCreation) {
            GMCreation = false;

            System.out.println("Type 1 for Guerrier / Type 2 For Magicien");

            int classe = scanner.nextByte();
            scanner.nextLine();

            if (classe == 1) {
                System.out.println("Warrior ");
                System.out.println("Name:  ");
                String Name = scanner.nextLine();

                System.out.println("Image: ");
                String Image = scanner.nextLine();

                int HP = rand.getRandomIntegerBetweenRange(5, 11);
                int AP = rand.getRandomIntegerBetweenRange(5, 11);
                Guerrier warrior = new Guerrier(Name, Image, HP, AP, "", "");
                System.out.println(warrior);
//                tabGuerriers[IndexG] = warrior;
                tabGuerriers.add(warrior);

                System.out.println("Do you want to Continue Creating? (1 YES/ 0 No) ");
                int more = scanner.nextByte();
                scanner.nextLine();
                if (more == 1) {
                    GMCreation = true;
                }

            } else {
                System.out.println("Magicien ");
                System.out.println("Name:  ");
                String Na = scanner.nextLine();

                System.out.println("Image:  ");
                String Img = scanner.nextLine();

                int HP = rand.getRandomIntegerBetweenRange(4, 7);
                int AP = rand.getRandomIntegerBetweenRange(10, 16);


                Magicien mag = new Magicien(Na, Img, HP, AP);

                System.out.println(mag);

                tabMagicien.add(mag);
                System.out.println("Do you want to Continue Creating? (1 YES/ 0 No) ");
                int more = scanner.nextByte();
                scanner.nextLine();
                if (more == 1) {
                    GMCreation = true;
                }
            }

        }

        show(tabGuerriers, tabMagicien);
        edit(tabGuerriers, tabMagicien);
        show(tabGuerriers, tabMagicien);
        remove(tabGuerriers, tabMagicien);
        show(tabGuerriers, tabMagicien);

    }

    public void show(ArrayList<Guerrier> tabGuerriers, ArrayList<Magicien> tabMagicien) {

        System.out.println("Table de Guerrier ");
        for (int i = 0; i < tabGuerriers.size(); i++) {
            System.out.println(tabGuerriers.get(i));
        }
        System.out.println("Table de Magicien ");
        for (int i = 0; i < tabMagicien.size(); i++) {

            System.out.println(tabMagicien.get(i));
        }

    }


    public void remove(ArrayList<Guerrier> tabGuerriers, ArrayList<Magicien> tabMagicien) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the delete section Presse 1 to remove Guerrier 2 to remove Magicien");
        int deleteChoice = scanner.nextByte();
        if (deleteChoice == 1) {
            System.out.println("Type the number of the Guerrier you want to remove ");
            int removeGuerrier = scanner.nextByte();
            tabGuerriers.remove(removeGuerrier - 1);
        } else {
            System.out.println("Type the number of the Magicien you want to remove ");
            int removeMagicien = scanner.nextByte();
            tabGuerriers.remove(removeMagicien - 1);
        }

    }

    public void edit(ArrayList<Guerrier> tabGuerriers, ArrayList<Magicien> tabMagicien) {
        Guerrier guerrierToChange;
        Magicien magicienToChange;
        boolean Editclasse;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you want to Edit your Classe? if yes Type 1 and 0 if no");
        int YorN = scanner.nextByte();
        scanner.nextLine();
        if (YorN == 1) {
            Editclasse = true;
        } else {
            Editclasse = false;
        }
        while (Editclasse) {
            Editclasse = false;
            System.out.println("If you want to edit a Guerriers press 1 or 0 for Magicien");
            int GorM = scanner.nextByte();
            scanner.nextLine();
            if (GorM == 1) {
                System.out.println("You want to change Guerriers");
                System.out.println("which Guerriers you want to change? ");
                int GuerriersChoice = scanner.nextByte();
                scanner.nextLine();


                guerrierToChange = tabGuerriers.get(GuerriersChoice - 1);
                boolean encoreG = true;
                while (encoreG) {

                    encoreG = false;
                    System.out.println("Press 1 to change name press 2 to change image");
                    int choiceG = scanner.nextByte();
                    scanner.nextLine();

                    switch (choiceG) {
                        case 1:
                            System.out.println("Edit Name");
                            String nameedit = scanner.nextLine();
                            guerrierToChange.setName(nameedit);


                            break;
                        case 2:
                            System.out.println("Edit Image");
                            String imagedit = scanner.nextLine();
                            guerrierToChange.setImage(imagedit);
                            break;

                    }
                    System.out.println("Do you want to edit Again? (1 YES/ 0 No)");
                    int EditAgain = scanner.nextByte();
                    if (EditAgain == 1) {
                        encoreG = true;
                    }
                }
            } else {
                System.out.println("You want to change Magicien");
                System.out.println("which Magicien you want to change? ");
                int Magicienchoice = scanner.nextByte();
                scanner.nextLine();


                magicienToChange = tabMagicien.get(Magicienchoice - 1);
                boolean encoreM = true;
                while (encoreM) {
                    System.out.println("Press 1 to change name press 2 to change image");
                    int choiceM = scanner.nextByte();
                    scanner.nextLine();

                    switch (choiceM) {
                        case 1:
                            System.out.println("Edit Name");
                            String nameedit = scanner.nextLine();
                            magicienToChange.setName(nameedit);


                            break;
                        case 2:
                            System.out.println("Edit Image");
                            String imagedit = scanner.nextLine();
                            magicienToChange.setImage(imagedit);
                            break;

                    }
                    System.out.println("Do you want to edit Again? (1 YES/ 0 No)");
                    int EditAgain = scanner.nextByte();
                    if (EditAgain == 1) {
                        encoreM = true;
                    } else {
                        encoreM = false;
                    }
                }
            }
        }

    }
}

