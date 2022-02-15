/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pet.shop.Objects;

/**
 *
 * @author juan barraza
 */
public class Shop {
    private int id;
    private int nit;
    private String name;
    private String email;
    private int celphone;
    private String address;

    public Shop(int id, int nit, String name, String email, int celphone, String address) {
        this.id = id;
        this.nit = nit;
        this.name = name;
        this.email = email;
        this.celphone = celphone;
        this.address = address;
    }
}
