class Solution {
    public String longestCommonPrefix(String[] strs) {

        StringBuilder sb = new StringBuilder();

        int arrayLength = strs.length;

for(int i=0;i<strs[0].length();i++){
    int count = 0;
    for(int j=0;j<arrayLength;j++){
        if(i>=strs[j].length()){
            break;
        }

        char c = strs[j].charAt(i);

        if(strs[0].charAt(i) == c){
            count++;
        }

    }
    if(count == arrayLength){
        sb.append(strs[0].charAt(i));
    }else{
        break;
    }
}

    return sb.toString();
    }
}