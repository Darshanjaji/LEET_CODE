int[][] result = new int[m][n];
int row=0,column=0,temp=0;
// result[0].length = No of Column
// result.length = No of Rows
//  Since we don't know how many rows so we are iterating the number of rows in indices.
for(int i=0;i<indices.length;i++){
// We Know that first column is to increment all cells on row by one. So we took column 0th of every row which will increment every row of result matrix.
row=indices[i][0];
for(int j=0;j<result[0].length;j++)
result[row][j]=result[row][j]+1;
// Similarly, We Know that second column is to increment all cells on column by one. So we took row 0th of every column which will increment every column of result matrix.
column=indices[i][1];
for(int j=0;j<result.length;j++)
result[j][column]=result[j][column]+1;
}
//  Finding the count of odd number in resultant Matrix.
for(int i=0;i<result[0].length;i++){
for(int j=0;j<result.length;j++){
if(result[j][i]%2!=0)
temp++;
}
}
return temp;