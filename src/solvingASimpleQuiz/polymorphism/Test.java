package src.solvingASimpleQuiz.polymorphism;

/*
Find mistake
You've decided to create your own project and for that, you need to employ 1 programmer and 1 team lead.
 You have written the code for that, but it does not work.

Your task is to find a mistake.

Note: don't rename methods or create your own classes and don't create new objects.
Don't use super and this.

Advice: what methods can be inherited?
 */
public class Test {
    public static void main(String[] args) {
        new TeamLead(1);
    }

    public static class TeamLead extends Programmer {

        private final int numTeamLead;

        public TeamLead(int numTeamLead) {
            super(numTeamLead);
            this.numTeamLead = numTeamLead;
            employ();
        }

        private void employ() {
            System.out.println(numTeamLead + " teamlead");
        }
    }

    public static class Programmer {

        private final int numProgrammer;

        public Programmer(int numProgrammer) {
            this.numProgrammer = numProgrammer;
            employ();
        }

        private void employ() {
            System.out.println(numProgrammer + " programmer");
        }
    }
}
