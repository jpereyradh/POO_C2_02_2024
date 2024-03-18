package presencial;

public class ClienteException extends Exception{

    //en esta clase es donde debemos definir lo qeu va a suceder cuando se lance la exception

    public ClienteException(String message) {
        super(message);
    }
}
