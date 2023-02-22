public class Lista<T> {
    //List<String> rd lo mismo
    private Nodo<T> head;
    private int size;

    /*
    public Lista(Nodo<T> head, int size) {
        this.head = head;
        this.size = size;
    }

     */

    public Lista(){
        head=null;
        size=0;
    }

    public int size(){
        return size;
    }


    public void add(Nodo <T> nodo){
        if(size!=0){
            head=nodo;

            nodo.setNext(head);
            head=nodo;
            size++;
        }



    }
    public T get(int index){
        if(index>size || index<=0)
            return null;
            Nodo<T> aux=head;
            for(int i=0;i<=index;i++){
              aux=aux.getNext();

        }
        return aux.getElem();

    }

}
