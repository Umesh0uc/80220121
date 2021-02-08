public class app {
    public static void main(String[] args){
        Calculator cal = new Calculator();
        double a = 10.1;
        double b = 10.9;
        double result = cal.add(a,b);
        System.out.println(result);
        System.out.println("Executed");
    }
}