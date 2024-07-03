
import java.util.Scanner;
public class Currencyconvertor {
    public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    System.out.println("welcome to currency convertor");
    System.out.println("convert USD to other currencies");
    System.out.println("1.convert USD to INR");
    System.out.println("2.Convert USD to KWD");
    System.out.println("3.Convert USD to SGD");
    System.out.println("4.covert USD to GPB");
    System.out.println("convert Pound to other currencies");
    System.out.println("5.convert POUND to INR");
    System.out.println("6.convert POUND to KWD");
    System.out.println("7.convert POUND to USD");
    System.out.println("8.convert POUND to SGD");
    System.out.println("convert Dinnar to other currencies");
    System.out.println("9.convert DINAR to INR");
    System.out.println("10.convert DINAR to GPB");
    System.out.println("11.convert DINAR to USD");
    System.out.println("12.convert DINAR to SGD");
    System.out.println("convert INR to other currencies");
    System.out.println("13.convert INR to KWD");
    System.out.println("14.convert INR to GPB");
    System.out.println("15.convert INR to USD");
    System.out.println("16.convert INR to SGD");
    System.out.println("convert Singapore currency to other currencies");
    System.out.println("17.convert  singapore currency to KWD");
    System.out.println("18.convert singapore currency to GPB");
    System.out.println("19.convert singapore currency to USD");
    System.out.println("20.convert singapore currency to SGD");
    
   
    System.out.print("Enter your choice: ");
    int choice=sc.nextInt();
    switch(choice){
        case 1:
                 convertUSDtoINR();
        break;

        case 2:
                convertUSDtoKWD();
        break;

        case 3:
                 convertUSDtoSGD();
        break;

        case 4:
                convertUSDtoGPB();
        break;

        case 5:
                convertPoundtoINR();
        break;

        case 6:
               convertPoundtoKWD();
        break;
        case 7:
               convertPoundtoUSD();
        break;
        case 8:
              convertPoundtoSGD();
        break;
        case 9:
              convertDINARtoINR();
        break;
        
        case 10:
              convertDINARtoGPB();
        break;

        case 11:
              convertDINARtoUSD();
        break;

        case 12:
             convertDINARtoSGD();
        break;

          case 13:
              convertINRtoKWD();
          break;

          case 14:
               convertINRtoGPB();
          break;
          case 15: 
                convertINRtoUSD();
          break;
          case 16:
               convertINRtoSGD();
          break;
        case 17:
              convertSINGAPOREtoKWD();
        break;
        case 18:
              convertSINGAPOREtoGPB();
        break;
        case 19:
              convertSINGAPOREtoUSD();
        break;
        case 20:
              convertSINGAPOREtoSGD();
        break;
       
        default:
        System.out.println("INVAILD CHOICE");

    }}
    public static void convertUSDtoINR(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the amount in USD:");
        double usdAmount=sc.nextDouble();
        double value=74.00;;
        double inrAmount= usdAmount * value;
        System.out.println("Amount is INR is:RS " +inrAmount);

    }
    public static void convertUSDtoKWD(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the amount in USD:");
        double usdAmount=sc.nextDouble();
        double value=0.30;
        double kwdAmount= usdAmount * value;
        System.out.println("Amount in KWD is: " +kwdAmount);
    }
    public static void convertUSDtoSGD(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the amount in USD:");
        double usdAmount=sc.nextDouble();
        double value=1.35;
        double sgdAmount= usdAmount * value;
        System.out.println("Amount is SGD is: " +sgdAmount);
    
}
public static void convertUSDtoGPB(){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the amount in USD:");
    double usdAmount=sc.nextDouble();
    double value=0.75;
    double gpbAmount= usdAmount * value;
    System.out.println("Amount is GPB is: " +gpbAmount); 
}
public static void convertPoundtoINR(){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the amount in POUND:");
    double poundAmount=sc.nextDouble();
    double value=99.50;
    double inrAmount= poundAmount * value;
    System.out.println("Amount in INR is:RS " +inrAmount);

}
public static void convertPoundtoKWD(){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the amount in POUND:");
    double poundAmount=sc.nextDouble();
    double value=0.40;
    double kwdAmount= poundAmount * value;
    System.out.println("Amount in KWD is: " +kwdAmount);
    }
    public static void convertPoundtoUSD(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the amount in POUND:");
        double poundAmount=sc.nextDouble();
        double value=1.33;
        double usdAmount= poundAmount * value;
        System.out.println("Amount in USD is: " +usdAmount);
        }
      public static void convertPoundtoSGD(){
         Scanner sc=new Scanner(System.in);
         System.out.print("Enter the amount in POUND:");
         double poundAmount=sc.nextDouble();
         double value=1.82;
         double sgdAmount= poundAmount * value;
         System.out.println("Amount in SGD is:RS " +sgdAmount);
         }
       public static void convertDINARtoINR(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the amount in DINAR:");
        double dinarAmount=sc.nextDouble();
        double value=240.10;
        double inrAmount= dinarAmount * value;
        System.out.println("Amount in INR is:RS " +inrAmount);
            }
        public static void convertDINARtoGPB(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the amount in DINAR:");
        double dinarAmount=sc.nextDouble();
        double value=2.49;
        double gpbAmount= dinarAmount * value;
        System.out.println("Amount in GPB is: " +gpbAmount);
           }
       public static void convertDINARtoUSD(){
         Scanner sc=new Scanner(System.in);
         System.out.print("Enter the amount in DINAR:");
         double dinarAmount=sc.nextDouble();
         double value=3.37;
         double usdAmount= dinarAmount * value;
         System.out.println("Amount in USD is: " +usdAmount);
       }
      public static void convertDINARtoSGD(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the amount in DINAR:");
        double dinarAmount=sc.nextDouble();
        double value=4.37;
        double sgdAmount= dinarAmount * value;
        System.out.println("Amount in SGD is:" +sgdAmount);
      }
      public static void convertINRtoKWD(){
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter the amount in INR:");
            double inrAmount=sc.nextDouble();
            double value=0.0042;
            double kwdAmount= inrAmount * value;
            System.out.println("Amount in KWD is: " +kwdAmount);
          }
      public static void convertINRtoGPB(){
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter the amount in INR:");
            double inrAmount=sc.nextDouble();
            double value=0.010;
            double gpbAmount= inrAmount * value;
            System.out.println("Amount in GPB is:" +gpbAmount);
          }
       public static void convertINRtoUSD(){
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter the amount in INR:");
            double inrAmount=sc.nextDouble();
            double value=0.013;
            double usdAmount= inrAmount * value;
            System.out.println("Amount in USD is: " +usdAmount);
          }
       public static void convertINRtoSGD(){
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter the amount in INR:");
            double inrAmount=sc.nextDouble();
            double value=0.018;
            double sgdAmount= inrAmount * value;
            System.out.println("Amount in SGDis:" +sgdAmount);
          }
       public static void convertSINGAPOREtoKWD(){
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter the amount in SINGAPORE CURRENCY:");
            double singaporeAmount=sc.nextDouble();
            double value=0.23;
            double kwdAmount= singaporeAmount * value;
            System.out.println("Amount in KWD is:" +kwdAmount);
          }
      public static void convertSINGAPOREtoGPB(){
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter the amount in SINGAPORE CURRENCY:");
            double singaporeAmount=sc.nextDouble();
            double value=0.55;
            double gpbAmount= singaporeAmount * value;
            System.out.println("Amount in GPB is:" +gpbAmount);
          }
       public static void convertSINGAPOREtoUSD(){
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter the amount in SINGAPORE CURRENCY:");
            double singaporeAmount=sc.nextDouble();
            double value=0.74;
            double usdAmount= singaporeAmount * value;
            System.out.println("Amount in USD is:" +usdAmount);
          }
       public static void convertSINGAPOREtoSGD(){
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter the amount in SINGAPORE CURRENCY:");
            double singaporeAmount=sc.nextDouble();
            double value=55.70;
            double sgdAmount= singaporeAmount * value;
            System.out.println("Amount in SGD is:" +sgdAmount);
          }
      
}


