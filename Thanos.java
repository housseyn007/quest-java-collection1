import java.util.*;

import java.util.*;

public class Thanos {

    public static void main(String[] args) {
       

        // TODO 1 : Create an empty heroes list
         ArrayList<Hero> hero = new ArrayList<>();
        // TODO 2 : Add those heroes to the list
        // name: Black Widow, age: 34
        // name: Captain America, age: 100
        // name: Vision, age: 3
        // name: Iron Man, age: 48
        // name: Scarlet Witch, age: 29
        // name: Thor, age: 1500
        // name: Spider-Man, age: 18
        // name: Hulk, age: 49
        // name: Doctor Strange, age: 42
        Hero h1=new Hero("Black Windo",34);
        Hero h2=new Hero("Captain America",100);
        Hero h3=new Hero("Vision",3);
        Hero h4=new Hero("Iron Man",48);
        Hero h5=new Hero("Scarlet Witch",29);
        Hero h6=new Hero("Thor",1500);
        Hero h7=new Hero("Spider-Man",18);
        Hero h8=new Hero("Hulk",49);
        Hero h9=new Hero("Doctor Strange",42);
        hero.add(h1);
        hero.add(h2);
        hero.add(h3);
        hero.add(h4);
        hero.add(h5);
        hero.add(h6);
        hero.add(h7);
        hero.add(h8);
        hero.add(h9);
           
        // TODO 3 : It's Thor birthday, now he's 1501
        h6.setAge(1501);
        // TODO 4 : Shuffle the heroes list
        Collections.shuffle(hero);
        // TODO 5 : Keep only the half of the list
        hero.subList( hero.size()/2,hero.size()).clear();
        // TODO 6 : Loop throught the list and display the name of the remaining heroes
        for (int i=0;i<hero.size();i++){
            System.out.println(hero.get(i).getName());
        }
    }
}
