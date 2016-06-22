
package nofearcode.android.garibay_retrofit.data.model;

public class Ability {

    private Integer slot;
    private Boolean isHidden;
    private Ability_ ability;

    /**
     * 
     * @return
     *     The slot
     */
    public Integer getSlot() {
        return slot;
    }

    /**
     * 
     * @param slot
     *     The slot
     */
    public void setSlot(Integer slot) {
        this.slot = slot;
    }

    /**
     * 
     * @return
     *     The isHidden
     */
    public Boolean getIsHidden() {
        return isHidden;
    }

    /**
     * 
     * @param isHidden
     *     The is_hidden
     */
    public void setIsHidden(Boolean isHidden) {
        this.isHidden = isHidden;
    }

    /**
     * 
     * @return
     *     The ability
     */
    public Ability_ getAbility() {
        return ability;
    }

    /**
     * 
     * @param ability
     *     The ability
     */
    public void setAbility(Ability_ ability) {
        this.ability = ability;
    }

}
