// created by team in KL
public class Student {
    // data/attributes
    Name name;
    String kp;
    String address;
    String schoolname;
    float marks[] = new float[5];
    
    // methods or operations
    float calcAvg() {
        return 0;
    }
    
    float calcMin() {
        return 0;
    }

    void setName(Name thename) {
        nama = thename;
    }    
    
    void setMark(float mark, int i) throws Exception /*method for error*/ {
        marks[i] = mark;
    }
    if (mark < 0)
        throw new Exception("Error in mark detected");

    //print marks
    void displayMark(){
        for (int i=0; i<marks.length; i++){
            System.out.print("marks at index "+i+": "+marks[i]);
        }
    }

    public static void main(String args[]) {
        Student stud0 = new Student();
        try { //try block.. something in here can cause an exception
            stud0.setMark(mark:10, i:0);
        } catch (Exception ex) //catch block.. action to the taken

        System.out.println("Cannot continue");
        ex.printStackTrace();
    }
    
}