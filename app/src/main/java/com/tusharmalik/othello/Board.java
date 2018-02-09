package com.tusharmalik.othello;

/**
 * Created by tushm on 08-02-2018.
 */

public class Board {
    private COLOR[][] board=new COLOR[8][8];
    private Player p1=new Player(COLOR.BLACK);
    private Player p2=new Player(COLOR.WHITE);
    private Player currp=p1;

    public Board(){
        StartGame();
    }
    public void StartGame(){
        for(int i=0;i<8;i++){
            for(int j=0;j<8;j++){
                board[i][j]=COLOR.EMPTY;
            }
        }
        currp=p1;
        place(3,3);
        changep();
        place(3,4);
        changep();
        place(4,4);
        changep();
        place(4,3);
        changep();
    }
    public void changep() {
        this.currp = (this.currp == p1) ? p2 : p1;
    }
    public void place(int row,int col){
        if(board[row][col]==COLOR.EMPTY){
            if(currp.getColor()==COLOR.WHITE){
                board[row][col]=COLOR.WHITE;
            }
            else if(currp.getColor()==COLOR.BLACK){
                board[row][col]=COLOR.BLACK;
            }

        }
    }
    public boolean possible(int row, int col) {
        boolean flippable = false;
        if(board[row][col]!= COLOR.EMPTY) {
            return flippable;
        }
        for (int dirRow=-1;dirRow<2;dirRow++) {
            for (int dirCol=-1;dirCol<2;dirCol++) {
                if(dirRow == 0 && dirCol == 0) {
                    continue;
                }
                int newRow=row+dirRow;
                int newCol=col+dirCol;
                if (newRow>=0&&newRow<=7&&newCol>=0&&newCol<=7) {
                    COLOR oppoColor = this.currp.getColor() == COLOR.WHITE ? COLOR.BLACK : COLOR.WHITE;
                    if (board[newRow][newCol]==oppoColor) {
                        for (int range=1;range<8;range++) {

                            int nRow=row+range*dirRow;
                            int nCol=col+range*dirCol;


                            if(nRow<0||nRow>7||nCol<0||nCol>7) {
                                continue;
                            }
                            if(board[nRow][nCol]==COLOR.EMPTY) {
                                break;
                            }
                            if(board[nRow][nCol]==this.currp.getColor()) {
                                flippable=true;
                                break;
                            }
                        }
                    }
                }
            }
        }
        return flippable;
    }

    public void flipit(int row, int col) {

        for (int dirRow=-1;dirRow<2;dirRow++) {
            for (int dirCol=-1;dirCol<2;dirCol++) {
                if(dirRow == 0 && dirCol == 0) {
                    continue;
                }
                int newRow=row+dirRow;
                int newCol=col+dirCol;


                if (newRow>=0&&newRow<=7&&newCol>=0&&newCol<=7) {
                    COLOR oppoColor = this.currp.getColor() == COLOR.WHITE ? COLOR.BLACK : COLOR.WHITE;
                    if(board[newRow][newCol]==oppoColor) {
                        for (int range=0;range<8;range++) {

                            int nRow=row+range*dirRow;
                            int nCol=col+range*dirCol;


                            if(nRow<0||nRow>7||nCol<0||nCol>7) {
                                continue;
                            }
                            if(board[nRow][nCol]==this.currp.getColor()) {
                                for(int flipDist=1;flipDist<range;flipDist++) {
                                    int finalRow=row+flipDist*dirRow;
                                    int finalCol=col+flipDist*dirCol;
                                    if(board[finalRow][finalCol]==oppoColor) {
                                        board[finalRow][finalCol]=this.currp.getColor();
                                    }
                                }
                                break;
                            }
                        }
                    }
                }
            }
        }

    }
    public boolean checkend(){
        for(int i=0;i<8;i++){
            for(int j=0;j<8;j++){
                if (board[i][j]==COLOR.EMPTY){
                    return false;
                }
            }
        }
        return true;
    }
    public Player getCurrentPlayer() {
        return currp;
    }
    public COLOR[][] getBoard() {
        return board;
    }
    public int count(COLOR c){
        int total=0;
        for(int i=0;i<8;i++){
            for(int j=0;j<8;j++){
                if(board[i][j]==c){
                    total++;
                }
            }
        }
        return total;

    }



}
