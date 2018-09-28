package com.akai.geektech.practiclessons;

public class Cat {
    private String mName;
    private String mDescription;

    public static final Cat[] cats = {
            new Cat("Рыжик", "Рыжик обожает рыжих клоунов"),
            new Cat("Барсик", "Барсик болеет за Барселону"),
            new Cat("Мурзик", "Мурзик выписывает мурзилку")
    };

    private Cat(String name, String description) {
        this.mName = name;
        this.mDescription = description;
    }

    public String getName() {
        return mName;
    }

    public void setName(String mName) {
        this.mName = mName;
    }

    public String getDescription() {
        return mDescription;
    }

    public void setDescription(String mDescription) {
        this.mDescription = mDescription;
    }
}
