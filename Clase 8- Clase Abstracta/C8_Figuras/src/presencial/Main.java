package presencial;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        ImpresoraEpson epson= new ImpresoraEpson("Epsion123","Usb",new Date(),50,11.0);

        System.out.println(epson.imprimir());
    }
}
