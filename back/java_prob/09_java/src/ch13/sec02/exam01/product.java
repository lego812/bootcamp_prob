package ch13.sec02.exam01;


public class product<kind, model>{
    kind kind;
    model model;

    public void setKind(kind kind){
        this.kind=kind;
    }

    public void setModel(model model){
        this.model=model;
    }

    public kind getKind(){
        return kind;
    }

    public model getModel(){
        return model;
    }
}
