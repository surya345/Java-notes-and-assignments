import java.util.concurrent.TimeUnit;

// import java.util.Properties;



class Demo{
    public static void main(String[] args) {
        // Locale english=new Locale("zh","CN");
        // Locale Hindi= new Locale("hi","IN");
        // String text="Welcome to India";
        // ResourceBundle obj=ResourceBundle.getBundle("MyResource", english);
        // System.out.println(obj.getString("welcome"));
        //  NumberFormat df=NumberFormat.getCurrencyInstance(english);
        // long d=263633737; 
        // Properties props=System.getProperties();
        // System.out.println(props.getProperty("user.name"));
        // // System.out.println(df.format(d));
        // System.out.println(props.getProperty("os.name"));
        // Runtime runtime=Runtime.getRuntime();
        // System.out.println(runtime.totalMemory());
        // System.out.println(runtime.freeMemory());
        // System.out.println(runtime.availableProcessors());
        try{
            Process p=Runtime.getRuntime().exec("calc");
            p.waitFor(2,TimeUnit.SECONDS);
            p.destroyForcibly();
            System.out.println(p);
            // p.destroy();
        }
        catch(Exception e){

        }
        
    }

    }
