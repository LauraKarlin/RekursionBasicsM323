public class Rekursion {
    public static void main(String[] args){
    }
    public int s = 10;

    public int summe (int s){
        if (s == 1){
            return 1;
        }
        else{
            return summe (s-1)+s;
            
        }
    }
  
}

