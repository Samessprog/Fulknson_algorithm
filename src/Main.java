import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        FordFulkerson ff = new FordFulkerson(6);
        Scanner sc = new Scanner(System.in);
        System.out.println("\n" + "Wprowadź liczbę krawędzi:");
        int edges = sc.nextInt();
        System.out.println("Legenda: u - wierzcholek startowy v - wierzcholek koncowy  w -  przepustowosc ");
        for (int i = 0; i < edges; i++) {
            System.out.println("Wprowadz krawedz " + (i + 1) + " (u v w):");
            System.out.print("u:");
            int u = sc.nextInt();
            System.out.print("v:");
            int v = sc.nextInt();
            System.out.print("w:");
            int w = sc.nextInt();
            ff.addEdge(u, v, w);
        }
        System.out.println("Wierzcholek zrodlowy:");
        int source = sc.nextInt();
        System.out.println("Wierzcholek ujsciowy:");
        int sink = sc.nextInt();
        int maxFlow = ff.getMaxFlow(source, sink);
        System.out.println("Max flow: " + maxFlow);
        sc.close();

    }
}