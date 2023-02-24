import javax.swing.JOptionPane;
public class Converter {
    public static void main(String[] args) {
        /*Currency exchanges date 23-feb-2023*/
        double exchangeRateSameCurrency = 1;
        double exchangeRateUSDToEUR = 0.94;
        double exchangeRateUSDToGBP = 0.83;
        double exchangeRateUSDToJPY = 134.44;
        double exchangeRateUSDToKRW = 1295.18;
        double exchangeRateEURToGBP = 0.89;
        double exchangeRateEURToJPY = 143.54;
        double exchangeRateEURToKRW = 1382.38;
        double exchangeRateGBPToJPY = 161.71;
        double exchangeRateGBPToKRW = 1557.79;
        double exchangeRateJPYToKRW = 9.63;
        double amount;
        double result;

        Object[] mainUnits = {"Temperatura", "Superficie", "Longitud", "Masa", "Volumen", "Tiempo", "Divisas"};
        Object unitChoice = JOptionPane.showInputDialog(null, "Seleccione la unidad que desea convertir", "Conversor de Unidades", JOptionPane.QUESTION_MESSAGE, null, mainUnits, mainUnits[6]);
        if (unitChoice == null){
            JOptionPane.showMessageDialog(null, "Error, cerrando el programa");
            return;
        }
        if (unitChoice.equals("Temperatura")){
            Object[] tempUnits = {"°C", "°F", "K"};
            Object tempChoice1 = JOptionPane.showInputDialog(null,"Seleccione la unidad", "Conversor de Unidades", JOptionPane.QUESTION_MESSAGE, null, tempUnits, null);
            Object tempChoice2 = JOptionPane.showInputDialog(null,"Convertir a", "Conversor de Unidades", JOptionPane.QUESTION_MESSAGE, null, tempUnits,null);
            switch (tempChoice1 + " to " + tempChoice2) {
                case "°C to °C" -> {
                    amount = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la temperatura en °C:"));
                    result = amount;
                    JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " °C equivalen a " + String.format("%.2f", result) + " °C.");
                }
                case "°C to °F" -> {
                    amount = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la temperatura en °C"));
                    result = (amount *1.8)+32;
                    JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " °C equivalen a " + String.format("%.2f", result) + " °F." );
                }
                case "°C to K" -> {
                    amount = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la temperatura en °C"));
                    result =amount + 273.15;
                    JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " °C equivalen a " + String.format("%.2f", result) + " K.");
                }
                case "°F to °C" -> {
                    amount = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la temperatura en °F"));
                    result = (amount - 32)/1.8;
                    JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " °F equivalen a " + String.format("%.2f", result) + " °C.");
                }
                case "°F to °F" -> {
                    amount = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la temperatura en °F"));
                    result = amount;
                    JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " °F equivalen a " + String.format("%.2f", result) + " °F.");
                }
                case "°F to K" -> {
                    amount = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la temperatura en °F"));
                    result = ((amount - 32)/1.8) + 273.15;
                    JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " °F equivalen a " + String.format("%.2f", result) + " K.");
                }
                case "K to °C" -> {
                    amount = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la temperatura en K"));
                    result = amount - 273.15;
                    JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " K equivalen a " + String.format("%.2f", result) + " °C.");
                }
                case "K to °F" -> {
                    amount = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la temperatura en K"));
                    result = ((amount - 273.15) * 1.8) + 32;
                    JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " K equivalen a " + String.format("%.2f", result) + " °F.");
                }
                case "K to K" -> {
                    amount = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la temperatura en K"));
                    result = amount;
                    JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " K equivalen a " + String.format("%.2f", result) + " K.");
                }
                default -> JOptionPane.showMessageDialog(null, "Error, cerrando programa");
            }
        }
        if (unitChoice.equals("Superficie")){
            Object[] surfaceUnits = {"m²", "km²", "ft²", "acre"};
            Object surfaceChoice1 = JOptionPane.showInputDialog(null,"Seleccione la unidad", "Conversor de Unidades", JOptionPane.QUESTION_MESSAGE, null, surfaceUnits, null);
            Object surfaceChoice2 = JOptionPane.showInputDialog(null,"Convertir a", "Conversor de Unidades", JOptionPane.QUESTION_MESSAGE, null, surfaceUnits,null);
        }
        if (unitChoice.equals("Longitud")){
            Object[] lengthUnits = {"m", "km", "ft", "mi"};
            Object lengthChoice1 = JOptionPane.showInputDialog(null,"Seleccione la unidad", "Conversor de Unidades", JOptionPane.QUESTION_MESSAGE, null, lengthUnits, null);
            Object lengthChoice2 = JOptionPane.showInputDialog(null,"Convertir a", "Conversor de Unidades", JOptionPane.QUESTION_MESSAGE, null, lengthUnits,null);
        }
        if (unitChoice.equals("Masa")){
            Object[] massUnits = {"gr", "kg", "lb", "oz"};
            Object massChoice1 = JOptionPane.showInputDialog(null,"Seleccione la unidad", "Conversor de Unidades", JOptionPane.QUESTION_MESSAGE, null, massUnits, null);
            Object massChoice2 = JOptionPane.showInputDialog(null,"Convertir a", "Conversor de Unidades", JOptionPane.QUESTION_MESSAGE, null, massUnits,null);
        }
        if (unitChoice.equals("Volumen")){
            Object[] volUnits = {"lt", "ml", "m³", "ft³", "gal"};
            Object volChoice1 = JOptionPane.showInputDialog(null,"Seleccione la unidad", "Conversor de Unidades", JOptionPane.QUESTION_MESSAGE, null, volUnits, null);
            Object volChoice2 = JOptionPane.showInputDialog(null,"Convertir a", "Conversor de Unidades", JOptionPane.QUESTION_MESSAGE, null, volUnits,null);
        }
        if (unitChoice.equals("Tiempo")){
            Object[] timeUnits = {"seg", "min", "h", "d", "sem", "a"};
            Object timeChoice1 = JOptionPane.showInputDialog(null,"Seleccione la unidad", "Conversor de Unidades", JOptionPane.QUESTION_MESSAGE, null, timeUnits, null);
            Object timeChoice2 = JOptionPane.showInputDialog(null,"Convertir a", "Conversor de Unidades", JOptionPane.QUESTION_MESSAGE, null, timeUnits,null);
        }
        if (unitChoice.equals("Divisas")){
            Object[] currencyUnits = {"USD", "EUR", "GBP", "JPY", "KRW"};
            Object currencyChoice1 = JOptionPane.showInputDialog(null,"Seleccione la unidad", "Conversor de Unidades", JOptionPane.QUESTION_MESSAGE, null, currencyUnits, null);
            Object currencyChoice2 = JOptionPane.showInputDialog(null,"Convertir a", "Conversor de Unidades", JOptionPane.QUESTION_MESSAGE, null, currencyUnits,null);
            switch (currencyChoice1 + " to " + currencyChoice2) {
                case "USD to USD" -> {
                    amount = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el monto USD:"));
                    result = amount * exchangeRateSameCurrency;
                    JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " USD equivalen a " + String.format("%.2f", result) + " USD.");
                }
                case "USD to EUR" -> {
                    amount = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el monto en USD"));
                    result = amount * exchangeRateUSDToEUR;
                    JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " USD equivalen a " + String.format("%.2f", result) + " EUR." );
                }
                case "USD to GBP" -> {
                    amount = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el monto en USD"));
                    result = amount * exchangeRateUSDToGBP;
                    JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " USD equivalen a " + String.format("%.2f", result) + " GBP.");
                }
                case "USD to JPY" -> {
                    amount = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el monto en USD"));
                    result = amount * exchangeRateUSDToJPY;
                    JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " USD equivalen a " + String.format("%.2f", result) + " JPY.");
                }
                case "USD to KRW" -> {
                    amount = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el monto en USD"));
                    result = amount * exchangeRateUSDToKRW;
                    JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " USD equivalen a " + String.format("%.2f", result) + " KRW.");
                }
                case "GBP to USD" -> {
                    amount = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el monto en GBP"));
                    result = amount / exchangeRateUSDToGBP;
                    JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " GBP equivalen a " + String.format("%.2f", result) + " USD.");
                }
                case "GBP to EUR" -> {
                    amount = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el monto en GBP"));
                    result = amount / exchangeRateEURToGBP;
                    JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " GBP equivalen a " + String.format("%.2f", result) + " EUR.");
                }
                case "GBP to GBP" -> {
                    amount = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el monto en GBP"));
                    result = amount * exchangeRateSameCurrency;
                    JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " GBP equivalen a " + String.format("%.2f", result) + " GBP.");
                }
                case "GBP to JPY" -> {
                    amount = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el monto en GBP"));
                    result = amount * exchangeRateGBPToJPY;
                    JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " GBP equivalen a " + String.format("%.2f", result) + " JPY.");
                }
                case "GBP to KRW" -> {
                    amount = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el monto en GBP"));
                    result = amount * exchangeRateGBPToKRW;
                    JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " GBP equivalen a " + String.format("%.2f", result) + " KRW.");
                }
                case "EUR to USD" -> {
                    amount = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el monto en EUR"));
                    result = amount / exchangeRateUSDToEUR;
                    JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " EUR equivalen a " + String.format("%.2f", result) + " USD.");
                }
                case "EUR to EUR" -> {
                    amount = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el monto en EUR"));
                    result = amount * exchangeRateSameCurrency;
                    JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " EUR equivalen a " + String.format("%.2f", result) + " EUR.");
                }
                case "EUR to GBP" -> {
                    amount = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el monto en EUR"));
                    result = amount * exchangeRateEURToGBP;
                    JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " EUR equivalen a " + String.format("%.2f", result) + " GBP.");
                }
                case "EUR to JPY" -> {
                    amount = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el monto en EUR"));
                    result = amount * exchangeRateEURToJPY;
                    JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " EUR equivalen a " + String.format("%.2f", result) + " JPY.");
                }
                case "EUR to KRW" -> {
                    amount = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el monto en EUR"));
                    result = amount * exchangeRateEURToKRW;
                    JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " EUR equivalen a " + String.format("%.2f", result) + " KRW.");
                }
                case "JPY to USD" -> {
                    amount = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el monto en JPY"));
                    result = amount / exchangeRateUSDToJPY;
                    JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " JPY equivalen a " + String.format("%.2f", result) + " USD.");
                }
                case "JPY to EUR" -> {
                    amount = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el monto en JPY"));
                    result = amount / exchangeRateEURToJPY;
                    JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " JPY equivalen a " + String.format("%.2f", result) + " EUR.");
                }
                case "JPY to GBP" -> {
                    amount = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el monto en JPY"));
                    result = amount / exchangeRateGBPToJPY;
                    JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " JPY equivalen a " + String.format("%.2f", result) + " GBP.");
                }
                case "JPY to JPY" -> {
                    amount = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el monto en JPY"));
                    result = amount * exchangeRateSameCurrency;
                    JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " JPY equivalen a " + String.format("%.2f", result) + " JPY.");
                }
                case "JPY to KRW" -> {
                    amount = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el monto en JPY"));
                    result = amount * exchangeRateJPYToKRW;
                    JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " JPY equivalen a " + String.format("%.2f", result) + " KRW.");
                }
                case "KRW to USD" -> {
                    amount = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el monto en KRW"));
                    result = amount / exchangeRateUSDToKRW;
                    JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " KRW equivalen a " + String.format("%.2f", result) + " USD.");
                }
                case "KRW to EUR" -> {
                    amount = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el monto en KRW"));
                    result = amount / exchangeRateEURToKRW;
                    JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " KRW equivalen a " + String.format("%.2f", result) + " EUR.");
                }
                case "KRW to GBP" -> {
                    amount = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el monto en KRW"));
                    result = amount / exchangeRateGBPToKRW;
                    JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " KRW equivalen a " + String.format("%.2f", result) + " GBP.");
                }
                case "KRW to JPY" -> {
                    amount = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el monto en KRW"));
                    result = amount / exchangeRateJPYToKRW;
                    JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " KRW equivalen a " + String.format("%.2f", result) + " JPY.");
                }
                case "KRW to KRW" -> {
                    amount = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el monto en KRW"));
                    result = amount * exchangeRateSameCurrency;
                    JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " KRW equivalen a " + String.format("%.2f", result) + " KRW.");
                }
                default -> JOptionPane.showMessageDialog(null, "Error, cerrando programa");
            }
        }
    }
}
/*
                     _        _                 _      _                      _ _
                    | |      | |               (_)    | |                    (_| |
 _ __ ___   __ _  __| | ___  | |__  _   _   ___ _ _ __| | ___ _ __ ___   __ _ _| | __
| '_ ` _ \ / _` |/ _` |/ _ \ | '_ \| | | | / __| | '__| |/ _ | '_ ` _ \ / _` | | |/ /
| | | | | | (_| | (_| |  __/ | |_) | |_| | \__ | | |  | |  __| | | | | | (_| | |   |
|_| |_| |_|\__,_|\__,_|\___| |_.__/ \__, | |___|_|_|  |_|\___|_| |_| |_|\__,_|_|_|\_\
                                     __/ |
                                    |___/
*/