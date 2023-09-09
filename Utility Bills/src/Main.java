public class Main {
    public static void main(String[] args) {


        ResidentalRate resident = new ResidentalRate();
        resident.setConsumptionAmount(2500);
        System.out.println(resident.calculateElectricity());
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