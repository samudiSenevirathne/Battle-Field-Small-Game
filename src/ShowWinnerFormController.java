import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class ShowWinnerFormController{

    public AnchorPane winnerId;
    public Label labalId;
    public AnchorPane temp2AnchorId;


    PlayerAWeponStore playerAWeponStore=new PlayerAWeponStore();
    PlayerBWeponStore playerBWeponStore=new PlayerBWeponStore();
    NextFormController nextFormController=new NextFormController();

    int maxScore = playerAWeponStore.scoreCalculate();
    String maxScoreText=String.valueOf(maxScore);

             public void initialize() {
                 if (playerBWeponStore.scoreCalculate()> maxScore) {
                     maxScore = playerBWeponStore.scoreCalculate();
                      maxScoreText=String.valueOf(maxScore);
                     labalId.setText("Winner player B! Score : "+maxScoreText);
                 }else{
                     labalId.setText("Winner player A! Score : "+maxScoreText);
                 }
             }

    public void tryAgainOnAction(ActionEvent actionEvent) throws IOException {
        playerAWeponStore.arrayList.clear();
                playerBWeponStore.arrayList.clear();
        nextFormController.arrayListA.clear();
        nextFormController.arrayListB.clear();
         Stage stage =(Stage) winnerId.getScene().getWindow();
        stage.setScene(new Scene
                (FXMLLoader.load(getClass().getResource("WelcomeForm.fxml"))));
        stage.centerOnScreen();
    }
}
