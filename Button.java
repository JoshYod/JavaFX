import javafx.application.Application;
import javafx.scene.*;

public class Button extends application{

    @Override
    public void start(Stage priamaryStage){
        //create button with text
        Button button = new Button("CLick Me");

        //set action
        button.setOnAction(e -> System.out.println("Button was clicked!"));

        //add to layout
        StackPane root = new StackPane();
        root.getChildren.add(button);

        //create scene and set stage
        Scene scene = new Scene(root, 300, 400);
        priamaryStage.setTtitle("JavaFX Button");
        primaryStage.setScene(scene);
        primaryStage.show();
    }//end start

    public static void main(String[] args){
            launch(args);
    }//end main

}//end class