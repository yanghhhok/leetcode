package leetcode2;

public class 最后一个单词的长度 { public int lengthOfLastWord(String s) {
    if (s==null)
        return 0;
    for(int i=0;i<s.length();i++){
        if(s.charAt(i)!=' '){
            break;
        }
        if(i==s.length()-1){
            return 0;
        }
    }
    String[] strs=s.split(" ");
    return strs[strs.length-1].length();
}
}
