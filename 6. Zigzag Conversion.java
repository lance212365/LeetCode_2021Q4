import java.util.*;


class ZigzagConversion {
    public static void main(String[] args) {
        System.out.println(convert(args[0],args[1]));
    }
    public String convert(String s, int numRows) {
        if(numRows == 1){return s;}
        StringBuilder result = new StringBuilder();
        ArrayList<StringBuilder> strlist = new ArrayList<StringBuilder>();
        while(strlist.size() != numRows){
            strlist.add(new StringBuilder());
        }
        int currentRow = 0;
        boolean directionDown = false;
        for(char c : s.toCharArray()){
            strlist.get(currentRow).append(c);
            if(currentRow == 0 || currentRow == numRows-1) directionDown = !directionDown;
            currentRow += directionDown? 1:-1;
        }
        for(StringBuilder sb : strlist){
            result.append(sb.toString());
        }
        return result.toString();
    }
}