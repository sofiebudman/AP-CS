
/**
 * Write a description of class GrayImage here.
 *
 * @author Sofie Budman
 * @version 3/5/2025
 */
public class GrayImage
{
    // instance variables - replace the example below with your own
    public static final int BLACK = 0;
    public static final int WHITE = 255;
    
    private int[][] pixelValues;

    /**
     * Constructor for objects of class GrayImage
     * Precondition: values != null
     * Postcondition: pixelValues[][[] is not pointed to values[][] 
     * (pixelValues have its own memory)
     */
    public GrayImage(int[][] values)
    {
        pixelValues = new int[values.length][values[0].length];
        for(int i = 0;i < values.length; i++ ){
            for(int j = 0; j < values[0].length; j++){
                pixelValues[i][j] = values[i][j];
            }
        }
        
     
        // initialise instance variables
       
    }

    public int countWhitePixels()
    { 
        int c = 0;
        for(int i = 0;i < pixelValues.length; i++ ){
            for(int j = 0; j < pixelValues[0].length; j++){
                if(pixelValues[i][j] == WHITE){
                    c ++;
                }
            }
        }
        return c;
        
        
    }
    public void processImage()
    {
        int rows = pixelValues.length - 2; //num rows that you cna access
        int columns = pixelValues[0].length - 2; //num colums you can access

        for(int i = 0; i < rows; i++){
            for (int j = 0; j < columns; j ++){
                int item = pixelValues[i][j];
                int dec = pixelValues[i+2][j+2];
                if(item - dec < BLACK){
                    pixelValues[i][j] = BLACK;

                }else{
                    pixelValues[i][j] = item-dec;
                }
            }
        }
        
    }
    public int[][] getPixelValues()
    {
        return pixelValues;
    }
    public void printArray(int[][] arr)
    {
        for(int i = 0;i < arr.length; i++ ){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        
    }
    public static void main(String[] args)
    {
        int[][] arr = { {221,184,178,84,135},{84,255,255,130,84},{78,255,0,0,78},
                                {84,130,255,130,84}};
        
        int[][] expected =  {{221,184,100,84,135},{0,125,171,130,84},{78,255,0,0,78},
                                {84,130,255,130,84}};
        GrayImage g = new GrayImage(arr);
        System.out.println(g.countWhitePixels());
        System.out.println("Answer should be 4");
        System.out.println();
        
        g.processImage();
        System.out.println("Result");
        g.printArray(g.getPixelValues());
        System.out.println();
        System.out.println("Expected Result");
        g.printArray(expected);
        
        
    }
    
}
