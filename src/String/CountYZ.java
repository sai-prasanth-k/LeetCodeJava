package String;

public class CountYZ {
    static int countYZ(String s){
        int strLength = s.length() -1 ;
        int i =0;
        int countX = 0;
        int totalCount = 0;
        while ( i < strLength){

            if (s.charAt(i) == s.lastIndexOf(('y'))) countX++;
            if (s.charAt(i) ==s.lastIndexOf('z')) totalCount +=countX;

        }
        return totalCount;
    }

    public static void main(String[] args) {
        String s = "fez day";
        System.out.println(countYZ(s));
    }
}
