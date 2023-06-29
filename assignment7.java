package assignment;
public class Student {
    private int studentId;
    private String studentName;
    private String residentialStatus;
    private long feesPerMonth;

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getResidentialStatus() {
        return residentialStatus;
    }

    public void setResidentialStatus(String residentialStatus) {
        this.residentialStatus = residentialStatus;
    }

    public long getFees() {
        return feesPerMonth;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", residentialStatus='" + residentialStatus + '\'' +
                ", feesPerMonth=" + feesPerMonth +
                '}';
    }
    public Student() {
    }

    public static void main(String[] args) {
        int studentId = Integer.parseInt(args[0]);
        String studentName = args[1];
        String residentialStatus = args[2];
        int semesterFee = Integer.parseInt(args[3]);
        int hostelFee = Integer.parseInt(args[4]);

        Student s = new Student();
        s.setStudentId(studentId);
        s.setStudentName(studentName);
        s.setResidentialStatus(residentialStatus);
        System.out.println(s);

    }
}
