package ku.cs.lab03;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import ku.cs.services.FXRouter;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXRouter.bind(this, stage, "", 800, 600);
        configRoute();
        // FXRouter.goTo("hello");
        FXRouter.goTo("students-table");
    }
    public static void configRoute() {
        String viewPath = "ku/cs/views/";
        FXRouter.when("students-table", viewPath + "students-table.fxml");
        FXRouter.when("student-list", viewPath + "student-list.fxml");
        FXRouter.when("hello", viewPath + "hello-view.fxml");
    }
    public static void main(String[] args) {
        launch();
    }
}