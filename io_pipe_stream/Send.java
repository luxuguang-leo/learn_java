import java.io.PipedOutputStream;

class Send implements Runnable{
  private PipedOutputStream out = null;

  public Send(){
    out = new PipedOutputStream();
  }

  public PipedOutputStream getOut(){
    return this.out;
  }

  public void run(){
    String msg = "hello test";
    try{
      out.write(msg.getBytes());
    } catch(Exception e){
      e.printStackTrace();
    }
    try{
      out.close();
    } catch(Exception e){
      e.printStackTrace();
    }
  }
}