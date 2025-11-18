public class MagpieRunner{ 
    public static void main(String[] args){
        Magpie maggie = new Magpie();

        System.out.println(maggie.getGreeting());
        // System.out.println(maggie.getResponse("My mother and I talked last night."));
        // System.out.println(maggie.getResponse("I said no!"));
        // System.out.println(maggie.getResponse("The weather is nice."));
        // System.out.println(maggie.getResponse("Do you know my brother?"));
        System.out.println(maggie.getResponse("I love my dog Sally!"));
        System.out.println(maggie.getResponse("I love my cat Mittens!"));
        System.out.println(maggie.getResponse("Mrs. Orsen lets us have lots of fun!"));
        System.out.println(maggie.getResponse("Mr. Gemici lets us talk to each other all the time!"));
        System.out.println(maggie.getResponse(""));
        System.out.println(maggie.getResponse("Hey, how's it going?"));
   }
}