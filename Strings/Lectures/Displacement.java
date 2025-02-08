package Strings.Lectures;

public class Displacement {
    public static float shortestPath(String str) {
        // starting coordinates
        int x1 = 0;
        int y1 = 0;
        // final destination coordinates
        int x2 = x1;
        int y2 = y1;
        for (int i = 0; i < str.length(); i++) {
            char dir = str.charAt(i);
            //East
            if(dir == 'E'){
                x2++;
            }
            //West
            else if(str.charAt(i) == 'W'){
                x2--;
            }
            //North
            else if(str.charAt(i) == 'N'){
                y2++;
            }
            //South
            else {
                y2--;
            }
        }

        // Displacement  
        float shortPath = (float)Math.sqrt(Math.pow(x2-x1, 2)+Math.pow(y2-y1, 2));
        return shortPath;
    }

    public static void main(String[] args) {
        String path = "WNEENESENNN";
        float res = shortestPath(path);
        System.out.println("Shortest Path = " +res);
    }
}
