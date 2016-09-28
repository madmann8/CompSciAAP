package Homework;

/**
 * Created by madmann on 9/28/16.
 */
public class Code {
    private String myCode;
    private char[] mFullCode;
    private char[] mSecretCode;

    public Code(String code){
        myCode=code;
        mFullCode =code.toCharArray();
        mSecretCode=code.toCharArray();
    }

    public String getCode(){
        String string=new String(mSecretCode);
        return string;
    }

    public void hide (int p1,int p2){
        for (int i = 0; i< mFullCode.length; i++){
            if (i>=p1 && i<=p2){
                mSecretCode[i]='X';
            }
        }
    }
    public void recover (int p1,int p2){
        for (int i = 0; i< mFullCode.length; i++){
            if (i>=p1 && i<=p2){
                mSecretCode[i]=mFullCode[i];
            }
        }
    }



}
