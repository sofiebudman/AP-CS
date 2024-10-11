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

    /**
     * Gives a response to a user statement
     *
     * @param statement the user statement
     * @return a response based on the rules given
     */
    public String getResponse(String statement)
    {
        String response = "";
        if (statement.indexOf("no") >= 0)
        {
            response = "Why so negative?";
        } else if (statement.indexOf("mother") >= 0
                || statement.indexOf("father") >= 0
                || statement.indexOf("sister") >= 0
                || statement.indexOf("brother") >= 0)
        {
            response = "Tell me more about your family.";
        }
       
        else if(statement.indexOf("dog") >= 0 || statement.indexOf("cat") >=0){
            response = "Tell me more about your pets";
       
        }
        else if(statement.indexOf("Mr.") >= 0){
            response = "He sounds like a good teacher.";
   
        }
        else if(statement.indexOf("Miss.") >= 0 || statement.indexOf("Mrs.") >= 0 || statement.indexOf("Ms.") >= 0){
            response = "She sounds like a good teacher.";
        }
        else if(statement.trim().length() == 0){
            System.out.println("Say something, please.");
        }
        else if(statement.indexOf("sad") >= 0){
            response = "I'm so sorry to hear that.";
        }
        else if (statement.indexOf("away") >= 0){
            response = "Where are you going?";
        }
        else if(statement.indexOf("food") >= 0){
            response = "What are you eating?";
        }
        else if(findKeyword(statement, "I want", 0)>= 0){
            response = transformIWantStatement(statement);
            
        }
         else if (findKeyword(statement, "I want to", 0) >= 0)
        {
            response = transformIWantToStatement(statement);
        }
    

        else
        {
            // Look for a two word (you <something> me)
            // pattern
            int psn = findKeyword(statement, "you", 0);

            if (psn >= 0 && findKeyword(statement, "me", psn) >= 0)
            {
                response = transformYouMeStatement(statement);
            }
            else if(findKeyword(statement, "I", 0) >= 0 && findKeyword(statement, "you", 1) >= 0){
                response = transformIMeStatement(statement);
            }
            else
            {
                response = getRandomResponse();
            }
        }
        return response;
        
    }
    private String transformIWantToStatement(String statement)
    {
       
        statement = statement.trim();
        String lastChar = statement.substring(statement.length() - 1);
        if (lastChar.equals("."))
        {
            statement = statement.substring(0, statement.length() - 1);
        }
        int psn = findKeyword(statement, "I want to", 0);
        String restOfStatement = statement.substring(psn + 9).trim();
        return "What would it mean to " + restOfStatement + "?";
    }
    
      private String transformIWantStatement(String statement)
    {
       
        statement = statement.trim();
        String lastChar = statement.substring(statement.length() - 1);
        if (lastChar.equals("."))
        {
            statement = statement.substring(0, statement.length() - 1);
        }
        int psn = findKeyword(statement, "I want", 0);
        String restOfStatement = statement.substring(psn + 6).trim();
        return "Would you really be happy if you had " + restOfStatement + "?";
    }
    
    private String transformYouMeStatement(String statement)
    {
       
        statement = statement.trim();
        String lastChar = statement.substring(statement.length() - 1);
        if (lastChar.equals("."))
        {
            statement = statement.substring(0, statement.length() - 1);
        }

        int psnOfYou = findKeyword(statement, "you", 0);
        int psnOfMe = findKeyword(statement, "me", psnOfYou + 3);

        String restOfStatement = statement.substring(psnOfYou + 3, psnOfMe).trim();
        return "What makes you think that I " + restOfStatement + " you?";
    }
    
    private String transformIMeStatement(String statement)
    {
        statement = statement.trim();
        String lastChar = statement.substring(statement.length() - 1);
        if (lastChar.equals("."))
        {
            statement = statement.substring(0, statement.length() - 1);
        }

        int psnOfYou = findKeyword(statement, "I", 0);
        int psnOfMe = findKeyword(statement, "you", psnOfYou + 3);

        String restOfStatement = statement.substring(psnOfYou + 2, psnOfMe).trim();
        return "Why do you " + restOfStatement + " me?";
        
    }
    
    private int findKeyword(String statement, String goal, int startPos)
    {
        String phrase = statement.trim();
        //  The only change to incorporate the startPos is in the line below
        int psn = phrase.toLowerCase().indexOf(goal.toLowerCase(), startPos);

        //  Refinement--make sure the goal isn't part of a word
        while (psn >= 0)
        {
            //  Find the string of length 1 before and after the word
            String before = " ", after = " ";
            if (psn > 0)
            {
                before = phrase.substring(psn - 1, psn).toLowerCase();
            }
            if (psn + goal.length() < phrase.length())
            {
                after =
                        phrase.substring(
                                        psn + goal.length(),
                                        psn + goal.length() + 1)
                                .toLowerCase();
            }

            //  If before and after aren't letters, we've found the word
            if (((before.compareTo("a") < 0)
                            || (before.compareTo("z")
                                    > 0)) //  before is not a letter
                    && ((after.compareTo("a") < 0)
                            || (after.compareTo("z") > 0)))
                            {
                return psn;
            }

            //  The last position didn't work, so let's find the next, if there is
            // one.
            psn = phrase.indexOf(goal.toLowerCase(), psn + 1);
        }

        return -1;
    }

    /**
     * Search for one word in phrase. The search is not case sensitive. This method
     * will check that the given goal is not a substring of a longer string (so,
     * for example, "I know" does not contain "no"). The search begins at the
     * beginning of the string.
     *
     * @param statement the string to search
     * @param goal the string to search for
     * @return the index of the first occurrence of goal in statement or -1 if it's
     *     not found
     */
    private int findKeyword(String statement, String goal)
    {
        return findKeyword(statement, goal, 0);
    }

    /**
     * Pick a default response to use if nothing else fits.
     *
     * @return a non-committal string
     */


   
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

