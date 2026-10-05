public class UNEB {
    String RegistrationStatus;
    String ExamCentre;
    String CandidateName;
    static String GradingPolicies;
    static int ExamYear;
    static int RegistrationFees;

    {
        System.out.println("\n INSTANCE INITIALIZATION BLOCK ");
        RegistrationStatus = "Running";
        ExamCentre = "25/UG/1048/BSSE-S";
    }
    static{
        System.out.println("\n STATIC BLOCK ");
        ExamYear = 2023;
        RegistrationFees = 1000;
        GradingPolicies = "A=80-100, B=60-79, C=40-59";
    }

}
