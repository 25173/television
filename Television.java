import java.util.Scanner;

public class Television {



  public static void main(String[] args) {
    Television2 myFirstTelevision = new Television2();

      while (0 == 0) {
          System.out.println("-----------------------------------------------------------------------\n\n");
          // als de tv uit is, keijg je dit te zien
             if (myFirstTelevision.on == false) {
                System.out.println( "De televisie staat uit");
                System.out.println("-----------------------------------------------------------------------");
                System.out.println("1.aanzetten");
                System.out.println("2.uitzetten");
                System.out.println("3.kanaal omhoog");
                System.out.println("4.kanaal omlaag");
                System.out.println("5.volume omhoog");
                System.out.println("6.volume omlaag");
                System.out.println("7.ga naar kanaal ");
                System.out.println("8.zet volume op ");
                System.out.println("9.EXIT");
                System.out.println("-----------------------------------------------------------------------\n\n");
            } //fout 1
          // als de tv aan staat, krijg je dit te zien
          else{
            System.out.println( "De televisie staat aan");
            System.out.println("het staat op kanaal : " +  myFirstTelevision.channel );
            System.out.println("De level van de volume is op : " + myFirstTelevision.volumeLevel);
            System.out.println("-----------------------------------------------------------------------\n\n");
            System.out.println("1.aanzetten");
            System.out.println("2.uitzetten");
            System.out.println("3.kanaal omhoog");
            System.out.println("4.kanaal omlaag");
            System.out.println("5.volume omhoog");
            System.out.println("6.volume omlaag");
            System.out.println("7.ga naar kanaal ");
            System.out.println("8.zet volume op ");
            System.out.println("9.EXIT");
            System.out.println("-----------------------------------------------------------------------\n\n");
            }
          System.out.println("maak u keueze");
          Scanner scanner = new Scanner(System.in);
          int activiteit = scanner.nextInt();
          // activiteit na de keuze als het uit is
          if (myFirstTelevision.on == false) {
            switch (activiteit) {
              case 1 : myFirstTelevision.turnOn();
              break;
              case 2 : myFirstTelevision.turnOff();
              break;
              case 9 :System.out.println("Tot ziends \n\n");
                      System.exit(0);
              break;
              default: myFirstTelevision.tvOff();
            }
          // activiteit na keuze als de tv aan is
          }else{
            switch (activiteit) {
              case 1 : myFirstTelevision.turnOn();
              break;
              case 2 : myFirstTelevision.turnOff();
              break;
              case 3 : myFirstTelevision.channelUp();
              break;
              case 4: myFirstTelevision.channelDown();
              break;
              case 5: myFirstTelevision.volumeUp();
              break;
              case 6: myFirstTelevision.volumeDown();
              break;
              case 7: System.out.println("naar welk kanaal wil je gaan? ");
                      int newChannel = scanner.nextInt();
                      myFirstTelevision.setChannel(newChannel);
              break;
              case 8: System.out.println("De volume level moet op ?");
                    int newVolumeLevel = scanner.nextInt();
                    myFirstTelevision.setVolume(newVolumeLevel);
              break;

              case 9 : System.out.println("Tot ziends \n\n");
              System.exit(0);
              break;
              default: myFirstTelevision.tvOff();
              }
          }
        }

  }

}
