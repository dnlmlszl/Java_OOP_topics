package fakeTriangle;

public class FakeTriangle {
	private int a, b, c;

    public FakeTriangle(int a, int b, int c) {
        setA(a);
        setB(b);
        setC(c);
        
        if(!szerkesztheto()){
            beallit();
        }
    }

    public int getA() { return a; }

    public void setA(int a) {     	
    	
        if(a < 0){
            a = Math.abs(a);
        }else if(a == 0){
            a = 1;
        }
        this.a = a;
        
        
    }

    public int getB() { return b; }

    public void setB(int b) { 
    	
        if(b < 0){
            b = Math.abs(b);
        }else if(b == 0){
            b = 1;
        }
        this.b = b;
        
    }
    
    public int getC() { return c; }

    public void setC(int c) {     	
    	
        if(c < 0){
            c = Math.abs(c);
        }else if(c == 0){
            c = 1;
        }
        this.c = c;
        
    }

    public String oldalakAdatai() {
        return "a=" + a + ", b=" + b + ", c=" + c;
    }
    
    private boolean szerkesztheto(){
        return a+b > c && a+c > b && b+c > a;
    }
    
    private void beallit() {
        a = 1;
        b = 1;
        c = 1;
    }
}