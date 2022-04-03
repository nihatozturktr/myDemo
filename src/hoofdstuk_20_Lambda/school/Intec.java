package hoofdstuk_20_Lambda.school;

public class Intec {
    private String group;
    private String groupName;
    private int StudentNum;


    public Intec(){

    }

    public Intec(String group, String groupName, int studentNum) {
        this.group = group;
        this.groupName = groupName;
        StudentNum = studentNum;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public int getStudentNum() {
        return StudentNum;
    }

    public void setStudentNum(int studentNum) {
        StudentNum = studentNum;
    }

    @Override
    public String toString() {
        return "Objeler{" +
                "group='" + group + '\'' +
                ", groupName='" + groupName + '\'' +
                ", StudentNum=" + StudentNum +
                '}';
    }
}



