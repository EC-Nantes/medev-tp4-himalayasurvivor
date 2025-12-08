/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cvub.jeudedames;

/**
 *
 * @author utaab
 */
public class Pion {
    private Case c;
    private boolean estDame;

    public Pion(Case c) {
        this.c = c;
        this.estDame = false;
    }
    
    public Pion(Case c, boolean estDame) {
        this.c = c;
        this.estDame = estDame;
    }

    public boolean isEstDame() {
        return estDame;
    }

    public void setEstDame(boolean estDame) {
        this.estDame = estDame;
    }

    public Case getC() {
        return c;
    }

    public void setC(Case c) {
        this.c = c;
    }
    
    
}
