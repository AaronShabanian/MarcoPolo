public class MarcoPolo extends Thread {
    public static void main(String[] args){
        MarcoPolo marco = new MarcoPolo();
        marco.setName("Marco ");
        MarcoPolo polo =new MarcoPolo();
        polo.setName("Polo \n");
        marco.start();
        try{
            Thread.sleep(100);
         }
         catch(InterruptedException e){
             System.out.println("Error");
         }
        polo.start();
    }
    public void run(){
        for(int i=0; i<10; i++){
            System.out.print(Thread.currentThread().getName());
            try{
                Thread.sleep(1000);
             }
             catch(InterruptedException e){
                 System.out.println("Error");
             }
        }
        if(Thread.currentThread().getName()=="Polo \n"){
            System.out.println("Thats all folks \n");
        }
        

    }

}