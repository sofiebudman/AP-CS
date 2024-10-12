public class Magpie2
{
    /**
     * Get a default greeting
     *
     * @return a greeting
     */
    public String getGreeting()
    {
        return "Hello, let's talk.";
    }

    
    public String getResponse(String statement)
    {
        String response = "";
        if(statement.indexOf("I") >= 0 && statement.indexOf("you") >= 0){
            //checks for an I ____ you statment
            statement = statement.trim();
            if(statement.substring(statement.length() - 1) == "."){
                statement = statement.substring(0, statement.length() - 1);
            }
            String word = statement.substring(statement.indexOf("I") + 2, statement.indexOf("you") -1);
            
            response = "Why do you " + word + " me?";
            
            
        }
        else if (statement.indexOf("I want") >=0 )
        {
            //checks for an I want 
            statement = statement.trim();
            String word = statement.substring(statement.indexOf("I want") + 6);
            word.trim();
            if(word.substring(word.length() - 1).equals(".")){
                word = word.substring(0, word.length() - 1);
            }
            response = "Would you be really happy if you had" + word + "?";
        }

        else if (statement.indexOf("no") >= 0)
        //checks for no
        {
            response = "Why so negative?";
        } else if (statement.indexOf("mother") >= 0
                || statement.indexOf("father") >= 0
                || statement.indexOf("sister") >= 0
                || statement.indexOf("brother") >= 0)
                //checks for family keyword
        {
            response = "Tell me more about your family.";
        }
       
        else if(statement.indexOf("dog") >= 0 || statement.indexOf("cat") >=0){
            //checks for dog/cat keyword
            response = "Tell me more about your pets";
       
        }
        else if(statement.indexOf("Mr.") >= 0){
            //checks for a Mr
            response = "He sounds like a good teacher.";
   
        }
        else if(statement.indexOf("Miss.") >= 0 || statement.indexOf("Mrs.") >= 0 || statement.indexOf("Ms.") >= 0){
            //checks for a Ms/Mrs/Miss
            response = "She sounds like a good teacher.";
        }
        else if(statement.trim().length() == 0){
            //if the statement is just white space, it will print the following
            System.out.println("Say something, please.");
        }
        else if(statement.indexOf("sad") >= 0){
            //checks for the sad keyword
            response = "I'm so sorry to hear that.";
        }
        else if (statement.indexOf("away") >= 0){
            //checks for the away keyword
            response = "Where are you going?";
        }
        else if(statement.indexOf("food") >= 0){
            //checks for the food keyword
            response = "What are you eating?";
        }
       
    
      
        else
        {
            //otherwise it will pick a random response from this method
            response = getRandomResponse();
            
        }
        return response;
        
    }
    
   
    private String getRandomResponse()
    {
        final int NUMBER_OF_RESPONSES = 6;
        double r = Math.random();
        int whichResponse = (int) (r * NUMBER_OF_RESPONSES);
        String response = "";

        if (whichResponse == 0)
        {
            response = "Interesting, tell me more.";
        }
        else if (whichResponse == 1)
        {
            response = "Hmmm.";
        }
        else if (whichResponse == 2)
        {
            response = "Do you really think so?";
        }
        else if (whichResponse == 3)
        {
            response = "You don't say.";
        }
        else if(whichResponse == 4){
            response = "Omg really";
        }
        else if (whichResponse == 5){
            response = "I disagree";
        }

        return response;
    }
}

