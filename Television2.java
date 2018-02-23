public class Television2  {
  // klasses
  public  int channel = 1 ;
  public  int volumeLevel = 1 ;
  public  boolean on ;

  // om aan te zetten
     public void turnOn(){
         if (on == false) {
           on = true;
           System.out.println("tv is aangezet!\n");
         }else {
             System.out.println("De tv was al aan\n");
           }
          }
  // om de tv uit te zetten
     public void turnOff(){
       if (on == true) {
           on = false;
           System.out.println("tv is uitgezet\n");
       }else{
         System.out.println("De tv is al uit\n");
       }
     }
  //om de kanaal te wijzigen zoals je wilt
     public void setChannel( int newChannel){
       if (newChannel >= 1 && newChannel <= 10) {
         channel = newChannel;
       System.out.println("Het is kanaal " + channel + " geworden.\n");
       }else{
       System.out.println("Kanaal " + newChannel + " bestaat niet.\n");
       }
     }
  //om de volume te wijzigen
     public void setVolume(int newVolumeLevel){
       if (newVolumeLevel >= 0 && newVolumeLevel <= 20) {
         volumeLevel = newVolumeLevel;
         System.out.println("Het volume is " + volumeLevel + ".\n");
       }else {
         System.out.println("Het volume kan niet harden dan 20.\n");
       }
     }
  // kanaal omhoog
     public void channelUp(){
       channel = channel + 1;
       if (channel == 11 ) {
         channel = 1;
         System.out.println("Het is kannaal " + channel + " geworden.\n");
       }else  {
         System.out.println("Het is kannaal " + channel + " geworden.\n");
       }
     }
  // kanaal omlaag
     public void channelDown(){
       channel -= 1 ;
       if (channel <= 0 ) {
           channel = 10;
         System.out.println("Het is kannaal " + channel + " geworden.\n");
       }else  {
         System.out.println("Het is kannaal " + channel + " geworden.\n");
       }
     }
  // volume omhoog
     public void volumeUp(){
       volumeLevel += 1;
       if (volumeLevel > 20 ) {
         volumeLevel = 20;
         System.out.println("Het volume level is " + volumeLevel + " en kan niet hoger\n");
       }else  {
         System.out.println("Het volume level is " + volumeLevel + ".\n" );
       }
     }
  //volume omlaag
     public void volumeDown(){
       volumeLevel -= 1;
       if (volumeLevel < 0 ) {
         volumeLevel = 0;
         System.out.println("Het volume level is " + volumeLevel +" en kan niet lager\n");
       }else if (volumeLevel == 0) {
         System.out.println("Het volume level is " + volumeLevel + ".\n" );
       }else  {
         System.out.println("Het volume level is " + volumeLevel + "\n" );
       }
     }
  //bevestiging dat de tv al uit staat
     public void tvOff(){
       if (on == false) {
         System.out.println("De tv staat uit !!!!!!!!!\n");
       }
     }
}
