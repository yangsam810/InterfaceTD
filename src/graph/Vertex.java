package Graph;

public class Vertex {
  private Object object;
  public Vertex() {}

  public Vertex(Object object) {
    this.object = object;
  }

  public boolean isEmpty() {
    return object == null;
  }

  public Object getVertex() { return object; }

  public void setVertex(Object object) {
    this.object = object;
  }
}
