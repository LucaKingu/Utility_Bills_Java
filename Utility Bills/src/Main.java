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

                System.out.println("Your Payment for electricity: €"+resident.calculateElectricityBill() +" kWh");
                System.out.println("at a rate of " +resident.getElectricalTariff() +" c/kWh");

                System.out.println("\nYour payment for water: €"+resident.calculateWaterBill());
                System.out.println("at a rate of €"+resident.getWaterTariff() +" m^3");
                break;

            case 2:
                var nonRseidentalRate = new NonRseidentalRate();
                System.out.println("Input electrical consumption:");
                int nonResidentElectricalInput = userInput.nextInt();
                nonRseidentalRate.setElectricalConsumptionAmount(nonResidentElectricalInput);

                System.out.println("Input water consumption(in m3)");
                int nonResidentWaterConsumption = userInput.nextInt();
                nonRseidentalRate.setCubicMeters(nonResidentWaterConsumption);

                System.out.println("Your Payment for electricity: €"+nonRseidentalRate.calculateElectricityBill() +" kWh");
                System.out.println("at a rate of " +nonRseidentalRate.getElectricalTariff() +" c/kWh");

                System.out.println("\nYour payment for water: €"+nonRseidentalRate.calculateWaterBill());
                System.out.println("at a rate of €"+nonRseidentalRate.getWaterTariff() +" m^3");
                break;

            case 3:
                var domesticRate = new DomesticRate();
                System.out.println("Input electrical consumption:");
                int domesticElectricalInput = userInput.nextInt();
                domesticRate.setElectricalConsumptionAmount(domesticElectricalInput);

                System.out.println("Input water consumption(in m3)");
                int domesticWaterConsumption = userInput.nextInt();
                domesticRate.setCubicMeters(domesticWaterConsumption);

                System.out.println("Your Payment for electricity: €"+domesticRate.calculateElectricityBill() +" kWh");
                System.out.println("at a rate of " +domesticRate.getElectricalTariff() +" c/kWh");

                System.out.println("\nYour payment for water: €"+domesticRate.calculateWaterBill());
                System.out.println("at a rate of €"+domesticRate.getWaterTariff() +" m^3");
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