package Main;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.ChoiceBox;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import java.awt.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Controller {
    private static final double Cola = 2.50;
    private static final double Sprite = 1.00;
    private static final double Wine = 7.82;
    private static final double Whiskey = 12.00;
    private static final double Chocolate = 0.55;
    private static final double Bread = 1.50;
    private static final double PorkSteak = 8.50;
    private static final double Chips = 1.20;
    private static final double Donuts = 3.25;
    private static final double Pizza = 10.12;

    @FXML
    private Label orderedProducts;

    @FXML
    private TextField qtField;

    @FXML
    private ChoiceBox<String> prodList = new ChoiceBox<>();

    ObservableList<String> productsListed = FXCollections.observableArrayList("Choose product...", "Cola", "Sprite", "Wine",
            "Whiskey", "Chocolate", "Bread", "Pork Steak", "Chips", "Donuts", "Pizza");

    public Controller() throws FileNotFoundException {
    }

    @FXML
    private void initialize() {
        prodList.setValue("Choose product...");
        prodList.setItems(productsListed);
    }

    private static ArrayList<Double> itemsOrdered = new ArrayList<Double>();

        int value1;
        String productChosen;

        public void howMany (){

            //get value from the Qt text field.
            value1 = Integer.valueOf(qtField.getText());

            while (value1==(int)value1&&value1>0){

                System.out.println();
                System.out.println("Please input a number!!!");
                //set value of the label Ordered Items.
                getChoice(prodList);
                orderedProducts.setText("YOU ORDER:\n" + Integer.toString(value1) + " pc. of " + productChosen);
                howMany();

            }

        }

    private void getChoice(ChoiceBox < String > prodList){
            productChosen = prodList.getValue();
            /*switch (productChosen) {
                case "Cola 2.50$": {
                    break;
                }
                case "Sprite 1.00$": {
                    break;
                }
                case "Wine 7.82$": {
                    break;
                }
                case "Whiskey 12.00$": {
                    break;
                }
                case "Chocolate 0.55$": {
                    break;
                }
                case "Bread 1.50$": {
                    break;
                }
                case "Pork Steak 8.50$": {
                    break;
                }
                case "Chips 1.20$": {
                    //System.out.println();
                    //System.out.println("You have ordered Chips. " + "\n");
                    //How_many_items(Chips);
                    //Yes_No();
                    break;
                }
                case "Donuts 3.25$": {
                    break;
                }
                case "Pizza 10.12$": {
                    break;
                }
            }*/
        }
}

