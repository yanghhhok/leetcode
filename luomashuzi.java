package leetcode2;

public class luomashuzi{

    public int getNum(char ch){
        switch(ch){
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }

    public int romanToInt(String s) {
        int result = 0;
        for(int j=0;j<s.length()-1;j++){
            if(getNum(s.charAt(j))>=getNum(s.charAt(j+1))){
                result += getNum(s.charAt(j));
            }else{
                result -= getNum(s.charAt(j));
            }
        }
        result+=getNum(s.charAt(s.length()-1));
        return result;
    }


}

