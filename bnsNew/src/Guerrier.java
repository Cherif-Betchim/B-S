public class Guerrier extends Personage{

    // attributs

    private String weapon;
    private String shield;

    //constructeur
public Guerrier (){

}
    public Guerrier(String nom,String image, int health, int power, String weapon,String shield){
        super(nom, image,health, power);
        this.name = nom ;
        this.image = image;
        this.health = health ;
        this.power =  power;
        this.shield = "Dagger";
        this.weapon = "Gauntlet";
    }




    // méthode toString
    public String toString()
    {
        return "nom : " + name + " || Image : " + image + " || Health : " + health + " || Power : "+ power + " || Weapon : "+ weapon +" || Shield : " +shield ;
    }
}
