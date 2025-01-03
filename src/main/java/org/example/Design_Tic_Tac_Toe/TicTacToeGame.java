package org.example.Design_Tic_Tac_Toe;
import java.util.*;

public class TicTacToeGame {

    Deque<Player> players;
    Board gameBoard;

    public void initializeGame(){
        players=new LinkedList<>();
        PlayingPieceX crossPiece=new PlayingPieceX();
        Player player1=new Player("Player1",crossPiece);

        PlayingPieceO noughtsPiece=new PlayingPieceO();
        Player player2=new Player("Player2",noughtsPiece);

        players.add(player1);
        players.add(player2);

        gameBoard=new Board(3);
    }

    public String startGame(){
        boolean noWinner=true;
        while(noWinner){
            Player playerTurn=players.removeFirst();
            gameBoard.printBoard();
            List<Pair<Integer,Integer>> freeSpaces=gameBoard.getFreeCalls();
            if(freeSpaces.isEmpty()){
                noWinner=false;
                continue;
            }

            System.out.println("Player:"+playerTurn.name+" Enter row,column: ");
            Scanner inputScanner=new Scanner(System.in);
            String s=inputScanner.nextLine();
            String[] values=s.split(",");
            int inputRow=Integer.valueOf(values[0]);
            int inputColumn=Integer.valueOf(values[1]);

            boolean pieceAddedSuccessfully= gameBoard.addPiece(inputRow,inputColumn,playerTurn.playingPiece);
            if(!pieceAddedSuccessfully){
                System.out.println("Incorrect position chosem,try again");
                players.addFirst(playerTurn);
                continue;
            }
            players.addLast(playerTurn);

            boolean winner=isThereWinner(inputRow,inputColumn,playerTurn.playingPiece.pieceType);

            if(winner){
                return playerTurn.name;
            }
        }

        return "tie";
    }

    public boolean isThereWinner(int row,int column,PieceType pieceType){
        boolean rowMatch=true;
        boolean columnMatch=true;
        boolean diagonalMatch=true;
        boolean antiDiagonalMatch=true;

        for(int i=0;i< gameBoard.size;i++){
            if(gameBoard.board[row][i]==null || gameBoard.board[row][i].pieceType!=pieceType){
                rowMatch=false;
            }
        }

        for (int i=0;i<gameBoard.size;i++){
            if(gameBoard.board[i][column] == null || gameBoard.board[i][column].pieceType!=pieceType){
                columnMatch=false;
            }
        }

        for(int i=0,j=0;i<gameBoard.size;i++,j++){
            if(gameBoard.board[i][j]==null || gameBoard.board[i][j].pieceType!=pieceType){
                diagonalMatch=false;
            }
        }

        for(int i=0,j= gameBoard.size-1;i<gameBoard.size;i++,j--){
            if(gameBoard.board[i][j]==null || gameBoard.board[i][j].pieceType!=pieceType){
                antiDiagonalMatch=false;
            }
        }

        return rowMatch || columnMatch || diagonalMatch || antiDiagonalMatch;
    }
}
