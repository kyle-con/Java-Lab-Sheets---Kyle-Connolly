class Teacher extends Person
{
    private String[] courses = new String[20];

    public Teacher(String name, String address)
    {
        super(name, address);
        for(int i = 0; i < courses.length; i++)
        {
            courses[i] = "";
        }
    }

    public boolean addCourse(String course)
    {
        boolean success = false;
        for(int i = 0; i < courses.length; i++)
        {
            if(courses[i] == "")
            {
                courses[i] = course;
                success = true;
                break;
            }
        }
        return success;
    }

    public boolean removeCourse(String course)
    {
        boolean success = false;
        for(int i = 0; i < courses.length; i++)
        {
            if(course.matches(courses[i]))
            {
                courses[i] = "";
                success = true;
                break;
            }
        }
        return success;
    }

    public String toString()
    {
        return "Teacher: " + super.toString();
    }
}