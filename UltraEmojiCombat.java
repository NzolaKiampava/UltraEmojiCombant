package ultraemojicombat;
public class UltraEmojiCombat {
    public static void main(String[] args) {
        Lutador L[] = new Lutador[6];
        
        L[0] = new Lutador("Pretty Boy", "França", 
                                68.9f, 1.75f, 31, 11 , 2, 1);
       
        L[1] = new Lutador("PutScript", "Brasil", 
                            57.8f, 1.68f, 29, 14, 2, 3);
        
        L[2] = new Lutador("Dead Code", "Austrália", 
                           81.6f, 1.93f, 28, 13, 0, 2);
        
        L[3] = new Lutador("Snap Shadow", "EUA", 
                           80.9f, 1.65f, 35, 12, 2, 1);
        
        L[4] = new Lutador("UFOCOBOL", "Brazil", 
                           119.3f, 1.70f, 37, 5, 4, 3);
         
        L[5] = new Lutador("NerdArt", "EUA", 
                           105.7f, 1.81f, 30, 12, 2, 4);
        
        
        Luta UFC01 = new Luta();
        UFC01.marcarLuta(L[4], L[5]);
        UFC01.Lutar();
        L[4].status();
        System.out.println("");  
        L[5].status();
        //L[0].apresentar();
        //String vet[] = new String[12];
    }
    
}
