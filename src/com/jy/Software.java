package com.jy;

public class Software extends Product {

    private String programmer;
    private String platform; // linux, mac, or pc
    private String os;

    public Software(){
        //super();
    }


    public String getProgrammer() {
        return programmer;
    }

    public void setProgrammer(String programmer) {
        this.programmer = programmer;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    @Override
    public boolean equals(Object obj) {
        System.out.print("This is the equals method of the subclass Software!");
        if(this == obj)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}