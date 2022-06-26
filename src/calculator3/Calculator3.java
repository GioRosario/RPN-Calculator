package calculator3;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Text;
import javafx.scene.control.TextField;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 *
 * @author John
 */
public class Calculator3 extends Application {

    private String xstr = "";
    private double x = 0.0; // create variable x as double
    private double y = 0.0; // create variable y as double
    private double z = 0.0; // create variable z as double
    private double t = 0.0; // create variable t as double 

    @Override
    public void start(Stage primaryStage) {
        GridPane root = new GridPane(); // create Gridpane
        root.setStyle("-fx-padding: 10 0 0 40"); // centering

        TextField displayAns = new TextField(); // Textfield for answer display
        root.add(displayAns, 0, 0); // add answer display to root - row/col 1

        HBox row2 = new HBox(5); // row 2 HBox with spacing
        row2.setStyle("-fx-padding: 5 0 5 0");

        // row 2 buttons and dimensions
        Button btnRad = new Button("Rad");
        btnRad.setPrefWidth(50);
        btnRad.setPrefHeight(35);

        Button btnDeg = new Button("Deg");
        btnDeg.setPrefWidth(50);
        btnDeg.setPrefHeight(35);

        Button btnInvert = new Button("x<->y");
        btnInvert.setPrefWidth(50);
        btnInvert.setPrefHeight(35);

        Button btnExp = new Button("y^x");
        btnExp.setPrefWidth(50);
        btnExp.setPrefHeight(35);

        Button btnSqrt = new Button("√");
        btnSqrt.setPrefWidth(50);
        btnSqrt.setPrefHeight(35);

        // add buttons to HBox and add to root at row 2
        row2.getChildren().addAll(btnRad, btnDeg, btnInvert, btnExp, btnSqrt);
        root.add(row2, 0, 1);

        HBox row3 = new HBox(5); // row 3 HBox with spacing
        row3.setStyle("-fx-padding: 0 0 5 0");

        // row 3 buttons and dimensions        
        Button btnSin = new Button("Sin");
        btnSin.setPrefWidth(50);
        btnSin.setPrefHeight(35);

        Button btn7 = new Button("7");
        btn7.setPrefWidth(50);
        btn7.setPrefHeight(35);

        Button btn8 = new Button("8");
        btn8.setPrefWidth(50);
        btn8.setPrefHeight(35);

        Button btn9 = new Button("9");
        btn9.setPrefWidth(50);
        btn9.setPrefHeight(35);

        Button btnDivide = new Button("/");
        btnDivide.setPrefWidth(50);
        btnDivide.setPrefHeight(35);

        // add buttons to HBox and add to root at row 3
        row3.getChildren().addAll(btnSin, btn7, btn8, btn9, btnDivide);
        root.add(row3, 0, 2);

        HBox row4 = new HBox(5); // row 4 HBox with spacing
        row4.setStyle("-fx-padding: 0 0 5 0");

        // row 4 buttons and dimensions
        Button btnCos = new Button("Cos");
        btnCos.setPrefWidth(50);
        btnCos.setPrefHeight(35);

        Button btn4 = new Button("4");
        btn4.setPrefWidth(50);
        btn4.setPrefHeight(35);

        Button btn5 = new Button("5");
        btn5.setPrefWidth(50);
        btn5.setPrefHeight(35);

        Button btn6 = new Button("6");
        btn6.setPrefWidth(50);
        btn6.setPrefHeight(35);

        Button btnMultiply = new Button("X");
        btnMultiply.setPrefWidth(50);
        btnMultiply.setPrefHeight(35);

        // add buttons to HBox and add to root at row 4
        row4.getChildren().addAll(btnCos, btn4, btn5, btn6, btnMultiply);
        root.add(row4, 0, 3);

        HBox row5 = new HBox(5); // row 5 HBox with spacing
        row5.setStyle("-fx-padding: 0 0 5 0");

        // row 5 buttons and dimensions
        Button btnTan = new Button("Tan");
        btnTan.setPrefWidth(50);
        btnTan.setPrefHeight(35);

        Button btn1 = new Button("1");
        btn1.setPrefWidth(50);
        btn1.setPrefHeight(35);

        Button btn2 = new Button("2");
        btn2.setPrefWidth(50);
        btn2.setPrefHeight(35);

        Button btn3 = new Button("3");
        btn3.setPrefWidth(50);
        btn3.setPrefHeight(35);

        Button btnSubtract = new Button("-");
        btnSubtract.setPrefWidth(50);
        btnSubtract.setPrefHeight(35);

        // add buttons to HBox and add to root at row 5
        row5.getChildren().addAll(btnTan, btn1, btn2, btn3, btnSubtract);
        root.add(row5, 0, 4);

        HBox row6 = new HBox(5); // row 6 HBox and spacing
        row6.setStyle("-fx-padding: 0 0 5 0");

        // row 6 buttons and dimensions
        Button btnCHS = new Button("CHS");
        btnCHS.setPrefWidth(50);
        btnCHS.setPrefHeight(35);

        Button btn0 = new Button("0");
        btn0.setPrefWidth(50);
        btn0.setPrefHeight(35);

        Button btnDecimal = new Button(".");
        btnDecimal.setPrefWidth(50);
        btnDecimal.setPrefHeight(35);

        Button btnPercent = new Button("%");
        btnPercent.setPrefWidth(50);
        btnPercent.setPrefHeight(35);

        Button btnAdd = new Button("+");
        btnAdd.setPrefWidth(50);
        btnAdd.setPrefHeight(35);

        // add buttons to HBox and add to root at row 6
        row6.getChildren().addAll(btnCHS, btn0, btnDecimal, btnPercent, btnAdd);
        root.add(row6, 0, 5);

        HBox row7 = new HBox(5); // row 7 HBox

        // row 7 buttons and dimensions
        Button btnClear = new Button("CLR");
        btnClear.setPrefWidth(50);
        btnClear.setPrefHeight(35);

        Button btnEnter = new Button("Enter");
        btnEnter.setStyle("-fx-text-fill: white;" + "-fx-font-weight: bold;");
        btnEnter.setPrefWidth(215);
        btnEnter.setPrefHeight(35);
        btnEnter.setBackground(new Background(new BackgroundFill(Color.ORANGE, CornerRadii.EMPTY, Insets.EMPTY)));

        // add buttons to HBox and add to root at row 7
        row7.getChildren().addAll(btnClear, btnEnter);
        root.add(row7, 0, 6);

        // not allowing negative 0
        if (x == -0) {
            x = 0;
        }
        // button actions
        // numbers (in ascending order)
        btn0.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                xstr += "0";
                x = Double.parseDouble(xstr);
                displayAns.setText(xstr);
                printStack();
            }
        });
        btn1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                xstr += "1";
                x = Double.parseDouble(xstr);
                displayAns.setText(xstr);
                printStack();
            }
        });
        btn2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                xstr += "2";
                x = Double.parseDouble(xstr);
                displayAns.setText(xstr);
                printStack();
            }
        });
        btn3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                xstr += "3";
                x = Double.parseDouble(xstr);
                displayAns.setText(xstr);
                printStack();
            }
        });
        btn4.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                xstr += "4";
                x = Double.parseDouble(xstr);
                displayAns.setText(xstr);
                printStack();
            }
        });
        btn5.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                xstr += "5";
                x = Double.parseDouble(xstr);
                displayAns.setText(xstr);
                printStack();
            }
        });
        btn6.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                xstr += "6";
                x = Double.parseDouble(xstr);
                displayAns.setText(xstr);
                printStack();
            }
        });
        btn7.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                xstr += "7";
                x = Double.parseDouble(xstr);
                displayAns.setText(xstr);
                printStack();
            }
        });
        btn8.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                xstr += "8";
                x = Double.parseDouble(xstr);
                displayAns.setText(xstr);
                printStack();
            }
        });
        btn9.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                xstr += "9";
                x = Double.parseDouble(xstr);
                displayAns.setText(xstr);
                printStack();
            }
        });

        // Add button operation        
        btnAdd.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {;
                x = y + x;
                y = z;
                z = t;
                t = 0;
                String val = String.valueOf(String.format("%.4f", x));
                displayAns.setText(val);
                printStack();
            }
        });

        // Subtract button operation
        btnSubtract.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {;
                x = y - x;
                y = z;
                z = t;
                t = 0;
                String val = String.valueOf(String.format("%.4f", x));
                displayAns.setText(val);
                printStack();
            }
        });

        // Multiplication button operation
        btnMultiply.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {;
                x = y * x;
                y = z;
                z = t;
                t = 0;
                String val = String.valueOf(String.format("%.4f", x));
                displayAns.setText(val);
                printStack();
            }
        });

        // Division button operation
        btnDivide.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {;
                //if (xstr != "")
                //    x = Double.parseDouble(xstr);
                x = y / x;
                y = z;
                z = t;
                t = 0;
                String val = String.valueOf(String.format("%.4f", x));
                displayAns.setText(val);
                printStack();
            }
        });

        // Square root button operation
        btnSqrt.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                t = z;
                z = y;
                y = x;
                x = Math.sqrt(x);
                printStack();
                String val = String.valueOf(String.format("%.4f", x));
                displayAns.setText(val);
                xstr = "";
            }
        });

        // Exponent button operation
        btnExp.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                x = Math.pow(y, x);
                printStack();
                String val = String.valueOf(String.format("%.4f", x));
                displayAns.setText(val);
                xstr = "";
            }
        });

        // Invert button operation (invert x and y)
        btnInvert.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                double temp = 0.0;
                temp = x;
                x = y;
                y = temp;
                printStack();
                String val = String.valueOf(String.format("%.4f", x));
                displayAns.setText(val);
                xstr = "";
            }
        });

        // Degree button operation (converts radians to degrees)
        btnDeg.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                t = z;
                z = y;
                y = x;
                x = Math.toDegrees(x);
                printStack();
                String val = String.valueOf(String.format("%.4f", x));
                displayAns.setText(val);
                xstr = "";
            }
        });

        // Radian button operation (converts degree to radian)
        btnRad.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                t = z;
                z = y;
                y = x;
                x = Math.toRadians(x);
                printStack();
                String val = String.valueOf(String.format("%.4f", x));
                displayAns.setText(val);
                xstr = "";
            }
        });

        // Sin button operation
        btnSin.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                t = z;
                z = y;
                y = x;
                x = Math.sin(x);
                printStack();
                String val = String.valueOf(String.format("%.4f", x));
                displayAns.setText(val);
                xstr = "";
            }
        });

        // Cos button operation
        btnCos.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                t = z;
                z = y;
                y = x;
                x = Math.cos(x);
                printStack();
                String val = String.valueOf(String.format("%.4f", x));
                displayAns.setText(val);
                xstr = "";
            }
        });

        // Tan button operation
        btnTan.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                t = z;
                z = y;
                y = x;
                x = Math.tan(x);
                printStack();
                String val = String.valueOf(String.format("%.4f", x));
                displayAns.setText(val);
                xstr = "";
            }
        });

        // CHS button operation (convert negative to positive and back)
        btnCHS.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {;
                x = -x;
                printStack();
                String val = String.valueOf(String.format("%.4f", x));
                displayAns.setText(val);
                xstr = "";
            }
        });

        // Clear x button operation
        btnClear.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {;
                x = 0;
                xstr = "";
                printStack();
                String val = String.valueOf(String.format("%.4f", x));
                displayAns.setText(val);
                xstr = "";
            }
        });

        // Decimal button operation
        btnDecimal.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (!xstr.contains(".")) {
                    xstr += ".";
                }
                printStack();
                displayAns.setText(xstr);
            }
        });

        // Percent button operation
        btnPercent.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {;
                x = x * .01;
                printStack();
                String val = String.valueOf(String.format("%.4f", x));
                displayAns.setText(val);
            }
        });

        // Enter button configuration
        btnEnter.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                t = z;
                z = y;
                xstr = "";
                //if (xstr != "")
                //    y = Double.parseDouble(xstr);
                //else
                //    y = x;
                y = x;
                x = y;
                //xstr = "";
                printStack();
                String val = String.valueOf(String.format("%.4f", x));
                displayAns.setText(val);
            }
        });

        Scene scene = new Scene(root, 350, 300);

        primaryStage.setTitle("RPN Calculator");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public void printStack() {
        //System.out.println(xstr);
        System.out.println("T = " + t);
        System.out.println("Z = " + z);
        System.out.println("Y = " + y);
        System.out.println("X = " + x + "\n");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
