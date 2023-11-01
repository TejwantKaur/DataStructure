public class a4_firstLetterUppercase {
    public static String toUp(String str){
        StringBuilder sb = new StringBuilder("");

        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for(int i=1; i<str.length(); i++){
            ch = str.charAt(i);
            if(ch == ' ' && i<str.length()-1){
                sb.append(ch); // space appended
                i++;
                sb.append(Character.toUpperCase(str.charAt(i))); //
            } else {
                sb.append(ch);
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String str = "hello i am tejwant kaur";
        System.out.println(toUp(str));
    }
}
