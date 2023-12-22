import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class QuizApplication {
    private static final int TOTAL_QUESTIONS = 3;
    private static final int TIME_LIMIT_SECONDS = 10;

    private int currentQuestion;
    private int correctAnswers;
    private Timer timer;

    private String[] questions = {
       " Who is the author of the play Romeo and Juliet?",
       "Which novel begins with the famous line, Call me Ishmael?",
       "What is the name of the fictional wizarding school in the Harry Potter series?"
    };

    private String[][] options = {
            {"A) William Shakespeare", "B) Jane Austen", "C) Charles Dickens", "D) F. Scott Fitzgerald"},
            {"A) Pride and Prejudice", "B) Moby-Dick", "C) The Great Gatsby", "D) 1984"},
            {"A) Hogwarts", "B) Beauxbatons", "C) Durmstrang", "D) Ilvermorny"},
    };

    private String[] correctAnswersArray = {"A", "B", "A"};

    public QuizApplication() {
        currentQuestion = 0;
        correctAnswers = 0;
        timer = new Timer();
    }

    public void startQuiz() {
        System.out.println("Welcome to the Quiz!\n");
        askQuestion();
    }

    private void askQuestion() {
        if (currentQuestion < TOTAL_QUESTIONS) {
            System.out.println(questions[currentQuestion]);
            for (String option : options[currentQuestion]) {
                System.out.println(option);
            }
            System.out.print("Your choice (A/B/C/D): ");

            startTimer();
            Scanner scanner = new Scanner(System.in);
            String userAnswer = scanner.nextLine().toUpperCase();

            checkAnswer(userAnswer);
        } else {
            endQuiz();
        }
    }

    private void startTimer() {
        timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            private int seconds = TIME_LIMIT_SECONDS;

            @Override
            public void run() {
                System.out.println("Time remaining: " + seconds + " seconds");

                if (seconds == 0) {
                    System.out.println("\nTime's up! Moving to the next question.\n");
                    checkAnswer("");
                }

                seconds--;
            }
        }, 0, 1000);
    }

    private void checkAnswer(String userAnswer) {
        timer.cancel();

        if (currentQuestion < TOTAL_QUESTIONS) {
            String correctAnswer = correctAnswersArray[currentQuestion];

            if (userAnswer.equals(correctAnswer)) {
                System.out.println("Correct!\n");
                correctAnswers++;
            } else {
                System.out.println("Incorrect. The correct answer is " + correctAnswer + "\n");
            }

            currentQuestion++;
            askQuestion();
        } else {
            endQuiz();
        }
    }

    private void endQuiz() {
        System.out.println("Quiz completed!");
        System.out.println("Your score: " + correctAnswers + " out of " + TOTAL_QUESTIONS);

        System.exit(0);
    }

    public static void main(String[] args) {
        QuizApplication quiz = new QuizApplication();
        quiz.startQuiz();
    }
}
