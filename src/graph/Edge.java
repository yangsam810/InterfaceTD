package Graph;
import java.util.*;

public abstract class Edge {
  private Vertex vertex1;
  private Vertex vertex2;

  public Edge() {}

  public Vertex nextVertex(Vertex vertex) {
    if (vertex == vertex1) {
      return vertex2;
    }
    if (vertex == vertex2) {
      return vertex1;
    }
    throw new EmptyStackException();
  }

  public void setVertices(Vertex vertex1, Vertex vertex2) {
    this.vertex1 = vertex1;
    this.vertex2 = vertex2;
  }

  public Vertex getFirstVertex() {
    return vertex1;
  }

  public Vertex getSecondVertex(）{
    return vertex2;
  }
}
