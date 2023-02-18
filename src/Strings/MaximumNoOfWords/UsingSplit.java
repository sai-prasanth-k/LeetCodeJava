package Strings.MaximumNoOfWords;

public class UsingSplit {
        public int mostWordsFound(String[] sentences) {
            int maxCount = 0;
            for(int i =0; i< sentences.length;i++){
                maxCount = Math.max(maxCount,(sentences[i].split(" ")).length);
            }
            return maxCount;
        }
}
