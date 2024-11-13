package TresEnRaya;

import javax.swing.JOptionPane;

public class Main {
    
    public static void main(String[] args) {
        
        Tablero tablero = new Tablero();
        operations ope = new operations();

        Boolean continuePlaying = true;
        String turn = "O";

        Boolean changeTurn;

        String resp;

        while (continuePlaying) {

            JOptionPane.showMessageDialog(null, tablero.getTablero());

            do {
                
                changeTurn = false;
                resp = JOptionPane.showInputDialog(tablero.getTablero() + "\n Que pieza quieres actualizar" + "\n Turno de: " + turn);

                if (ope.validateMove(resp, tablero)) {

                    tablero.actuTablero(resp, turn);
                    changeTurn = true;
                    
                } else{

                    JOptionPane.showMessageDialog(null, "Movimiento Invalido");

                }

            } while (!changeTurn);

            if (!(tablero.checkWin())) {
                
                turn = ope.getTurn(turn);
                System.out.println("Cambio de turno");
    
            } else {

                JOptionPane.showMessageDialog(null, tablero.getTablero());

                JOptionPane.showMessageDialog(null, "Gano el jugador: " + turn);
                
                continuePlaying = false;
                System.out.println("Alguien a ganado");
            }

            
        }
    
    }
}
