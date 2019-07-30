/**
 * @(#)Scores.java
 * Griffin White
 *
 * @author 
 * @version 1.00 2018/10/30
 */


public class Scores {
	
	//A private String array that will hold the individual score codes.
	private String [] IndScores;
	//A private int variable that will hold the team's final score.
	private int TotScores;
	//A set of private int variables that will hold each team's final score.
	private int Team1FinalScore;
	private int Team2FinalScore;
	
	//The main constructor that will recieve the combined score codes.
    public Scores(String CombinedScores) 
    {
    	//Assiging what was sent over to "IndScores" and splitting up the compined line.
    	IndScores = CombinedScores.split("");
    }
    
    //A secondary constructor that will recieve the final scores of each team.
    public Scores (int Team1FinalScoreA, int Team2FinalScoreA)
    {
    	//Assiging the sent over scores to their variables.
    	Team1FinalScore = Team1FinalScoreA;
    	Team2FinalScore = Team2FinalScoreA;
    }
    
    //The method which will tally up a team's score.
    public int CalcScores ()
    {
    	//A for loop that will cycle until reaching the last score code.
		for (int K = 0; K < IndScores.length; K++)		
		{
			//An int variable which will keep track of the current score.
			int CurrentScore = 0;
			
			//A set of switch steaments for each score code.
			switch (IndScores [K])
			{
				//The case for a touchdown.
				case "T":
					//Setting the "CurrentScore" to six.
					CurrentScore = 6;
					break;
				
				//The case for a point after attempt made, kicked.
				case "K":
					//Setting the "CurrentScore" to one.
					CurrentScore = 1;
					break;
					
				//The case for a point after attempt made, pass or run.
				case "W":
					//Setting the "CurrentScore" to two.
					CurrentScore = 2;
					break;
				
				//The case for a point after attempt blocked, returned to other goal by defense.	
				case "B":
					//Setting the "CurrentScore" to two.
					CurrentScore = 2;
					break;
					
				//The case for a field goal.	
				case "F":
					//Setting the "CurrentScore" to three.
					CurrentScore = 3;
					break;
				
				//The case for a safety.	
				case "S":
					//Setting the "CurrentScore" to two.
					CurrentScore = 2;
					break;			
			}
			
			//Adding the score from the current code to the score total.
			TotScores += CurrentScore;
		}
		
		//Returning the total score.	
		return TotScores;		
    }
    
    //A method which will determine the winning team.
    public boolean WinningTeam ()
    {
    	//An if statement for when the first team wins.
    	if (Team1FinalScore > Team2FinalScore)
    		//Returning true.
    		return true;
    	//An else statement for when the first team loses.	
    	else 
    		//Returning false.
    		return false;	
    	
    }
    
    
    
    
}