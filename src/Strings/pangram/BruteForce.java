package Strings.pangram;

class BruteForce {
    public boolean checkIfPangram(String sentence) {
        for(int i = 0; i<26;i++){
            char current = (char)('a' +i);
            if(sentence.indexOf(current) == -1) return false;
        }
        return true;
    }
}
