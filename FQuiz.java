import javax.swing.*;

public class FQuiz {
    public static void main(String[] args) {
        String[][] questions = {
            {"Which is a Neon number? "},{
            "Which is a Prime number?"},{
            "Which is the capital of India? "},{
            "Which planet is known as the Red Planet?"},{"What is largest planet in solar System?"}
        ,{"what is the ph of human blood?"},{"what is the name of ceo of nvidia?"},{"total number of country in SARC?"},{"what is the SI unit of current?"},{"what is the atomic number of gold?"},{"what is the atomic mass of Na"}};
        String[][] option ={{"a) 4","b) 7" ,"c) 9 " ,"d) 21" },
        {"a) 4","b) 7" ,"c) 9 " ,"d) 21" },
        {"a) Mumbai" ,"b) Delhi"," c) Kolkata"," d) Chennai"},
        {"a) Earth","b) Venus" ,"c) Mars", "d) Jupiter"},
        {"a) Earth","b) Venus" ,"c) Mars", "d) Jupiter"},
        {"a) 4","b) 7" ,"c) 9 " ,"d) 21" },
    {"a) sunder pichai","b) ven huan" ,"c) jensen Huang " ,"d) priya thapar" },{"a) 4","b) 8 " ,"c) 9 " ,"d) 21" },{"a) Volt","b) Ampere" ,"c) Tesla " ,"d) farad" },{"a) 78","b) 79" ,"c) 70 " ,"d) 71" },{"a) 11","b) 22" ,"c) 23 " ,"d) 24" }};
        String[][] answers = { {"c) 9"},{ "b) 7"},{ "b) Delhi"}, {"c) Mars"},{"d) Jupiter"},{ "b) 7"},{"c) jensen Huang " },{ "b) 8"},{"b) Ampere" },{"b) 79"},{"c) 23"}};
        int score = 0,chose=0;
  for ( int i = 0; i < questions.length; i++) {
 chose=JOptionPane.showOptionDialog(null,questions[i],
"Quiz",JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE,null,option[i],option[0][0]);
            if(option[i][chose].equals(answers[i][0])){
            score++;
            }}
            
                JOptionPane.showMessageDialog(null,"Score is :"+score+"out of"+questions.length);
        

            
        }
        }