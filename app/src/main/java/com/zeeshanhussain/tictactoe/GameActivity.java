package com.zeeshanhussain.tictactoe;

import android.app.AlertDialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class GameActivity extends AppCompatActivity {
    private Button button1, button2, button3, button4, button5, button6, button7, button8, button9, restart;
    private TextView mStatus;
    String turn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        restart = (Button) findViewById(R.id.restart);
        mStatus = (TextView) findViewById(R.id.Status);
        turn = "x";
        mStatus.setText("Player X's Turn");

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (turn.equals("x")) {
                    xClick(button1);
                } else {
                    oClick(button1);
                }
                gameOver();
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (turn.equals("x")) {
                    xClick(button2);
                } else {
                    oClick(button2);
                }
                gameOver();

            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (turn.equals("x")) {
                    xClick(button3);
                } else {
                    oClick(button3);
                }
                gameOver();
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (turn.equals("x")) {
                    xClick(button4);
                } else {
                    oClick(button4);
                }
                gameOver();
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (turn.equals("x")) {
                    xClick(button5);
                } else {
                    oClick(button5);
                }
                gameOver();
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (turn.equals("x")) {
                    xClick(button6);
                } else {
                    oClick(button6);
                }
                gameOver();
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (turn.equals("x")) {
                    xClick(button7);
                } else {
                    oClick(button7);
                }
                gameOver();
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (turn.equals("x")) {
                    xClick(button8);
                } else {
                    oClick(button8);
                }
                gameOver();
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (turn.equals("x")) {
                    xClick(button9);
                } else {
                    oClick(button9);
                }
                gameOver();
            }
        });
        restart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                reset();
            }
        });


    }

    public void xClick(Button b) {
        b.setText("X");
        turn = "o";
        mStatus.setText("Player O's Turn");
        b.setClickable(false);
    }

    public void oClick(Button b) {
        b.setText("O");
        turn = "x";
        mStatus.setText("Player X's Turn");
        b.setClickable(false);
    }

    public void gameOver() {
        String a, b, c, d, e, f, g, h, i;
        boolean over = false;
        a = button1.getText().toString();
        b = button2.getText().toString();
        c = button3.getText().toString();
        d = button4.getText().toString();
        e = button5.getText().toString();
        f = button6.getText().toString();
        g = button7.getText().toString();
        h = button8.getText().toString();
        i = button9.getText().toString();
        if (a.equals("X") && b.equals("X") && c.equals("X")) {
            over = true;
            restart.setVisibility(View.VISIBLE);
            new AlertDialog.Builder(this)
                    .setTitle("Winner!!")
                    .setMessage("Player X won")
                    .setNegativeButton("Okay", null)
                    .create().show();
        }
        if (a.equals("X") && e.equals("X") && i.equals("X")) {
            new AlertDialog.Builder(this)
                    .setTitle("Winner!!")
                    .setMessage("Player X won")
                    .setNegativeButton("Okay", null)
                    .create().show();
            over = true;
            restart.setVisibility(View.VISIBLE);
        }
        if (a.equals("X") && d.equals("X") && g.equals("X")) {
            new AlertDialog.Builder(this)
                    .setTitle("Winner!!")
                    .setMessage("Player X won")
                    .setNegativeButton("Okay", null)
                    .create().show();
            over = true;
            restart.setVisibility(View.VISIBLE);
        }
        if (b.equals("X") && e.equals("X") && h.equals("X")) {
            new AlertDialog.Builder(this)
                    .setTitle("Winner!!")
                    .setMessage("Player X won")
                    .setNegativeButton("Okay", null)
                    .create().show();
            over = true;
            restart.setVisibility(View.VISIBLE);
        }
        if (c.equals("X") && f.equals("X") && i.equals("X")) {
            Toast.makeText(this, "Player X won", Toast.LENGTH_SHORT).show();
            over = true;
            restart.setVisibility(View.VISIBLE);
        }
        if (d.equals("X") && e.equals("X") && f.equals("X")) {
            new AlertDialog.Builder(this)
                    .setTitle("Winner!!")
                    .setMessage("Player X won")
                    .setNegativeButton("Okay", null)
                    .create().show();
            over = true;
            restart.setVisibility(View.VISIBLE);
        }
        if (g.equals("X") && h.equals("X") && i.equals("X")) {
            new AlertDialog.Builder(this)
                    .setTitle("Winner!!")
                    .setMessage("Player X won")
                    .setNegativeButton("Okay", null)
                    .create().show();
            over = true;
            restart.setVisibility(View.VISIBLE);
        }
        if (g.equals("X") && e.equals("X") && c.equals("X")) {
            new AlertDialog.Builder(this)
                    .setTitle("Winner!!")
                    .setMessage("Player X won")
                    .setNegativeButton("Okay", null)
                    .create().show();
            over = true;
            restart.setVisibility(View.VISIBLE);
        }
        if (a.equals("O") && b.equals("O") && c.equals("O")) {
            new AlertDialog.Builder(this)
                    .setTitle("Winner!!")
                    .setMessage("Player O won")
                    .setNegativeButton("Okay", null)
                    .create().show();
            over = true;
            restart.setVisibility(View.VISIBLE);
        }
        if (a.equals("O") && e.equals("O") && i.equals("O")) {
            new AlertDialog.Builder(this)
                    .setTitle("Winner!!")
                    .setMessage("Player O won")
                    .setNegativeButton("Okay", null)
                    .create().show();
            over = true;
            restart.setVisibility(View.VISIBLE);
        }
        if (a.equals("O") && d.equals("O") && g.equals("O")) {
            new AlertDialog.Builder(this)
                    .setTitle("Winner!!")
                    .setMessage("Player O won")
                    .setNegativeButton("Okay", null)
                    .create().show();
            over = true;
            restart.setVisibility(View.VISIBLE);
        }
        if (b.equals("O") && e.equals("O") && h.equals("O")) {
            new AlertDialog.Builder(this)
                    .setTitle("Winner!!")
                    .setMessage("Player O won")
                    .setNegativeButton("Okay", null)
                    .create().show();
            over = true;
            restart.setVisibility(View.VISIBLE);
        }
        if (c.equals("O") && f.equals("O") && i.equals("O")) {
            new AlertDialog.Builder(this)
                    .setTitle("Winner!!")
                    .setMessage("Player O won")
                    .setNegativeButton("Okay", null)
                    .create().show();
            over = true;
            restart.setVisibility(View.VISIBLE);
        }
        if (d.equals("O") && e.equals("O") && f.equals("O")) {
            new AlertDialog.Builder(this)
                    .setTitle("Winner!!")
                    .setMessage("Player O won")
                    .setNegativeButton("Okay", null)
                    .create().show();
            over = true;
            restart.setVisibility(View.VISIBLE);
        }
        if (g.equals("O") && h.equals("O") && i.equals("O")) {
            new AlertDialog.Builder(this)
                    .setTitle("Winner!!")
                    .setMessage("Player O won")
                    .setNegativeButton("Okay", null)
                    .create().show();
            over = true;
            restart.setVisibility(View.VISIBLE);
        }
        if (g.equals("O") && e.equals("O") && c.equals("O")) {
            new AlertDialog.Builder(this)
                    .setTitle("Winner!!")
                    .setMessage("Player O won")
                    .setNegativeButton("Okay", null)
                    .create().show();
            over = true;
            restart.setVisibility(View.VISIBLE);
        }
        if (!button1.getText().toString().equals("") &&
                !button2.getText().toString().equals("") &&
                !button3.getText().toString().equals("") &&
                !button4.getText().toString().equals("") &&
                !button5.getText().toString().equals("") &&
                !button6.getText().toString().equals("") &&
                !button7.getText().toString().equals("") &&
                !button8.getText().toString().equals("") &&
                !button9.getText().toString().equals("") && (!over)) {
            over = true;
            restart.setVisibility(View.VISIBLE);
            new AlertDialog.Builder(this)
                    .setTitle("Winner!!")
                    .setMessage("Its a Draw")
                    .setNegativeButton("Okay", null)
                    .create().show();
        }
        if (over) {
            button1.setEnabled(false);
            button2.setEnabled(false);
            button3.setEnabled(false);
            button4.setEnabled(false);
            button5.setEnabled(false);
            button6.setEnabled(false);
            button7.setEnabled(false);
            button8.setEnabled(false);
            button9.setEnabled(false);
        }

//        if(!button1.isEnabled() && !button2.isEnabled() && !button3.isEnabled() && !button4.isEnabled() &&
//                !button5.isEnabled() && !button6.isEnabled() &&
//        !button7.isEnabled() && !button8.isEnabled() && !button9.isEnabled()){
//            Toast.makeText(this, "Draw", Toast.LENGTH_SHORT).show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.reset:
                reset();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    public void reset() {
        button1.setText("");
        button2.setText("");
        button3.setText("");
        button4.setText("");
        button5.setText("");
        button6.setText("");
        button7.setText("");
        button8.setText("");
        button9.setText("");
        button1.setClickable(true);
        button2.setClickable(true);
        button3.setClickable(true);
        button4.setClickable(true);
        button5.setClickable(true);
        button6.setClickable(true);
        button7.setClickable(true);
        button8.setClickable(true);
        button9.setClickable(true);
        button1.setEnabled(true);
        button2.setEnabled(true);
        button3.setEnabled(true);
        button4.setEnabled(true);
        button5.setEnabled(true);
        button6.setEnabled(true);
        button7.setEnabled(true);
        button8.setEnabled(true);
        button9.setEnabled(true);
        restart.setVisibility(View.GONE);
    }
}

