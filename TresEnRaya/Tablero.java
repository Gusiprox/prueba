package TresEnRaya;

public class Tablero {
    
    private String tablero;
    private String tableroHelp;
    
    private String pieza11;
    private String pieza12;
    private String pieza13;

    private String pieza21;
    private String pieza22;
    private String pieza23;

    private String pieza31;
    private String pieza32;
    private String pieza33;


    public Tablero(){

        putTableroToDefault();

        tableroHelp = (

            "-----------------------\n" +

            " -- " + "11" + " ---- " + "12" + " ---- " + "13" + " -- " +
            "\n------------------------\n" +

            " -- " + "21" + " ---- " + "22" + " ---- " + "23" + " -- " +
            "\n------------------------\n" +

            " -- " + "31" + " ---- " + "32" + " ---- " + "33" + " -- " +
            
            "\n------------------------\n"

        );

        actuTablero();   
    }

    public String getTablero(){

        return tablero + "\n" + tableroHelp;
    }

    private void putTableroToDefault(){

        pieza11 = "p";
        pieza12 = "p";
        pieza13 = "p";
    
        pieza21 = "p";
        pieza22 = "p";
        pieza23 = "p";
    
        pieza31 = "p";
        pieza32 = "p";
        pieza33 = "p";

        System.out.println("Se ha puesto el tablero en default1");
    
    }

    public void actuTablero(String pieze, String turn){

        //Si se me ocurre ordenar por el primer numero y despues por el segudo
        switch (pieze) {

            case "11":
                
                pieza11 = turn;
                System.out.println("Pieza 11 actualizada");
                break;
            case "12":
                
                pieza12 = turn;
                break;

            case "13":
                
                pieza13 = turn;
                break;

                //Siguiente parte

            case "21":
                
                pieza21 = turn;
                break;
            case "22":
                
                pieza22 = turn;
                break;

            case "23":
                
                pieza23 = turn;
                break;

                //Siguiente parte

                
            case "31":
                
                pieza31 = turn;
                break;
            case "32":
                
                pieza32 = turn;
                break;
            case "33":

                pieza33 = turn;
                break;

            default:
                //No se de que manera se acaba aqui
                System.out.println("Ha pasado algo");
                break;
        }

        actuTablero();

    }

    public String getPiezeTablero(String pieze){

        //Si se me ocurre ordenar por el primer numero y despues por el segudo
        switch (pieze) {

            case "11": 
                return pieza11;
            case "12":  
                return pieza12;
            case "13":           
                return pieza13;
                
                //Siguiente parte

            case "21":        
                return pieza21;
            case "22":
                return pieza22;
            case "23":      
                return pieza23;
                
                //Siguiente parte

            case "31":
                return pieza31;
            case "32":
                return pieza32;
            case "33":
                return pieza33;
               
            default:
                //No se de que manera se acaba aqui
                System.out.println("Ha pasado algo");
                return "p";

        }

    }

    public void actuTablero(){

        tablero = (

            "-----------------------\n" +

            " -- " + pieza11 + " ---- " + pieza12 + " ---- " + pieza13 + " -- " +
            "\n------------------------\n" +

            " -- " + pieza21 + " ---- " + pieza22 + " ---- " + pieza23 + " -- " +
            "\n------------------------\n" +

            " -- " + pieza31 + " ---- " + pieza32 + " ---- " + pieza33 + " -- " +
            
            "\n------------------------\n"

        );
    }

    public Boolean checkWin(){

        boolean win = false;

        
        if (!pieza11.equals("p") && pieza11.equals(pieza12) && pieza11.equals(pieza13)) {
        
            win = true;

        } else if (!pieza21.equals("p") && pieza21.equals(pieza22) && pieza21.equals(pieza23)) {
            
            win = true;

        } else if (!pieza31.equals("p") && pieza31.equals(pieza32) && pieza31.equals(pieza33)) {
            
            win = true;
            
        } else if (!pieza11.equals("p") && pieza11.equals(pieza21) && pieza11.equals(pieza31)) {
            
            win = true;
            
        } else if (!pieza12.equals("p") && pieza12.equals(pieza22) && pieza12.equals(pieza32)) {
            
            win = true;
            
        } else if (!pieza13.equals("p") && pieza13.equals(pieza23) && pieza13.equals(pieza33)) {
            
            win = true;
            
        } else if (!pieza11.equals("p") && pieza11.equals(pieza22) && pieza11.equals(pieza33)) {
            
            win = true;
            
        } else if (!pieza13.equals("p") && pieza13.equals(pieza22) && pieza13.equals(pieza31)) {
            
            win = true;
            
        }

        return win;
    }

    private Boolean checkDraw(){

        String allSume;

        allSume = pieza11 + pieza12 + pieza13 + pieza21 + pieza22 + pieza23 + pieza31 + pieza32 + pieza33;

        if (!allSume.contains("p")) {
            
            return true;
        }
        return false;
    }

}
