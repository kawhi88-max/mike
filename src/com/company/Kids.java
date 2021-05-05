package com.company;

public final class  Kids extends Gorilla {
    private int birthday;
    private  int height;
    private Name nameGorilla;
    


    public Name getNameGorilla() {
        return nameGorilla;
    }

    public int getBirthday() {
        return birthday;
    }

    public int getHeight() {
        return height;
    }

    public Kids(int birthday, int height , Name nameGorilla , String breed , Color color){
        super(color , breed);
        this.birthday = birthday;
        this.height = height;
        this.nameGorilla = nameGorilla;

    }

    @Override
    public void voice() {
        super.voice();
        System.out.println("ууу , ooo , aaa");
    }

    public void copyMethod(Kids kids){
        this.birthday = birthday;
        this.height = height;
    }
    public String getInfo(){
        return super.getInfo()+"\n день рождения - "+birthday+ "\n рост - "+height+ "\n имя - "+nameGorilla.getName();
    }
}
