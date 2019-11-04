package Airplane;

public class Main {
    public static void main(String[] args) {
        Airplane boeing = new Airplane(2, 2, "S7");
        Airplane boeing2 = new Airplane(2, 2, "Ural Airlines");
        boeing.equals(boeing2);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Airplane) {
            Airplane airplane = (Airplane) obj;
        }
        if (obj.getClass() == this.getClass()) {
            Airplane airplane = (Airplane) obj;
        }
        return super.equals(obj);
    }
}

