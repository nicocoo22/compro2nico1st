public class Theater2D {
    public static void main (String[] args){

        int[][] theater = new int [5][8];

        theater[2][5] = 1;
        theater[0][0] = 1;

        for (int i = 0; i < 5; i++){
            for (int a = 0; a < 8; a++) {
                if (theater[i][a] == 0) {
                    System.out.print("|-| ");
                }else {
                    System.out.print("|x| ");
                }
            } System.out.println();
        }
        
    } 
         int count = 0;
        for (int i = 0; i < 5; i++) {
            for (int a = 0; a < 8; a++) {
                if (theater[i][a] == 1) {
                    count++;
                }
            }
        }

        System.out.println("Booked seats: " + count);
    }
