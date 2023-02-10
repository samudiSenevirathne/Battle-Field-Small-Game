import javafx.beans.binding.Bindings;
import javafx.beans.binding.IntegerBinding;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.ObservableSet;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;

public class NextFormController {

    public AnchorPane nextPageId;

    public AnchorPane playerAId;
    public CheckBox t56IdA;
    public CheckBox tankIdA;
    public CheckBox multiBarrelIdA;
    public CheckBox pistolIdA;
    public CheckBox bombIdA;

    public AnchorPane playerBId;
    public CheckBox t56IdB;
    public CheckBox tankIdB;
    public CheckBox multiBarrelIdB;
    public CheckBox pistolIdB;
    public CheckBox bombIdB;

    public Button startGameId;


  /*  public static ArrayList<String> arrayListA = new ArrayList<>();

    public static ArrayList<String> arrayListB = new ArrayList<>();*/

    ArrayList<Integer> arrayListA = new ArrayList<>();
    ArrayList<Integer> arrayListB = new ArrayList<>();

   /* ObservableList<Integer> arrayListA= FXCollections.observableArrayList();
    ObservableList<Integer> arrayListB= FXCollections.observableArrayList();*/

    public AnchorPane tempAnchorId;

    public void PlayerAOnAction(MouseEvent mouseEvent) {
    }

    public void playerBOnAction(MouseEvent mouseEvent) {
    }

   /* private ObservableSet<CheckBox> selectedCheckBoxes = FXCollections.observableSet();
    private ObservableSet<CheckBox> unselectedCheckBoxes = FXCollections.observableSet();

    private IntegerBinding numCheckBoxesSelected = Bindings.size(selectedCheckBoxes);


    private final int maxNumSelected = 3;

    private ObservableSet<CheckBox> selectedCheckBoxes1 = FXCollections.observableSet();
    private ObservableSet<CheckBox> unselectedCheckBoxes1 = FXCollections.observableSet();

    private IntegerBinding numCheckBoxesSelected1 = Bindings.size(selectedCheckBoxes1);


    private final int maxNumSelected1 = 3;*/

    int count = 0;
    int count1 = 0;
    T56 t56 = new T56();
    Tank tank = new Tank();
    Bomb bomb = new Bomb();
    MultiBarrel multiBarrel = new MultiBarrel();
    Pistol pistol = new Pistol();

    public void initialize() {


        startGameId.setDisable(true);


       /* configureCheckBox1(t56IdA,"T-56");
        configureCheckBox1(tankIdA,"Tank");
        configureCheckBox1(multiBarrelIdA,"MultiBarrel");
        configureCheckBox1(pistolIdA,"Pistol");
        configureCheckBox1(bombIdA,"Bomb");

          startGameId.setDisable(true);
          numCheckBoxesSelected.addListener((obs, oldSelectedCount, newSelectedCount) -> {
              if (newSelectedCount.intValue() >= maxNumSelected) {
                  unselectedCheckBoxes.forEach(cb -> cb.setDisable(true));
                  startGameId.setDisable(false);


              } else {
                  unselectedCheckBoxes.forEach(cb -> cb.setDisable(false));
                  startGameId.setDisable(true);

              }
          });

        configureCheckBox2(t56IdB,"T-56");
        configureCheckBox2(tankIdB,"Tank");
        configureCheckBox2(multiBarrelIdB,"MultiBarrel");
        configureCheckBox2(pistolIdB,"Pistol");
        configureCheckBox2(bombIdB,"Bomb");

        numCheckBoxesSelected1.addListener((obs, oldSelectedCount, newSelectedCount) -> {
            if (newSelectedCount.intValue() >= maxNumSelected1) {
                unselectedCheckBoxes1.forEach(cb -> cb.setDisable(true));
                startGameId.setDisable(false);


            } else {
                unselectedCheckBoxes1.forEach(cb -> cb.setDisable(false));
                startGameId.setDisable(true);

            }
        });*/


    }

        public void t56AOnAction (ActionEvent actionEvent){
            if(count<3) {
                if (t56IdA.isSelected()) {
                    t56.shoot();
                    arrayListA.add(t56.getScore());
                    count++;
                    if (t56IdA.isSelected()) {
                        arrayListA.remove(count-1);
                        count--;
                    }
                }
            }else if(count==3){
                t56IdA.setDisable(true);
            }
            VisibalOrNot();
    }


    public void tankAOnAction(ActionEvent actionEvent) {

        if(count<3) {
            if (tankIdA.isSelected()) {
                tank.shoot();
                arrayListA.add(tank.getScore());
                count++;
                if (!tankIdA.isSelected()) {
                    arrayListA.remove(tank.getScore());
                    count--;
                }
            }
        }else if(count==3){
            tankIdA.setDisable(true);
        }
        VisibalOrNot();
    }

    public void multiBarrelAOnAction(ActionEvent actionEvent) {

        if(count<3) {
            if (multiBarrelIdA.isSelected()) {
                multiBarrel.shoot();
                arrayListA.add(multiBarrel.getScore());
                count++;
                if (!multiBarrelIdA.isSelected()) {
                    arrayListA.remove(multiBarrel.getScore());
                    count--;
                }
            }
        }else if(count==3){
            multiBarrelIdA.setDisable(true);
        }
        VisibalOrNot();
    }

    public void pistolAOnAction(ActionEvent actionEvent) {

        if(count<3) {
            if (pistolIdA.isSelected()) {
                pistol.shoot();
                arrayListA.add(pistol.getScore());
                count++;
                if (!pistolIdA.isSelected()) {
                    arrayListA.remove(pistol.getScore());
                    count--;
                }
            }
        }else if(count==3){
            pistolIdA.setDisable(true);
        }
        VisibalOrNot();
    }

    public void bombAOnAction(ActionEvent actionEvent) {

        if(count<3) {
            if (bombIdA.isSelected()) {
                bomb.shoot();
                arrayListA.add(bomb.getScore());
                count++;
                if (!bombIdA.isSelected()) {
                    arrayListA.remove(bomb.getScore());
                    count--;
                }
            }
        }else if(count==3){
            bombIdA.setDisable(true);
        }
        VisibalOrNot();
    }

    public void t56BOnAction(ActionEvent actionEvent) {

        if(count1<3) {
            if (t56IdB.isSelected()) {
                t56.shoot();
                arrayListB.add(t56.getScore());
                count1++;
                if (!t56IdB.isSelected()) {
                    arrayListB.remove(t56.getScore());
                    count1--;
                }
            }
        }else if(count1==3){
            t56IdB.setDisable(true);
        }
        VisibalOrNot();
    }

    public void tankBOnAction(ActionEvent actionEvent) {

        if(count1<3) {
            if (tankIdB.isSelected()) {
                tank.shoot();
                arrayListB.add(tank.getScore());
                count1++;
                if (!tankIdB.isSelected()) {
                    arrayListB.remove(tank.getScore());
                    count1--;
                }
            }
        }else if(count1==3){
            tankIdB.setDisable(true);
        }
        VisibalOrNot();
    }

    public void multiBarrelBOnAction(ActionEvent actionEvent) {

        if(count1<3) {
            if (multiBarrelIdB.isSelected()) {
                multiBarrel.shoot();
                arrayListB.add(multiBarrel.getScore());
                count1++;
                if (!multiBarrelIdB.isSelected()) {
                    arrayListB.remove(multiBarrel.getScore());
                    count1--;
                }
            }
        }else if(count1==3){
            multiBarrelIdB.setDisable(true);
        }
        VisibalOrNot();
    }

    public void pistolBOnAction(ActionEvent actionEvent) {

        if(count1<3) {
            if (pistolIdB.isSelected()) {
                pistol.shoot();
                arrayListB.add(pistol.getScore());
                count1++;
                if (!pistolIdB.isSelected()) {
                    arrayListB.remove(pistol.getScore());
                    count1--;
                }
            }
        }else if(count1==3){
            pistolIdB.setDisable(true);
        }
        VisibalOrNot();
    }

    public void bombBOnAction(ActionEvent actionEvent) {

        if(count1<3) {
            if (bombIdB.isSelected()) {
                bomb.shoot();
                arrayListB.add(bomb.getScore());
                count1++;
                if (!bombIdB.isSelected()) {
                    arrayListB.remove(bomb.getScore());
                    count1--;
                }
            }
        }else if(count1==3){
            bombIdB.setDisable(true);
        }
        VisibalOrNot();
    }


    public void VisibalOrNot(){
        if(count==3 && count1==3){
            startGameId.setDisable(false);
        }else{
            startGameId.setDisable(true);
        }
    }


      /*  private void configureCheckBox1 (CheckBox checkBox,String string){

        if (checkBox.isSelected()) {
            selectedCheckBoxes.add(checkBox);
            arrayListA.add(string);

        } else {
            unselectedCheckBoxes.add(checkBox);
            arrayListA.add(string);

        }

        checkBox.selectedProperty().addListener((obs, wasSelected, isNowSelected) -> {
            if (isNowSelected) {
                unselectedCheckBoxes.remove(checkBox);
                arrayListA.remove(string);

                selectedCheckBoxes.add(checkBox);
                arrayListA.add(string);

            } else {
                selectedCheckBoxes.remove(checkBox);
                arrayListA.remove(string);

                unselectedCheckBoxes.add(checkBox);
                arrayListA.add(string);

            }

        });

    }

    private void configureCheckBox2 (CheckBox checkBox,String string){

        if (checkBox.isSelected()) {
            selectedCheckBoxes1.add(checkBox);
            arrayListB.add(string);

        } else {
            unselectedCheckBoxes1.add(checkBox);
            arrayListB.add(string);
        }

        checkBox.selectedProperty().addListener((obs, wasSelected, isNowSelected) -> {
            if (isNowSelected) {
                unselectedCheckBoxes1.remove(checkBox);
                arrayListB.remove(string);

                selectedCheckBoxes1.add(checkBox);
                arrayListB.add(string);

            } else {
                selectedCheckBoxes1.remove(checkBox);
                arrayListB.remove(string);

                unselectedCheckBoxes1.add(checkBox);
                arrayListB.add(string);
            }

        });

    } */

        public void BattleStartOnAction (ActionEvent actionEvent) throws IOException {
            PlayerAWeponStore playerAWeponStore=new PlayerAWeponStore(arrayListA);
            PlayerBWeponStore playerBWeponStore=new PlayerBWeponStore(arrayListB);
            Stage stage =(Stage) nextPageId.getScene().getWindow();
            stage.setScene(new Scene
                    (FXMLLoader.load(getClass().getResource("ShowWinnerForm.fxml"))));
            stage.centerOnScreen();
        }


}

