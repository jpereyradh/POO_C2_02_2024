package presencial;

public class Tamagotchi {
    private EstadoTamagotchi estado; //iniciamos la relacion de asociacion con los posibles estados de la mascota.


    public Tamagotchi() { //cuando instancio la mascota, la mascota esta triste
        //como voy a inicializar a la mascota
        estado= new Hambriento();
    }
    public void recbirComida(){
        estado.recibirComida(); //va a hacer es estando triste recibir comida
       if(estado instanceof Hambriento){
           estado= new Feliz(); 
       } else if (estado instanceof  Triste) {
           estado= new Hambriento();
       } else if (estado instanceof Sediento) {
           estado= new Triste();
       }
    }
    public void recibirBebida(){
        estado.recibirBebida();
        if(estado instanceof  Feliz){
            estado= new Hambriento();
        } else if (estado instanceof  Triste ) {
          estado= new Feliz();
        } else if (estado instanceof  Hambriento) {
        estado= new Triste();
                   }
    }
    public void recibirMimo(){
        estado.recibirMimos();
        if(estado instanceof  Feliz){
            estado= new Hambriento();
        } else if (estado instanceof Triste) {
            estado= new Feliz();
             } else if (estado instanceof  Hambriento) {
            estado= new Triste();

        }
    }
}
