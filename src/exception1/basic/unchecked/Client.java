package exception1.basic.unchecked;

import exception1.basic.checked.MyCheckedException;

public class Client {
    public void call(){
        throw new MyUncheckedException("ex");
    }
}
