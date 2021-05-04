class Transmissprogram{
    static class Transmission{
        String modelnumber;
        Double Firstgear;
        double Secondgear;
        double Thirdgear;
        double Fourthgear;
        
        public Transmission(String modelnumber){
            this.modelnumber=modelnumber;
 
            if(modelnumber.equals("MP4")){
             this.Firstgear=2.540;
             this.Secondgear=1.928;
             this.Thirdgear=1.876;
             this.Fourthgear=1.675;
            }
            if(modelnumber.equals("mp5")){
                this.Firstgear=3.545;
                this.Secondgear=1.765;
                this.Thirdgear=1.875;
                this.Fourthgear=1.865;
        }
          if(modelnumber.equals("mp6")){
            this.Firstgear=3.068;
            this.Secondgear=1.980;
            this.Thirdgear=1.838;
            this.Fourthgear=7225;
    }
        if(modelnumber.equals("md5")){
            this.Firstgear=3.708;
            this.Secondgear=1.6008;
            this.Thirdgear=1.990;
            this.Fourthgear=7245;
 }
        if(modelnumber.equals("md6")){
          this.Firstgear=2.345;
          this.Secondgear=6000;
          this.Thirdgear=9024;
          this.Fourthgear=2525;
}
       if(modelnumber.equals("AMPTP4")){
         this.Firstgear=2.540;
        this.Secondgear=1.8766;
        this.Thirdgear=923;
       this.Fourthgear=3553;
}
if(modelnumber.equals("AMPTD6")){
    this.Firstgear=3.876;
    this.Secondgear=4000;
    this.Thirdgear=930;
    this.Fourthgear=75;
}
if(modelnumber.equals("ACT6")){
    this.Firstgear=2.654;
    this.Secondgear=2251;
    this.Thirdgear=910;
    this.Fourthgear=75;
}
if(modelnumber.equals("DCT6")){
    this.Firstgear=2.765;
    this.Secondgear=225;
    this.Thirdgear=252;
    this.Fourthgear=65;
}

    }
 }
 static class Manual extends Transmission{
  String TransmissionType;
  double Fifthgear;
  double forwardgear;
     public Manual(String modelnumber) {
 
         super(modelnumber);
         if(modelnumber.equalsIgnoreCase("mp4")){
             this.forwardgear=4;
             this.TransmissionType="Manual";
             
         }
         if(modelnumber.equalsIgnoreCase("mp5")){
            this.forwardgear=5;
            this.Fifthgear=1.496;
            this.TransmissionType="Manual";
     }
     if(modelnumber.equalsIgnoreCase("mp6")){
        this.forwardgear=6;
        this.Fifthgear=1.936;
        this.TransmissionType="Manual";} 
 
         if(modelnumber.equalsIgnoreCase("md5")){
            this.forwardgear=5;
            this.Fifthgear=1.306;
            this.TransmissionType="Manual";}
 
             if(modelnumber.equalsIgnoreCase("md6")){
                this.forwardgear=6;
                this.Fifthgear=1.236;
                this.TransmissionType="Manual";
             }
             
                
 
 }
 }
   static class AMT extends Transmission{
    String TransmissionType;
    double Fifthgear;
    double forwardgear;
    double sixthgear;
    double seventhgear;
    double eighthgear;
       public AMT(String modelnumber) {
 
           super(modelnumber);
           if(modelnumber.equalsIgnoreCase("AMPTP4")){
                this.forwardgear=4;
                this.TransmissionType="Automatic";
            }
            if(modelnumber.equalsIgnoreCase("AMPTD5")){
                this.forwardgear=5;
                this.Fifthgear=1.436;
                this.TransmissionType="Automatic";
            }
            if(modelnumber.equalsIgnoreCase("CVT6")){
                this.forwardgear=6;
                this.Fifthgear=1.946;
                this.sixthgear=0.499;
                this.TransmissionType="Automatic";
            }
            if(modelnumber.equalsIgnoreCase("DCT8")){
                this.forwardgear=8;
                this.Fifthgear=1.976;
                this.sixthgear=1.0000;
                this.eighthgear=0.667;
                this.TransmissionType="Automatic"; 
            }
       }
       
   } 
   class Manual1 extends Transmission{
     String transmissiontype;
      public Manual1(String modelnumber) {
          super(modelnumber);
          this.transmissiontype="Manual";
      }
      
  }
  class AMT1 extends Transmission{
    String transmissiontype;
      public AMT1(String modelnumber) {
          super(modelnumber);
          this.transmissiontype="Automatic";
      }
      
  }
  class CVT6 extends Transmission{
      String transmissiontype ;
      public CVT6(String modelnumber) {
          super(modelnumber);
          this.transmissiontype="Automatic";
      }
     }
      class DCT6 extends Transmission{
      String transmissiontype;
          public DCT6(String modelnumber) {
              super(modelnumber);
              this.transmissiontype="Automatic";
          }
          
      } 
      public static void showspecs(Manual e){
        System.out.println("Transmission Type    :"+e.TransmissionType);
        
        System.out.println("Transmission Model number:"+ e.modelnumber);
        System.out.println("---------------------------------");
        System.out.println("Key Specifications:");
        System.out.println("1:Forward gear   :"+e.forwardgear);
        System.out.println("2:First gear   :"+e.Firstgear);
        System.out.println("3:Second gear   :"+e.Secondgear);
        System.out.println("4:Third gear  :"+e.Thirdgear);
        System.out.println("5:Forth gear  :"+e.Fourthgear);
        System.out.println("6:Fivth gear  :"+e.Fifthgear);

     }
 public static void main(String[] args) {
    
         
     
 }
 }
 
 