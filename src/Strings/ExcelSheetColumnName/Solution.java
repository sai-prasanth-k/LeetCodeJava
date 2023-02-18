package Strings.ExcelSheetColumnName;

class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder columnName = new StringBuilder();
        while (columnNumber > 0){
            int r = columnNumber % 26;
            if(r == 0){
                columnName.append('Z');
                columnNumber = (columnNumber / 26) -1;

            }else {
                columnName.append((char)((r-1)+'A'));
                columnNumber = columnNumber /26;
            }
        }
        columnName.reverse();
        return columnName.toString();
    }
}
