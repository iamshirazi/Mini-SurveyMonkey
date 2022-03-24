public class Answer {

    private Long answerID;

    private String answer;



    public Answer( String answer){
        this.answer = answer;
    }

    public String getAnswer(){
        return this.answer;
    }

    public void setAnswer(String answer){
        this.answer = answer;
    }
}
