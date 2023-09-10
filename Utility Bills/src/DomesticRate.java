public class DomesticRate extends RateCategory implements CanUtilityCalculator{
    @Override
    public double calculateElectricityBill() {
        return 0;
    }

    @Override
    public double calculateWaterBill() {
        return 0;
    }
}
