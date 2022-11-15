public class Hideout<T> {
    private T hideout;

    /*public Hideout() {
        this.hideout = ;
    } */

    public void putIntoHideout(T toHide) {
        this.hideout = toHide;
    }

    public T takeFromHideout() {
        if (isInHideout() == false) {
            return null;
        }
        
        T toReturn = this.hideout;
        this.hideout = null;
        return toReturn;
    }

    public boolean isInHideout() {
        if (this.hideout == null) {
            return false;
        } 
        else {
            return true;
        }
    }
}
