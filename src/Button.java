class Button{
    EventHandler handler;
    Button(EventHandler action){
        this.handler=action;
    }
    public void click(){
        handler.execute();
    }
}