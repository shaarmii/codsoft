import java.util.*;
class Quiz{
String question;
List<String> options;
int correct;
public Quiz(String question,List<String> options,int correct){
this.question=question;
this.options=options;
this.correct=correct;
}

public String getQuestion(){
return question;
}

public List<String> getoptions(){
return options;
}

public int getcorrect(){
return correct;
}
}

public class Main{
List<Quiz> quest;
int index;
int score;
Timer timer;
Scanner sc;

public Main(){
quest=new ArrayList<>();
index=0;
score=0;
timer=new Timer();
sc=new Scanner(System.in);
}
public void addQuestion(Quiz question){
quest.add(question);
}

public void startQuiz(){
System.out.println("Lets Begin the QUIZ!!");
timer.schedule(new Task(),0,10000);
while(index<quest.size()){
Quiz currentQt=quest.get(index);
displayQt(currentQt);
int choice=getchoice();
if(choice==currentQt.getcorrect()){
System.out.println("CORRECT");
score++;
}
else 
   System.out.println("INCORRECT");
index++;
}
displayRes();
}

void displayQt(Quiz question){
System.out.println(question.getQuestion());
List<String> options=question.getoptions();
for(int i=0;i<options.size();i++){
System.out.println((i+1)+"."+options.get(i));
}
}
int getchoice(){
System.out.println("Enter your choice(1-"+quest.get(index).getoptions().size()+"):");
return sc.nextInt();
}

void displayRes(){
System.out.println("your score:"+score+"/"+quest.size());
}

class Task extends TimerTask{
int sec_left=10;
public void run(){
if(sec_left>0){
sec_left--;
}
else{
System.out.println("Time up");
index++;
}
}
}
public static void main(String args[]){
Main quizap=new Main();
quizap.addQuestion(new Quiz("who is the father of computer?",List.of("Dennis Ritchie","Charles Babbage","Bill Gates"),2));
quizap.addQuestion(new Quiz("what is the brain of computer?",List.of("RAM","CPU","GPU"),2));
quizap.addQuestion(new Quiz("which is known as volatile memory?",List.of("HDD","ROM","RAM"),3));
quizap.addQuestion(new Quiz("which is the smallest unit of memory?",List.of("Byte","Bit","Kb"),2));
quizap.addQuestion(new Quiz("what is half byte called?",List.of("Word Size","Bit","Nibble"),3));
quizap.addQuestion(new Quiz("How many generations computers are classified?",List.of("4","5","3"),2));
quizap.addQuestion(new Quiz("which is the first mechanical calculating device?",List.of("Abacus","Pascaline","UNIVAC"),1));
quizap.addQuestion(new Quiz("Pascaline is known as?",List.of("Adding Machine","Division Machine","Difference Engine"),1));
quizap.addQuestion(new Quiz("Integrated Circuits used in computers were developed using which material",List.of("Gold","Silver","Silicon"),3));
quizap.addQuestion(new Quiz("The time taken by computer to process specific task is called as?",List.of("Response Time","Execution Time","Real Time"),2));
quizap.startQuiz();
System.exit(0);
}

}




















