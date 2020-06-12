package com.nammafarmer.seeds;

public class BuySeeds {

    private String name;
    private String phone;
    private String email;
    private Boolean Rice;
    private Boolean Onion;
    private Boolean Tomato;
    private Boolean Bendi;
    private Boolean Brinjal;
    private Boolean Pumpkin;
    private Boolean Wheat;
    private Boolean Karela;
    private Boolean Beans;
    private Boolean Carrot;
    private Boolean Squash;
    private Boolean Radish;
    private Boolean Millets;
    private Boolean Chilli;
    private Boolean Ginger;
    private Boolean Garlic;
    private Boolean Spices;
    private Boolean Others;


    public BuySeeds() {

    }

    public BuySeeds(String name,String phone,String email,Boolean Rice,Boolean Onion,Boolean Tomato,Boolean Bendi,Boolean Brinjal,Boolean Pumpkin,
            Boolean Wheat,Boolean Karela,Boolean Beans,Boolean Carrot,Boolean Squash,Boolean Radish,Boolean Millets,Boolean Chilli,
            Boolean Ginger,Boolean Garlic,Boolean Spices,Boolean Others){

                this.setName(name);
                this.setEmail(email);
                this.setPhone(phone);
                this.setRice(Rice);
                this.setOnion(Onion);
                this.setTomato(Tomato);
                this.setBendi(Bendi);
                this.setBrinjal(Brinjal);
                this.setPumpkin(Pumpkin);
                this.setWheat(Wheat);
                this.setKarela(Karela);
                this.setBeans(Beans);
                this.setCarrot(Carrot);
                this.setSquash(Squash);
                this.setRadish(Radish);
                this.setMillets(Millets);
                this.setChilli(Chilli);
                this.setGinger(Ginger);
                this.setGarlic(Garlic);
                this.setSpices(Spices);
                this.setOthers(Others);
    }


    public Boolean getMillets() {
        return Millets;
    }

    public void setMillets(Boolean millets) {
        Millets = millets;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getRice() {
        return Rice;
    }

    public void setRice(Boolean rice) {
        Rice = rice;
    }

    public Boolean getOnion() {
        return Onion;
    }

    public void setOnion(Boolean onion) {
        Onion = onion;
    }

    public Boolean getTomato() {
        return Tomato;
    }

    public void setTomato(Boolean tomato) {
        Tomato = tomato;
    }

    public Boolean getBendi() {
        return Bendi;
    }

    public void setBendi(Boolean bendi) {
        Bendi = bendi;
    }

    public Boolean getBrinjal() {
        return Brinjal;
    }

    public void setBrinjal(Boolean brinjal) {
        Brinjal = brinjal;
    }

    public Boolean getPumpkin() {
        return Pumpkin;
    }

    public void setPumpkin(Boolean pumpkin) {
        Pumpkin = pumpkin;
    }

    public Boolean getWheat() {
        return Wheat;
    }

    public void setWheat(Boolean wheat) {
        Wheat = wheat;
    }

    public Boolean getKarela() {
        return Karela;
    }

    public void setKarela(Boolean karela) {
        Karela = karela;
    }

    public Boolean getBeans() {
        return Beans;
    }

    public void setBeans(Boolean beans) {
        Beans = beans;
    }

    public Boolean getCarrot() {
        return Carrot;
    }

    public void setCarrot(Boolean carrot) {
        Carrot = carrot;
    }

    public Boolean getSquash() {
        return Squash;
    }

    public void setSquash(Boolean squash) {
        Squash = squash;
    }

    public Boolean getRadish() {
        return Radish;
    }

    public void setRadish(Boolean radish) {
        Radish = radish;
    }

    public Boolean getChilli() {
        return Chilli;
    }

    public void setChilli(Boolean chilli) {
        Chilli = chilli;
    }

    public Boolean getGinger() {
        return Ginger;
    }

    public void setGinger(Boolean ginger) {
        Ginger = ginger;
    }

    public Boolean getGarlic() {
        return Garlic;
    }

    public void setGarlic(Boolean garlic) {
        Garlic = garlic;
    }

    public Boolean getSpices() {
        return Spices;
    }

    public void setSpices(Boolean spices) {
        Spices = spices;
    }

    public Boolean getOthers() {
        return Others;
    }

    public void setOthers(Boolean others) {
        Others = others;
    }
}

