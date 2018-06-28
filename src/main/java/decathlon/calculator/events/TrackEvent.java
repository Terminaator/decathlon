package decathlon.calculator.events;

public class TrackEvent {
    public TrackEvent(){

    }
    public int run100Points(String run100m){
        System.out.println((int) (25.4347*Math.pow(18-Float.parseFloat(run100m),1.81)));
        return (int) (25.4347*Math.pow(18-Float.parseFloat(run100m),1.81));
    }
    public int run110Points(String run110m){
        System.out.println((int) (5.74352*Math.pow(28.5-Float.parseFloat(run110m),1.92)));
        return (int) (5.74352*Math.pow(28.5-Float.parseFloat(run110m),1.92));
    }
    public int run400Points(String run400m){
        System.out.println((int) (1.53775*Math.pow(82-Float.parseFloat(run400m),1.81)));
        return (int) (1.53775*Math.pow(82-Float.parseFloat(run400m),1.81));
    }
    public int run1500Points(String run1500m){
        System.out.println((int) (0.03768*Math.pow(480-Float.parseFloat(run1500m),1.85)));
        return (int) (0.03768*Math.pow(480-Float.parseFloat(run1500m),1.85));
    }
}
