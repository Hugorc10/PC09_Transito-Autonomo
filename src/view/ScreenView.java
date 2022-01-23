package view;

import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;

/**
 * Tela principal com uma imagem como background
 */
public class ScreenView {
    
    public static ImageView bethView;
    public static ImageView jerryView;
    public static ImageView mortyView;
    public static ImageView rickView;
    public static ImageView summerView;
    public static Button startBtn;
    public static ImageView arrowView;
    
    public Parent createContent() {
        Pane canvas = new Pane();
        // o tamanho do painel que ira guardar o background
        canvas.setMaxSize(1000, 698);
        canvas.setPrefSize(1000, 698);
        
        // imagem do background
        Image backgroundImg = new Image(getClass().getResourceAsStream("/img/ground/background.jpg"));
        
        BackgroundSize backgroundSize = new BackgroundSize(1000, 698,
                true, true, true, false);
        
        BackgroundImage backgroundImage = new BackgroundImage(backgroundImg, BackgroundRepeat.NO_REPEAT,
                BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, backgroundSize);
        
        Background background = new Background(backgroundImage);
        
        canvas.setBackground(background);
        
        // gif do portal
        Image portalImg = new Image("/img/ground/portal.gif", true);
        
        ImageView portalView = new ImageView(portalImg);
        portalView.setCache(true);
        portalView.setSmooth(true);
        portalView.setPreserveRatio(true);
        portalView.setFitHeight(90);
        portalView.setX(722);
        portalView.setY(284);
        
        // gif do mr meeseks
        Image meeseeksImg = new Image("/img/ground/meeseeks.gif", true);
        
        ImageView meeseeksView = new ImageView(meeseeksImg);
        meeseeksView.setCache(true);
        meeseeksView.setSmooth(true);
        meeseeksView.setPreserveRatio(true);
        meeseeksView.setFitHeight(85);
        meeseeksView.setX(876);
        meeseeksView.setY(494);
        
        // imagem da seta
        Image arrowImg = new Image("/img/button/arrow.png", true);
        
        arrowView = new ImageView(arrowImg);
        arrowView.setCache(true);
        arrowView.setSmooth(true);
        arrowView.setPreserveRatio(true);
        arrowView.setFitWidth(100);
        arrowView.setX(450);
        arrowView.setLayoutY(160);
        
        // imagem do botao de play
        Image playImg = new Image("/img/button/play-button.png", true);
        
        BackgroundImage backgroundImageBtn = new BackgroundImage(playImg, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT,
                BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
        Background backgroundBtn = new Background(backgroundImageBtn);
        
        startBtn = new Button();
        startBtn.setBackground(backgroundBtn);
        startBtn.setPrefSize(250, 88);
        startBtn.setDefaultButton(true);
        startBtn.setLayoutX(380);
        startBtn.setLayoutY(295);
        
        Image frontBethImg = new Image("/img/gifs/beth1.gif", true);
        
        bethView = new ImageView(frontBethImg);
        bethView.setCache(true);
        bethView.setSmooth(true);
        bethView.setPreserveRatio(true);
        bethView.setFitHeight(60);
        bethView.setVisible(false);
        
        Image frontJerryImg = new Image("/img/gifs/jerry1.gif", true);
        
        jerryView = new ImageView(frontJerryImg);
        jerryView.setCache(true);
        jerryView.setSmooth(true);
        jerryView.setPreserveRatio(true);
        jerryView.setFitHeight(60);
        jerryView.setVisible(false);
        
        Image frontMortyImg = new Image("/img/gifs/morty1.gif", true);
        
        mortyView = new ImageView(frontMortyImg);
        mortyView.setCache(true);
        mortyView.setSmooth(true);
        mortyView.setPreserveRatio(true);
        mortyView.setFitHeight(60);
        mortyView.setVisible(false);
        
        Image frontSummerImg = new Image("/img/gifs/summer1.gif", true);
        
        summerView = new ImageView(frontSummerImg);
        summerView.setCache(true);
        summerView.setSmooth(true);
        summerView.setPreserveRatio(true);
        summerView.setFitHeight(60);
        summerView.setVisible(false);
        
        Image frontRickImg = new Image("/img/gifs/rick1.gif", true);
        
        rickView = new ImageView(frontRickImg);
        rickView.setCache(true);
        rickView.setSmooth(true);
        rickView.setPreserveRatio(true);
        rickView.setFitHeight(60);
        rickView.setVisible(false);
        
        canvas.getChildren().addAll(startBtn, arrowView, portalView, meeseeksView,
                bethView, jerryView, mortyView, rickView, summerView);
        
        return canvas;
    }
}
