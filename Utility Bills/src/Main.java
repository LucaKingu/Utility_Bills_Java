import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        var format = new DecimalFormat("#.00");

        System.out.println("\nChoose Consumer Type:\nResident - 1\nNon-Resident - 2\nDomestic - 3");

        int choice = userInput.nextInt();
        switch (choice){
            case 1:
                try {
                    var resident = new ResidentalRate();
                    System.out.println("Input electrical consumption(in kWh):");
                    double residentElectricalconsumption = userInput.nextDouble();
                    resident.setElectricalConsumptionAmount(residentElectricalconsumption);

                    System.out.println("Input water consumption(in m^3)");
                    double residentWaterConsumption = userInput.nextDouble();
                    resident.setCubicMeters(residentWaterConsumption);

                    if(residentElectricalconsumption < 0 || residentWaterConsumption <0){
                        throw new IllegalArgumentException("Neither of the values can be negative");
                    }

                    if(residentElectricalconsumption > Double.MAX_VALUE || residentWaterConsumption < Double.MAX_VALUE){
                        throw new IllegalArgumentException("Invalid number input");
                    }

                    double residentElectricFormat = Double.parseDouble(format.format(resident.calculateElectricityBill()));
                    System.out.println("\nYour Payment for electricity: €"+residentElectricFormat);
                    double residentWaterFormat = Double.parseDouble(format.format(resident.calculateWaterBill()));
                    System.out.println("Your payment for water: €"+residentWaterFormat);
                    double residentTotalFormat = Double.parseDouble(format.format(resident.totalAmount()));
                    System.out.println("Total: €" +residentTotalFormat);
                }
                catch (IllegalArgumentException e){
                    System.out.println("Error: " +e.getMessage());
                }
                break;

            case 2:
                try{
                    var nonRseidentalRate = new NonRseidentalRate();
                    System.out.println("Input electrical consumption(in kWh):");
                    double nonResidentElectricalInput = userInput.nextDouble();
                    nonRseidentalRate.setElectricalConsumptionAmount(nonResidentElectricalInput);

                    System.out.println("Input water consumption(in m^3)");
                    double nonResidentWaterConsumption = userInput.nextDouble();
                    nonRseidentalRate.setCubicMeters(nonResidentWaterConsumption);

                    if(nonResidentElectricalInput < 0 || nonResidentWaterConsumption <0){
                        throw new IllegalArgumentException("Neither of the values can be negative");
                    }

                    if(nonResidentElectricalInput > Double.MAX_VALUE || nonResidentWaterConsumption < Double.MAX_VALUE){
                        throw new IllegalArgumentException("Invalid number input");
                    }

                    double nonResidentElectricFormat = Double.parseDouble(format.format(nonRseidentalRate.calculateElectricityBill()));
                    System.out.println("\nYour Payment for electricity: €"+nonResidentElectricFormat);
                    double nonResidentWaterFormat = Double.parseDouble(format.format(nonRseidentalRate.calculateWaterBill()));
                    System.out.println("Your payment for water: €"+nonResidentWaterFormat);
                    double nonResidentTotalFormat = Double.parseDouble(format.format(nonRseidentalRate.totalAmount()));
                    System.out.println("Total: €" +nonResidentTotalFormat);
                }
                catch (IllegalArgumentException e){
                    System.out.println("Error: " +e.getMessage());
                }
                break;

            case 3:
                try{
                    var domesticRate = new DomesticRate();
                    System.out.println("Input electrical consumption(in kWh):");
                    double domesticElectricalInput = userInput.nextDouble();
                    domesticRate.setElectricalConsumptionAmount(domesticElectricalInput);

                    System.out.println("Input water consumption(in m^3)");
                    double domesticWaterConsumption = userInput.nextDouble();
                    domesticRate.setCubicMeters(domesticWaterConsumption);

                    if(domesticElectricalInput < 0 || domesticWaterConsumption <0){
                        throw new IllegalArgumentException("Neither of the values can be negative");
                    }

                    if(domesticElectricalInput > Double.MAX_VALUE || domesticWaterConsumption < Double.MAX_VALUE){
                        throw new IllegalArgumentException("Invalid number input");
                    }

                    double domesticElectricFormat = Double.parseDouble(format.format(domesticRate.calculateElectricityBill()));
                    System.out.println("\nYour Payment for electricity: €"+domesticElectricFormat);
                    double domesticWaterFormat = Double.parseDouble(format.format(domesticRate.calculateWaterBill()));
                    System.out.println("Your payment for water: €"+domesticWaterFormat);
                    double domesticTotalFormat = Double.parseDouble(format.format(domesticRate.totalAmount()));
                    System.out.println("Total: €" +domesticTotalFormat);
                }
                catch (IllegalArgumentException e)
                {
                    System.out.println("Error: " +e.getMessage());
                }
                break;
        }
        userInput.close();
    }
}