public class GraduateStudent extends Students{
    public void computeCourseGrade(){
        int total = 0;
        for (int i = 0; i < NUM_OF_TESTS; i++) {
            test+=test[i];
        }
        if (total/NUM_OF_TESTS >=80) {
            courseGrade = "pass";
        }else{
            courseGrade= "no pass";
        }
    }
}