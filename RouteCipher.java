
/**
 * Write a description of class RouteCipher here.
 *
 * @author Sofie Budman
 * Period 5
 * @version 3/10/25
 */
public class RouteCipher
{
    // instance variables - replace the example below with your own
    private String[][] letterBlock;
    private int numRows;
    private int numCols;
    /* Constructor
     * Postcondition: letterBlock has been instantiated. All instant variables have been initialized.
     */
    public RouteCipher(int numRows, int numCols)
    {
        this.numRows = numRows;
        this.numCols = numCols;
        letterBlock = new String[numRows][numCols];
        
        
        
    }
    private void fillBlock(String str)
    {
        int s =0;
        for(int i = 0; i < numRows; i++ ){
            for(int j = 0; j < numCols; j ++ ){
                if(s < str.length()){
                    letterBlock[i][j] = str.substring(s, s+1);

                }else{
                    letterBlock[i][j] = "A";

                }

                s++;

            }
        }
    }
    private String encryptBlock()
    {
        String out = "";
        for(int i = 0; i < numCols; i ++ ){
            for(int j = 0; j < numRows; j ++ ){
                out += letterBlock[j][i];

            }
            
        }
        return out;
        
    }
    public String encryptMessage(String message)
    {
        String out = "";
        fillBlock(message);
        while(message.length() >= numRows*numCols){
            fillBlock(message.substring(0, (numRows*numCols)));
            out += encryptBlock();
            message = message.substring(numRows*numCols);

        }
        fillBlock(message);
        out += encryptBlock();
        return out;
    }
       
        
        

    public void printLetterBlock()
    {
        for(int i=0;i<numRows;i++)
        {
            for(int j=0;j<numCols;j++)
                System.out.print(letterBlock[i][j] + " ");
            System.out.println();
        }
            
    }
    public static void main(String[] args)
    {
        RouteCipher r = new RouteCipher(2,3);
        System.out.println(r.encryptMessage("Meet at midnight"));
        System.out.println("Expected: Mte eati dmnitgAhA");
    }
}
