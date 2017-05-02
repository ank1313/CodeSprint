package com.example.android.codesprint2;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Stack;

public class MainActivity extends AppCompatActivity {

    private Stack s1 = new Stack();
    private Stack s2 = new Stack();
    private Stack s3 = new Stack();
    private int turn=1;
    private int size1 = 5;
    private int size2 = 0;
    private int size3 = 0;
    private int p1=0;
    private int p2=0;
    TextView left5;
    TextView left4;
    TextView left3;
    TextView left2;
    TextView left1;
    TextView middle5;
    TextView middle4;
    TextView middle3;
    TextView middle2;
    TextView middle1;
    TextView right5;
    TextView right4;
    TextView right3;
    TextView right2;
    TextView right1;
    TextView p1score;
    TextView p2score;

    TextView playerturn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });

        s1.push(5);
        s1.push(4);
        s1.push(3);
        s1.push(2);
        s1.push(1);

        left5 = (TextView) findViewById(R.id.left5);
        left4 = (TextView) findViewById(R.id.left4);
        left3 = (TextView) findViewById(R.id.left3);
        left2 = (TextView) findViewById(R.id.left2);
        left1 = (TextView) findViewById(R.id.left1);
        middle5 = (TextView) findViewById(R.id.middle5);
        middle4 = (TextView) findViewById(R.id.middle4);
        middle3 = (TextView) findViewById(R.id.middle3);
        middle2 = (TextView) findViewById(R.id.middle2);
        middle1 = (TextView) findViewById(R.id.middle1);
        right1 = (TextView) findViewById(R.id.right1);
        right2 = (TextView) findViewById(R.id.right2);
        right3 =  (TextView) findViewById(R.id.right3);
        right4 = (TextView) findViewById(R.id.right4);
        right5 = (TextView)findViewById(R.id.right5);
        playerturn = (TextView) findViewById(R.id.playerturn);
        p1score = (TextView) findViewById(R.id.p1score);
        p2score = (TextView) findViewById(R.id.p2score);
    }


    public void atob(View view)
    {
        if(size1>0) {
            int x = (int) s1.peek();
            if (size2 == 1) {
                int y = (int) s2.peek();
                if (x > y) {
                    Toast.makeText(MainActivity.this, "Move Not Possible!", Toast.LENGTH_LONG).show();
                    if(turn==1) {
                        p1++;
                        p1score.setText("P1Score " + p1);
                    }
                    else if(turn==2){
                        p2++;
                        p2score.setText("P2Score "+p2);
                    }
                    return;
                } else {
                    int z = (int) s1.pop();
                    s2.push(z);
                    middle4.setText(z + "");
                    if(size1==5)
                    left1.setText("");
                    else if(size1==4)
                    left2.setText("");
                    else if(size1==3)
                        left3.setText("");
                    else if(size1==2)
                        left4.setText("");
                    else if(size1==1)
                        left5.setText("");
                    size1--;
                    size2++;
                }
            } else if (size2 == 2) {
                int y = (int) s2.peek();
                if (x > y) {
                    Toast.makeText(MainActivity.this, "Move Not Possible!", Toast.LENGTH_LONG).show();
                    if(turn==1) {
                        p1++;
                        p1score.setText("P1Score " + p1);
                    }
                    else if(turn==2){
                        p2++;
                        p2score.setText("P2Score "+p2);
                    }
                    return;
                } else {
                    int z = (int) s1.pop();
                    s2.push(z);
                    middle3.setText(z + "");
                    if(size1==5)
                        left1.setText("");
                    else if(size1==4)
                        left2.setText("");
                    else if(size1==3)
                        left3.setText("");
                    else if(size1==2)
                        left4.setText("");
                    else if(size1==1)
                        left5.setText("");
                    size1--;
                    size2++;
                }
            } else if (size2 == 3) {
                int y = (int) s2.peek();
                if (x > y) {
                    Toast.makeText(MainActivity.this, "Move Not Possible!", Toast.LENGTH_LONG).show();
                    if(turn==1) {
                        p1++;
                        p1score.setText("P1Score " + p1);
                    }
                    else if(turn==2){
                        p2++;
                        p2score.setText("P2Score "+p2);
                    }
                    return;
                } else {
                    int z = (int) s1.pop();
                    s2.push(z);
                    middle2.setText(z + "");
                    if(size1==5)
                        left1.setText("");
                    else if(size1==4)
                        left2.setText("");
                    else if(size1==3)
                        left3.setText("");
                    else if(size1==2)
                        left4.setText("");
                    else if(size1==1)
                        left5.setText("");
                    size1--;
                    size2++;
                }
            } else if (size2 == 4) {
                int y = (int) s2.peek();
                if (x > y) {
                    Toast.makeText(MainActivity.this, "Move Not Possible!", Toast.LENGTH_LONG).show();
                    if(turn==1) {
                        p1++;
                        p1score.setText("P1Score " + p1);
                    }
                    else if(turn==2){
                        p2++;
                        p2score.setText("P2Score "+p2);
                    }
                    return;
                } else {
                    int z = (int) s1.pop();
                    s2.push(z);
                    middle1.setText(z + "");
                    if(size1==5)
                        left1.setText("");
                    else if(size1==4)
                        left2.setText("");
                    else if(size1==3)
                        left3.setText("");
                    else if(size1==2)
                        left4.setText("");
                    else if(size1==1)
                        left5.setText("");
                    size1--;
                    size2++;
                }
            } else if (size2 == 0) {
                int z = (int) s1.pop();
                s2.push(z);
                middle5.setText(z + "");
                if(size1==5)
                    left1.setText("");
                else if(size1==4)
                    left2.setText("");
                else if(size1==3)
                    left3.setText("");
                else if(size1==2)
                    left4.setText("");
                else if(size1==1)
                    left5.setText("");
                size1--;
                size2++;
            }

            if (turn == 1) {
                turn = 2;
                playerturn.setText("Player2 turn");
                p1++;
                p1score.setText("P1Score" + p1);
                if(size1==0&&size2==0&&size3==5)
                {
                    alertView("P1", "P2");
                    view.performClick();
                }

            } else if (turn == 2) {
                turn = 1;
                playerturn.setText("Player1 turn");
                p2++;
                p1score.setText("P2Score"+p2);
                if(size1==0&&size2==0&&size3==5)
                {
                    alertView("P2", "P1");
                    view.performClick();
                }
            }
        }
            else
            {
                Toast.makeText(MainActivity.this,"Move Not Possible!",Toast.LENGTH_LONG).show();
            }

    }

    public void btoc(View view)
    {
        if(size2>0) {
            int x = (int) s2.peek();
            if (size3 == 1) {
                int y = (int) s3.peek();
                if (x > y) {
                    Toast.makeText(MainActivity.this, "Move Not Possible!", Toast.LENGTH_LONG).show();
                    if(turn==1) {
                        p1++;
                        p1score.setText("P1Score " + p1);
                    }
                    else if(turn==2){
                        p2++;
                        p2score.setText("P2Score "+p2);
                    }
                    return;
                } else {
                    int z = (int) s2.pop();
                    s3.push(z);
                    right4.setText(z + "");
                    if(size2==5)
                        middle1.setText("");
                    else if(size2==4)
                        middle2.setText("");
                    else if(size2==3)
                        middle3.setText("");
                    else if(size2==2)
                        middle4.setText("");
                    else if(size2==1)
                        middle5.setText("");
                    size2--;
                    size3++;
                }
            } else if (size3 == 2) {
                int y = (int) s3.peek();
                if (x > y) {
                    Toast.makeText(MainActivity.this, "Move Not Possible!", Toast.LENGTH_LONG).show();
                    if(turn==1) {
                        p1++;
                        p1score.setText("P1Score " + p1);
                    }
                    else if(turn==2){
                        p2++;
                        p2score.setText("P2Score "+p2);
                    }
                    return;
                } else {
                    int z = (int) s2.pop();
                    s3.push(z);
                    right3.setText(z + "");
                    if(size2==5)
                        middle1.setText("");
                    else if(size2==4)
                        middle2.setText("");
                    else if(size2==3)
                        middle3.setText("");
                    else if(size2==2)
                        middle4.setText("");
                    else if(size2==1)
                        middle5.setText("");
                    size2--;
                    size3++;
                }
            } else if (size3 == 3) {
                int y = (int) s3.peek();
                if (x > y) {
                    Toast.makeText(MainActivity.this, "Move Not Possible!", Toast.LENGTH_LONG).show();
                    if(turn==1) {
                        p1++;
                        p1score.setText("P1Score " + p1);
                    }
                    else if(turn==2){
                        p2++;
                        p2score.setText("P2Score "+p2);
                    }
                    return;
                } else {
                    int z = (int) s2.pop();
                    s3.push(z);
                    right2.setText(z + "");
                    if(size2==5)
                        middle1.setText("");
                    else if(size2==4)
                        middle2.setText("");
                    else if(size2==3)
                        middle3.setText("");
                    else if(size2==2)
                        middle4.setText("");
                    else if(size2==1)
                        middle5.setText("");
                    size2--;
                    size3++;
                }
            } else if (size2 == 4) {
                int y = (int) s3.peek();
                if (x > y) {
                    Toast.makeText(MainActivity.this, "Move Not Possible!", Toast.LENGTH_LONG).show();
                    if(turn==1) {
                        p1++;
                        p1score.setText("P1Score " + p1);
                    }
                    else if(turn==2){
                        p2++;
                        p2score.setText("P2Score "+p2);
                    }
                    return;
                } else {
                    int z = (int) s2.pop();
                    s3.push(z);
                    right1.setText(z + "");
                    if(size2==5)
                        middle1.setText("");
                    else if(size2==4)
                        middle2.setText("");
                    else if(size2==3)
                        middle3.setText("");
                    else if(size2==2)
                        middle4.setText("");
                    else if(size2==1)
                        middle5.setText("");
                    size2--;
                    size3++;
                }
            } else if (size3 == 0) {
                int z = (int) s2.pop();
                s3.push(z);
                right5.setText(z + "");
                if(size2==5)
                    middle1.setText("");
                else if(size2==4)
                    middle2.setText("");
                else if(size2==3)
                    middle3.setText("");
                else if(size2==2)
                    middle4.setText("");
                else if(size2==1)
                    middle5.setText("");
                size2--;
                size3++;
            }

            if (turn == 1) {
                turn = 2;
                playerturn.setText("Player2 turn");
                p1++;
                p1score.setText("P1Score"+p1);
                if(size1==0&&size2==0&&size3==5)
                {
                    alertView("P1", "P2");
                    view.performClick();
                }
            } else if (turn == 2) {
                turn = 1;
                playerturn.setText("Player1 turn");
                p2++;
                p2score.setText("P2Score"+p2);
                if(size1==0&&size2==0&&size3==5)
                {
                    alertView("P2","P1");
                    view.performClick();
                }

            }

        }
        else
        {
            Toast.makeText(MainActivity.this,"Move Not Possible!",Toast.LENGTH_LONG).show();
            if(turn==1) {
                p1++;
                p1score.setText("P1Score " + p1);
            }
            else if(turn==2){
                p2++;
                p2score.setText("P2Score "+p2);
            }
            return;
        }
    }

    public void ctoa(View view)
    {
        if(size3>0) {
            int x = (int) s3.peek();
            if (size1 == 1) {
                int y = (int) s1.peek();
                if (x > y) {
                    Toast.makeText(MainActivity.this, "Move Not Possible!", Toast.LENGTH_LONG).show();
                    if(turn==1) {
                        p1++;
                        p1score.setText("P1Score " + p1);
                    }
                    else if(turn==2){
                        p2++;
                        p2score.setText("P2Score "+p2);
                    }
                    return;
                } else {
                    int z = (int) s3.pop();
                    s1.push(z);
                    left4.setText(z + "");
                    if(size3==5)
                        right1.setText("");
                    else if(size3==4)
                        right2.setText("");
                    else if(size3==3)
                        right3.setText("");
                    else if(size3==2)
                        right4.setText("");
                    else if(size3==1)
                        right5.setText("");
                    size3--;
                    size1++;
                }
            } else if (size1 == 2) {
                int y = (int) s1.peek();
                if (x > y) {
                    Toast.makeText(MainActivity.this, "Move Not Possible!", Toast.LENGTH_LONG).show();
                    if(turn==1) {
                        p1++;
                        p1score.setText("P1Score " + p1);
                    }
                    else if(turn==2){
                        p2++;
                        p2score.setText("P2Score "+p2);
                    }
                    return;
                } else {
                    int z = (int) s3.pop();
                    s1.push(z);
                    left3.setText(z + "");
                    if(size3==5)
                        right1.setText("");
                    else if(size3==4)
                        right2.setText("");
                    else if(size3==3)
                        right3.setText("");
                    else if(size3==2)
                        right4.setText("");
                    else if(size3==1)
                        right5.setText("");
                    size3--;
                    size1++;
                }
            } else if (size1 == 3) {
                int y = (int) s1.peek();
                if (x > y) {
                    Toast.makeText(MainActivity.this, "Move Not Possible!", Toast.LENGTH_LONG).show();
                    if(turn==1) {
                        p1++;
                        p1score.setText("P1Score " + p1);
                    }
                    else if(turn==2){
                        p2++;
                        p2score.setText("P2Score "+p2);
                    }
                    return;
                } else {
                    int z = (int) s3.pop();
                    s1.push(z);
                    left2.setText(z + "");
                    if(size3==5)
                        right1.setText("");
                    else if(size3==4)
                        right2.setText("");
                    else if(size3==3)
                        right3.setText("");
                    else if(size3==2)
                        right4.setText("");
                    else if(size3==1)
                        right5.setText("");
                    size3--;
                    size1++;
                }
            } else if (size1 == 4) {
                int y = (int) s1.peek();
                if (x > y) {
                    Toast.makeText(MainActivity.this, "Move Not Possible!", Toast.LENGTH_LONG).show();
                    if(turn==1) {
                        p1++;
                        p1score.setText("P1Score " + p1);
                    }
                    else if(turn==2){
                        p2++;
                        p2score.setText("P2Score "+p2);
                    }
                    return;
                } else {
                    int z = (int) s3.pop();
                    s1.push(z);
                    left1.setText(z + "");
                    if(size3==5)
                        right1.setText("");
                    else if(size3==4)
                        right2.setText("");
                    else if(size3==3)
                        right3.setText("");
                    else if(size3==2)
                        right4.setText("");
                    else if(size3==1)
                        right5.setText("");
                    size3--;
                    size1++;
                }
            } else if (size1 == 0) {
                int z = (int) s3.pop();
                s1.push(z);
                left5.setText(z + "");
                if(size3==5)
                    right1.setText("");
                else if(size3==4)
                    right2.setText("");
                else if(size3==3)
                    right3.setText("");
                else if(size3==2)
                    right4.setText("");
                else if(size3==1)
                    right5.setText("");
                size3--;
                size1++;
            }

            if (turn == 1) {
                turn = 2;
                playerturn.setText("Player2 turn");
                p1++;
                p1score.setText("P1Score"+p1);
                if(size1==0&&size2==0&&size3==5)
                {
                    alertView("P1", "P2");
                    view.performClick();
                }
            } else if (turn == 2) {
                turn = 1;
                playerturn.setText("Player1 turn");
                p2++;
                p2score.setText("P2Score"+p2);
                if(size1==0&&size2==0&&size3==5)
                {
                    alertView("P1", "P2");
                    view.performClick();
                }
            }
        }
        else
        {
            Toast.makeText(MainActivity.this,"Move Not Possible!",Toast.LENGTH_LONG).show();
        }
    }

    public void btoa(View view)
    {
        if(size2>0) {
            int x = (int) s2.peek();
            if (size1 == 1) {
                int y = (int) s1.peek();
                if (x > y) {
                    Toast.makeText(MainActivity.this, "Move Not Possible!", Toast.LENGTH_LONG).show();
                    if(turn==1) {
                        p1++;
                        p1score.setText("P1Score " + p1);
                    }
                    else if(turn==2){
                        p2++;
                        p2score.setText("P2Score "+p2);
                    }
                    return;
                } else {
                    int z = (int) s2.pop();
                    s1.push(z);
                    left4.setText(z + "");
                    if(size2==5)
                        middle1.setText("");
                    else if(size2==4)
                        middle2.setText("");
                    else if(size2==3)
                        middle3.setText("");
                    else if(size2==2)
                        middle4.setText("");
                    else if(size2==1)
                        middle5.setText("");
                    size2--;
                    size1++;
                }
            } else if (size1 == 2) {
                int y = (int) s1.peek();
                if (x > y) {
                    Toast.makeText(MainActivity.this, "Move Not Possible!", Toast.LENGTH_LONG).show();
                    if(turn==1) {
                        p1++;
                        p1score.setText("P1Score " + p1);
                    }
                    else if(turn==2){
                        p2++;
                        p2score.setText("P2Score "+p2);
                    }
                    return;
                } else {
                    int z = (int) s2.pop();
                    s1.push(z);
                    left3.setText(z + "");
                    if(size2==5)
                        middle1.setText("");
                    else if(size2==4)
                        middle2.setText("");
                    else if(size2==3)
                        middle3.setText("");
                    else if(size2==2)
                        middle4.setText("");
                    else if(size2==1)
                        middle5.setText("");
                    size2--;
                    size1++;
                }
            } else if (size1 == 3) {
                int y = (int) s1.peek();
                if (x > y) {
                    Toast.makeText(MainActivity.this, "Move Not Possible!", Toast.LENGTH_LONG).show();
                    if(turn==1) {
                        p1++;
                        p1score.setText("P1Score " + p1);
                    }
                    else if(turn==2){
                        p2++;
                        p2score.setText("P2Score "+p2);
                    }
                    return;
                } else {
                    int z = (int) s2.pop();
                    s1.push(z);
                    left2.setText(z + "");
                    if(size2==5)
                        middle1.setText("");
                    else if(size2==4)
                        middle2.setText("");
                    else if(size2==3)
                        middle3.setText("");
                    else if(size2==2)
                        middle4.setText("");
                    else if(size2==1)
                        middle5.setText("");
                    size2--;
                    size1++;
                }
            } else if (size2 == 4) {
                int y = (int) s1.peek();
                if (x > y) {
                    Toast.makeText(MainActivity.this, "Move Not Possible!", Toast.LENGTH_LONG).show();
                    if(turn==1) {
                        p1++;
                        p1score.setText("P1Score " + p1);
                    }
                    else if(turn==2){
                        p2++;
                        p2score.setText("P2Score "+p2);
                    }
                    return;
                } else {
                    int z = (int) s2.pop();
                    s1.push(z);
                    left1.setText(z + "");
                    if(size2==5)
                        middle1.setText("");
                    else if(size2==4)
                        middle2.setText("");
                    else if(size2==3)
                        middle3.setText("");
                    else if(size2==2)
                        middle4.setText("");
                    else if(size2==1)
                        middle5.setText("");
                    size2--;
                    size1++;
                }
            } else if (size1 == 0) {
                int z = (int) s2.pop();
                s1.push(z);
                left5.setText(z + "");
                if(size2==5)
                    middle1.setText("");
                else if(size2==4)
                    middle2.setText("");
                else if(size2==3)
                    middle3.setText("");
                else if(size2==2)
                    middle4.setText("");
                else if(size2==1)
                    middle5.setText("");
                size2--;
                size1++;
            }

            if (turn == 1) {
                turn = 2;
                playerturn.setText("Player2 turn");
                p1++;
                p1score.setText("P1Score"+p1);
                if(size1==0&&size2==0&&size3==5)
                {
                    alertView("P1", "P2");
                    view.performClick();
                }
            } else if (turn == 2) {
                turn = 1;
                playerturn.setText("Player1 turn");
                p2++;
                p2score.setText("P2Score"+p2);
                if(size1==0&&size2==0&&size3==5)
                {
                    alertView("P1", "P2");
                    view.performClick();
                }
            }
        }
        else
        {
            Toast.makeText(MainActivity.this,"Move Not Possible!",Toast.LENGTH_LONG).show();
            if(turn==1) {
                p1++;
                p1score.setText("P1Score " + p1);
            }
            else if(turn==2){
                p2++;
                p2score.setText("P2Score "+p2);
            }
            return;
        }
    }

    public void ctob(View view)
    {
        if(size3>0) {
            int x = (int) s3.peek();
            if (size2 == 1) {
                int y = (int) s2.peek();
                if (x > y) {
                    Toast.makeText(MainActivity.this, "Move Not Possible!", Toast.LENGTH_LONG).show();
                } else {
                    int z = (int) s3.pop();
                    s2.push(z);
                    middle4.setText(z + "");
                    if(size3==5)
                        right1.setText("");
                    else if(size3==4)
                        right2.setText("");
                    else if(size3==3)
                        right3.setText("");
                    else if(size3==2)
                        right4.setText("");
                    else if(size3==1)
                        right5.setText("");
                    size3--;
                    size2++;
                }
            } else if (size2 == 2) {
                int y = (int) s2.peek();
                if (x > y) {
                    Toast.makeText(MainActivity.this, "Move Not Possible!", Toast.LENGTH_LONG).show();
                } else {
                    int z = (int) s3.pop();
                    s2.push(z);
                    middle3.setText(z + "");
                    if(size3==5)
                        right1.setText("");
                    else if(size3==4)
                        right2.setText("");
                    else if(size3==3)
                        right3.setText("");
                    else if(size3==2)
                        right4.setText("");
                    else if(size3==1)
                        right5.setText("");
                    size3--;
                    size2++;
                }
            } else if (size2 == 3) {
                int y = (int) s2.peek();
                if (x > y) {
                    Toast.makeText(MainActivity.this, "Move Not Possible!", Toast.LENGTH_LONG).show();
                } else {
                    int z = (int) s3.pop();
                    s2.push(z);
                    middle2.setText(z + "");
                    if(size3==5)
                        right1.setText("");
                    else if(size3==4)
                        right2.setText("");
                    else if(size3==3)
                        right3.setText("");
                    else if(size3==2)
                        right4.setText("");
                    else if(size3==1)
                        right5.setText("");
                    size3--;
                    size2++;
                }
            } else if (size2 == 4) {
                int y = (int) s2.peek();
                if (x > y) {
                    Toast.makeText(MainActivity.this, "Move Not Possible!", Toast.LENGTH_LONG).show();
                } else {
                    int z = (int) s3.pop();
                    s2.push(z);
                    middle1.setText(z + "");
                    if(size3==5)
                        right1.setText("");
                    else if(size3==4)
                        right2.setText("");
                    else if(size3==3)
                        right3.setText("");
                    else if(size3==2)
                        right4.setText("");
                    else if(size3==1)
                        right5.setText("");
                    size3--;
                    size2++;
                }
            } else if (size2 == 0) {
                int z = (int) s3.pop();
                s2.push(z);
                middle5.setText(z + "");
                if(size3==5)
                    right1.setText("");
                else if(size3==4)
                    right2.setText("");
                else if(size3==3)
                    right3.setText("");
                else if(size3==2)
                    right4.setText("");
                else if(size3==1)
                    right5.setText("");
                size3--;
                size2++;
            }

            if (turn == 1) {
                turn = 2;
                playerturn.setText("Player2 turn");
                p1++;
                p1score.setText("P1Score"+p1);
                if(size1==0&&size2==0&&size3==5)
                {
                    alertView("P1", "P2");
                    view.performClick();
                }
            } else if (turn == 2) {
                turn = 1;
                playerturn.setText("Player1 turn");
                p2++;
                p2score.setText("P2Score"+p2);
                if(size1==0&&size2==0&&size3==5)
                {
                    alertView("P1", "P2");
                    view.performClick();
                }
            }
        }
        else
        {
            Toast.makeText(MainActivity.this,"Move Not Possible!",Toast.LENGTH_LONG).show();
            if(turn==1) {
                p1++;
                p1score.setText("P1Score " + p1);
            }
            else if(turn==2){
                p2++;
                p2score.setText("P2Score "+p2);
            }
            return;
        }
    }

    public void atoc(View view)
    {
        if(size1>0) {
            int x = (int) s1.peek();
            if (size3 == 1) {
                int y = (int) s3.peek();
                if (x > y) {
                    Toast.makeText(MainActivity.this, "Move Not Possible!", Toast.LENGTH_LONG).show();
                    if(turn==1) {
                        p1++;
                        p1score.setText("P1Score " + p1);
                    }
                    else if(turn==2){
                        p2++;
                        p2score.setText("P2Score "+p2);
                    }
                    return;
                } else {
                    int z = (int) s1.pop();
                    s3.push(z);
                    right4.setText(z + "");
                    if(size1==5)
                        left1.setText("");
                    else if(size1==4)
                        left2.setText("");
                    else if(size1==3)
                        left3.setText("");
                    else if(size1==2)
                        left4.setText("");
                    else if(size1==1)
                        left5.setText("");
                    size1--;
                    size3++;
                }
            } else if (size3 == 2) {
                int y = (int) s3.peek();
                if (x > y) {
                    Toast.makeText(MainActivity.this, "Move Not Possible!", Toast.LENGTH_LONG).show();
                    if(turn==1) {
                        p1++;
                        p1score.setText("P1Score " + p1);
                    }
                    else if(turn==2){
                        p2++;
                        p2score.setText("P2Score "+p2);
                    }
                    return;
                } else {
                    int z = (int) s1.pop();
                    s3.push(z);
                    right3.setText(z + "");
                    if(size1==5)
                        left1.setText("");
                    else if(size1==4)
                        left2.setText("");
                    else if(size1==3)
                        left3.setText("");
                    else if(size1==2)
                        left4.setText("");
                    else if(size1==1)
                        left5.setText("");
                    size1--;
                    size3++;
                }
            } else if (size3 == 3) {
                int y = (int) s3.peek();
                if (x > y) {
                    Toast.makeText(MainActivity.this, "Move Not Possible!", Toast.LENGTH_LONG).show();
                    if(turn==1) {
                        p1++;
                        p1score.setText("P1Score " + p1);
                    }
                    else if(turn==2){
                        p2++;
                        p2score.setText("P2Score "+p2);
                    }
                    return;
                } else {
                    int z = (int) s1.pop();
                    s3.push(z);
                    right2.setText(z + "");
                    if(size1==5)
                        left1.setText("");
                    else if(size1==4)
                        left2.setText("");
                    else if(size1==3)
                        left3.setText("");
                    else if(size1==2)
                        left4.setText("");
                    else if(size1==1)
                        left5.setText("");
                    size1--;
                    size3++;
                }
            } else if (size3 == 4) {
                int y = (int) s3.peek();
                if (x > y) {
                    Toast.makeText(MainActivity.this, "Move Not Possible!", Toast.LENGTH_LONG).show();
                    if(turn==1) {
                        p1++;
                        p1score.setText("P1Score " + p1);
                    }
                    else if(turn==2){
                        p2++;
                        p2score.setText("P2Score "+p2);
                    }
                    return;
                } else {
                    int z = (int) s1.pop();
                    s3.push(z);
                    right1.setText(z + "");
                    if(size1==5)
                        left1.setText("");
                    else if(size1==4)
                        left2.setText("");
                    else if(size1==3)
                        left3.setText("");
                    else if(size1==2)
                        left4.setText("");
                    else if(size1==1)
                        left5.setText("");
                    size1--;
                    size3++;
                }
            } else if (size3 == 0) {
                int z = (int) s1.pop();
                s3.push(z);
                right5.setText(z + "");
                if(size1==5)
                    left1.setText("");
                else if(size1==4)
                    left2.setText("");
                else if(size1==3)
                    left3.setText("");
                else if(size1==2)
                    left4.setText("");
                else if(size1==1)
                    left5.setText("");
                size1--;
                size3++;
            }

            if (turn == 1) {
                turn = 2;
                playerturn.setText("Player2 turn");
                p1++;
                p1score.setText("P1Score"+p1);
                if(size1==0&&size2==0&&size3==5)
                {
                    alertView("P1", "P2");
                    view.performClick();
                }
            } else if (turn == 2) {
                turn = 1;
                playerturn.setText("Player1 turn");
                p2++;
                p2score.setText("P2Score"+p2);
                if(size1==0&&size2==0&&size3==5)
                {
                    alertView("P1", "P2");
                    view.performClick();
                }
            }
        }
        else
        {
            Toast.makeText(MainActivity.this,"Move Not Possible!",Toast.LENGTH_LONG).show();
            if(turn==1) {
                p1++;
                p1score.setText("P1Score " + p1);
            }
            else if(turn==2){
                p2++;
                p2score.setText("P2Score "+p2);
            }
            return;
        }
    }

    private void alertView( String message,String message2 ) {
        AlertDialog.Builder dialog = new AlertDialog.Builder(MainActivity.this);
        dialog.setTitle("Congratulations "+message+ " won!. Moves taken= "+p1)
                .setMessage("Better Luck next time "+message2+ "!. Moves taken="+p2)
                .setPositiveButton("PLAY AGAIN", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        recreate();
                    }
                })
                .setNegativeButton("EXIT", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        System.exit(0);
                    }
                })
                .setIcon(android.R.drawable.ic_dialog_alert)
                .show();
    }

    public void restart(View view)
    {
        if (Build.VERSION.SDK_INT >= 11) {
            recreate();
        } else {
            Intent intent = getIntent();
            intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
            finish();
            overridePendingTransition(0, 0);

            startActivity(intent);
            overridePendingTransition(0, 0);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}