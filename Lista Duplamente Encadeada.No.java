import java.io.ObjectInputStream;

class ListaDupla {
    No inicio;
    No fim;
    int tamanho;

    public class void inserInicio(string info) {
        No no = new No ();
        no.info = info;
        no.anterior = null;
        no.proximo = inicio;
        if (inicio != null) {
            inicio.anterior = no;
        }
        inicio = no;
        if (tamanho == 0 ) {
            fim = inicio;
        }
        tamanho++;
    }
}

public String retirarInicio  () {
    if (inicio == null) {
        return null;
    }
    String out = inicio.info;
    inicio = inicio.proximo; 
    if (inicio != null) {
        inicio anterior = null;
    }
    tamanho--;
    return out;
    }
    public void inserirInicio(String info) {
        No no = new No ();
        no.info = info;
        no.proximo = null; 
        no.anterior = fim;
        if (fim != null) {
            fim.proximo = no;
        }
        fim = no;
        if (tamanho == 0) {
            inicio = fim;
        } 
        tamanho++;
    } 
    public String retirarFim () {
        if (fim == null) {
            return null; 
        }
        String out = no.info;
        fim = fim.anterior; 
        if (fim != null) {
            fim.proximo = null;
        }   else {
            inicio = null;
        }    
        tamanho--;
        return out;
    }

    public void inserirMeio(int indice, String info) {
        if (indice <= 0 ) {
            inserirInicio(info);
        } else if (indice >= tamanho) {
            inserirFim(info);
    } else {
        No local = inicio;
        for (int i = 0; i < indice; i++) {
            local = local.proximo
        }
        No no = new No ();
        No.info = info;
        no.anterior = local; 
        no.proximo = local.proximo; 
        local.proximo = no;
        no.proximo.anterior = no;
        tamanho++;
        }
        }{
    } 
    public String retirarMeio(int indice){
        if (indice < 0
        || indice >= tamanho 
        || inicio == null) {
            return "";  
        } else if (indice == 0) {
            return retirarInicio();
     }else if (indice == tamanho-1) {
            return retirarFim();

     }
     No local = inicio;
     for (int i = 0; i < indice; i++ ) {
        local= local.proximo;
     }
     if (local.anterior != null)    {
        local.anterior.proximo = local.proximo;
     }
     if (local.proximo != null) {
        local.proximo.anterior = local.anterior;
     }
     tamanho--;
     return local.info;
    }{
      
    public String toString() {
        String str= "(" + tamanho + ")";
        No local = inicio;
        while(local != null) {
            str += local.info + " ";
            local = local.proximo;
        }
        return str;
    }
    public static void main(String [] args) {
        ListaDupla l = new ListaDupla();
        System.out.println(l);

        for (int i =0; i < 6; i++) {
            l.inserirInicio("" + (char) (i + 97));
            system.out.println(l);
        }

        l.inserirMeio(l. "x");
        System.out.println(l);

        l.retirarMeio(4);
        System.out.println("retirei: "
            + l.retirarMeio(4));
            System.out.printLn(L);
            
            while(l.retirarInicio()!= null) {
                System.out.printLn(l);
            }
    }


        
}




