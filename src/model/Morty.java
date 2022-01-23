package model;

import javafx.application.Platform;
import javafx.scene.image.Image;
import util.SemaphoreControl;
import view.ControlsView;
import view.ScreenView;

/**
 * Morty eh verde
 */
public class Morty extends Thread {
    
    static final Image frontMortyImg = new Image("/img/gifs/morty1.gif", true);
    static final Image leftSideMortyImg = new Image("/img/gifs/morty2.gif", true);
    static final Image rightSideMortyImg = new Image("/img/gifs/morty3.gif", true);
    static final Image backMortyImg = new Image("/img/gifs/morty4.gif", true);
    
    public Morty() {
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                ScreenView.mortyView.setVisible(true);
            }
        });
        
        ScreenView.mortyView.setLayoutX(470);
        ScreenView.mortyView.setLayoutY(355);
    }
    
    @Override
    public void run() {
        while (true) {
            // Morty anda a direita
            walkStreet_c32();
            SemaphoreControl.rua_e3Toe32.down();
            SemaphoreControl.rua_d32.down();
            walkStreet_d32();
            SemaphoreControl.rua_d32.up();
            walkStreet_e32();
            SemaphoreControl.rua_d5Toe4.down();
            // Morty sobe
            walkStreet_e3();
            walkStreet_e4();
            SemaphoreControl.rua_e3Toe32.up();
            walkStreet_e5();
            // Morty anda a esquerda
            walkStreet_e5Tod5();
            SemaphoreControl.rua_bc5Tobc3.down();
            SemaphoreControl.rua_bc5Andcd5.down();
//            SemaphoreControl.rua_bc5Andc5.down();
            walkStreet_d5Toc5();
            // Morty desce
            walkStreet_bc5();
            SemaphoreControl.rua_d5Toe4.up();
            walkStreet_bc4();
            walkStreet_bc3();
            SemaphoreControl.rua_c43Andbc3.up();
            SemaphoreControl.rua_bc5Tobc3.up();
        }
    }
    
    private void walkStreet_c32() {
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                ScreenView.mortyView.setImage(rightSideMortyImg);
            }
        });
        
        double x = ScreenView.mortyView.getLayoutX();
        
        while (x <= 522) {
            double finalX = x;
            Platform.runLater(new Runnable() {
                @Override
                public void run() {
                    ScreenView.mortyView.setLayoutX(finalX);
                }
            });
            
            x++;
            
            try {
                sleep(controlMortySpeed());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    
    
    private void walkStreet_d32() {
        double x = ScreenView.mortyView.getLayoutX();
        
        while (x <= 813) {
            double finalX = x;
            Platform.runLater(new Runnable() {
                @Override
                public void run() {
                    ScreenView.mortyView.setLayoutX(finalX);
                }
            });
            
            x++;
            
            try {
                sleep(controlMortySpeed());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    
    private void walkStreet_e32() {
        double x = ScreenView.mortyView.getLayoutX();
        
        while (x <= 905) {
            double finalX = x;
            Platform.runLater(new Runnable() {
                @Override
                public void run() {
                    ScreenView.mortyView.setLayoutX(finalX);
                }
            });
            
            x++;
            
            try {
                sleep(controlMortySpeed());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        
    }
    
    private void walkStreet_e3() {
        double x = ScreenView.mortyView.getLayoutX();
        
        while (x <= 967) {
            double finalX = x;
            Platform.runLater(new Runnable() {
                @Override
                public void run() {
                    ScreenView.mortyView.setLayoutX(finalX);
                }
            });
            
            x++;
            
            try {
                sleep(controlMortySpeed());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        
        // Morty vira para frente
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                ScreenView.mortyView.setImage(backMortyImg);
            }
        });
        
        double y = ScreenView.mortyView.getLayoutY();
        
        while (y >= 287) {
            double finalY = y;
            Platform.runLater(new Runnable() {
                @Override
                public void run() {
                    ScreenView.mortyView.setLayoutY(finalY);
                }
            });
            
            y--;
            
            try {
                sleep(controlMortySpeed());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    
    private void walkStreet_e4() {
        double y = ScreenView.mortyView.getLayoutY();
        
        while (y >= 175) {
            double finalY = y;
            Platform.runLater(new Runnable() {
                @Override
                public void run() {
                    ScreenView.mortyView.setLayoutY(finalY);
                }
            });
            
            y--;
            
            try {
                sleep(controlMortySpeed());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    
    private void walkStreet_e5() {
        double y = ScreenView.mortyView.getLayoutY();
        
        while (y >= -22) {
            double finalY = y;
            Platform.runLater(new Runnable() {
                @Override
                public void run() {
                    ScreenView.mortyView.setLayoutY(finalY);
                }
            });
            
            y--;
            
            try {
                sleep(controlMortySpeed());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    
    private void walkStreet_e5Tod5() {
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                ScreenView.mortyView.setImage(leftSideMortyImg);
            }
        });
        
        double x = ScreenView.mortyView.getLayoutX();
        
        while (x >= 650) {
            double finalX = x;
            Platform.runLater(new Runnable() {
                @Override
                public void run() {
                    ScreenView.mortyView.setLayoutX(finalX);
                }
            });
            
            x--;
            
            try {
                sleep(controlMortySpeed());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        
        while (x >= 626) {
            double finalX = x;
            Platform.runLater(new Runnable() {
                @Override
                public void run() {
                    ScreenView.mortyView.setLayoutX(finalX);
                }
            });
            
            x--;
            
            try {
                sleep(controlMortySpeed());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    
    private void walkStreet_d5Toc5() {
        double x = ScreenView.mortyView.getLayoutX();
        
        while (x >= 525) {
            double finalX = x;
            Platform.runLater(new Runnable() {
                @Override
                public void run() {
                    ScreenView.mortyView.setLayoutX(finalX);
                }
            });
            
            x--;
            
            try {
                sleep(controlMortySpeed());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        
        while (x >= 437) {
            double finalX1 = x;
            Platform.runLater(new Runnable() {
                @Override
                public void run() {
                    ScreenView.mortyView.setLayoutX(finalX1);
                }
            });
            
            x--;
            
            try {
                sleep(controlMortySpeed());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    
    private void walkStreet_bc5() {
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                ScreenView.mortyView.setImage(frontMortyImg);
            }
        });
        
        double x = ScreenView.mortyView.getLayoutX();
        
        while (x >= 390) {
            double finalX = x;
            Platform.runLater(new Runnable() {
                @Override
                public void run() {
                    ScreenView.mortyView.setLayoutX(finalX);
                }
            });
            
            x--;
            
            try {
                sleep(controlMortySpeed());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        
        double y = ScreenView.mortyView.getLayoutY();
        
        while (y <= 43) {
            double finalY = y;
            Platform.runLater(new Runnable() {
                @Override
                public void run() {
                    ScreenView.mortyView.setLayoutY(finalY);
                }
            });
            
            y++;
            
            try {
                sleep(controlMortySpeed());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    
    private void walkStreet_bc4() {
        double y = ScreenView.mortyView.getLayoutY();
        
        while (y <= 157) {
            double finalY = y;
            Platform.runLater(new Runnable() {
                @Override
                public void run() {
                    ScreenView.mortyView.setLayoutY(finalY);
                }
            });
            
            y++;
            
            try {
                sleep(controlMortySpeed());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        
        SemaphoreControl.rua_bc5Andcd5.up();
//        SemaphoreControl.rua_bc5Andc5.up();
        SemaphoreControl.rua_c43Andbc3.down();
        
        while (y <= 176) {
            double finalY1 = y;
            Platform.runLater(new Runnable() {
                @Override
                public void run() {
                    ScreenView.mortyView.setLayoutY(finalY1);
                }
            });
            
            y++;
            
            try {
                sleep(controlMortySpeed());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    
    private void walkStreet_bc3() {
        double y = ScreenView.mortyView.getLayoutY();
        
        while (y <= 357) {
            double finalY = y;
            Platform.runLater(new Runnable() {
                @Override
                public void run() {
                    ScreenView.mortyView.setLayoutY(finalY);
                }
            });
            
            y++;
            
            try {
                sleep(controlMortySpeed());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        
        double x = ScreenView.mortyView.getLayoutX();
        
        while (x <= 434) {
            double finalX = x;
            Platform.runLater(new Runnable() {
                @Override
                public void run() {
                    ScreenView.mortyView.setLayoutX(finalX);
                }
            });
            
            x++;
            
            try {
                sleep(controlMortySpeed());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    
    private long controlMortySpeed() {
        long speed = (long) (12 - ControlsView.mortySpeedSld.getValue());
        return speed;
    }
}
