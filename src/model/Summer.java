package model;

import javafx.application.Platform;
import javafx.scene.image.Image;
import util.SemaphoreControl;
import view.ControlsView;
import view.ScreenView;

/**
 * Sumer eh laranja
 */
public class Summer extends Thread {
    
    final static Image frontSummerImg = new Image("/img/gifs/summer1.gif", true);
    final static Image leftSideSummerImg = new Image("/img/gifs/summer2.gif", true);
    final static Image rightSideSummerImg = new Image("/img/gifs/summer3.gif", true);
    final static Image backSummerImg = new Image("/img/gifs/summer4.gif", true);
    
    public Summer() {
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                ScreenView.summerView.setVisible(true);
            }
        });
        ScreenView.summerView.setLayoutX(341);
        ScreenView.summerView.setLayoutY(359);
    }
    
    @Override
    public void run() {
        while (true) {
            // Summer vira para a esquerda
            walkStreet_b32();
            SemaphoreControl.rua_ab2.down();
            // Summer desce
            walkStreet_ab2();
            SemaphoreControl.rua_ab2.up();
            walkStreet_ab1();
            // Summer vira para a esquerda
            walkStreet_a1();
            // Summer sobe
            walkStreet_a1Toa2();
            walkStreet_a3();
            SemaphoreControl.rua_b5Toa4v2.down();
            walkStreet_a4();
            walkStreet_a4Toa5();
            // Summer vira para a direita
            walkStreet_a5Tob5();
            SemaphoreControl.rua_bc5Andcd5.down();
            // Summer desce
            walkStreet_bc5();
            // Summer vira para a direita
            walkStreet_c54();
            // Summer sobe
            walkStreet_cd5();
            // Summer vira para a direita
            walkStreet_d5Toe5();
            // Summer desce
            walkStreet_e5To4e();
            SemaphoreControl.rua_e3.down();
            walkStreet_e4Toe1();
            // Summer vira para a esquerda
            walkStreet_e1();
            // Summer sobe
            walkStreet_de1();
            SemaphoreControl.rua_de2.down();
            walkStreet_de2();
            SemaphoreControl.rua_d32.down();
            // Summer vira a esquerda
            walkStreet_d32();
            // Summer sobe
            walkStreet_cd3();
            // Summer vira a esquerda
            walkStreet_c43();
            // Summer desce
            walkStreet_bc3();
            SemaphoreControl.rua_c43Andbc3.up();
        }
    }
    
    private void walkStreet_b32() {
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                ScreenView.summerView.setImage(leftSideSummerImg);
            }
        });
        
        double x = ScreenView.summerView.getLayoutX();
        
        while (x >= 241) {
            double finalX = x;
            Platform.runLater(new Runnable() {
                @Override
                public void run() {
                    ScreenView.summerView.setLayoutX(finalX);
                }
            });
            
            x--;
            
            try {
                sleep(controlSummerSpeed());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    
    private void walkStreet_ab2() {
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                ScreenView.summerView.setImage(frontSummerImg);
            }
        });
        
        double x = ScreenView.summerView.getLayoutX();
        
        while (x >= 193) {
            double finalX = x;
            Platform.runLater(new Runnable() {
                @Override
                public void run() {
                    ScreenView.summerView.setLayoutX(finalX);
                }
            });
            
            x--;
            
            try {
                sleep(controlSummerSpeed());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        
        double y = ScreenView.summerView.getLayoutY();
        
        while (y <= 564) {
            double finalY = y;
            Platform.runLater(new Runnable() {
                @Override
                public void run() {
                    ScreenView.summerView.setLayoutY(finalY);
                }
            });
            
            y++;
            
            try {
                sleep(controlSummerSpeed());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    
    private void walkStreet_ab1() {
        double y = ScreenView.summerView.getLayoutY();
        
        while (y <= 583) {
            double finalY = y;
            Platform.runLater(new Runnable() {
                @Override
                public void run() {
                    ScreenView.summerView.setLayoutY(finalY);
                }
            });
            
            y++;
            
            try {
                sleep(controlSummerSpeed());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        
        SemaphoreControl.rua_a1Tobc5.down();
        
        while (y <= 635) {
            double finalY1 = y;
            Platform.runLater(new Runnable() {
                @Override
                public void run() {
                    ScreenView.summerView.setLayoutY(finalY1);
                }
            });
            
            y++;
            
            try {
                sleep(controlSummerSpeed());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    
    private void walkStreet_a1() {
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                ScreenView.summerView.setImage(leftSideSummerImg);
            }
        });
        
        double x = ScreenView.summerView.getLayoutX();
        
        while (x >= 4) {
            double finalX = x;
            Platform.runLater(new Runnable() {
                @Override
                public void run() {
                    ScreenView.summerView.setLayoutX(finalX);
                }
            });
            
            x--;
            
            try {
                sleep(controlSummerSpeed());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    
    private void walkStreet_a1Toa2() {
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                ScreenView.summerView.setImage(backSummerImg);
            }
        });
        
        double y = ScreenView.summerView.getLayoutY();
        
        while (y >= 421) {
            double finalY = y;
            Platform.runLater(new Runnable() {
                @Override
                public void run() {
                    ScreenView.summerView.setLayoutY(finalY);
                }
            });
            
            y--;
            
            try {
                sleep(controlSummerSpeed());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        
        SemaphoreControl.rua_a3.down();
    }
    
    private void walkStreet_a3() {
        double y = ScreenView.summerView.getLayoutY();
        
        while (y >= 287) {
            double finalY = y;
            Platform.runLater(new Runnable() {
                @Override
                public void run() {
                    ScreenView.summerView.setLayoutY(finalY);
                }
            });
            
            y--;
            
            try {
                sleep(controlSummerSpeed());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    
    private void walkStreet_a4() {
        double y = ScreenView.summerView.getLayoutY();
        
        while (y >= 185) {
            double finalY = y;
            Platform.runLater(new Runnable() {
                @Override
                public void run() {
                    ScreenView.summerView.setLayoutY(finalY);
                }
            });
            
            y--;
            
            try {
                sleep(controlSummerSpeed());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        
        SemaphoreControl.rua_a3.up();
    }
    
    private void walkStreet_a4Toa5() {
        double y = ScreenView.summerView.getLayoutY();
        
        while (y >= -25) {
            double finalY = y;
            Platform.runLater(new Runnable() {
                @Override
                public void run() {
                    ScreenView.summerView.setLayoutY(finalY);
                }
            });
            
            y--;
            
            try {
                sleep(controlSummerSpeed());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    
    private void walkStreet_a5Tob5() {
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                ScreenView.summerView.setImage(rightSideSummerImg);
            }
        });
        
        double x = ScreenView.summerView.getLayoutX();
        
        while (x <= 336) {
            double finalX = x;
            Platform.runLater(new Runnable() {
                @Override
                public void run() {
                    ScreenView.summerView.setLayoutX(finalX);
                }
            });
            
            x++;
            
            try {
                sleep(controlSummerSpeed());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    
    private void walkStreet_bc5() {
        double x = ScreenView.summerView.getLayoutX();
        
        while (x <= 385) {
            double finalX = x;
            Platform.runLater(new Runnable() {
                @Override
                public void run() {
                    ScreenView.summerView.setLayoutX(finalX);
                }
            });
            
            x++;
            
            try {
                sleep(controlSummerSpeed());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                ScreenView.summerView.setImage(frontSummerImg);
            }
        });
        
        double y = ScreenView.summerView.getLayoutY();
        
        while (y <= 45) {
            double finalY = y;
            Platform.runLater(new Runnable() {
                @Override
                public void run() {
                    ScreenView.summerView.setLayoutY(finalY);
                }
            });
            
            y++;
            
            try {
                sleep(controlSummerSpeed());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        
        // Controla o trajeto entre Jerry e Summer
        SemaphoreControl.rua_b5Toa4v2.up();
        
        while (y <= 87) {
            double finalY1 = y;
            Platform.runLater(new Runnable() {
                @Override
                public void run() {
                    ScreenView.summerView.setLayoutY(finalY1);
                }
            });
            
            y++;
            
            try {
                sleep(controlSummerSpeed());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    
    private void walkStreet_c54() {
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                ScreenView.summerView.setImage(rightSideSummerImg);
            }
        });
        
        double x = ScreenView.summerView.getLayoutX();
        
        while (x <= 435) {
            double finalX = x;
            Platform.runLater(new Runnable() {
                @Override
                public void run() {
                    ScreenView.summerView.setLayoutX(finalX);
                }
            });
            
            x++;
            
            try {
                sleep(controlSummerSpeed());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    
        SemaphoreControl.rua_a1Tobc5.up();
        SemaphoreControl.rua_bc5Andcd5.up();
        
        while (x <= 527) {
            double finalX1 = x;
            Platform.runLater(new Runnable() {
                @Override
                public void run() {
                    ScreenView.summerView.setLayoutX(finalX1);
                }
            });
            
            x++;
            
            try {
                sleep(controlSummerSpeed());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    
        SemaphoreControl.rua_d5Toe4.down();
        SemaphoreControl.rua_bc5Andcd5.down();
        
        while (x <= 575) {
            double finalX1 = x;
            Platform.runLater(new Runnable() {
                @Override
                public void run() {
                    ScreenView.summerView.setLayoutX(finalX1);
                }
            });
            
            x++;
            
            try {
                sleep(controlSummerSpeed());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    
    private void walkStreet_cd5() {
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                ScreenView.summerView.setImage(backSummerImg);
            }
        });
        
        double y = ScreenView.summerView.getLayoutY();
        
        while (y >= 47) {
            double finalY = y;
            Platform.runLater(new Runnable() {
                @Override
                public void run() {
                    ScreenView.summerView.setLayoutY(finalY);
                }
            });
            
            y--;
            
            try {
                sleep(controlSummerSpeed());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    
        while (y >= -22) {
            double finalY1 = y;
            Platform.runLater(new Runnable() {
                @Override
                public void run() {
                    ScreenView.summerView.setLayoutY(finalY1);
                }
            });
            
            y--;
            
            try {
                sleep(controlSummerSpeed());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        
    }
    
    private void walkStreet_d5Toe5() {
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                ScreenView.summerView.setImage(rightSideSummerImg);
            }
        });
        
        double x = ScreenView.summerView.getLayoutX();
        
        while (x <= 626) {
            double finalX = x;
            Platform.runLater(new Runnable() {
                @Override
                public void run() {
                    ScreenView.summerView.setLayoutX(finalX);
                }
            });
            
            x++;
            
            try {
                sleep(controlSummerSpeed());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        
        SemaphoreControl.rua_bc5Andcd5.up();
        
        while (x <= 970) {
            double finalX1 = x;
            Platform.runLater(new Runnable() {
                @Override
                public void run() {
                    ScreenView.summerView.setLayoutX(finalX1);
                }
            });
            
            x++;
            
            try {
                sleep(controlSummerSpeed());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    
    private void walkStreet_e5To4e() {
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                ScreenView.summerView.setImage(frontSummerImg);
            }
        });
        
        double y = ScreenView.summerView.getLayoutY();
        
        while (y <= 177) {
            double finalY = y;
            Platform.runLater(new Runnable() {
                @Override
                public void run() {
                    ScreenView.summerView.setLayoutY(finalY);
                }
            });
            
            y++;
            
            try {
                sleep(controlSummerSpeed());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    
    private void walkStreet_e4Toe1() {
        double y = ScreenView.summerView.getLayoutY();
        
        while (y <= 431) {
            double finalY = y;
            Platform.runLater(new Runnable() {
                @Override
                public void run() {
                    ScreenView.summerView.setLayoutY(finalY);
                }
            });
            
            y++;
            
            try {
                sleep(controlSummerSpeed());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        
        SemaphoreControl.rua_e3.up();
        SemaphoreControl.rua_d5Toe4.up();
        
        while (y <= 636) {
            double finalY1 = y;
            Platform.runLater(new Runnable() {
                @Override
                public void run() {
                    ScreenView.summerView.setLayoutY(finalY1);
                }
            });
            
            y++;
            
            try {
                sleep(controlSummerSpeed());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    
    private void walkStreet_e1() {
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                ScreenView.summerView.setImage(leftSideSummerImg);
            }
        });
        
        double x = ScreenView.summerView.getLayoutX();
        
        while (x >= 764) {
            double finalX = x;
            Platform.runLater(new Runnable() {
                @Override
                public void run() {
                    ScreenView.summerView.setLayoutX(finalX);
                }
            });
            
            x--;
            
            try {
                sleep(controlSummerSpeed());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    
    private void walkStreet_de1() {
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                ScreenView.summerView.setImage(backSummerImg);
            }
        });
        
        double y = ScreenView.summerView.getLayoutY();
        
        while (y >= 563) {
            double finalY = y;
            Platform.runLater(new Runnable() {
                @Override
                public void run() {
                    ScreenView.summerView.setLayoutY(finalY);
                }
            });
            
            y--;
            
            try {
                sleep(controlSummerSpeed());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    
    private void walkStreet_de2() {
        double y = ScreenView.summerView.getLayoutY();
        
        while (y >= 425) {
            double finalY = y;
            Platform.runLater(new Runnable() {
                @Override
                public void run() {
                    ScreenView.summerView.setLayoutY(finalY);
                }
            });
            
            y--;
            
            try {
                sleep(controlSummerSpeed());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    
    private void walkStreet_d32() {
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                ScreenView.summerView.setImage(leftSideSummerImg);
            }
        });
        
        double y = ScreenView.summerView.getLayoutY();
        
        while (y >= 356) {
            double finalY = y;
            Platform.runLater(new Runnable() {
                @Override
                public void run() {
                    ScreenView.summerView.setLayoutY(finalY);
                }
            });
            
            y--;
            
            try {
                sleep(controlSummerSpeed());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        
        double x = ScreenView.summerView.getLayoutX();
        
        while (x >= 717) {
            double finalX = x;
            Platform.runLater(new Runnable() {
                @Override
                public void run() {
                    ScreenView.summerView.setLayoutX(finalX);
                }
            });
            
            x--;
            
            try {
                sleep(controlSummerSpeed());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        
        SemaphoreControl.rua_de2.up();
        
        while (x >= 571) {
            double finalX1 = x;
            Platform.runLater(new Runnable() {
                @Override
                public void run() {
                    ScreenView.summerView.setLayoutX(finalX1);
                }
            });
            
            x--;
            
            try {
                sleep(controlSummerSpeed());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    
    private void walkStreet_cd3() {
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                ScreenView.summerView.setImage(backSummerImg);
            }
        });
        
        double y = ScreenView.summerView.getLayoutY();
        
        while (y >= 305) {
            double finalY1 = y;
            Platform.runLater(new Runnable() {
                @Override
                public void run() {
                    ScreenView.summerView.setLayoutY(finalY1);
                }
            });
            
            y--;
            
            try {
                sleep(controlSummerSpeed());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        
        SemaphoreControl.rua_d32.up();
        
        while (y >= 277) {
            double finalY = y;
            Platform.runLater(new Runnable() {
                @Override
                public void run() {
                    ScreenView.summerView.setLayoutY(finalY);
                }
            });
            
            y--;
            
            try {
                sleep(controlSummerSpeed());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    
    private void walkStreet_c43() {
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                ScreenView.summerView.setImage(leftSideSummerImg);
            }
        });
        
        double y = ScreenView.summerView.getLayoutY();
        
        while (y >= 290) {
            double finalY = y;
            Platform.runLater(new Runnable() {
                @Override
                public void run() {
                    ScreenView.summerView.setLayoutY(finalY);
                }
            });
            
            y--;
            
            try {
                sleep(controlSummerSpeed());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        
        SemaphoreControl.rua_c43Andbc3.down();
//        SemaphoreControl.rua_c43.down();
        
        while (y >= 222) {
            double finalY1 = y;
            Platform.runLater(new Runnable() {
                @Override
                public void run() {
                    ScreenView.summerView.setLayoutY(finalY1);
                }
            });
            
            y--;
            
            try {
                sleep(controlSummerSpeed());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        
        double x = ScreenView.summerView.getLayoutX();
        
        while (x >= 430) {
            double finalX = x;
            Platform.runLater(new Runnable() {
                @Override
                public void run() {
                    ScreenView.summerView.setLayoutX(finalX);
                }
            });
            
            x--;
            
            try {
                sleep(controlSummerSpeed());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    
    private void walkStreet_bc3() {
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                ScreenView.summerView.setImage(frontSummerImg);
            }
        });
        
        double x = ScreenView.summerView.getLayoutX();
        
        while (x >= 385) {
            double finalX = x;
            Platform.runLater(new Runnable() {
                @Override
                public void run() {
                    ScreenView.summerView.setLayoutX(finalX);
                }
            });
            
            x--;
            
            try {
                sleep(controlSummerSpeed());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        
        double y = ScreenView.summerView.getLayoutY();
        
        while (y <= 361) {
            double finalY = y;
            Platform.runLater(new Runnable() {
                @Override
                public void run() {
                    ScreenView.summerView.setLayoutY(finalY);
                }
            });
            
            y++;
            
            try {
                sleep(controlSummerSpeed());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

//        SemaphoreControl.rua_c43.up();
        
        while (x >= 335) {
            double finalX1 = x;
            Platform.runLater(new Runnable() {
                @Override
                public void run() {
                    ScreenView.summerView.setLayoutX(finalX1);
                }
            });
            
            x--;
            
            try {
                sleep(controlSummerSpeed());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    
    private long controlSummerSpeed() {
        long speed = (long) (12 - ControlsView.summerSpeedSld.getValue());
        return speed;
    }
}
