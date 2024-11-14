# Fulknson algorithm

## Description


This project implements the Ford-Fulkerson algorithm for computing the maximum flow in a flow network. The Ford-Fulkerson method is used to find the maximum flow from a source vertex to a sink vertex in a directed graph where each edge has a capacity.

### Features

- **Add Edges:** Allows you to define the graph by adding edges with specified capacities.
- **Compute Maximum Flow:** Calculates the maximum flow from a source vertex to a sink vertex using the Ford-Fulkerson algorithm.
- **Interactive Input:** Prompts the user to input the number of edges, details of each edge (start vertex, end vertex, and capacity), and the source and sink vertices.

### How It Works

1. **Input Graph Definition:** The user specifies the number of edges and provides the details for each edge in the graph. Each edge is defined by a start vertex, end vertex, and capacity.
2. **Compute Flow:** The algorithm uses a Breadth-First Search (BFS) to find augmenting paths in the residual graph. It then updates the flow along these paths until no more augmenting paths can be found.
3. **Output Result:** The program outputs the maximum flow from the source vertex to the sink vertex.

### Example

To use the program, follow these steps:
1. Run the program.
2. Enter the number of edges when prompted.
3. For each edge, provide the start vertex, end vertex, and capacity.
4. Input the source vertex and sink vertex.
5. The program will compute and display the maximum flow value.

This implementation is a basic example and can be extended or optimized for more complex use cases.

### Dependencies

- Java 8 or later

### Usage

Compile the Java code and run the `Main` class. Follow the on-screen prompts to input graph details and calculate the maximum flow.

```bash
javac Main.java
java Main
