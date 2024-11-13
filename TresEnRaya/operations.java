package TresEnRaya;

public class operations {
    
    public String getTurn(String turn){

        if (turn.equals("O")) {
            return "X";
        } else{
            return "O";
        }
    }

    public Boolean validateMove(String pieze, Tablero tab){

        Boolean valid = true;

        if (!(pieze.equals("11") || 
            pieze.equals("12") ||
            pieze.equals("13") ||

            pieze.equals("21") ||
            pieze.equals("22") ||
            pieze.equals("23") ||

            pieze.equals("31") ||
            pieze.equals("32") ||
            pieze.equals("33")
        
        )) {
            
            valid = false;
        }


        if (!(tab.getPiezeTablero(pieze).equals("p"))) {
            
            valid = false;
        }

        return valid;
    }
}
