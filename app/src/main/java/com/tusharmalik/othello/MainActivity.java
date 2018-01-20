package com.tusharmalik.othello;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public Button[][] ib = new Button[8][8];
    private Board b=new Board();
    public Button newgame;
    public Button current,p1,p2,totrem;
    int rem=60;
    int turn=1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        newgame=findViewById(R.id.btnRestart);
        ib[0][0] = findViewById(R.id.b11);
        ib[0][1] = findViewById(R.id.b12);
        ib[0][2] = findViewById(R.id.b13);
        ib[0][3] = findViewById(R.id.b14);
        ib[0][4] = findViewById(R.id.b15);
        ib[0][5] = findViewById(R.id.b16);
        ib[1][0] = findViewById(R.id.b21);
        ib[1][1] = findViewById(R.id.b22);
        ib[1][2] = findViewById(R.id.b23);
        ib[1][3] = findViewById(R.id.b24);
        ib[1][4] = findViewById(R.id.b25);
        ib[1][5] = findViewById(R.id.b26);
        ib[2][0] = findViewById(R.id.b31);
        ib[2][1] = findViewById(R.id.b32);
        ib[2][2] = findViewById(R.id.b33);
        ib[2][3] = findViewById(R.id.b34);
        ib[2][4] = findViewById(R.id.b35);
        ib[2][5] = findViewById(R.id.b36);
        ib[3][0] = findViewById(R.id.b41);
        ib[3][1] = findViewById(R.id.b42);
        ib[3][2] = findViewById(R.id.b43);
        ib[3][3] = findViewById(R.id.b44);
        ib[3][4] = findViewById(R.id.b45);
        ib[3][5] = findViewById(R.id.b46);
        ib[4][0] = findViewById(R.id.b51);
        ib[4][1] = findViewById(R.id.b52);
        ib[4][2] = findViewById(R.id.b53);
        ib[4][3] = findViewById(R.id.b54);
        ib[4][4] = findViewById(R.id.b55);
        ib[4][5] = findViewById(R.id.b56);
        ib[5][0] = findViewById(R.id.b61);
        ib[5][1] = findViewById(R.id.b62);
        ib[5][2] = findViewById(R.id.b63);
        ib[5][3] = findViewById(R.id.b64);
        ib[5][4] = findViewById(R.id.b65);
        ib[5][5] = findViewById(R.id.b66);
        ib[5][6] = findViewById(R.id.b67);
        ib[4][6] = findViewById(R.id.b57);
        ib[3][6] = findViewById(R.id.b47);
        ib[2][6] = findViewById(R.id.b37);
        ib[1][6] = findViewById(R.id.b27);
        ib[0][6] = findViewById(R.id.b17);
        ib[6][0] = findViewById(R.id.b71);
        ib[6][1] = findViewById(R.id.b72);
        ib[6][2] = findViewById(R.id.b73);
        ib[6][3] = findViewById(R.id.b74);
        ib[6][4] = findViewById(R.id.b75);
        ib[6][5] = findViewById(R.id.b76);
        ib[6][6] = findViewById(R.id.b77);
        ib[0][6] = findViewById(R.id.b17);
        ib[7][0] = findViewById(R.id.b81);
        ib[7][1] = findViewById(R.id.b82);
        ib[7][2] = findViewById(R.id.b83);
        ib[7][3] = findViewById(R.id.b84);
        ib[7][4] = findViewById(R.id.b85);
        ib[7][5] = findViewById(R.id.b86);
        ib[7][6] = findViewById(R.id.b87);
        ib[7][7] = findViewById(R.id.b88);
        ib[0][7] = findViewById(R.id.b18);
        ib[1][7] = findViewById(R.id.b28);
        ib[2][7] = findViewById(R.id.b38);
        ib[3][7] = findViewById(R.id.b48);
        ib[4][7] = findViewById(R.id.b58);
        ib[5][7] = findViewById(R.id.b68);
        ib[6][7] = findViewById(R.id.b78);
        current=findViewById(R.id.currp);
        p1=findViewById(R.id.p1);
        p2=findViewById(R.id.p0);
        totrem=findViewById(R.id.rem);
        newgame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b.StartGame();
                printboard();
                current.setText("Curr Player:1");
                p1.setText("Player 1 : " + b.count(COLOR.BLACK));
                p2.setText("Player 0 : " + b.count(COLOR.WHITE));
                totrem.setText("Remaining: 60");

            }
        });
        for(int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                ib[i][j].setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        switch (view.getId()){
                            case R.id.b11:
                                displaynum(0,0);
                                break;
                            case R.id.b12:
                                displaynum(0,1);
                                break;
                            case R.id.b13:
                                displaynum(0,2);
                                break;
                            case R.id.b14:
                                displaynum(0,3);
                                break;
                            case R.id.b15:
                                displaynum(0,4);
                                break;
                            case R.id.b16:
                                displaynum(0,5);
                                break;
                            case R.id.b17:
                                displaynum(0,6);
                                break;
                            case R.id.b18:
                                displaynum(0,7);
                                break;
                            case R.id.b21:
                                displaynum(1,0);
                                break;
                            case R.id.b22:
                                displaynum(1,1);
                                break;
                            case R.id.b23:
                                displaynum(1,2);
                                break;
                            case R.id.b24:
                                displaynum(1,3);
                                break;
                            case R.id.b25:
                                displaynum(1,4);
                                break;
                            case R.id.b26:
                                displaynum(1,5);
                                break;
                            case R.id.b27:
                                displaynum(1,6);
                                break;
                            case R.id.b28:
                                displaynum(1,7);
                                break;
                            case R.id.b31:
                                displaynum(2,0);
                                break;
                            case R.id.b32:
                                displaynum(2,1);
                                break;
                            case R.id.b33:
                                displaynum(2,2);
                                break;
                            case R.id.b34:
                                displaynum(2,3);
                                break;
                            case R.id.b35:
                                displaynum(2,4);
                                break;
                            case R.id.b36:
                                displaynum(2,5);
                                break;
                            case R.id.b37:
                                displaynum(2,6);
                                break;
                            case R.id.b38:
                                displaynum(2,7);
                                break;
                            case R.id.b41:
                                displaynum(3,0);
                                break;
                            case R.id.b42:
                                displaynum(3,1);
                                break;
                            case R.id.b43:
                                displaynum(3,2);
                                break;
                            case R.id.b44:
                                displaynum(3,3);
                                break;
                            case R.id.b45:
                                displaynum(3,4);
                                break;
                            case R.id.b46:
                                displaynum(3,5);
                                break;
                            case R.id.b47:
                                displaynum(3,6);
                                break;
                            case R.id.b48:
                                displaynum(3,7);
                                break;

                            case R.id.b51:
                                displaynum(4,0);
                                break;
                            case R.id.b52:
                                displaynum(4,1);
                                break;
                            case R.id.b53:
                                displaynum(4,2);
                                break;
                            case R.id.b54:
                                displaynum(4,3);
                                break;
                            case R.id.b55:
                                displaynum(4,4);
                                break;
                            case R.id.b56:
                                displaynum(4,5);
                                break;
                            case R.id.b57:
                                displaynum(4,6);
                                break;
                            case R.id.b58:
                                displaynum(4,7);
                                break;
                            case R.id.b61:
                                displaynum(5,0);
                                break;
                            case R.id.b62:
                                displaynum(5,1);
                                break;
                            case R.id.b63:
                                displaynum(5,2);
                                break;
                            case R.id.b64:
                                displaynum(5,3);
                                break;
                            case R.id.b65:
                                displaynum(5,4);
                                break;
                            case R.id.b66:
                                displaynum(5,5);
                                break;
                            case R.id.b67:
                                displaynum(5,6);
                                break;
                            case R.id.b68:
                                displaynum(5,7);
                                break;
                            case R.id.b71:
                                displaynum(6,0);
                                break;
                            case R.id.b72:
                                displaynum(6,1);
                                break;
                            case R.id.b73:
                                displaynum(6,2);
                                break;
                            case R.id.b74:
                                displaynum(6,3);
                                break;
                            case R.id.b75:
                                displaynum(6,4);
                                break;
                            case R.id.b76:
                                displaynum(6,5);
                                break;
                            case R.id.b77:
                                displaynum(6,6);
                                break;
                            case R.id.b78:
                                displaynum(6,7);
                                break;
                            case R.id.b81:
                                displaynum(7,0);
                                break;
                            case R.id.b82:
                                displaynum(7,1);
                                break;
                            case R.id.b83:
                                displaynum(7,2);
                                break;
                            case R.id.b84:
                                displaynum(7,3);
                                break;
                            case R.id.b85:
                                displaynum(7,4);
                                break;
                            case R.id.b86:
                                displaynum(7,5);
                                break;
                            case R.id.b87:
                                displaynum(7,6);
                                break;
                            case R.id.b88:
                                displaynum(7,7);
                                break;

                        }
                    }
                });
            }
        }




    }
    public void displaynum(int row,int col){
        if(b.checkend()==false &&Haspossiblemove()==true){
            if(b.possible(row,col)) {
                b.flipit(row, col);
                b.place(row, col);
                p1.setText("Player 1 : " + b.count(COLOR.BLACK));
                p2.setText("Player 0 : " + b.count(COLOR.WHITE));
                rem--;
                totrem.setText("Remaining: "+rem);
                printboard();

                if (!b.checkend()) {
                    b.changep();
                    buttonChange(current);
                    if (!Haspossiblemove()) {
                        Toast.makeText(MainActivity.this, "No move available", Toast.LENGTH_SHORT).show();
                        b.changep();
                        buttonChange(current);
                        if (!Haspossiblemove()) {
                            Toast.makeText(MainActivity.this, "No move available", Toast.LENGTH_SHORT).show();
                            winner();
                        }
                    }
                }

                    if (b.checkend()) {
                        winner();
                    }

            }
        }
        else if(b.checkend()){
            Toast.makeText(MainActivity.this, "Please restart the game", Toast.LENGTH_SHORT).show();
        }

    }
    public void buttonChange(Button img_button) {
        if (b.getCurrentPlayer().getColor() == COLOR.BLACK) {
            img_button.setText("curr player:1");
        } else if (b.getCurrentPlayer().getColor() == COLOR.WHITE) {
            img_button.setText("curr player:0");
        } else {
            img_button.setText("");
        }
    }

    public void printboard(){
        for(int i= 0;i<8;i++){
            for(int j=0;j<8;j++){
                if(b.getBoard()[i][j]== COLOR.BLACK){
                    ib[i][j].setText("1");
                }
                if(b.getBoard()[i][j]== COLOR.WHITE){
                    ib[i][j].setText("0");
                }
                if(b.getBoard()[i][j]== COLOR.EMPTY){
                    ib[i][j].setText("");
                }
            }
        }
    }

    public boolean Haspossiblemove(){
        for(int i= 0;i<8;i++) {
            for (int j = 0; j < 8; j++) {
                if(b.possible(i,j)){
                    return true;
            }
        }
            }
            return false;
    }
    public void winner(){
        if(b.count(COLOR.BLACK)>b.count(COLOR.WHITE)){
            Toast.makeText(MainActivity.this, "Player 1 wins ", Toast.LENGTH_LONG).show();
        }
        else if(b.count(COLOR.BLACK)<b.count(COLOR.WHITE)){
            Toast.makeText(MainActivity.this, "Player 0 wins", Toast.LENGTH_SHORT).show();
        }
        else  if(b.count(COLOR.BLACK)==b.count(COLOR.WHITE)){
            Toast.makeText(MainActivity.this, "Its a tie", Toast.LENGTH_SHORT).show();
        }
    }

}
