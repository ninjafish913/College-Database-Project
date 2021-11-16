import java.util.ArrayList;

public class BandMember extends Student
{
    private static ArrayList<BandMember> roster = new ArrayList<BandMember>();

    private String instrument;
    
    public String getInstrument()
    {
        return instrument;
    }
    public void setInstrument(String instrument)
    {
        if (instrument.equals("bells") || instrument.equals("trumpet") || instrument.equals("baritone") || instrument.equals("tuba"))
        {

        }
    }

    public void setName() {}
    public void setEmail() {}
    public void setGradePointAvg() {}
    public void setMajor() {}
    public void setYear() {}

    public BandMember(Student student)
    {
        super(student.getName(), student.getEmail(), student.getMajor(), student.getYearNumber(), 0);

        switch (student.getYear()) {
            case "freshman":
                this.instrument = "bells";
                break;
            case "sophomore":
                this.instrument = "trumpet";
                break;
            case "junior":
                this.instrument = "baritone";
                break;
            case "senior":
                this.instrument = "tuba";
                break;
        }
        roster.add(this);
    }

    public static void printRoster()
    {
        System.out.println("Band Roster:");
        for (BandMember member : roster)
        {
            System.out.println(member.getName());
            System.out.println(member.getEmail());
            System.out.println("Instrument - " + member.getInstrument());
            System.out.println("Major - " + member.getMajor() + "\n");
        }
    }
}
