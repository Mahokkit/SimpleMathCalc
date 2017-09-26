package nscc_appd200.simplemathcalc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

import java.lang.String;
import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView display;

    private int count = 0;
    private int negCount = 0;
    String  s1;
    double v1 = 0, result;
    boolean newValue = true;
    boolean booPlus = false, booMinus = false, booMultiply = false, booDivided = false; //for equal
    boolean opPlus = false, opMinus = false, opMultiply = false, opDivided = false; //for operation
    DecimalFormat decimalFormat = new DecimalFormat("#.#####");
    Button btnEqual;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button num1 = (Button) findViewById(R.id.btn1);
        num1.setOnClickListener(this);
        Button num2 = (Button) findViewById(R.id.btn2);
        num2.setOnClickListener(this);
        Button num3 = (Button) findViewById(R.id.btn3);
        num3.setOnClickListener(this);
        Button num4 = (Button) findViewById(R.id.btn4);
        num4.setOnClickListener(this);
        Button num5 = (Button) findViewById(R.id.btn5);
        num5.setOnClickListener(this);
        Button num6 = (Button) findViewById(R.id.btn6);
        num6.setOnClickListener(this);
        Button num7 = (Button) findViewById(R.id.btn7);
        num7.setOnClickListener(this);
        Button num8 = (Button) findViewById(R.id.btn8);
        num8.setOnClickListener(this);
        Button num9 = (Button) findViewById(R.id.btn9);
        num9.setOnClickListener(this);
        Button num0 = (Button) findViewById(R.id.btn0);
        num0.setOnClickListener(this);
        Button btnClear = (Button) findViewById(R.id.btnClear);
        btnClear.setOnClickListener(this);
        Button btnBkSpc = (Button) findViewById(R.id.btnBkSpc);
        btnBkSpc.setOnClickListener(this);
        Button btnPlus = (Button) findViewById(R.id.btnPlus);
        btnPlus.setOnClickListener(this);
        Button btnMinus = (Button) findViewById(R.id.btnMinus);
        btnMinus.setOnClickListener(this);
        Button btnMultiply = (Button) findViewById(R.id.btnMultiply);
        btnMultiply.setOnClickListener(this);
        Button btnDivided = (Button) findViewById(R.id.btnDivided);
        btnDivided.setOnClickListener(this);
        Button btnDecimal = (Button) findViewById(R.id.btnDecimal);
        btnDecimal.setOnClickListener(this);
        Button btnPosNeg = (Button) findViewById(R.id.btnPosNeg);
        btnPosNeg.setOnClickListener(this);
        btnEqual = (Button) findViewById(R.id.btnEqual);
        this.btnEqual.setOnClickListener(this);

        display = (TextView) findViewById(R.id.display);
        display.setText(null);
    }


    public void onClick(View view) {
//        TextView display = (TextView) findViewById(R.id.display);
        switch (view.getId()) {
            case R.id.btn1:
                if (newValue != true)
                {
                    display.setText(display.getText() + display.getResources().getString(R.string.txtNum1));
                    s1 = s1 + "1";
                }
                else
                {
                    display.setText(display.getText() + display.getResources().getString(R.string.txtNum1));
                    s1 = "1";
                    newValue = false;
                }
                break;
            case R.id.btn2:
                if (newValue != true)
                {
                    display.setText(display.getText() + display.getResources().getString(R.string.txtNum2));
                    s1 = s1 + "2";
                }
                else
                {
                    display.setText(display.getText() + display.getResources().getString(R.string.txtNum2));
                    s1 = "2";
                    newValue = false;
                }
                break;
            case R.id.btn3:
                if (newValue != true)
                {
                    display.setText(display.getText() + display.getResources().getString(R.string.txtNum3));
                    s1 = s1 + "3";
                }
                else
                {
                    display.setText(display.getText() + display.getResources().getString(R.string.txtNum3));
                    s1 = "3";
                    newValue = false;
                }
                break;
            case R.id.btn4:
                if (newValue != true)
                {
                    display.setText(display.getText() + display.getResources().getString(R.string.txtNum4));
                    s1 = s1 + "4";
                }
                else
                {
                    display.setText(display.getText() + display.getResources().getString(R.string.txtNum4));
                    s1 = "4";
                    newValue = false;
                }
                break;
            case R.id.btn5:
                if (newValue != true)
                {
                    display.setText(display.getText() + display.getResources().getString(R.string.txtNum5));
                    s1 = s1 + "5";
                }
                else
                {
                    display.setText(display.getText() + display.getResources().getString(R.string.txtNum5));
                    s1 = "5";
                    newValue = false;
                }
                break;
            case R.id.btn6:
                if (newValue != true)
                {
                    display.setText(display.getText() + display.getResources().getString(R.string.txtNum6));
                    s1 = s1 + "6";
                }
                else
                {
                    display.setText(display.getText() + display.getResources().getString(R.string.txtNum6));
                    s1 = "6";
                    newValue = false;
                }
                break;
            case R.id.btn7:
                if (newValue != true)
                {
                    display.setText(display.getText() + display.getResources().getString(R.string.txtNum7));
                    s1 = s1 + "7";
                }
                else
                {
                    display.setText(display.getText() + display.getResources().getString(R.string.txtNum7));
                    s1 = "7";
                    newValue = false;
                }
                break;
            case R.id.btn8:
                if (newValue != true)
                {
                    display.setText(display.getText() + display.getResources().getString(R.string.txtNum7));
                    s1 = s1 + "7";
                }
                else
                {
                    display.setText(display.getText() + display.getResources().getString(R.string.txtNum7));
                    s1 = "7";
                    newValue = false;
                }
                break;
            case R.id.btn9:
                if (newValue != true)
                {
                    display.setText(display.getText() + display.getResources().getString(R.string.txtNum9));
                    s1 = s1 + "9";
                }
                else
                {
                    display.setText(display.getText() + display.getResources().getString(R.string.txtNum9));
                    s1 = "9";
                    newValue = false;
                }
                break;
            case R.id.btn0:
                if (newValue != true)
                {
                    display.setText(display.getText() + display.getResources().getString(R.string.txtNum0));
                    s1 = s1 + "0";
                }
                else
                {
                    display.setText(display.getText() + display.getResources().getString(R.string.txtNum0));
                    s1 = "0";
                    newValue = false;
                }
                break;
            case R.id.btnClear:
                display.setText(null);
                clearALL();
                break;
            case R.id.btnDivided:
                operationClicked("divided");
                display.setText(display.getText() + display.getResources().getString(R.string.txtDivided));
                break;
            case R.id.btnMultiply:
                operationClicked("multiply");
                display.setText(display.getText() + display.getResources().getString(R.string.txtMultiply));
                opMultiply = true;
                break;
            case R.id.btnPlus:
                operationClicked("plus");
                display.setText(display.getText() + display.getResources().getString(R.string.txtPlus));
                break;
            case R.id.btnMinus:
                operationClicked("minus");
                display.setText(display.getText() + display.getResources().getString(R.string.txtMinus));
                break;
            case R.id.btnDecimal:
                if (count == 0 && display.length() != 0) {
                    display.setText(display.getText() + ".");
                    s1 = s1 + ".";
                    count++;
                }
                break;
            case R.id.btnBkSpc:
                if (display.getText().toString().isEmpty()) {
                    display.setText(null);
                    clearALL();
                    break;
                } else {
                    String txt = display.getText().toString();
                    txt = txt.substring(0, display.length() - 1);
                    display.setText(txt);
                    break;
                }
            case R.id.btnPosNeg:
                s1 = "-" + s1;
                if (negCount == 0)
                {
                    display.setText(s1);
                }
                else
                {
                    if (booPlus == true)
                    {
                        display.setText(Double.toString(result) + "+" + s1);
                    }
                    else if (booMinus == true)
                    {
                        display.setText(Double.toString(result) + "-" + s1);
                    }
                    else if (booMultiply==true)
                    {
                        display.setText(Double.toString(result) + "x" + s1);
                    }
                    else if (booDivided == true)
                    {
                        display.setText(Double.toString(result) + display.getResources().getString(R.string.txtDivided) + s1);
                    }
                }
                negCount++;
                break;
            case R.id.btnEqual:
                if (booPlus == true)
                {
                    operationClicked("plus");
                }
                else if (booMinus == true)
                {
                    operationClicked("minus");
                }
                else if (booMultiply == true)
                {
                    operationClicked("multiply");
                }
                else if (booDivided == true)
                {
                    operationClicked("divided");
                }

                opPlus = false;
                opMinus = false;
                opDivided = false;
                opMultiply = false;
                booDivided = false;
                booMultiply = false;
                booMinus = false;
                booPlus = false;
                s1 = Double.toString(result);
                count = 0;
                negCount = 0;
                break;
        }
    }

    private void clearALL()
    {
        result = 0;
        v1 = 0;
        opPlus = false;
        opMinus = false;
        opDivided = false;
        opMultiply = false;
        booDivided = false;
        booMultiply = false;
        booMinus = false;
        booPlus = false;
        count = 0;
        negCount = 0;
        s1 = "";
    }

    private void operationClicked(String op)
    {
        if (op == "plus")
        {
            if (opPlus == false)
            {
                result = Double.parseDouble(s1);
                opPlus = true;
            }
            else if (opPlus == true)
            {
                v1 = Double.parseDouble(s1);
                result = result + v1;
                display.setText(decimalFormat.format(result));
            }
            newValue = true;
            booPlus = true;
        }
        else if (op == "minus")
        {
            if (opMinus == false)
            {
                result = Double.parseDouble(s1);
                opMinus = true;

            }
            else if (opMinus == true)
            {
                v1 = Double.parseDouble(s1);
                result = result - v1;
                display.setText(decimalFormat.format(result));
            }
            newValue = true;
            booMinus = true;
        }
        else if (op == "multiply")
        {
            if (opMultiply == false)
            {
                result = Double.parseDouble(s1);
                opMultiply = true;
            }
            else if (opMultiply == true)
            {
                v1 = Double.parseDouble(s1);
                result = result * v1;
                display.setText(decimalFormat.format(result));
            }
            newValue = true;
            booMultiply = true;
        }
        else if (op == "divided")
        {
            if (opDivided == false)
            {
                result = Double.parseDouble(s1);
                opDivided = true;
            }
            else if (opDivided == true)
            {
                v1 = Double.parseDouble(s1);
                if (v1 == 0) //fix infinity problem.
                {
                    result = 0;
                    display.setText(decimalFormat.format(0));
                }
                else
                {
                    result = result / v1;
                    display.setText(decimalFormat.format(result));
                }
            }
            newValue = true;
            booDivided = true;
        }
        count = 0;
    }

}