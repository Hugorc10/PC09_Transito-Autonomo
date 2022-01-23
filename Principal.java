/**
 * Created by Hugo Teixeira Mafra <hugorc10@hotmail.com> on 17/10/2018. Last modification on 28/10/2018.
 * <p>
 * Enrollment number: 201611540
 * <p>
 * Rick and Morty Race Condition is inter-process communication and synchronization problem.
 * It simulates a traffic of cars (or people, as is the case of my program) that can not collide.
 * The areas that cars may collide are critical section
 * (parts of the code where two processes dispute access to a shared resource).
 * The purpose of the program is to simulate this transit avoiding that the cars chop,
 * using the special semaphore variable created by Dijlkstra.
 * <p>
 * Rick and Morty Race Condition is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * <p>
 * Rick and Morty Race Condition is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 * <p>
 * To see the GNU General Public License
 * please visit this site: <http://www.gnu.org/licenses/>.
 */

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.stage.Stage;
import model.*;
import view.ControlsView;
import view.ScreenView;

/**
 * Classe Principal
 *
 * @author Hugo Mafra
 */
public class Principal extends Application {
    
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) {
        // classe do pane principal com o background
        ScreenView sv = new ScreenView();
        Scene scene = new Scene(sv.createContent());
        
        // inicia a classe dos controles
        ControlsView controlsView = new ControlsView();
        controlsView.display();
        
        ScreenView.startBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                // seta a imagem da seta e do botao como nao visivel
                ScreenView.arrowView.setVisible(false);
                ScreenView.startBtn.setVisible(false);
                
                Beth beth = new Beth();
                Jerry jerry = new Jerry();
                Morty morty = new Morty();
                Rick rick = new Rick();
                Summer summer = new Summer();
                
                // starta a thread beth e faz com que ela morra ao fechar a aplicacao
                beth.setDaemon(true);
                beth.start();
                // starta a thread jerry e faz com que ela morra ao fechar a aplicacao
                jerry.setDaemon(true);
                jerry.start();
                // starta a thread morty e faz com que ela morra ao fechar a aplicacao
                morty.setDaemon(true);
                morty.start();
                // starta a thread summer e faz com que ela morra ao fechar a aplicacao
                summer.setDaemon(true);
                summer.start();
                // starta a thread rick e faz com que ela morra ao fechar a aplicacao
                rick.setDaemon(true);
                rick.start();
            }
        });
        
//        Stage stage = new Stage();
        primaryStage.setScene(scene);
        // titulo da janela
        primaryStage.setTitle("Rick and Morty race condition");
        primaryStage.setResizable(false);
        primaryStage.setX(0);
        primaryStage.setY(0);
        primaryStage.show();
    }
}
