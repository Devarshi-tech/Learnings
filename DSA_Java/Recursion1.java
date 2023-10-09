class Recursion1{
    public static void printNumRevrs(int n){
        if(n == 0){
            return;
        }
        
            System.out.println(n);
            printNumRevrs(n-1);
        
    }

    public static void printNum(int n){
        if(n == 6){
            return;
        }
        
            System.out.println(n);
            printNum(n+1);
        
    }
    public static void sumOfNatrlNum(int n,int sum){
        if(n == 101){
            System.out.println(sum);
            return;
        }
        // int sum = 0;
        sum = sum +n;
        sumOfNatrlNum(n+1,sum);
    }

    public static void factorialOfNum(int i,int n,int fact){
        if(n == i){
            fact = fact * i;
            System.out.println(fact);
            return;
        }
        fact = fact * i;
        factorialOfNum(i+1,n,fact);
    }

    public static void fibonSeries(int a,int b,int n){
        if(n == 0){
            return;
        }
        int c = a + b;
        System.out.println(c);
        fibonSeries(b,c,n-1);

    }

    public static void powerN(int x, int n){
        if(x == 0){
            System.out.println(0);
            return;
        }
        if(n == 0 || x==1){
            if(x>1){
                System.out.println(x);
            }
            else{
                System.out.println(1);
            }

            return;
        }
        int temp = n-1 ;
        
        powerN(x,n-1);

    }

    public static void main(String[] args){
        // printNumRevrs(10);
        // printNum(1);


        // Calculate num of first n natural numbers
        // sumOfNatrlNum(1,0);

        // factorial
        // factorialOfNum(1,3,1);

        // fibonacci 
        // int a = 0;
        // int b = 1;
        // int n = 10;
        // System.out.println(a);
        // System.out.println(b);
        // fibonSeries(a,b,n);

        // -------calculate x^n value----------
        int x = 4;
        int n = 0;
        powerN(x,n);

    }
}