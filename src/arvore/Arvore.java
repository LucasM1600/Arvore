package arvore;

import java.util.Scanner;

public class Arvore {
    No raiz;
    public Arvore(){
        raiz = null;
    }
    public No novo(int v){
        No temp = new No();
        temp.elemento = v;
        temp.dir = null;
        temp.esq = null;
        return  temp;
    }
    
    public No insert(No no, No novoNo){
        if(no == null){
            return novoNo;
        }
        else{
            if(novoNo.elemento > no.elemento)
                no.dir = insert(no.dir, novoNo);
            else{
                if(novoNo.elemento < no.elemento)
                    no.esq = insert(no.esq, novoNo);
            }
            return no;
        }
    }
    
    public void preOrdem(No tmp){
    
    }
    
    public void emordem(No tmp){
        
    }
    
    public void posordem(No tmp){
        
    }
    
    public boolean busca(No no, int elem){
        boolean temp = false;
        if(no == null){
            return false;
        }
        else{
            if(no.elemento == elem){
                return true;
            }
            else{
                if(elem > no.elemento){
                    temp = busca(no.dir, elem);
                }
                else{
                    temp = busca(no.esq, elem);
                }
            }
            return temp;
        }
    }
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Inicalizando a arvores");
        int valor = 0;
        Arvore ar = new Arvore();
        ar.raiz = ar.insert(ar.raiz , ar.novo(10));
        ar.raiz = ar.insert(ar.raiz , ar.novo(14));
        ar.raiz = ar.insert(ar.raiz , ar.novo(12));
        ar.raiz = ar.insert(ar.raiz , ar.novo(15));
        ar.raiz = ar.insert(ar.raiz , ar.novo(6));
        ar.raiz = ar.insert(ar.raiz , ar.novo(7));
        ar.raiz = ar.insert(ar.raiz , ar.novo(3));
        
        System.out.println("Busca valor: " + ar.busca(ar.raiz, 3));
        System.out.print("Digite um valor da busca: ");
        valor = sc.nextInt();
        System.out.println("Valor: " + valor + " = " + ar.busca(ar.raiz, valor));
    }
    
}

class No{
    int elemento;
    No dir;
    No esq;
}