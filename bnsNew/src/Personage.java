public abstract  class  Personage {
    protected String name;
    protected String image;
    protected int health;
    protected int power;

    public Personage() {

    }

    public Personage(String name, String image, int health, int power) {
        this.name = name;
        this.image = image;
        this.health = health;
        this.power = power;

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

}

