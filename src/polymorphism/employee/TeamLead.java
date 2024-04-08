package polymorphism.employee;

public class TeamLead extends Programmer {

    public TeamLead(int numTeamLead) {
        super(numTeamLead);
    }

    @Override
    protected void employ() {
        System.out.println(numProgrammer + " teamlead");
    }
}

