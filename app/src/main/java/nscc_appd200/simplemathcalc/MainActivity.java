package nscc_appd200.simplemathcalc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;
import java.lang.String;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
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
    }


    public void onClick (View view)
    {
        TextView display = (TextView) findViewById(R.id.display);
        switch (view.getId())
        {
            case R.id.btn1:
                display.setText(display.getText() + display.getResources().getString(R.string.txtNum1));
                break;
            case R.id.btn2:
                display.setText(display.getText() + display.getResources().getString(R.string.txtNum2));
                break;
            case R.id.btn3:
                display.setText(display.getText() + display.getResources().getString(R.string.txtNum3));
                break;
            case R.id.btn4:
                display.setText(display.getText() + display.getResources().getString(R.string.txtNum4));
                break;
            case R.id.btn5:
                display.setText(display.getText() + display.getResources().getString(R.string.txtNum5));
                break;
            case R.id.btn6:
                display.setText(display.getText() + display.getResources().getString(R.string.txtNum6));
                break;
            case R.id.btn7:
                display.setText(display.getText() + display.getResources().getString(R.string.txtNum7));
                break;
            case R.id.btn8:
                display.setText(display.getText() + display.getResources().getString(R.string.txtNum8));
                break;
            case R.id.btn9:
                display.setText(display.getText() + display.getResources().getString(R.string.txtNum9));
                break;
            case R.id.btn0:
                display.setText(display.getText() + display.getResources().getString(R.string.txtNum0));
                break;
            case R.id.btnClear:
                display.setText(null);
                break;
            case R.id.btnDivided:
                display.setText(display.getText() + display.getResources().getString(R.string.txtDivided));
                break;
            case R.id.btnMultiply:
                display.setText(display.getText() + display.getResources().getString(R.string.txtMultiply));
                break;
            case R.id.btnPlus:
                display.setText(display.getText() + display.getResources().getString(R.string.txtPlus));
                break;
            case R.id.btnMinus:
                display.setText(display.getText() + display.getResources().getString(R.string.txtMinus));
                break;
            case R.id.btnDecimal:
                display.setText(display.getText() + display.getResources().getString(R.string.txtDecimal));
                break;
            case R.id.btnBkSpc:
                if (display.getText().toString().isEmpty())
                {
                    display.setText(null);
                    break;
                }
                else
                {
                    String txt = display.getText().toString();
                    txt = txt.substring(0, display.length() - 1);
                    display.setText(txt);
                    break;

                }
        }
    }
//        display.setText(display.getText() + "1");
}
