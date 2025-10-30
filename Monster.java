public class Monster{
    
    private int arms;
    private int eyes;
    private int buttons;
    private String name;
    
    public void setArms(int arms){
        this.arms = arms;
    }
    public void setEyes(int eyes){
        this.eyes = eyes;
    }
    public void setButtons(int buttons){
        this.buttons = buttons;
    }
    public void setName(String name){
        this.name = name;
    }
    public Monster(){
        arms = 2;
        eyes = 2;
        buttons = 1;
        name = "Bill";

    }
    public Monster(int arms, int eyes, int buttons, String name){
        this.arms = arms;
        this.eyes = eyes;
        this.buttons = buttons;
        this.name = name;
    }
    public String toString(){
        return "" + arms + "" + eyes + "" + buttons + "" + name;
    }  

    public static void main(String[] args){
        Monster m1 = new Monster();
        Monster m2 = new Monster(2, 2, 1, "Bill");
        System.out.println(m1);
        System.out.println(m2);
    }
}