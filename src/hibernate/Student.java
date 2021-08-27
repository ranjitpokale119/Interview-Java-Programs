package hibernate;

import java.util.Set;

public class Student {

    /*@ManyToMany
            @JoinTable(
                    name="Stud_Course_tbl",
                    joinColumns= @JoinColumn(name="student_id"),
                    inverseJoinColumns= @JoinColumn(name="course_Id")
            )
    Set<Course> courseSet;*/

    public static void d() {
        int a = 0;
        a = a + 10;

        System.out.println(a);
    }

    public static void main(String[] args) {
        Student student=null;
        student.d();
    }


}
