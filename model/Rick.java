package model;

import javafx.application.Platform;
import javafx.scene.image.Image;
import util.SemaphoreControl;
import view.ControlsView;
import view.ScreenView;

/**
 * Rick eh roxo
 */
public class Rick extends Thread {
    
    static final Image frontRickImg = new Image("/img/gifs/rick1.gif", true);
    static final Image leftSideRickImg = new Image("/img/gifs/rick2.gif", true);
    static final Image rightSideRickImg = new Image("/img/gifs/rick3.gif", true);
    static final Image backRickImg = new Image("/img/gifs/rick4.gif", true);
    
    public Rick() {
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                ScreenView.rickView.setVisible(true);
            }
        });
        
        ScreenView.rickView.setLayoutX(550);
        ScreenView.rickView.setLayoutY(83);
    }
    
    @Override
    public void run() {
        while (true) {
            walkStreet_d54();
            walkBlockd_de4();
            SemaphoreControl.rua_e43.down();
            walkBlock_e43();
            SemaphoreControl.rua_e3Toe32.down();
            walkBlock_e3();
            walkStreet_e32();
            SemaphoreControl.rua_de2.down();
            walkSteet_de2();
            walkBlock_d21();
            walkBlock_cd1();
            walkStreet_c1();
            SemaphoreControl.rua_bc1.down();
            walkStreet_bc1();
            walkStreet_b21();
            SemaphoreControl.rua_ab2.down();
            walkStreet_ab2();
            walkStreet_a32();
            SemaphoreControl.rua_a3.down();
            walkStreet_a3();
            walkStreet_a43();
            walkStreet_ab4();
            walkStreet_b54();
            SemaphoreControl.rua_c5.down();
            SemaphoreControl.rua_bc5Andcd5.down();
//            SemaphoreControl.rua_bc5Andc5.down();
            SemaphoreControl.rua_bc5.down();
            walkStreet_bc5();
            walkStreet_c5();
//            SemaphoreControl.rua_bc5Andcd5.down();
            walkStreet_cd5();
            SemaphoreControl.rua_bc5Andcd5.up();
        }
    }
    
    private void walkStreet_d54() {
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                ScreenView.rickView.setImage(rightSideRickImg);
            }
        });
        
        double x = ScreenView.rickView.getLayoutX();
        
        while (x <= 763) {
            double finalX = x;
            Platform.runLater(new Runnable() {
                @Override
                public void run() {
                    ScreenView.rickView.setLayoutX(finalX);
                }
            });
            
            x++;
            
            try {
                sleep(controlRickSpeed());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    
    private void walkBlockd_de4() {
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                ScreenView.rickView.setImage(frontRickImg);
            }
        });
        
        double y = ScreenView.rickView.getLayoutY();
    
        while (y <= 175) {
            double finalY = y;
            Platform.runLater(new Runnable() {
                @Override
                public void run() {
                    ScreenView.rickView.setLayoutY(finalY);
                }
            });
            
            y++;
            
            try {
                sleep(controlRickSpeed());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    
    private void walkBlock_e43() {
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                ScreenView.rickView.setImage(rightSideRickImg);
            }
        });
    
        double y = ScreenView.rickView.getLayoutY();
    
        while (y <= 215) {
            double finalY = y;
            Platform.runLater(new Runnable() {
                @Override
                public void run() {
                    ScreenView.rickView.setLayoutY(finalY);
                }
            });
            
            y++;
            
            try {
                sleep(controlRickSpeed());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    
        double x = ScreenView.rickView.getLayoutX();
    
        while (x <= 907) {
            double finalX = x;
            Platform.runLater(new Runnable() {
                @Override
                public void run() {
                    ScreenView.rickView.setLayoutX(finalX);
                }
            });
            
            x++;
            
            try {
                sleep(controlRickSpeed());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    
    private void walkBlock_e3() {
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                ScreenView.rickView.setImage(frontRickImg);
            }
        });
    
        double x = ScreenView.rickView.getLayoutX();
    
        while (x <= 958) {
            double finalX = x;
            Platform.runLater(new Runnable() {
                @Override
                public void run() {
                    ScreenView.rickView.setLayoutX(finalX);
                }
            });
            
            x++;
            
            try {
                sleep(controlRickSpeed());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    
        SemaphoreControl.rua_e3.down();
    
        double y = ScreenView.rickView.getLayoutY();
    
        while (y <= 287) {
            double finalY = y;
            Platform.runLater(new Runnable() {
                @Override
                public void run() {
                    ScreenView.rickView.setLayoutY(finalY);
                }
            });
            
            y++;
            
            try {
                sleep(controlRickSpeed());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        
        SemaphoreControl.rua_e43.up();
        
        while (y <= 362) {
            double finalY1 = y;
            Platform.runLater(new Runnable() {
                @Override
                public void run() {
                    ScreenView.rickView.setLayoutY(finalY1);
                }
            });
            
            y++;
            
            try {
                sleep(controlRickSpeed());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    
    private void walkStreet_e32() {
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                ScreenView.rickView.setImage(leftSideRickImg);
            }
        });
    
        double x = ScreenView.rickView.getLayoutX();
    
        while (x >= 907) {
            double finalX = x;
            Platform.runLater(new Runnable() {
                @Override
                public void run() {
                    ScreenView.rickView.setLayoutX(finalX);
                }
            });
            
            x--;
            
            try {
                sleep(controlRickSpeed());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    
        SemaphoreControl.rua_e3.up();
    
        while (x >= 815) {
            double finalX1 = x;
            Platform.runLater(new Runnable() {
                @Override
                public void run() {
                    ScreenView.rickView.setLayoutX(finalX1);
                }
            });
            
            x--;
            
            try {
                sleep(controlRickSpeed());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    
    private void walkSteet_de2() {
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                ScreenView.rickView.setImage(frontRickImg);
            }
        });
    
        double x = ScreenView.rickView.getLayoutX();
    
        while (x >= 765) {
            double finalX = x;
            Platform.runLater(new Runnable() {
                @Override
                public void run() {
                    ScreenView.rickView.setLayoutX(finalX);
                }
            });
            
            x--;
            
            try {
                sleep(controlRickSpeed());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    
        double y = ScreenView.rickView.getLayoutY();
    
        while (y <= 428) {
            double finalY = y;
            Platform.runLater(new Runnable() {
                @Override
                public void run() {
                    ScreenView.rickView.setLayoutY(finalY);
                }
            });
            
            y++;
            
            try {
                sleep(controlRickSpeed());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        
        SemaphoreControl.rua_e3Toe32.up();
        
        while (y <= 499) {
            double finalY1 = y;
            Platform.runLater(new Runnable() {
                @Override
                public void run() {
                    ScreenView.rickView.setLayoutY(finalY1);
                }
            });
            
            y++;
            
            try {
                sleep(controlRickSpeed());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    
    private void walkBlock_d21() {
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                ScreenView.rickView.setImage(leftSideRickImg);
            }
        });
    
        double x = ScreenView.rickView.getLayoutX();
    
        while (x >= 721) {
            double finalX = x;
            Platform.runLater(new Runnable() {
                @Override
                public void run() {
                    ScreenView.rickView.setLayoutX(finalX);
                }
            });
            
            x--;
            
            try {
                sleep(controlRickSpeed());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        
        SemaphoreControl.rua_de2.up();
        
        while (x >= 578) {
            double finalX1 = x;
            Platform.runLater(new Runnable() {
                @Override
                public void run() {
                    ScreenView.rickView.setLayoutX(finalX1);
                }
            });
            
            x--;
            
            try {
                sleep(controlRickSpeed());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    
    private void walkBlock_cd1() {
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                ScreenView.rickView.setImage(frontRickImg);
            }
        });
    
        double y = ScreenView.rickView.getLayoutY();
    
        while (y <= 636) {
            double finalY = y;
            Platform.runLater(new Runnable() {
                @Override
                public void run() {
                    ScreenView.rickView.setLayoutY(finalY);
                }
            });
            
            y++;
            
            try {
                sleep(controlRickSpeed());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    
    private void walkStreet_c1() {
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                ScreenView.rickView.setImage(leftSideRickImg);
            }
        });
    
        double x = ScreenView.rickView.getLayoutX();
    
        while (x >= 435) {
            double finalX = x;
            Platform.runLater(new Runnable() {
                @Override
                public void run() {
                    ScreenView.rickView.setLayoutX(finalX);
                }
            });
            
            x--;
            
            try {
                sleep(controlRickSpeed());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    
    private void walkStreet_bc1() {
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                ScreenView.rickView.setImage(backRickImg);
            }
        });
    
        double x = ScreenView.rickView.getLayoutX();
    
        while (x >= 381) {
            double finalX = x;
            Platform.runLater(new Runnable() {
                @Override
                public void run() {
                    ScreenView.rickView.setLayoutX(finalX);
                }
            });
            
            x--;
            
            try {
                sleep(controlRickSpeed());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        
        double y = ScreenView.rickView.getLayoutY();
        
        while (y >= 495) {
            double finalY = y;
            Platform.runLater(new Runnable() {
                @Override
                public void run() {
                    ScreenView.rickView.setLayoutY(finalY);
                }
            });
            
            y--;
            
            try {
                sleep(controlRickSpeed());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        
        while (x >= 336) {
            double finalX1 = x;
            Platform.runLater(new Runnable() {
                @Override
                public void run() {
                    ScreenView.rickView.setLayoutX(finalX1);
                }
            });
            
            x--;
            
            try {
                sleep(controlRickSpeed());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        
        SemaphoreControl.rua_bc1.up();
    }
    
    private void walkStreet_b21() {
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                ScreenView.rickView.setImage(leftSideRickImg);
            }
        });
    
        double x = ScreenView.rickView.getLayoutX();
    
        while (x >= 238) {
            double finalX = x;
            Platform.runLater(new Runnable() {
                @Override
                public void run() {
                    ScreenView.rickView.setLayoutX(finalX);
                }
            });
            
            x--;
            
            try {
                sleep(controlRickSpeed());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    
    private void walkStreet_ab2() {
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                ScreenView.rickView.setImage(backRickImg);
            }
        });
    
        double x = ScreenView.rickView.getLayoutX();
    
        while (x >= 189) {
            double finalX = x;
            Platform.runLater(new Runnable() {
                @Override
                public void run() {
                    ScreenView.rickView.setLayoutX(finalX);
                }
            });
            
            x--;
            
            try {
                sleep(controlRickSpeed());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    
        double y = ScreenView.rickView.getLayoutY();
    
        while (y >= 357) {
            double finalY = y;
            Platform.runLater(new Runnable() {
                @Override
                public void run() {
                    ScreenView.rickView.setLayoutY(finalY);
                }
            });
            
            y--;
            
            try {
                sleep(controlRickSpeed());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    
    private void walkStreet_a32() {
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                ScreenView.rickView.setImage(leftSideRickImg);
            }
        });
    
        double x = ScreenView.rickView.getLayoutX();
    
        while (x >= 138) {
            double finalX = x;
            Platform.runLater(new Runnable() {
                @Override
                public void run() {
                    ScreenView.rickView.setLayoutX(finalX);
                }
            });
            
            x--;
            
            try {
                sleep(controlRickSpeed());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        
        SemaphoreControl.rua_ab2.up();
        
        while (x >= 48) {
            double finalX1 = x;
            Platform.runLater(new Runnable() {
                @Override
                public void run() {
                    ScreenView.rickView.setLayoutX(finalX1);
                }
            });
            
            x--;
            
            try {
                sleep(controlRickSpeed());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    
    private void walkStreet_a3() {
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                ScreenView.rickView.setImage(backRickImg);
            }
        });
    
        double x = ScreenView.rickView.getLayoutX();
    
        while (x >= 1) {
            double finalX = x;
            Platform.runLater(new Runnable() {
                @Override
                public void run() {
                    ScreenView.rickView.setLayoutX(finalX);
                }
            });
            
            x--;
            
            try {
                sleep(controlRickSpeed());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    
        double y = ScreenView.rickView.getLayoutY();
    
        while (y >= 288) {
            double finalY = y;
            Platform.runLater(new Runnable() {
                @Override
                public void run() {
                    ScreenView.rickView.setLayoutY(finalY);
                }
            });
            
            y--;
            
            try {
                sleep(controlRickSpeed());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        
        // Controla a condicao de corrida entre Jerry e Rick
        SemaphoreControl.rua_a43.down();
        
        while (y >= 218) {
            double finalY1 = y;
            Platform.runLater(new Runnable() {
                @Override
                public void run() {
                    ScreenView.rickView.setLayoutY(finalY1);
                }
            });
            
            y--;
            
            try {
                sleep(controlRickSpeed());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    
    private void walkStreet_a43() {
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                ScreenView.rickView.setImage(rightSideRickImg);
            }
        });
    
        double x = ScreenView.rickView.getLayoutX();
    
        while (x <= 49) {
            double finalX = x;
            Platform.runLater(new Runnable() {
                @Override
                public void run() {
                    ScreenView.rickView.setLayoutX(finalX);
                }
            });
            
            x++;
            
            try {
                sleep(controlRickSpeed());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        
        SemaphoreControl.rua_a3.up();
        
        while (x <= 194) {
            double finalX1 = x;
            Platform.runLater(new Runnable() {
                @Override
                public void run() {
                    ScreenView.rickView.setLayoutX(finalX1);
                }
            });
            
            x++;
            
            try {
                sleep(controlRickSpeed());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    
    private void walkStreet_ab4() {
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                ScreenView.rickView.setImage(backRickImg);
            }
        });
    
        double y = ScreenView.rickView.getLayoutY();
    
        while (y >= 174) {
            double finalY = y;
            Platform.runLater(new Runnable() {
                @Override
                public void run() {
                    ScreenView.rickView.setLayoutY(finalY);
                }
            });
            
            y--;
            
            try {
                sleep(controlRickSpeed());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        
        // Controla a condicao de corrida entre Jerry e Rick
        SemaphoreControl.rua_a43.up();
        
        while (y >= 84) {
            double finalY1 = y;
            Platform.runLater(new Runnable() {
                @Override
                public void run() {
                    ScreenView.rickView.setLayoutY(finalY1);
                }
            });
            
            y--;
            
            try {
                sleep(controlRickSpeed());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                ScreenView.rickView.setImage(rightSideRickImg);
            }
        });
    
        double x = ScreenView.rickView.getLayoutX();
    
        while (x <= 285) {
            double finalX = x;
            Platform.runLater(new Runnable() {
                @Override
                public void run() {
                    ScreenView.rickView.setLayoutX(finalX);
                }
            });
            
            x++;
        
            try {
                sleep(controlRickSpeed());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    
    private void walkStreet_b54() {
        double x = ScreenView.rickView.getLayoutX();
    
        while (x <= 300) {
            double finalX = x;
            Platform.runLater(new Runnable() {
                @Override
                public void run() {
                    ScreenView.rickView.setLayoutX(finalX);
                }
            });
            
            x++;
        
            try {
                sleep(controlRickSpeed());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        
        while (x <= 335) {
            double finalX1 = x;
            Platform.runLater(new Runnable() {
                @Override
                public void run() {
                    ScreenView.rickView.setLayoutX(finalX1);
                }
            });
            
            x++;
            
            try {
                sleep(controlRickSpeed());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    
    private void walkStreet_bc5() {
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                ScreenView.rickView.setImage(backRickImg);
            }
        });
    
        double x = ScreenView.rickView.getLayoutX();
    
        while (x <= 385) {
            double finalX = x;
            Platform.runLater(new Runnable() {
                @Override
                public void run() {
                    ScreenView.rickView.setLayoutX(finalX);
                }
            });
            
            x++;
            
            try {
                sleep(controlRickSpeed());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    
        double y = ScreenView.rickView.getLayoutY();
    
        while (y >= 44) {
            double finalY = y;
            Platform.runLater(new Runnable() {
                @Override
                public void run() {
                    ScreenView.rickView.setLayoutY(finalY);
                }
            });
            
            y--;
            
            try {
                sleep(controlRickSpeed());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    
    private void walkStreet_c5() {
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                ScreenView.rickView.setImage(rightSideRickImg);
            }
        });
    
        double y = ScreenView.rickView.getLayoutY();
    
        while (y >= -23) {
            double finalY = y;
            Platform.runLater(new Runnable() {
                @Override
                public void run() {
                    ScreenView.rickView.setLayoutY(finalY);
                }
            });
            
            y--;
            
            try {
                sleep(controlRickSpeed());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    
        double x = ScreenView.rickView.getLayoutX();
    
        while (x <= 436) {
            double finalX = x;
            Platform.runLater(new Runnable() {
                @Override
                public void run() {
                    ScreenView.rickView.setLayoutX(finalX);
                }
            });
            
            x++;
            
            try {
                sleep(controlRickSpeed());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        
        SemaphoreControl.rua_bc5.up();
//        SemaphoreControl.rua_bc5Andcd5.up();
        
        while (x <= 527) {
            double finalX1 = x;
            Platform.runLater(new Runnable() {
                @Override
                public void run() {
                    ScreenView.rickView.setLayoutX(finalX1);
                }
            });
            
            x++;
            
            try {
                sleep(controlRickSpeed());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    
    private void walkStreet_cd5() {
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                ScreenView.rickView.setImage(frontRickImg);
            }
        });
    
        double x = ScreenView.rickView.getLayoutX();
    
        while (x <= 575) {
            double finalX = x;
            Platform.runLater(new Runnable() {
                @Override
                public void run() {
                    ScreenView.rickView.setLayoutX(finalX);
                }
            });
            
            x++;
            
            try {
                sleep(controlRickSpeed());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    
        double y = ScreenView.rickView.getLayoutY();
    
        while (y <= 46) {
            double finalY = y;
            Platform.runLater(new Runnable() {
                @Override
                public void run() {
                    ScreenView.rickView.setLayoutY(finalY);
                }
            });
            
            y++;
            
            try {
                sleep(controlRickSpeed());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    
        SemaphoreControl.rua_c5.up();
    
        while (y <= 84) {
            double finalY1 = y;
            Platform.runLater(new Runnable() {
                @Override
                public void run() {
                    ScreenView.rickView.setLayoutY(finalY1);
                }
            });
            
            y++;
        
            try {
                sleep(controlRickSpeed());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        
        while (x <= 626) {
            double finalX1 = x;
            Platform.runLater(new Runnable() {
                @Override
                public void run() {
                    ScreenView.rickView.setLayoutX(finalX1);
                }
            });
            
            x++;
            
            try {
                sleep(controlRickSpeed());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    
    private long controlRickSpeed() {
        long speed = (long) (12 - ControlsView.rickSpeedSld.getValue());
        return speed;
    }
}
