public class Ejercicio_06{

    public static void main(String[]args){
        System.out.println("+-------------------------+");
        System.out.println("+     FUNCIÓN MAYOR       +");
        System.out.println("+-------------------------+");

        System.out.println("Mayor: "+mayor(1,2,3));
        System.out.println("Mayor: "+mayor(4,7,6));
        System.out.println("Mayor: "+mayor(10,24,30));
        System.out.println("Mayor: "+mayor(9,17,4));
        System.out.println("Mayor: "+mayor(2,6,15));
    }


    public static int mayor(int n1, int n2, int n3){
        if(n1>n2){
            if(n1>n3){
                return n1;
            }else{
                return n3;
            }
        }else if(n2>n3){
            return n2;
        }else{
            return n3;
        }
    }
}