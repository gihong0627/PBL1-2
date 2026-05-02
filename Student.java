
/**
 * Student 구구단이 가능한 학생이 만들어지는 클래스.
 *
 * @author (2021320032 임기홍)
 * @version (2026 05 02)
 */
public class Student
{
    private String name;
    private int id;

    /**
     * Student 클래스의 객체 생성자
     */
    public Student(String name, int id)
    {
        this.name = name;
        this.id = id;
    }
    
    /**
     * Student 클래스의 id를 제외한 오버로딩 객체 생성자
     */
    public Student(String name)
    {
        this.name = name;
    }

    /**
     * 파라미터로 받은 단을 계산해 객체 이름과 구구단을 출력하는 메서드
     *
     * @param  dan 정수형 구구단의 단
     * 
     */
    public void timesTables(int dan) {
        System.out.print(this.name + " : ");
        for (int count = 1; count <= 9; count++) {
            System.out.print(dan + "×" + count + "=" + (dan * count) + "\t");
        }
    }
}
