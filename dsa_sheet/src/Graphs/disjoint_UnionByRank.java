package Graphs;
import java.util.*;
class Disjoint{
    ArrayList<Integer> rank= new ArrayList<>();
    ArrayList<Integer> par= new ArrayList<>();
    public Disjoint(int n){
        for(int i=0; i<=n; i++){
            rank.add(0);
            par.add(i);
        }
    }

    public int findUlPar(int node){
        if(node==par.get(node)) return node;

        int ulPar=findUlPar(par.get(node));
        par.set(node, ulPar);
        return par.get(node);
    }

    public void unionByRank(int u, int v){
        int ulp_u= findUlPar(u);
        int ulp_v= findUlPar(v);

        if(ulp_u==ulp_v) return;

        if(rank.get(ulp_u)< rank.get(ulp_v)) par.set(ulp_u, ulp_v);
        else if(rank.get(ulp_v)< rank.get(ulp_u)) par.set(ulp_v, ulp_u);
        else{
            par.set(ulp_v,ulp_u);
            rank.set(ulp_u,rank.get(ulp_u)+1);
        }
    }
}

public class disjoint_UnionByRank {
    public static void main(String[] args) {
        Disjoint ds= new Disjoint(7);

        ds.unionByRank(1,2);
        ds.unionByRank(2,3);
        ds.unionByRank(4,5);
        ds.unionByRank(6,7);
        ds.unionByRank(5,6);

        if(ds.findUlPar(3)== ds.findUlPar(7)){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
        ds.unionByRank(3,7);
        if(ds.findUlPar(3)== ds.findUlPar(7)){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }

    }
}
