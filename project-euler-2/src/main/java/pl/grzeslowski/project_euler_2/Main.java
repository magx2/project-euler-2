package pl.grzeslowski.project_euler_2;


public final class Main {

    public static void main( final String[] args) {
        final long fibonacciMaxElement = Integer.parseInt(args[0]);

        final ProjectEuler2 projectEuler2SimpleImpl = new ProjectEulerSimpleImpl();

        System.out.println(projectEuler2SimpleImpl.findSum(fibonacciMaxElement));
    }

}
