import java.util.LinkedList;

public class Grafi {
    private int nyja;
    private LinkedList<Integer>[] fqinji;

    public Grafi(int nyja){
        this.nyja=nyja;
        fqinji=new LinkedList[nyja];
        for(int i=0;i<nyja;++i){
            fqinji[i]=new LinkedList<>();
        }
    }

    void addEdge(int n,int w){
        fqinji[n].add(w);
    }

    void dfs(int n, boolean[] nyjet){
        nyjet[n]=true;
        System.out.print(n + " ");

        int a;
        for(int i=0;i<fqinji[n].size();i++){
            a=fqinji[n].get(i);
            if(!nyjet[a]){
                dfs(a,nyjet);
            }
        }
    }

    void depthFirst(int n){
        boolean[] listaVizituar=new boolean[nyja];
        dfs(n,listaVizituar);
    }
}
