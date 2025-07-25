package QuizApp;

import java.util.Scanner;

public class QuestionService {

  Question[] questions = new Question[5];
  String selection[] = new String[5];

  public QuestionService() {
    questions[0] = new Question(1, "What is best programming language for oops concept?", "java", "c++", "c", "python", "java");
    questions[1] = new Question(2, "size of int", "4", "2", "1", "6", "4");
    questions[2] = new Question(3, "size of double", "2", "4", "8", "5", "8");
    questions[3] = new Question(4, "size of char", "6", "2", "4", "0", "2");
    questions[4] = new Question(5, "size of long", "8", "6", "4", "0", "8");
  }

  public void playQuiz() {

    int i = 0;
    for (Question q : questions) {
      System.out.println("Question no. : "+ q.getId());
      System.out.println(q.getQuestion());
      System.out.println(q.getOpt1());
      System.out.println(q.getOpt2());
      System.out.println(q.getOpt3());
      System.out.println(q.getOpt4());

      Scanner sc = new Scanner(System.in);
      selection[i] = sc.nextLine();
      i++;
    }

    for (String s : selection) {
      System.out.println(s);
    }
  }

  public void printScore() {
    int score = 0;

    for (int i = 0; i<questions.length; i++) {
      Question que = questions[i];
      String actualAnswer = que.getAnswer(); 

      String userAnswer = selection[i];

      if (actualAnswer.equals(userAnswer)) {
        score++;
      }
    }
    System.out.println("Your Score is : " + score);
  }

}
