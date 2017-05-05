package Graph;

public abstract interface Graph {
  public abstract boolean isEmpty();

  public abstract Graph addEdge(Edge paramEdge);

  public abstract Graph removeEdge(Edge paramEdge);

  public abstract Graph addVertex(Vertex paramVertex);

  public abstract Graph removeVertice(Vertex paramVertex);
}
