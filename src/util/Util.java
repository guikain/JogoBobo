package util;

public class Util {
    
    public static int mobId = 1;

    public static int gerarId(){
        return mobId++;
    };

    public static boolean isValidNum(int num){
        if(num >= 0){
            return true;
        }
        return false;
    }

}
