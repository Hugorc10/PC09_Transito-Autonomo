/**
 * Created by Hugo Teixeira Mafra <hugorc10@hotmail.com> on 17/10/2018. Last modification on 28/10/2018.
 * <br>
 * Enrollment number: 201611540
 * <br>
 * Rick and Morty Race Condition is inter-process communication and synchronization problem.
 * It simulates a traffic of cars (or people, as is the case of my program) that can not collide.
 * The areas that cars may collide are critical section
 * (parts of the code where two processes dispute access to a shared resource).
 * The purpose of the program is to simulate this transit avoiding that the cars chop,
 * using the special semaphore variable created by Dijlkstra.
 * <br>
 * MIT License
 * <br>
 * Copyright (c) 2018 Hugo Mafra
 * <br>
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * <br>
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 * <br>
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
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
