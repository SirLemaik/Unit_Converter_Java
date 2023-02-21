/*        - Convertir de la moneda de tu país a Dólar
       - Convertir de la moneda de tu país  a Euros
       - Convertir de la moneda de tu país  a Libras Esterlinas
       - Convertir de la moneda de tu país  a Yen Japonés
       - Convertir de la moneda de tu país  a Won sul-coreano
*/
import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        double exchangeRate = 0.83; // 1 USD = 0.83 EUR
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the amount of U.S. dollars to convert: ");
        double usd = input.nextDouble();
        double eur = usd * exchangeRate;
        System.out.println("$" + usd + " is equivalent to " + eur + " euros.");
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