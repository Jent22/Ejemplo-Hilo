public class hilos {
public static void main(String[] args){

    Thread proceso = new procesos("accion");
    Thread proceso2 = new procesos("reaccion");

    proceso.start();
    proceso2.start();
}

}