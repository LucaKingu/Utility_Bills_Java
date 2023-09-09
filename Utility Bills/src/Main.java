import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        ResidentalRate resident = new ResidentalRate();

        System.out.println("\nChoose Consumer Type:\nResident - 1\nNon-Resident - 2\nDomestic - 3");

        int choice = userInput.nextInt();
        switch (choice){
            case 1:
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
                System.out.println("Non-Residental");
                break;

            case 3:
                System.out.println("Domestitc");

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