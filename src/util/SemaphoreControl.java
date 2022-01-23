package util;

/**
 * Controla os semaforos das regioes criticas
 */
public class SemaphoreControl {
    
    /**
     * Rick e Summer regioes criticas
     */
    public static Semaphore rua_de2 = new Semaphore(1);
    public static Semaphore rua_ab2 = new Semaphore(1);
    public static Semaphore rua_e3 = new Semaphore(1);
    /*******************************************************/
    
    /**
     * Rick, Morty e Summer
     */
    public static Semaphore rua_bc5Andcd5 = new Semaphore(1);
    /********************************************************/
    
    /**
     * Jerry e Beth regioes criticas
     */
    public static Semaphore rua_bcToa4v1 = new Semaphore(1);
    /*******************************************************/
    
    /**
     * Jerry e Summer regioes criticas
     */
    public static Semaphore rua_b5Toa4v2 = new Semaphore(1);
    /***************************************************/
    
    /**
     * Summer e Beth regioes criticas
     */
    public static Semaphore rua_a1Tobc5 = new Semaphore(1);
    /*****************************************************/
    
    /**
     * Rick, Beth e Summer regioes criticas
     */
    public static Semaphore rua_a3 = new Semaphore(1);
    /***************************************************/
    
    /**
     * Jerry, Summer e Morty regioes criticas
     */
    public static Semaphore rua_d5Toe4 = new Semaphore(1);
    /*************************************************/
    
    /**
     * Jerry, Beth, Summer e Morty regioes criticas
     */
    public static Semaphore rua_c43Andbc3 = new Semaphore(1);
    /********************************************************/
    
    /**
     * Rick e Morty regioes criticas
     */
//    public static Semaphore rua_bc5Andc5 = new Semaphore(1);
    public static Semaphore rua_e3Toe32 = new Semaphore(1);
    /*************************************************/
    
    /**
     * Rick e Beth regioes criticas
     */
    public static Semaphore rua_bc1 = new Semaphore(1);
    public static Semaphore rua_bc5 = new Semaphore(1);
    /************************************************/
    
    /**
     * Morty e Summer regioes criticas
     */
    public static Semaphore rua_d32 = new Semaphore(1);
    /**********************************************/
    
    /**
     * Jerry e Rick regioes criticas
     */
    public static Semaphore rua_c5 = new Semaphore(1);
    public static Semaphore rua_e43 = new Semaphore(1);
    public static Semaphore rua_a43 = new Semaphore(1);
    /***********************************************/
    
    /**
     * Morty e Beth regioes criticas
     */
    public static Semaphore rua_bc5Tobc3 = new Semaphore(1);
    /***********************************************/
}
