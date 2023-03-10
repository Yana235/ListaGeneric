public class Nodo<T> {
   private T elem;
   private Nodo<T> next;

    public Nodo(T elem) {
        this.elem = elem;
    }


    public T getElem() {
        return elem;
    }

    public void setElem(T elem) {
        this.elem = elem;
    }

    public Nodo<T> getNext() {
        return next;
    }

    public void setNext(Nodo<T> next) {
        this.next = next;
    }


    @Override
    public boolean equals(Object o){
        if(!(o instanceof Nodo))
            return false;

            Nodo nodo = (Nodo) o;
            return this.elem.equals(nodo.elem);


    }


}
