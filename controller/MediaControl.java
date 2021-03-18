package controller;

import javafx.application.Platform;
import javafx.beans.InvalidationListener;
import javafx.beans.Observable;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.Region;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.util.Duration;

/**
 * Classe responsavel por criar os elementos graficos e fazer controle do audio
 */
public class MediaControl extends HBox {
    
    private final MediaPlayer mp;
    private boolean stopRequested = false;
    private boolean atEndOfMedia = false;
    private Duration duration;
    private Slider timeSlider;
    private Label playTime;
    private CheckBox repeatBox;
    private Slider volumeSlider;
    
    public MediaControl(Media media) {
        mp = new MediaPlayer(media);
        // ira tocar assim que esta classe for instanciada
        mp.setAutoPlay(true);
        
        // tamanho do HBox
        setPrefSize(400, 40);
        setAlignment(Pos.CENTER);
        
        // botao de play
        final Button playButton = new Button();
        playButton.setStyle("-fx-background-color: transparent");
        playButton.setGraphic(buildImage("/img/song/play.png", 30));
        playButton.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                updateValues();
                MediaPlayer.Status status = mp.getStatus();
                if (status == MediaPlayer.Status.PAUSED
                        || status == MediaPlayer.Status.READY
                        || status == MediaPlayer.Status.STOPPED) {
                    if (atEndOfMedia) {
                        mp.seek(mp.getStartTime());
                        atEndOfMedia = false;
                        playButton.setGraphic(buildImage("/img/song/play.png", 30));
                        updateValues();
                    }
                    mp.play();
                    playButton.setGraphic(buildImage("/img/song/pause.png", 28));
                } else {
                    mp.pause();
                }
            }
        });
        
        mp.currentTimeProperty().addListener(new InvalidationListener() {
            
            @Override
            public void invalidated(Observable ov) {
                updateValues();
            }
        });
        
        mp.setOnPlaying(new Runnable() {
            
            public void run() {
                if (stopRequested) {
                    mp.pause();
                    stopRequested = false;
                } else {
                    playButton.setGraphic(buildImage("/img/song/pause.png", 28));
                }
            }
        });
        
        mp.setOnPaused(new Runnable() {
            
            public void run() {
                playButton.setGraphic(buildImage("/img/song/play.png", 30));
            }
        });
        
        mp.setOnReady(new Runnable() {
            
            public void run() {
                duration = mp.getMedia().getDuration();
                updateValues();
            }
        });
        
        mp.setOnEndOfMedia(new Runnable() {
            
            public void run() {
                if (repeatBox.isSelected()) {
                    mp.seek(mp.getStartTime());
                } else {
                    playButton.setGraphic(buildImage("/img/song/play.png", 30));
                    stopRequested = true;
                    atEndOfMedia = true;
                    
                    
                }
            }
        });
        this.getChildren().add(playButton);
        
        // Label indicando onde fica o slider do tempo
        Label timeLabel = new Label("Time: ");
        timeLabel.setFont(Font.font("Verdana", FontWeight.BOLD, 11));
        timeLabel.setTextFill(Color.BLACK);
        timeLabel.setMinWidth(Control.USE_PREF_SIZE);
        this.getChildren().add(timeLabel);
        
        // o slider do tempo
        timeSlider = new Slider();
        timeSlider.setMaxWidth(Double.MAX_VALUE);
        timeSlider.setMinWidth(50);
        HBox.setHgrow(timeSlider, Priority.ALWAYS);
        timeSlider.valueProperty().addListener(new InvalidationListener() {
            
            @Override
            public void invalidated(Observable ov) {
                if (timeSlider.isValueChanging()) {
                    // multiply duration by percentage calculated by slider position
                    if (duration != null) {
                        mp.seek(duration.multiply(timeSlider.getValue() / 100.0));
                    }
                    updateValues();
                }
            }
        });
        getChildren().add(timeSlider);
        
        // label que mostra o tempo
        playTime = new Label();
        playTime.setFont(Font.font("Verdana", FontWeight.BOLD, 10));
        playTime.setTextFill(Color.BLACK);
        playTime.setPrefWidth(100);
        playTime.setMinWidth(50);
        getChildren().add(playTime);
        
        // label do com o icone do volume
        Label volumeLabel = new Label();
        volumeLabel.setGraphic(buildImage("/img/song/volume.png", 30));
        volumeLabel.setMinWidth(Control.USE_PREF_SIZE);
        getChildren().add(volumeLabel);
        
        // slider do volume
        volumeSlider = new Slider();
        volumeSlider.setPrefWidth(70);
        volumeSlider.setMaxWidth(Region.USE_PREF_SIZE);
        volumeSlider.setMinWidth(30);
        volumeSlider.valueProperty().addListener(new ChangeListener<Number>() {
            
            @Override
            public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
                if (volumeSlider.isValueChanging()) {
                    mp.setVolume(volumeSlider.getValue() / 100.0);
                }
            }
        });
        getChildren().add(volumeSlider);
        
        // label com o icone de loop
        Label repeatLabel = new Label();
        repeatLabel.setGraphic(buildImage("/img/song/loop.png", 30));
        repeatLabel.setMaxWidth(Region.USE_PREF_SIZE);
        repeatLabel.setPrefWidth(30);
        repeatLabel.setMinWidth(30);
        repeatLabel.setPadding(new Insets(0, 0, 0, 5));
        getChildren().add(repeatLabel);
        
        // CheckBox que controla a repeticao da musica
        repeatBox = new CheckBox();
        repeatBox.setSelected(true);
        repeatBox.setTranslateX(5);
        getChildren().add(repeatBox);
    }
    
    /**
     * Realiza calculos para controlar o slider do tempo e do volume
     */
    protected void updateValues() {
        if (playTime != null && timeSlider != null && volumeSlider != null) {
            Platform.runLater(new Runnable() {
                
                public void run() {
                    Duration currentTime = mp.getCurrentTime();
                    playTime.setText(formatTime(currentTime, duration));
                    timeSlider.setDisable(duration.isUnknown());
                    if (!timeSlider.isDisabled() && duration.greaterThan(Duration.ZERO) && !timeSlider.isValueChanging()) {
                        timeSlider.setValue(currentTime.divide(duration.toMillis()).toMillis() * 100.0);
                    }
                    if (!volumeSlider.isValueChanging()) {
                        volumeSlider.setValue((int) Math.round(mp.getVolume() * 100));
                    }
                }
            });
        }
    }
    
    /**
     * Realiza calculos para formartar o tempo da musica
     *
     * @param elapsed  tempo decorrido
     * @param duration duracao do audio
     * @return String os minutos e segundos em forma de String
     */
    private static String formatTime(Duration elapsed, Duration duration) {
        int intElapsed = (int) Math.floor(elapsed.toSeconds());
        int elapsedHours = intElapsed / (60 * 60);
        if (elapsedHours > 0) {
            intElapsed -= elapsedHours * 60 * 60;
        }
        int elapsedMinutes = intElapsed / 60;
        int elapsedSeconds = intElapsed - elapsedHours * 60 * 60 - elapsedMinutes * 60;
        
        if (duration.greaterThan(Duration.ZERO)) {
            int intDuration = (int) Math.floor(duration.toSeconds());
            int durationHours = intDuration / (60 * 60);
            if (durationHours > 0) {
                intDuration -= durationHours * 60 * 60;
            }
            int durationMinutes = intDuration / 60;
            int durationSeconds = intDuration - durationHours * 60 * 60 - durationMinutes * 60;
            
            if (durationHours > 0) {
                return String.format("%d:%02d:%02d/%d:%02d:%02d",
                        elapsedHours, elapsedMinutes, elapsedSeconds,
                        durationHours, durationMinutes, durationSeconds);
            } else {
                return String.format("%02d:%02d/%02d:%02d",
                        elapsedMinutes, elapsedSeconds,
                        durationMinutes, durationSeconds);
            }
        } else {
            if (elapsedHours > 0) {
                return String.format("%d:%02d:%02d",
                        elapsedHours, elapsedMinutes, elapsedSeconds);
            } else {
                return String.format("%02d:%02d",
                        elapsedMinutes, elapsedSeconds);
            }
        }
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
}
