package decathlon.calculator.events;

public class FieldEvent {
    public FieldEvent(){

    }
    public int discusPoints(String discusThrow){
        System.out.println((int) (12.91*Math.pow(Float.parseFloat(discusThrow)-4,1.1)));
        return (int) (12.91*Math.pow(Float.parseFloat(discusThrow)-4,1.1));
    }
    public int highPoints(String highJump){
        System.out.println((int) (0.8465*Math.pow(Float.parseFloat(highJump)-75,1.42)));
        return (int) (0.8465*Math.pow(Float.parseFloat(highJump)-75,1.42));
    }
    public int javalinPoints(String javalinThrow){
        System.out.println((int) (10.14*Math.pow(Float.parseFloat(javalinThrow)-7,1.08)));
        return (int) (10.14*Math.pow(Float.parseFloat(javalinThrow)-7,1.08));
    }
    public int longPoints(String longJump){
        System.out.println((int) (0.14354*Math.pow(Float.parseFloat(longJump)-220,1.4)));
        return (int) (0.14354*Math.pow(Float.parseFloat(longJump)-220,1.4));
    }
    public int polePoints(String poleVault){
        System.out.println((int) (0.2797*Math.pow(Float.parseFloat(poleVault)-100,1.35)));
        return (int) (0.2797*Math.pow(Float.parseFloat(poleVault)-100,1.35));
    }
    public int shotPoints(String shotPut){
        System.out.println((int) (51.39*Math.pow(Float.parseFloat(shotPut)-1.5,1.05)));
        return (int) (51.39*Math.pow(Float.parseFloat(shotPut)-1.5,1.05));
    }
}
