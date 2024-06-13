class A{
    public static void main(String args[]){
        try{
            System.out.println("First statement to try block");
            int a=45/0;
            System.out.println(a);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("catch block");
        }
        finally{
            System.out.println("end");
        }
    }
}