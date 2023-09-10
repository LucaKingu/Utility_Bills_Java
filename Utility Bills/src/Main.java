import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);


        System.out.println("\nChoose Consumer Type:\nResident - 1\nNon-Resident - 2\nDomestic - 3");

        int choice = userInput.nextInt();
        switch (choice){
            case 1:
                var resident = new ResidentalRate();
                System.out.println("Input electrical consumption:");
                int residentElectricalconsumption = userInput.nextInt();
                resident.setElectricalConsumptionAmount(residentElectricalconsumption);

                System.out.println("Input water consumption(in m3)");
                int residentWaterConsumption = userInput.nextInt();
                resident.setCubicMeters(residentWaterConsumption);

                System.out.println("\nYour Payment for electricity: €"+resident.calculateElectricityBill() +);
                System.out.println("Your payment for water: €"+resident.calculateWaterBill());
                break;

            case 2:
                var nonRseidentalRate = new NonRseidentalRate();
                System.out.println("Input electrical consumption:");
                int nonResidentElectricalInput = userInput.nextInt();
                nonRseidentalRate.setElectricalConsumptionAmount(nonResidentElectricalInput);

                System.out.println("Input water consumption(in m3)");
                int nonResidentWaterConsumption = userInput.nextInt();
                nonRseidentalRate.setCubicMeters(nonResidentWaterConsumption);

                System.out.println("\nYour Payment for electricity: €"+nonRseidentalRate.calculateElectricityBill());
                System.out.println("Your payment for water: €"+nonRseidentalRate.calculateWaterBill());
                break;

            case 3:
                var domesticRate = new DomesticRate();
                System.out.println("Input electrical consumption:");
                int domesticElectricalInput = userInput.nextInt();
                domesticRate.setElectricalConsumptionAmount(domesticElectricalInput);

                System.out.println("Input water consumption(in m3)");
                int domesticWaterConsumption = userInput.nextInt();
                domesticRate.setCubicMeters(domesticWaterConsumption);

                System.out.println("\nYour Payment for electricity: €"+domesticRate.calculateElectricityBill());
                System.out.println("Your payment for water: €"+domesticRate.calculateWaterBill());
                break;
        }
    }
}





        /*
            INTERFACE > ELECTRICITYCALCULATOR
            INTERFACE > WATERCALCULATOR
            CLASS > RATECATEGORY

            >INHERITANCE CLASS > RateCategory
            >RESDIENTAL INHERITS RateCategory
            >NON-RESDIENTAL INHERITS RateCategory
            >DOMESTICAL INHERITS RateCategory
            INCLUDES consumptionAmount
                     Tariff

        */