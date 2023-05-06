package pattern;
 class ChildRegistration {

    private String childName;

    private int childAge;

    private String chosenCampType;  

    

    public ChildRegistration(String childName, int childAge, String chosenCampType) {

        this.childName = childName;

        this.childAge = childAge;

        this.chosenCampType = chosenCampType;

    }

    

    @Override

    public String toString() {

        return "ChildRegistration (childName: " + this.childName + ", childAge: "

                + this.childAge + ", chosenCampType: " + this.chosenCampType+")";

    }

    

    public int getChildAge() {

        return this.childAge;

    }

    

    public String getChosenCampType() {

        return this.chosenCampType;

    }

    

    public boolean validateChildEligibility() {

        if(this.childAge >= 5 && this.childAge <= 15) {

            return true;

        }

        return false;

    }
    
    //To Trainee

    public Integer identifyRegistrationFee() { 

        //Implement your logic here

        int registrationFee=0;
        
        if(chosenCampType.equals("Regular")) {
            registrationFee=500;
        }
        else if(chosenCampType.equals("CrashCourse")) {
            registrationFee=350;
        }
        else if(chosenCampType.equals("Weekend")) {
            registrationFee=200;
        }
        
        //Change the return statement accordingly

        return registrationFee;

    }

}

 
 

 class CulturalCamp extends SummerCamp {

    private static String[] availableActivitiesArr = {"Music", "Cooking", "Dance", "Craft", "Drama"};

    private static int[] activitiesCostArr = {150, 350, 300, 200, 250};

    

    private boolean exhibitionParticipation;

    private String activityToRegister; 

    

    public CulturalCamp(ChildRegistration childReg, int noOfDays, boolean exhibitionParticipation, String activityToRegister) {

        super(childReg, noOfDays);

        this.exhibitionParticipation = exhibitionParticipation;

        this.activityToRegister = activityToRegister;

    }

    

    @Override

    public String toString() {

        return "CulturalCamp (childReg: " + this.getChildReg() + ", noOfDays: "

    + this.getNoOfDays() + ", exhibitionParticipation: " + this.exhibitionParticipation + ", activityToRegister: "

            + this.activityToRegister +")" ;

    }

    

    //To Trainee

    public Integer  identifyActivityCost() {
        Integer activityCost = 0;
        int flag =0 ;
        for (int i =0 ; i < CulturalCamp.availableActivitiesArr.length; i++) {
            if (this.activityToRegister.equalsIgnoreCase( CulturalCamp.availableActivitiesArr[i])) {
                activityCost = CulturalCamp.activitiesCostArr[i];
                flag = 1;
            }
        }
        if (flag ==0) {
            activityCost = 0;
        }
        return activityCost;
    }

    

    //To Trainee

    @Override

    public void calculateTotalCampFee() {
        super.getChildReg().validateChildEligibility();
        int activityCost = this.identifyActivityCost();
       
        if (super.getChildReg().validateChildEligibility() && activityCost != 0) {
            Integer registrationFee = super.getChildReg().identifyRegistrationFee();
            int totalActivityCost = activityCost * super.getNoOfDays();
            double campFee = registrationFee + totalActivityCost;
            if (this.exhibitionParticipation == true) {
                campFee += 400;
            }
            if (super.getChildReg().getChildAge() <= 10) {
                campFee =campFee - (campFee * 0.05);
            }
            super.setTotalCampFee(campFee);;
            super.generateCampRegistrationId();
        }else {
            super.setCampRegistrationId("NA");
            super.setTotalCampFee(-1.0);
        }
    }

}


 

abstract  class SummerCamp {

    private static int counter = 1000;

    private ChildRegistration childReg;

    private int noOfDays;

    private String campRegistrationId;

    private double totalCampFee;

    

    public SummerCamp(ChildRegistration childReg, int noOfDays) {

        this.childReg = childReg;

        this.noOfDays = noOfDays;

    }

    

    public ChildRegistration getChildReg() {

        return this.childReg;

    }

    

    public int getNoOfDays() {

        return this.noOfDays;

    }

    

    public String getCampRegistrationId() {

        return this.campRegistrationId;

    }

    

    public double getTotalCampFee() {

        return this.totalCampFee;

    }

    

    public void setCampRegistrationId(String campRegistrationId) {

        this.campRegistrationId = campRegistrationId;

    }

    

    public void setTotalCampFee(double totalCampFee) {

        this.totalCampFee = totalCampFee;

    }

    

    //To Trainee

    public void generateCampRegistrationId() {

        

        //Implement your logic here
        campRegistrationId=getChildReg().getChosenCampType().substring(0,1) + ++SummerCamp.counter;
        

    }

    

    public abstract void calculateTotalCampFee();

} 


 

public class Tester {

    public static void main(String[] args) {

        ChildRegistration childReg1 = new ChildRegistration("Ben", 7, "Regular");

        CulturalCamp camp1 = new CulturalCamp(childReg1, 10, true, "COOKING");

        camp1.calculateTotalCampFee();

        System.out.println("Child RegistrationId: "+camp1.getCampRegistrationId());

        System.out.println("Total camp fee: "+camp1.getTotalCampFee());

    }

}
