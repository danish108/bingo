package constructors;

class ArrayDemo {
    public double[] calculate(int [] brr)
    {
        double [] d=new double[2];
        int sum=0;
        for(int i=0;i<brr.length;i++)
        {
            sum=sum+brr[i];
        }
        d[0]=sum;
        d[1]=(double)sum/brr.length;
        return d;
    }
    
}
