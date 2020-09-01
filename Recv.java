import java.io.PipedInputStream;

class Recv implements Runnable{
  private PipedInputStream input = null;
  
  public Recv(){
    this.input = new PipedInputStream();
  }

  public PipedInputStream getInput(){
    return this.input;
  }

  public void run(){
    byte[] b = new byte[1000];
    int len = 0;
    try {
      len = this.input.read(b);
    } catch(Exception e){
      e.printStackTrace();
    }

    try{
      input.close();
    } catch(Exception e){
      e.printStackTrace();
    }

    System.out.println("接收内容为"+ (new String(b, 0, len)));
  }
}