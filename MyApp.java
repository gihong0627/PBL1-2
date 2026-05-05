import java.util.Scanner;
/**
 * MyApp 사용자 입력을 받아 구구단 출력.
 * 
 * @author (2020315044 허진영)
 * @version (2026.05.05)
 */
public class MyApp
{
    public static void main(String[] args){
        Student JENNA = new Student("JENNA", "R005");
        Student JOAN = new Student("JOHN", "R010");
        Student MARIA = new Student("MARIA", "R029");
        Student JAMES = new Student("JAMES", "R009");

        System.out.println("단을 입력해주세요~");

        Scanner scandan = new Scanner(System.in);
        int dan = Integer.parseInt(scandan.nextLine());


        JENNA.timesTables(dan);
        System.out.println();
        scandan.close();
    }
}