package Graphs;
import java.util.*;
class disjoint{
    ArrayList<Integer> par= new ArrayList<>();
    ArrayList<Integer> size= new ArrayList<>();
    disjoint(int n){
        for (int i=0; i<=n ;i++){
            par.add(i);
            size.add(1);
        }
    }
    public int findulPar(int node){
        if(node==par.get(node)) return node;

        int ulPar= findulPar(par.get(node));
        par.set(node, ulPar);
        return par.get(node);
    }

    public void unionBySize(int u, int v){
        int ulP_u= findulPar(u);
        int ulP_v= findulPar(v);

        if(ulP_u==ulP_v) return;

        if(par.get(ulP_u)< par.get(ulP_v)){
            par.set(ulP_u, ulP_v);
            size.set(ulP_v,  size.get(ulP_u)+size.get(ulP_v));
        }else{
            par.set(ulP_v,ulP_u);
            size.set(ulP_u, size.get(ulP_u)+size.get(ulP_v));
        }
    }
}
public class disjoint_UnionBySize {
    public static void main(String[] args) {
        disjoint ds= new disjoint(7);

        ds.unionBySize(1,2);
        ds.unionBySize(2,3);
        ds.unionBySize(4,5);
        ds.unionBySize(6,7);
        ds.unionBySize(5,6);

        if(ds.findulPar(3)== ds.findulPar(7)){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
        ds.unionBySize(3,7);
        if(ds.findulPar(3)== ds.findulPar(7)){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
    }
}
