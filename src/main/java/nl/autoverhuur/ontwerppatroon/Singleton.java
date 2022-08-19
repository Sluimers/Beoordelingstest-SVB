package nl.autoverhuur.ontwerppatroon;

public class Singleton {

  private static volatile Singleton _unicum = null;

  protected Singleton() {}

  public static Singleton geefUnicum() {
    if (_unicum == null) {
    	synchronized(Singleton.class) {
            if (_unicum  == null) {
            	_unicum = new Singleton();
            }
        }
    }
    return _unicum;
  }
}
