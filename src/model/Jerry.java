package model;

import javafx.application.Platform;
import javafx.scene.image.Image;
import util.SemaphoreControl;
import view.ControlsView;
import view.ScreenView;

/**
 * Jerry eh azul
 */
public class Jerry extends Thread {
    
    static final Image frontJerryImg = new Image("/img/gifs/jerry1.gif", true);
    static final Image leftSideJerryImg = new Image("/img/gifs/jerry2.gif", true);
    static final Image rightSideJerryImg = new Image("/img/gifs/jerry3.gif", true);
    static final Image backJerryImg = new Image("/img/gifs/jerry4.gif", true);
    
    public Jerry() {
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                ScreenView.jerryView.setVisible(true);
            }
        });
        ScreenView.jerryView.setLayoutX(242);
        ScreenView.jerryView.setLayoutY(217);
    }
    
    @Override
    public void run() {
        while (true) {
            // Jerry anda para a direita
            walkStreet_b43();
            SemaphoreControl.rua_c43Andbc3.down();
            walkStreet_c43();
            SemaphoreControl.rua_c43Andbc3.up();
            walkStreet_d43();
            SemaphoreControl.rua_e43.down();
            walkStreet_e43();
            // Jerry sobe
            walkStreet_e4Toe5();
            // Jerry anda para a esquerda
            walkStreet_e5Toc5();
            SemaphoreControl.rua_c5.down();
            walkStreet_c5();
            SemaphoreControl.rua_bcToa4v1.down();
            SemaphoreControl.rua_b5Toa4v2.down();
            walkStreet_b5Toa5();
            // Jerry desce
            walkStreet_a5Toa4();
            // Jerry anda para a direita
            walkStreet_a43();
            SemaphoreControl.rua_a43.up();
        }
    }
    
    private void walkStreet_b43() {
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                ScreenView.jerryView.setImage(rightSideJerryImg);
            }
        });
        
        double x = ScreenView.jerryView.getLayoutX();
        
        while (x <= 335) {
            double finalX = x;
            Platform.runLater(new Runnable() {
                @Override
                public void run() {
                    ScreenView.jerryView.setLayoutX(finalX);
                }
            });
            
            x++;
            
            try {
                sleep(controlJerrySpeed());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    
    private void walkStreet_c43() {
        double x = ScreenView.jerryView.getLayoutX();
        
        while (x <= 432) {
            double finalX = x;
            Platform.runLater(new Runnable() {
                @Override
                public void run() {
                    ScreenView.jerryView.setLayoutX(finalX);
                }
            });
            
            x++;
            
            try {
                sleep(controlJerrySpeed());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        
        while (x <= 620) {
            double finalX = x;
            Platform.runLater(new Runnable() {
                @Override
                public void run() {
                    ScreenView.jerryView.setLayoutX(finalX);
                }
            });
            
            x++;
            
            try {
                sleep(controlJerrySpeed());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    
    private void walkStreet_d43() {
        double x = ScreenView.jerryView.getLayoutX();
        
        while (x <= 720) {
            double finalX = x;
            Platform.runLater(new Runnable() {
                @Override
                public void run() {
                    ScreenView.jerryView.setLayoutX(finalX);
                }
            });
            
            x++;
            
            try {
                sleep(controlJerrySpeed());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    
    private void walkStreet_e43() {
        double x = ScreenView.jerryView.getLayoutX();
        
        while (x <= 907) {
            double finalX = x;
            Platform.runLater(new Runnable() {
                @Override
                public void run() {
                    ScreenView.jerryView.setLayoutX(finalX);
                }
            });
            
            x++;
            
            try {
                sleep(controlJerrySpeed());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        
        SemaphoreControl.rua_d5Toe4.down();
        
        while (x <= 970) {
            double finalX1 = x;
            Platform.runLater(new Runnable() {
                @Override
                public void run() {
                    ScreenView.jerryView.setLayoutX(finalX1);
                }
            });
            
            x++;
            
            try {
                sleep(controlJerrySpeed());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    
    private void walkStreet_e4Toe5() {
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                ScreenView.jerryView.setImage(backJerryImg);
            }
        });
        
        double y = ScreenView.jerryView.getLayoutY();
        
        while (y >= 173) {
            double finalY1 = y;
            Platform.runLater(new Runnable() {
                @Override
                public void run() {
                    ScreenView.jerryView.setLayoutY(finalY1);
                }
            });
            
            y--;
            
            try {
                sleep(controlJerrySpeed());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        
        SemaphoreControl.rua_e43.up();
        
        while (y >= -22) {
            double finalY = y;
            Platform.runLater(new Runnable() {
                @Override
                public void run() {
                    ScreenView.jerryView.setLayoutY(finalY);
                }
            });
            
            y--;
            
            try {
                sleep(controlJerrySpeed());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    
    private void walkStreet_e5Toc5() {
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                ScreenView.jerryView.setImage(leftSideJerryImg);
            }
        });
        
        double x = ScreenView.jerryView.getLayoutX();
        
        while (x >= 629) {
            double finalX = x;
            Platform.runLater(new Runnable() {
                @Override
                public void run() {
                    ScreenView.jerryView.setLayoutX(finalX);
                }
            });
            
            x--;
            
            try {
                sleep(controlJerrySpeed());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    
    private void walkStreet_c5() {
        double x = ScreenView.jerryView.getLayoutX();
        
        while (x >= 526) {
            double finalX = x;
            Platform.runLater(new Runnable() {
                @Override
                public void run() {
                    ScreenView.jerryView.setLayoutX(finalX);
                }
            });
            
            x--;
            
            try {
                sleep(controlJerrySpeed());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        
        while (x >= 433) {
            double finalX = x;
            Platform.runLater(new Runnable() {
                @Override
                public void run() {
                    ScreenView.jerryView.setLayoutX(finalX);
                }
            });
            
            x--;
            
            try {
                sleep(controlJerrySpeed());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        
    }
    
    private void walkStreet_b5Toa5() {
        double x = ScreenView.jerryView.getLayoutX();
        
        while (x >= 336) {
            double finalX1 = x;
            Platform.runLater(new Runnable() {
                @Override
                public void run() {
                    ScreenView.jerryView.setLayoutX(finalX1);
                }
            });
            
            x--;
            
            try {
                sleep(controlJerrySpeed());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        
        SemaphoreControl.rua_d5Toe4.up();
        SemaphoreControl.rua_c5.up();
        
        while (x >= 1) {
            double finalX2 = x;
            Platform.runLater(new Runnable() {
                @Override
                public void run() {
                    ScreenView.jerryView.setLayoutX(finalX2);
                }
            });
            
            x--;
            
            try {
                sleep(controlJerrySpeed());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    
    private void walkStreet_a5Toa4() {
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                ScreenView.jerryView.setImage(frontJerryImg);
            }
        });
        
        double y = ScreenView.jerryView.getLayoutY();
        
        while (y <= 175) {
            double finalY = y;
            Platform.runLater(new Runnable() {
                @Override
                public void run() {
                    ScreenView.jerryView.setLayoutY(finalY);
                }
            });
            
            y++;
            
            try {
                sleep(controlJerrySpeed());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        
        SemaphoreControl.rua_a43.down();
        
        while (y <= 217) {
            double finalY1 = y;
            Platform.runLater(new Runnable() {
                @Override
                public void run() {
                    ScreenView.jerryView.setLayoutY(finalY1);
                }
            });
            
            y++;
            
            try {
                sleep(controlJerrySpeed());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    
    private void walkStreet_a43() {
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                ScreenView.jerryView.setImage(rightSideJerryImg);
            }
        });
        
        double x = ScreenView.jerryView.getLayoutX();
        
        while (x <= 51) {
            double finalX = x;
            Platform.runLater(new Runnable() {
                @Override
                public void run() {
                    ScreenView.jerryView.setLayoutX(finalX);
                }
            });
            
            x++;
            
            try {
                sleep(controlJerrySpeed());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        
        SemaphoreControl.rua_bcToa4v1.up();
        SemaphoreControl.rua_b5Toa4v2.up();
        
        while (x <= 266) {
            double finalX1 = x;
            Platform.runLater(new Runnable() {
                @Override
                public void run() {
                    ScreenView.jerryView.setLayoutX(finalX1);
                }
            });
            
            x++;
            
            try {
                sleep(controlJerrySpeed());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    
    private long controlJerrySpeed() {
        long speed = (long) (12 - ControlsView.jerrySpeedSld.getValue());
        return speed;
    }
}
