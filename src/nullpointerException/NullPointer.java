package nullpointerException;

public class NullPointer {
    public static void main(String[] args) {
        String str = null;
        try{
            System.out.println("Length Of the String :- "+str.length());
        }catch (NullPointerException e){
            System.out.println(e.getMessage());
        }
        System.out.println("After handling exeception");
    }
}
