package uaslp.ingenieria.labs.otro;

import uaslp.ingenieria.labs.Employee;

public class Principal extends Employee {
    private String atributo;

    void print(){
        System.out.println(atributo);
        System.out.println(name);
    }

    public String getAtributo() {
        return atributo;
    }

    public void setAtributo(String atributo) {
        this.atributo = atributo;
    }
}
