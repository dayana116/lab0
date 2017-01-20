public class Fibonacci {

    public static int fibonacci(int n) {
        // Su codigo aqui
       public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n;
        int i; 
        int serie;  
        int fib1, fib2; 
        fib1 = 1;
        fib2 = 1;

        do{
            System.out.print("Introduce un numero: ");
            n = sc.nextInt();
        }while(n <=1);
        System.out.println("Numero Fibonacci son: " + n);

        fibo1=1;
        fibo2=1;

        System.out.print(fibo1 + " ");
        for(i=2;i<=numero;i++){
             System.out.print(fibo2 + " ");
             fibo2 = fibo1 + fibo2;
             fibo1 = fibo2 - fibo1;
        }
        System.out.println();
    }
}

        /*for(i=2; i<=n; i++){
            System.out.print(fubo2 + "");
            fib2 = fib1 + fib2;
            fib1 = fib2 - fib1;
        }*/

     return 0;
    }

    // NO MODIFICAR A PARTIR DE AQUI

    public static void main(String[] args) {
        if(args.length > 0) {
            int n = Integer.parseInt(args[0]);
            System.out.println("Fibonacci de " + n + ": " + fibonacci(n));
        } else {
            System.err.println("No se paso ningun argumento");
        }
    }

}
