package model;

import javafx.application.Platform;
import javafx.scene.image.Image;
import util.SemaphoreControl;
import view.ControlsView;
import view.ScreenView;

/**
 * Beth eh vermelha
 */
public class Beth extends Thread {
    
    static final Image frontBethImg = new Image("/img/gifs/beth1.gif", true);
    static final Image leftBethImg = new Image("/img/gifs/beth2.gif", true);
    static final Image rightSideBethImg = new Image("/img/gifs/beth3.gif", true);
    static final Image backBethImg = new Image("/img/gifs/beth4.gif", true);
    
    public Beth() {
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                ScreenView.bethView.setVisible(true);
            }
        });
        
        ScreenView.bethView.setLayoutX(236);
        ScreenView.bethView.setLayoutY(636);
    }
    
    @Override
    public void run() {
        while (true) {
            // Beth vira para a direita
            walkStreet_b1();
            SemaphoreControl.rua_bc1.down();
            // Beth sobe
            walkStreet_bc1Tobc3();
            SemaphoreControl.rua_c43Andbc3.up();
            walkStreet_bc4();
            SemaphoreControl.rua_a1Tobc5.down();
            SemaphoreControl.rua_bc5.down();
            walkStreet_bc5();
            SemaphoreControl.rua_bcToa4v1.down();
            // Beth vire para a esquerda
            walkStreet_b5Toa5();
            // Beth desce
            walkStreet_a5Toa3();
            SemaphoreControl.rua_bcToa4v1.up();
            walkStreet_a3Toa1();
            // Beth vira para a direita
            walkStreet_a1();
            SemaphoreControl.rua_a1Tobc5.up();
        }
    }
    
    private void walkStreet_b1() {
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                ScreenView.bethView.setImage(rightSideBethImg);
            }
        });
        
        double x = ScreenView.bethView.getLayoutX();
        
        while (x <= 332) {
            double finalX = x;
            Platform.runLater(new Runnable() {
                @Override
                public void run() {
                    ScreenView.bethView.setLayoutX(finalX);
                }
            });
            
            x++;
            
            try {
                sleep(controlBethSpeed());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    
    private void walkStreet_bc1Tobc3() {
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                ScreenView.bethView.setImage(backBethImg);
            }
        });
        
        double x = ScreenView.bethView.getLayoutX();
        
        while (x <= 382) {
            double finalX = x;
            Platform.runLater(new Runnable() {
                @Override
                public void run() {
                    ScreenView.bethView.setLayoutX(finalX);
                }
            });
            
            x++;
            
            try {
                sleep(controlBethSpeed());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        
        double y = ScreenView.bethView.getLayoutY();
        
        while (y >= 455) {
            double finalY = y;
            Platform.runLater(new Runnable() {
                @Override
                public void run() {
                    ScreenView.bethView.setLayoutY(finalY);
                }
            });
            
            y--;
            
            try {
                sleep(controlBethSpeed());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        
        SemaphoreControl.rua_bc1.up();
        
        while (y >= 435) {
            double finalY1 = y;
            Platform.runLater(new Runnable() {
                @Override
                public void run() {
                    ScreenView.bethView.setLayoutY(finalY1);
                }
            });
            
            y--;
            
            try {
                sleep(controlBethSpeed());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        
        SemaphoreControl.rua_bc5Tobc3.down();
        SemaphoreControl.rua_c43Andbc3.down();
        
        while (y >= 294) {
            double finalY2 = y;
            Platform.runLater(new Runnable() {
                @Override
                public void run() {
                    ScreenView.bethView.setLayoutY(finalY2);
                }
            });
            
            y--;
            
            try {
                sleep(controlBethSpeed());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        
        while (y >= 176) {
            double finalY3 = y;
            Platform.runLater(new Runnable() {
                @Override
                public void run() {
                    ScreenView.bethView.setLayoutY(finalY3);
                }
            });
            
            y--;
            
            try {
                sleep(controlBethSpeed());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    
    private void walkStreet_bc4() {
        double y = ScreenView.bethView.getLayoutY();
        
        while (y >= 156) {
            double finalY = y;
            Platform.runLater(new Runnable() {
                @Override
                public void run() {
                    ScreenView.bethView.setLayoutY(finalY);
                }
            });
            
            y--;
            
            try {
                sleep(controlBethSpeed());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    
    private void walkStreet_bc5() {
        double y = ScreenView.bethView.getLayoutY();
        
        while (y >= 44) {
            double finalY = y;
            Platform.runLater(new Runnable() {
                @Override
                public void run() {
                    ScreenView.bethView.setLayoutY(finalY);
                }
            });
            
            y--;
            
            try {
                sleep(controlBethSpeed());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    
    private void walkStreet_b5Toa5() {
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                ScreenView.bethView.setImage(leftBethImg);
            }
        });
        
        
        while (ScreenView.bethView.getLayoutY() >= -25) {
            Platform.runLater(new Runnable() {
                @Override
                public void run() {
                    ScreenView.bethView.setLayoutY(ScreenView.bethView.getLayoutY() - 1);
                }
            });
            
            
            try {
                sleep(controlBethSpeed());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                ScreenView.bethView.setImage(leftBethImg);
            }
        });
        
        while (ScreenView.bethView.getLayoutX() >= 336) {
            Platform.runLater(new Runnable() {
                @Override
                public void run() {
                    ScreenView.bethView.setLayoutX(ScreenView.bethView.getLayoutX() - 1);
                }
            });
            
            try {
                sleep(controlBethSpeed());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        
        SemaphoreControl.rua_bc5.up();
        SemaphoreControl.rua_bc5Tobc3.up();
        
        while (ScreenView.bethView.getLayoutX() >= 1) {
            Platform.runLater(new Runnable() {
                @Override
                public void run() {
                    ScreenView.bethView.setLayoutX(ScreenView.bethView.getLayoutX() - 1);
                }
            });
            
            try {
                sleep(controlBethSpeed());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    
    private void walkStreet_a5Toa3() {
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                ScreenView.bethView.setImage(frontBethImg);
            }
        });
        
        double y = ScreenView.bethView.getLayoutY();
        
        while (y <= 171) {
            double finalY = y;
            Platform.runLater(new Runnable() {
                @Override
                public void run() {
                    ScreenView.bethView.setLayoutY(finalY);
                }
            });
            
            y++;
            
            try {
                sleep(controlBethSpeed());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        
        SemaphoreControl.rua_a3.down();
        
        while (y <= 288) {
            double finalY1 = y;
            Platform.runLater(new Runnable() {
                @Override
                public void run() {
                    ScreenView.bethView.setLayoutY(finalY1);
                }
            });
            
            y++;
            
            try {
                sleep(controlBethSpeed());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    
    private void walkStreet_a3Toa1() {
        double y = ScreenView.bethView.getLayoutY();
        
        while (y <= 421) {
            double finalY = y;
            Platform.runLater(new Runnable() {
                @Override
                public void run() {
                    ScreenView.bethView.setLayoutY(finalY);
                }
            });
            
            y++;
            
            try {
                sleep(controlBethSpeed());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        
        SemaphoreControl.rua_a3.up();
        
        while (y <= 634) {
            double finalY1 = y;
            Platform.runLater(new Runnable() {
                @Override
                public void run() {
                    ScreenView.bethView.setLayoutY(finalY1);
                }
            });
            
            y++;
            
            try {
                sleep(controlBethSpeed());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    
    private void walkStreet_a1() {
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                ScreenView.bethView.setImage(rightSideBethImg);
            }
        });
        
        double x = ScreenView.bethView.getLayoutX();
        
        while (x <= 234) {
            double finalX = x;
            Platform.runLater(new Runnable() {
                @Override
                public void run() {
                    ScreenView.bethView.setLayoutX(finalX);
                }
            });
            
            x++;
            
            try {
                sleep(controlBethSpeed());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    
    private long controlBethSpeed() {
        long speed = (long) (100 - ControlsView.bethSpeedSld.getValue());
        return speed;
    }
}