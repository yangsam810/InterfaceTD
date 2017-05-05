package Graph;
import java.util.*;

public class DirectedEdge extends Edge {
  public DirectedEdge(Vertex paramVertex1, Vertex paramVertex2) {
    first = paramVertex1;
    second = paramVertex2;
  }

  public Vertex nextVertex(Vertex paramVertex) {
    if (paramVertex == first) {
      return second;
    }
    throw new EmptyStackException();
  }

  public Vertex getBeginVertex() {
    return first;
  }

  public Vertex getEndVertex() {
    return second;
  }

  public void changedDirection() {
    setVertices(second, first);
  }
}
