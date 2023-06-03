public class ServiceStationForType implements ServiceStation {
    @Override
    public void check(Bicycle[] bicycles) {
        checkModel(bicycles, "bicycles");
    }
    @Override
    public void check(Truck[] trucks) {
        checkModel(trucks, "trucks");
    }
    @Override
    public void check(Car[] cars) {
        checkModel(cars, "cars");
    }
    private void checkModel(TypeOfObject[] types, String model) {
        System.out.println("All " + model +"\n");
        for (TypeOfObject type : types) {
            System.out.println("Обслуживаем " + type.getModelName());
            for (int i = 0; i < type.getWheelsCount(); i++) {
                type.updateTyre();
            }
            if (model.equals("cars")) {
                type.checkEngine();
            } else if (model.equals("trucks")) {
                type.checkEngine();
                type.checkTrailer();
            }
        }
        System.out.println("-------------------------------------------------------------------------------");
    }
}
