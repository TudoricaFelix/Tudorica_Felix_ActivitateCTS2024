package Problema14.Template;

public abstract class AOpririTramvai {
    abstract void pornireStatia1();
    abstract void oprireStatia1();
    abstract void oprireStatia2();
    abstract void oprireStatia3();
    abstract void oprireStatia4();
    abstract void oprireStatia5();
    abstract void oprireStatia6();
    abstract void pornireStatia6();

    public final void proceduraOprireTramvaiInFata(){
        pornireStatia1();
        oprireStatia2();
        oprireStatia3();
        oprireStatia4();
        oprireStatia5();
        oprireStatia6();
    }

    public final void proceduraOprireTramvaiSensInvers(){
        pornireStatia6();
        oprireStatia5();
        oprireStatia4();
        oprireStatia3();
        oprireStatia2();
        oprireStatia1();
    }
}
