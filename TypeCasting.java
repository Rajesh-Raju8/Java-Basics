public class TypeCasting {
    public static void main(String[] args) {
        byte by=127;
        //if i m converting integer of long into byte it is going to perform modulo operaton and give the remainder as the input
        int num=257;
        by=(byte) num; //explicit conversion 
        System.out.println((by));
    }
}
