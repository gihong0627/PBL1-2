import java.util.Scanner;
/**
 * MyApp 사용자 입력을 받아 구구단 출력.
 * 
 * @author (2020315044 허진영)
 * @version (2026.05.02)
 */
public class MyApp
{
    public static void main(String[] args){
        Student JENNA = new Student("JENNA", 2021320032);
        Student JOAN = new Student("JOAN");
        Student MARIA = new Student("MARIA", 2020320020);
        Student JAMES = new Student("JAMES", 2024320031);

        System.out.println("단을 입력해주세요~");

        Scanner scandan = new Scanner(System.in);
        int dan = Integer.parseInt(scandan.nextLine());


        JENNA.timesTables(dan);
        System.out.println();
        scandan.close();
    }
}