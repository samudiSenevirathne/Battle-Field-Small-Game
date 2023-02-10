import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class WelcomeFormController{

    public AnchorPane welcomePageId;
    @FXML
    private ImageView imageId;

    public void initialize(){
        System.out.println(imageId.getImage());
    }

    public void startGameOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage =(Stage) welcomePageId.getScene().getWindow();
        stage.setScene(new Scene
                (FXMLLoader.load(getClass().getResource("NextForm.fxml"))));
        stage.centerOnScreen();
    }
}
