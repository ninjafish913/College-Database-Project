public class Student extends Person
{
    private String year, major;
    private double gradePointAvg;

    public String getYear()
    {
        return this.year;
    }
    public int getYearNumber()
    {
        switch (this.year) {
            case "freshman":
                return 1;
            case "sophomore":
                return 2;
            case "junior":
                return 3;
            case "senior":
                return 4;
            default:
                return 0;
        }
    }
    public void setYear(int year)
    {
        switch (year) {
            case 1: 
                this.year = "freshman";
                break;
            case 2: 
                this.year = "sophomore";
                break;
            case 3:
                this.year = "junior";
                break;
            case 4:
                this.year = "senior";
                break;
            default:
                throw new IllegalArgumentException("Year " + year + " is not a valid year!");
        }
    }

    public String getMajor() 
    {
        return major;
    }
    public void setMajor(String major)
    {
        if (major.equals("Computer Science") || major.equals("Mathematics") || major.equals("English"))
        {
            this.major = major;
        } else {
            throw new IllegalArgumentException(major + " is not a valid major!");
        }
    }

    public double getGradePointAvg()
    {
        return this.gradePointAvg;
    }
    public void setGradePointAvg(double grade)
    {
        if (grade <= 4 && grade >= 0)
        {
            this.gradePointAvg = grade;
        } else {
            throw new IllegalArgumentException("Grade point average must be between 0.0 and 4.0!");
        }
    }

    public Student()
    {
        super();
        setMajor("N/A");
        setYear(1);
        setGradePointAvg(0);
    }
    public Student(String name, String email, String major, int year, double gradePointAvg)
    {
        super(name, email);
        setMajor(major);
        setYear(year);
        setGradePointAvg(gradePointAvg);
    }
}
