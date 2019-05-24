public class Magicien extends Personage{
    //attribute

    private String skill;
    private String philtre;


    //constructeur
public Magicien(){

}

    public Magicien(String nom,String image, int health, int power){
        super(nom, image, health, power);
        this.name = nom ;
        this.image = image;
        this.health = health ;
        this.power =  power;
        this.skill = "Fire";
        this.philtre = "Bracelet";
    }
    //getter setter


    public void setSkill(String skill) {
        this.skill = skill;
    }

    public void setPhiltre(String philtre) {
        this.philtre = philtre;
    }

    public String toString()
    {
        return "nom : " + name + " || Image : " + image + " || Health : " + health + " || Power : "+ power + " || Skill : "+ skill +" || Philtre : " +philtre ;
    }
}


