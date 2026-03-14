package BasicProgram;

    public class prime{
        static void main() {
//            int num = 7;
//            int count =0;
//
//            if(num >1){
//                for(int i =1; i<=num; i++){
//                    if(num%i == 0){
//                        count++;
//                    }
//                }
//                if(count == 2){
//                    System.out.println("The given number is Prime .." );
//                }
//                else {
//                    System.out.println("The given number is not prime no..");
//                }
//            }

            // logic 2

            int num =7;
            boolean isprime = true;

            for(int i =2; i<= Math.sqrt(num); i++){
                if(num%i == 0){
                    isprime = false;
                    break;
                }
            }
            if(isprime && num> 1){
                System.out.println("The given number is prime");
            }else {
                System.out.println("The given number is not prime");
            }
        }
    }
