public class a2_shortestRoute {
    public static float findShortest(String str){
        int x=0, y=0;

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch == 'W'){
                x--;
            } else if (ch == 'E'){
                x++;
            } else if (ch == 'N'){
                y++;
            } else if (ch == 'S'){
                y--;
            }
        }
//        as alwys origin thus x2-x1 = x2 and y2-y1 = y2
        int x2 = x*x;
        int y2 = y*y;

        return (float) Math.sqrt(x2+y2);
    }
    public static void main(String[] args) {

        String route="WNEENESENNN";
        System.out.println(findShortest(route));
    }
}
