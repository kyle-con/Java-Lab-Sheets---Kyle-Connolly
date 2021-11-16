class Student extends Person
{
    private int numCourses;
    private String[] courses = new String[20];
    private int[] grades = new int[20];

    public Student(String name, String address)
    {
        super(name, address);
        for(int i = 0; i < courses.length; i++)
        {
            courses[i] = "";
            grades[i] = -1;
        }
    }

    public void addCourseGrade(String course, int grade)
    {
        for(int i = 0; i < courses.length; i++)
        {
            if(courses[i] == "")
            {
                courses[i] = course;
                grades[i] = grade;
                numCourses++;
                break;
            }
            else if(i == courses.length - 1 && courses[i] != "")
            {
                System.out.println("This student has the maximum permited number of courses, please remove some and try again.");
            }
        }
    }

    public double getAverageGrade()
    {
        double average = 0;
        for(int i = 0; i < grades.length; i++)
        {
            if(grades[i] != -1)
            {
                average += grades[i];
            }
        }
        average = average / numCourses;
        return average;
    }

    public void printGrades()
    {
        System.out.print(toString());
        for(int i = 0; i < courses.length; i++)
        {
            if(courses[i] != "")
            {
                System.out.print(" " + courses[i] + ":" + grades[i]);
            }
        }
        System.out.println();
    }
    public String toString()
    {
        return "Student: " + super.toString();
    }
}