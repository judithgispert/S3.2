package N2Callback;



public abstract class Payment {
    protected float amount;
    final void executeWith(ICallback iCallback){
        execute();
        iCallback.call();
    }
    public abstract void execute();
}
