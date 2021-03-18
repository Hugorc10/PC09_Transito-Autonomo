package view;

import controller.MediaControl;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.media.Media;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

import java.net.URL;

/**
 * Classe responsavel por criar os elementos graficos do controle de velocidade
 * e botoes de play, pause e stop para a musica
 */
public class ControlsView {
    
    private static final String RICK_AND_MORTY_SONG_PATH = "/audios/rick-and-morty-evil-morty-theme-song.wav";
    
    public static Slider rickSpeedSld;
    public static Slider summerSpeedSld;
    public static Slider bethSpeedSld;
    public static Slider jerrySpeedSld;
    public static Slider mortySpeedSld;
    
    public void display() {
        Stage window = new Stage();
        Group root = new Group();
        Scene scene = new Scene(root, 400, 370);
        
        window.setTitle("Controls");
        window.setX(960);
        window.setY(200);
        
        final URL rickAndMortyThemeResource = getClass().getResource(RICK_AND_MORTY_SONG_PATH);
        
        // classes responsaveis por manipular o audio
        Media media = null;
        try {
            media = new Media(rickAndMortyThemeResource.toURI().toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    
        MediaControl mediaControl = new MediaControl(media);
        
        // Simbolo de '-'
        Label[] lessSymbolLbl = new Label[5];
        for (int i = 0; i < lessSymbolLbl.length; i++) {
            lessSymbolLbl[i] = new Label("-");
            lessSymbolLbl[i].setFont(Font.font("Verdana", FontWeight.BOLD, 30));
            lessSymbolLbl[i].setTextFill(Color.BLACK);
            lessSymbolLbl[i].setTranslateY(-10);
        }
        
        // Simbolo de '+'
        Label[] moreSymbolLbl = new Label[5];
        for (int i = 0; i < moreSymbolLbl.length; i++) {
            moreSymbolLbl[i] = new Label("+");
            moreSymbolLbl[i].setFont(Font.font("Verdana", FontWeight.BOLD, 30));
            moreSymbolLbl[i].setTextFill(Color.BLACK);
            moreSymbolLbl[i].setTranslateY(-10);
        }
        
        /*****************************************************/
        
        // BorderPane com elementos de controle e imagens do Rick
        BorderPane rickBorderPane = new BorderPane();
        rickBorderPane.setPadding(new Insets(0, 5, 10, 0));
        
        Text rickTxt = new Text("Rick's speed control");
        rickTxt.setTextAlignment(TextAlignment.CENTER);
        rickTxt.setFont(Font.font("Verdana", FontWeight.BOLD, 17));
        
        // Slider de velocidade do Rick
        rickSpeedSld = new Slider(0, 99, 95);
        rickSpeedSld.setOrientation(Orientation.HORIZONTAL);
        rickSpeedSld.getStylesheets().add(getClass().getResource("/css/slider.css").toExternalForm());
        rickSpeedSld.setMaxWidth(Region.USE_PREF_SIZE);
        rickSpeedSld.setPrefWidth(380);
        rickSpeedSld.setShowTickLabels(true);
        rickSpeedSld.setShowTickMarks(true);
        rickSpeedSld.setMajorTickUnit(20);
        rickSpeedSld.setMinorTickCount(3);
        
        // imagem da rota do Rick
        ImageView rickRoute = buildImage("/img/routes/route20.png", 180);
        
        // imagem do busto do Rick
        ImageView rickView = buildImage("/img/tabs/rick.png", 180);
        
        HBox hBoxBottom1 = new HBox(30);
        hBoxBottom1.setAlignment(Pos.BASELINE_CENTER);
        hBoxBottom1.getChildren().addAll(rickRoute, rickView);
    
        // Adiciona os elementos do HBox e VBox em um BorberPane
        rickBorderPane.setTop(vBoxTop(lessSymbolLbl[0], rickSpeedSld, moreSymbolLbl[0], rickTxt));
        rickBorderPane.setBottom(hBoxBottom1);
        
        /*************************************************/
        
        // BorderPane com elementos de controle e imagens do Rick
        BorderPane summerBorderPane = new BorderPane();
        summerBorderPane.setPadding(new Insets(0, 5, 10, 0));
        
        Text summerTxt = new Text("Summer's speed control");
        summerTxt.setTextAlignment(TextAlignment.CENTER);
        summerTxt.setFont(Font.font("Verdana", FontWeight.BOLD, 17));
        
        // Slider de velocidade da Summer
        summerSpeedSld = new Slider(0, 99, 95);
        summerSpeedSld.getStylesheets().add(getClass().getResource("/css/slider.css").toString());
        summerSpeedSld.setOrientation(Orientation.HORIZONTAL);
        summerSpeedSld.setMaxWidth(Region.USE_PREF_SIZE);
        summerSpeedSld.setPrefWidth(380);
        summerSpeedSld.setShowTickLabels(true);
        summerSpeedSld.setShowTickMarks(true);
        summerSpeedSld.setMajorTickUnit(20);
        summerSpeedSld.setMinorTickCount(3);
        
        // Imagem da rota da Summer
        ImageView summerRoute = buildImage("/img/routes/route1.png", 180);
        
        // Imagem do busto da Summer
        ImageView summerView = buildImage("/img/tabs/summer.png", 180);
        
        HBox hBoxBottom2 = new HBox(50);
        hBoxBottom2.setAlignment(Pos.BASELINE_CENTER);
        hBoxBottom2.getChildren().addAll(summerRoute, summerView);
    
        // Adiciona os elementos do HBox e VBox em um BorberPane
        summerBorderPane.setTop(vBoxTop(lessSymbolLbl[1], summerSpeedSld, moreSymbolLbl[1], summerTxt));
        summerBorderPane.setBottom(hBoxBottom2);
        
        /****************************************************/
        
        // BorderPane com elementos de controle e imagens da Beth
        BorderPane bethBorderPane = new BorderPane();
        bethBorderPane.setPadding(new Insets(0, 5, 10, 0));
        
        Text bethTxt = new Text("Beth's speed control");
        bethTxt.setTextAlignment(TextAlignment.CENTER);
        bethTxt.setFont(Font.font("Verdana", FontWeight.BOLD, 17));
        
        // Slider de velocidade da Beth
        bethSpeedSld = new Slider(0, 99, 95);
        bethSpeedSld.getStylesheets().add(getClass().getResource("/css/slider.css").toString());
        bethSpeedSld.setOrientation(Orientation.HORIZONTAL);
        bethSpeedSld.setMaxWidth(Region.USE_PREF_SIZE);
        bethSpeedSld.setPrefWidth(380);
        bethSpeedSld.setShowTickLabels(true);
        bethSpeedSld.setShowTickMarks(true);
        bethSpeedSld.setMajorTickUnit(20);
        bethSpeedSld.setMinorTickCount(3);
        
        // imagem da rota da Beth
        ImageView bethRoute = buildImage("/img/routes/route11.png", 180);
        
        // imagem do busto da Beth
        ImageView bethView = buildImage("/img/tabs/beth.png", 180);
        
        // adiciona elementos na parte inferior da cena
        HBox hBoxBottom3 = new HBox(50);
        hBoxBottom3.setAlignment(Pos.CENTER);
        hBoxBottom3.getChildren().addAll(bethRoute, bethView);
        
        // Adiciona os elementos do HBox e VBox em um BorberPane
        bethBorderPane.setTop(vBoxTop(lessSymbolLbl[2], bethSpeedSld, moreSymbolLbl[2], bethTxt));
        bethBorderPane.setBottom(hBoxBottom3);
        
        /***********************************************************/
        
        // BorderPane com elementos de controle e imagens do Jerry
        BorderPane jerryBorderPane = new BorderPane();
        jerryBorderPane.setPadding(new Insets(0, 5, 10, 0));
        
        Text jerryTxt = new Text("Jerry's speed control");
        jerryTxt.setTextAlignment(TextAlignment.CENTER);
        jerryTxt.setFont(Font.font("Verdana", FontWeight.BOLD, 17));
        
        // Slider de velocidade de Jerry
        jerrySpeedSld = new Slider(0, 99, 95);
        jerrySpeedSld.setOrientation(Orientation.HORIZONTAL);
        jerrySpeedSld.getStylesheets().add(getClass().getResource("/css/slider.css").toString());
        jerrySpeedSld.setMaxWidth(Region.USE_PREF_SIZE);
        jerrySpeedSld.setPrefWidth(380);
        jerrySpeedSld.setShowTickLabels(true);
        jerrySpeedSld.setShowTickMarks(true);
        jerrySpeedSld.setMajorTickUnit(20);
        jerrySpeedSld.setMinorTickCount(3);
        
        // imagem da rota do Jerry
        ImageView jerryRoute = buildImage("/img/routes/route7.png", 180);
        
        // imagem do busto do Jerry
        ImageView jerryView = buildImage("/img/tabs/jerry.png", 180);
        
        HBox hboxBottom4 = new HBox(30);
        hboxBottom4.setAlignment(Pos.CENTER);
        hboxBottom4.getChildren().addAll(jerryRoute, jerryView);
    
        // Adiciona os elementos do HBox e VBox em um BorberPane
        jerryBorderPane.setTop(vBoxTop(lessSymbolLbl[3], jerrySpeedSld, moreSymbolLbl[3], jerryTxt));
        jerryBorderPane.setBottom(hboxBottom4);
        
        /*****************************************************/
        
        // BorderPane com elementos de controle e imagens do Morty
        BorderPane mortyBorderPane = new BorderPane();
        mortyBorderPane.setPadding(new Insets(0, 5, 10, 0));
        
        Text mortyTxt = new Text("Morty's speed control");
        mortyTxt.setTextAlignment(TextAlignment.CENTER);
        mortyTxt.setFont(Font.font("Verdana", FontWeight.BOLD, 17));
        
        // Slider de velocidade do Morty
        mortySpeedSld = new Slider(0, 99, 95);
        mortySpeedSld.setOrientation(Orientation.HORIZONTAL);
        mortySpeedSld.getStylesheets().add(getClass().getResource("/css/slider.css").toString());
        mortySpeedSld.setMaxWidth(Region.USE_PREF_SIZE);
        mortySpeedSld.setPrefWidth(380);
        mortySpeedSld.setShowTickLabels(true);
        mortySpeedSld.setShowTickMarks(true);
        mortySpeedSld.setMajorTickUnit(20);
        mortySpeedSld.setMinorTickCount(3);
        
        // imagem da rota do Morty
        ImageView mortyRoute = buildImage("/img/routes/route16.png", 180);
        
        // imagem do busto do Morty
        ImageView mortyView = buildImage("/img/tabs/morty.png", 180);
        
        HBox hboxBottom5 = new HBox(60);
        hboxBottom5.setAlignment(Pos.CENTER);
        hboxBottom5.getChildren().addAll(mortyRoute, mortyView);
        
        // Adiciona os elementos do HBox e VBox em um BorberPane
        mortyBorderPane.setTop(vBoxTop(lessSymbolLbl[4], mortySpeedSld, moreSymbolLbl[4], mortyTxt));
        mortyBorderPane.setBottom(hboxBottom5);
        
        /************************************************/
        
        // pane contendo os tabs do todos os personagens
        TabPane tabPane = new TabPane();
        
        Image backgroundImg = new Image(getClass().getResourceAsStream("/img/ground/controlsBackground.png"));
    
        BackgroundSize backgroundSize = new BackgroundSize(400, 370,
                true, true, true, false);
    
        BackgroundImage backgroundImage = new BackgroundImage(backgroundImg, BackgroundRepeat.NO_REPEAT,
                BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, backgroundSize);
    
        Background background = new Background(backgroundImage);
        
        tabPane.setBackground(background);
        
        Tab rickTab = new Tab("Rick");
        rickTab.setGraphic(buildImage("/img/tabs/rick-face.png", 20));
        rickTab.setContent(rickBorderPane);
        
        Tab summerTab = new Tab("Summer");
        summerTab.setGraphic(buildImage("/img/tabs/summer-face.png", 20));
        summerTab.setContent(summerBorderPane);
        
        Tab bethTab = new Tab("Beth");
        bethTab.setGraphic(buildImage("/img/tabs/beth-face.png", 20));
        bethTab.setContent(bethBorderPane);
        
        Tab jerryTab = new Tab("Jerry");
        jerryTab.setGraphic(buildImage("/img/tabs/jerry-face.png", 20));
        jerryTab.setContent(jerryBorderPane);
        
        Tab mortyTab = new Tab("Morty");
        mortyTab.setGraphic(buildImage("/img/tabs/morty-face.png", 20));
        mortyTab.setContent(mortyBorderPane);
        
        // evita que os tabs possam ser fechados
        tabPane.setTabClosingPolicy(TabPane.TabClosingPolicy.UNAVAILABLE);
        tabPane.prefWidthProperty().bind(scene.widthProperty());
        tabPane.prefHeightProperty().bind(scene.heightProperty());
        tabPane.getTabs().addAll(rickTab, summerTab, bethTab, jerryTab, mortyTab);
        
        // set a posicao vertical do HBox com os controles do audio
        mediaControl.setLayoutY(118);
        root.getChildren().addAll(tabPane, mediaControl);
        
        window.setScene(scene);
        window.setResizable(false);
        window.show();
    }
    
    /**
     * Trata e especifica a imagem que sera usada
     *
     * @param path   O caminho da imagem
     * @param height o altura que a imagem tera
     * @return A ImageView tratada
     */
    private static ImageView buildImage(String path, int height) {
        Image image = new Image(path);
        
        ImageView imageView = new ImageView(image);
        imageView.setCache(true);
        imageView.setSmooth(true);
        imageView.setPreserveRatio(true);
        imageView.setFitHeight(height);
        return imageView;
    }
    
    /**
     * Trata e adiciona especificados a um VBox que ira ficar no topo
     *
     * @param element1 Label generico que sera adicionado a um HBox
     * @param speedSld Slider do personagem especificado
     * @param element2 Label generico que sera adiciona a um HBox
     * @param titleTxt Titulo que ficara em cima do Slider
     * @return
     */
    private VBox vBoxTop(Label element1, Slider speedSld, Label element2, Text titleTxt) {
        HBox hBoxTop = new HBox(5);
        hBoxTop.setPadding(new Insets(10, 0, 0, 0));
        hBoxTop.setAlignment(Pos.BASELINE_CENTER);
        hBoxTop.getChildren().addAll(element1, speedSld, element2);
        
        VBox vBoxTop = new VBox();
        vBoxTop.setAlignment(Pos.CENTER);
        vBoxTop.setPadding(new Insets(10, 0, 0, 10));
        vBoxTop.getChildren().addAll(titleTxt, hBoxTop);
        
        return vBoxTop;
    }
} // fim da classe ControlsView
