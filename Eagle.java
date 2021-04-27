public class Eagle extends Bird implements Fly {

    private boolean flying;
    private int altitude;

    public Eagle(String name) {
        super(name);
        this.flying = false;
        this.altitude = 0;
    }

    public int getAltitude() {
        return altitude;
    }

    public void setAltitude(int altitude) {
        this.altitude=altitude;
    }
    
    public boolean isFlying() {
        return flying;
    }

    public void setFlying(boolean flying) {
        this.flying=flying;
    }
    
    
    @Override
    public String sing() {
        return "Screech!";
    }
    
    /**
     * takeoff 
     */
    @Override
    public void takeOff() {
    	if (!this.flying && this.altitude == 0) {
            this.flying=true;
            System.out.printf("%s takes off in the sky.%n", this.getName());
        }
    }
    
    /**
     * Fly upward
     * @param meters altitude increase
     * @return altitude
     */
    @Override
    public int ascend(int meters) {
        if (this.flying) {
            this.altitude=Math.min(this.altitude + meters, 150);
            System.out.printf("%s flies upward, altitude  %d%n", this.getName(), this.altitude);
        }
        return this.altitude;                                               
    }    
    
    /**
     * Fly downward
     * @param meters altitude decrease
     * @return altitude
     */
    @Override
    public int descend(int meters) {
        if (this.flying) {
            this.altitude = Math.max(this.altitude - meters, 0);
            System.out.printf("%s flies downward, altitude : %d%n", this.getName(), this.altitude);
        }
        return this.altitude;
    }    
    
    /**
     * Glide in the sky
     */
    @Override
    public void glide() {
        if (this.flying && this.altitude>= 150) {
            System.out.printf("It glides into the air.%n");
        }
    }
        
    /**
     * land
     */
    @Override
    public void land() {
        if (this.flying && this.altitude <= 1) {
            System.out.printf("%s lands on the ground.%n",  this.getName());
        } else {
            System.out.printf("%s is too upward, it can't land.%n", this.getName());
        }
    }
    
    
    
    
}
