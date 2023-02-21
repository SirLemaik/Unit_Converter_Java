import javax.swing.JOptionPane;
public class CurrencyConverter {
    public static void main(String[] args) {
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

        Object[] options = {"USD", "EUR", "GBP", "JPY", "KRW"};
        Object choice1 = JOptionPane.showInputDialog(null, "Seleccione la moneda de origen", "Conversor de Divisas", JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
        Object choice2 = JOptionPane.showInputDialog(null, "Seleccione a que moneda desea convertir", "Conversor de Divisas", JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

        if (choice1 == null || choice2 == null) {
            JOptionPane.showMessageDialog(null, "Error, cerrando programa");
            return;
        }

        double amount;
        double result;

        switch (choice1 + " to " + choice2) {
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