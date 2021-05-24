import java.util.Scanner;

public class temperatureconverter {


    public static void main (String [] args) {

        System.out.println("1.Graus -> Fahrenheit  2.Fahrenheit -> Graus  3.sair");

        

            Scanner tcd = new Scanner(System.in);

                int teste = -1;

                    teste = tcd.nextInt();

                    if (teste == 3) {System.out.println("Saindo aguarde ...");};


        
                        if ( teste == 1 ) {

                            System.out.println("Digite a temperatura em Graus");

                                int Graus ;

                                    Graus = tcd.nextInt();

                                        System.out.println(Graus + " Graus em Fahrenheit é " + (9 * Graus + 160 ) / 5 ) ;} 



                                            if (teste != 1 && teste != 2 && teste != 3) {System.out.println("1.tentar novamente 2.sair");
                                        
                                                int retur;
                                              
                                                    retur = tcd.nextInt();
                                                
                                                        if (retur == 1) {}
                                                        
                                                            if (retur == 2) {System.out.println("Saindo aguarde ...");}};
            
                                            
                    
                        if ( teste == 2) {

                            System.out.println("Digite a temperatura em Fahrenheit");

                                int F;

                                    F = tcd.nextInt();

                                        System.out.println(F + " Fahrenheit em Graus é " + (F - 32) * 5/9);};
                                        
                                           

                        

                                    
                                

                        }   
                        
                        
        }
                
                

    






