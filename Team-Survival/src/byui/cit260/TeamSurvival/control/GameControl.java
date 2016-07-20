/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.TeamSurvival.control;

import byui.cit260.TeamSurvival.exceptions.GameControlException;
import byui.cit260.TeamSurvival.exceptions.MapControlException;
import byui.cit260.TeamSurvival.model.Game;
import byui.cit260.TeamSurvival.model.Item;
import byui.cit260.TeamSurvival.model.ItemIndex;
import byui.cit260.TeamSurvival.model.Map;
import byui.cit260.TeamSurvival.model.Player;
import byui.cit260.TeamSurvival.model.Scene;
import byui.cit260.TeamSurvival.model.Ship;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import team.survival.TeamSurvival;

/**
 *
 * @author Aboli
 */
public class GameControl {

    public static void createNewGame(Player player) 
    throws MapControlException{

        Game game = new Game();
        TeamSurvival.setCurrentGame(game);

        game.setPlayer(player);

        Item[] ItemIndex = GameControl.createItemList();
        game.setItem(ItemIndex);

//        Ship ship = new Ship();
//        game.setShip(ship);
//        
        Map map = MapControl.createMap();
        
        game.setMap(map);
//        try{
        MapControl.moveCharactersToStartingLocation(map);
//    } catch (MapControlException mce){
//        System.out.println(mce.getMessage());
    }
    

    public static Player createPlayer(String name) {

        if (name == null) {
            return null;
        }

        Player player = new Player();
        player.setName(name);

        TeamSurvival.setPlayer(player); //save the player
        return player;
    }

    public static Player createPlayer(Player player) {
        System.out.println("\ncreatenewGame function called");
        return player;
    }

    public static Item[] sortingWeight(Item[] itemList) {

        for (int i = 0; i < itemList.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < itemList.length; j++) {
                if (itemList[j].getWeight() < itemList[index].getWeight()) {
                    index = j;
                }
            }

            double smallerNumber = itemList[index].getWeight();
            itemList[index] = itemList[i];
            itemList[i].setWeight(smallerNumber);

        }

        return itemList;
    }

    public static Item[] createItemList() {
        //create array(list) of items lists
        Item[] items = new Item[20];

        Item rice = new Item();
        rice.setItemType("Rice");
        rice.setAvailableQuantity(0);
        rice.setRequiredAmount(0);
        rice.setWeight(7.5);
        items[ItemIndex.rice.ordinal()] = rice;

        Item bread = new Item();
        bread.setItemType("Bread");
        bread.setAvailableQuantity(0);
        bread.setRequiredAmount(0);
        bread.setWeight(2);
        items[ItemIndex.bread.ordinal()] = bread;

        Item water = new Item();
        water.setItemType("Water");
        water.setAvailableQuantity(0);
        water.setRequiredAmount(0);
        water.setWeight(4);
        items[ItemIndex.water.ordinal()] = water;
        
        Item apples = new Item();
        apples.setItemType("Apples");
        apples.setAvailableQuantity(8);
        apples.setRequiredAmount(0);
        apples.setWeight(2.5);
        items[ItemIndex.apples.ordinal()] = apples;
        
        Item bakedBeans = new Item();
        bakedBeans.setItemType("Baked Beans");
        bakedBeans.setAvailableQuantity(5);
        bakedBeans.setRequiredAmount(0);
        bakedBeans.setWeight(6);
        items[ItemIndex.bakedBeans.ordinal()] = bakedBeans;
        
        Item avacado = new Item();
        avacado.setItemType("Avacado");
        avacado.setAvailableQuantity(3);
        avacado.setRequiredAmount(0);
        avacado.setWeight(1.5);
        items[ItemIndex.avacado.ordinal()] = avacado;
        
        Item buritto = new Item();
        buritto.setItemType("Buritto");
        buritto.setAvailableQuantity(9);
        buritto.setRequiredAmount(0);
        buritto.setWeight(6.5);
        items[ItemIndex.buritto.ordinal()] = buritto;
        
        Item cereal = new Item();
        cereal.setItemType("Cereal");
        cereal.setAvailableQuantity(2);
        cereal.setRequiredAmount(0);
        cereal.setWeight(3.5);
        items[ItemIndex.cereal.ordinal()] = cereal;
        
        Item hotDogs = new Item();
        hotDogs.setItemType("Hot Dogs");
        hotDogs.setAvailableQuantity(10);
        hotDogs.setRequiredAmount(0);
        hotDogs.setWeight(7.2);
        items[ItemIndex.hotDogs.ordinal()] = hotDogs;
        
        Item Noodles = new Item();
        Noodles.setItemType("Noodles");
        Noodles.setAvailableQuantity(5);
        Noodles.setRequiredAmount(0);
        Noodles.setWeight(2.7);
        items[ItemIndex.Noodles.ordinal()] = Noodles;
        
        Item Walnuts = new Item();
        Walnuts.setItemType("Walnuts");
        Walnuts.setAvailableQuantity(1);
        Walnuts.setRequiredAmount(0);
        Walnuts.setWeight(4.5);
        items[ItemIndex.Walnuts.ordinal()] = Walnuts;
        
         Item Oatmeal = new Item();
        Oatmeal.setItemType("Oatmeal");
        Oatmeal.setAvailableQuantity(1);
        Oatmeal.setRequiredAmount(0);
        Oatmeal.setWeight(5.5);
        items[ItemIndex.Oatmeal.ordinal()] = Oatmeal;
        
         Item Amitiza = new Item();
        Amitiza.setItemType("Amitiza");
        Amitiza.setAvailableQuantity(2);
        Amitiza.setRequiredAmount(0);
        Amitiza.setWeight(4);
        items[ItemIndex.Amitiza.ordinal()] = Amitiza;
        
         Item PainKiller = new Item();
        PainKiller.setItemType("PainKiller");
        PainKiller.setAvailableQuantity(3);
        PainKiller.setRequiredAmount(0);
        PainKiller.setWeight(4.7);
        items[ItemIndex.PainKiller.ordinal()] = PainKiller;
        
         Item Amitriptyline = new Item();
        Amitriptyline.setItemType("Amitriptyline");
        Amitriptyline.setAvailableQuantity(2);
        Amitriptyline.setRequiredAmount(0);
        Amitriptyline.setWeight(4.2);
        items[ItemIndex.Amitriptyline.ordinal()] = Amitriptyline;
        
         Item Bepridil = new Item();
        Bepridil.setItemType("Bepridil");
        Bepridil.setAvailableQuantity(5);
        Bepridil.setRequiredAmount(0);
        Bepridil.setWeight(1.9);
        items[ItemIndex.Bepridil.ordinal()] = Bepridil;
        
        
         Item Beractant = new Item();
        Beractant.setItemType("Beractant");
        Beractant.setAvailableQuantity(9);
        Beractant.setRequiredAmount(0);
        Beractant.setWeight(1.9);
        items[ItemIndex.Beractant.ordinal()] = Beractant;
        
        
         Item Garlic = new Item();
        Garlic.setItemType("Garlic");
        Garlic.setAvailableQuantity(0);
        Garlic.setRequiredAmount(0);
        Garlic.setWeight(4.9);
        items[ItemIndex.Garlic.ordinal()] = Garlic;
        
        Item Cheese = new Item();
        Cheese.setItemType("Cheese");
        Cheese.setAvailableQuantity(2);
        Cheese.setRequiredAmount(0);
        Cheese.setWeight(5.1);
        items[ItemIndex.Cheese.ordinal()] = Cheese;
        
        Item Butter = new Item();
        Butter.setItemType("Butter");
        Butter.setAvailableQuantity(5);
        Butter.setRequiredAmount(0);
        Butter.setWeight(6.8);
        items[ItemIndex.Butter.ordinal()] = Butter;
        
        

        return items;
    }

    public static void saveGame(Game currentGame, String filePath) 
//        System.out.println("\n***saveExistingGame function called");

        throws GameControlException{
        
        try(FileOutputStream fops = new FileOutputStream(filePath)){
            ObjectOutputStream output  = new ObjectOutputStream(fops);
            
            output.writeObject(currentGame); //wirts the game object out to a file
        } catch(Exception e){
                    throw new GameControlException(e.getMessage());
                    }
        }
    

    public static void getSavedGame(String filePath)
            throws GameControlException {
        Game game = null;
        try (FileInputStream fips = new FileInputStream(filePath)) {
            ObjectInputStream input = new ObjectInputStream(fips);

            game = (Game) input.readObject(); //reads the game object from file
        } 
catch (Exception e) {
            throw new GameControlException(e.getMessage());
        }
    
    //close the output file
    TeamSurvival.setCurrentGame(game); //save in Team survival
}

}
