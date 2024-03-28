package modyfiers.donut;

class DonutStore {
    public double sellDonut(String flavor) {
        return switch (flavor.toLowerCase()) {
            case "vanilla" -> 1.0;
            case "chocolate" -> 1.5;
            default -> 0.0;
        };
    }
}

   /*  private String[] flavors = new String[]{"chocolate", "vanilla"};
   public double sellDonut(String flavor) {
        for (String f : flavors) {
            if (flavor.equals("chocolate")) {
                return 1.5;
            } else if (flavor.equals("vanilla")) {
                return 1.0;
            }
        }
        return 0.0;
    }*/


