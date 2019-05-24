

public class Main {

    public static void main(String[] args) {
        int verif =0;
        while ( verif !=1) {
            try {
                verif=1;
                Creation create = new Creation();
                create.create();


            } catch (Exception a) {
                System.out.println("hello");
                verif = 0;
            }
            //  System.out.println("something wrong happened");
        }


    }
}

