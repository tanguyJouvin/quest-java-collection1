import java.util.*;

public class Thanos {

    public static void main(String[] args) {
        Hero blackWidow = new Hero( "Black Widow", 34);
        Hero CaptainAmerica = new Hero( "Captain America", 100);
        Hero vision = new Hero( "Vision", 3);
        Hero ironMan = new Hero( "Iron Man", 48);
        Hero scarletWitch = new Hero( "Scarlet Witch", 29);
        Hero thor = new Hero( "Thor", 1500);
        Hero hulk = new Hero( "Hulk", 49);
        Hero doctorStrange = new Hero( "Doctor Strange", 42);

        // TODO 1 : Create an empty heroes list
        ArrayList<Hero> heroes = new ArrayList<>();
        // TODO 2 : Add those heroes to the list
        heroes.add(blackWidow);
        heroes.add(CaptainAmerica);
        heroes.add(vision);
        heroes.add(ironMan);
        heroes.add(scarletWitch);
        heroes.add(thor);
        heroes.add(hulk);
        heroes.add(doctorStrange);

        // TODO 3 : It's Thor birthday, now he's 1501
        Hero newThor = new Hero("Thor", 1501);
        heroes.set(5, newThor);
        
        // TODO 4 : Shuffle the heroes list
        Collections.shuffle(heroes);
       // System.out.println(heroes);
        Collections.shuffle(heroes);
       // System.out.println(heroes);
        // TODO 5 : Keep only the half of the list
        List<Hero> heroes2 = heroes.subList(0, 4); 
  
        // TODO 6 : Loop throught the list and display the name of the remaining heroes

        for (Hero heroeAlive : heroes2) { // iterate though the list
            System.out.println(heroeAlive.getName());
        }
    }
}
