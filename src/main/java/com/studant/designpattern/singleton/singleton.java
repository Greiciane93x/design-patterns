public class Singleton { 
    private static Singleton instance = null; 

    // A finalidade do synchronized é evitar problemas com estados 
    // indeterminados em um programa. 
    public syncronized  static Singleton getInstance(){
        if(instance == null){
            instance = new Singleton(); 
        }
        return instance; 
    }
    private Singleton()

}