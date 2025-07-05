import java.util.*;

class Question {
    String question;
    List<String> options;
    int correct;

    Question(String q, List<String> opt, int c) {
        question = q;
        options = opt;
        correct = c;
    }

    boolean ask(Scanner sc) {
        System.out.println("\n" + question);
        for (int i = 0; i < options.size(); i++) {
            System.out.println((i + 1) + ". " + options.get(i));
        }
        System.out.print("Enter your answer (1-" + options.size() + "): ");
        int ans = sc.nextInt();
        return ans == correct;
    }
}

public class QuizApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Question> qList = new ArrayList<>();
        qList.add(new Question("1. What is Java?",
                Arrays.asList("Database", "Programming Language", "OS", "Browser"), 2));
        qList.add(new Question("2. Which loop runs at least once?",
                Arrays.asList("for", "while", "do-while", "None"), 3));
        qList.add(new Question("3. Full form of OOP?",
                Arrays.asList("Object On Program", "Object Oriented Programming", "Old Ordered Program", "None"), 2));
        qList.add(new Question("4. Which is not a data type?",
                Arrays.asList("int", "float", "char", "code"), 4));
        qList.add(new Question("5. What is JVM?",
                Arrays.asList("Java Virtual Machine", "Java Visual Model", "Java Version Module", "None"), 1));

        int score = 0;

        System.out.println("(Day 08) Welcome to Java Quiz ");

        for (Question q : qList) {
            if (q.ask(sc)) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Wrong!");
            }
        }

        System.out.println("\nFinal Score: " + score + "/" + qList.size());
        sc.close();
    }
}
