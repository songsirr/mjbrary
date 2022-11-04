package com.mj.song.designpattern.creationalpatterns.builderpattern;

public class BuilderProduct {

    private String name;

    private String age;

    private String gender;

    private BuilderProduct(Builder builder){
        this.name = builder.name;
        this.age = builder.age;
        this.gender = builder.gender;
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public static Builder builder(){
        return new Builder();
    }

    public static class Builder {

        private String name;

        private String age;

        private String gender;

        private Builder(){}

        public Builder name(String name){
            this.name = name;
            return this;
        }

        public Builder age(String age){
            this.age = age;
            return this;
        }

        public Builder gender(String gender){
            this.gender = gender;
            return this;
        }

        public BuilderProduct build(){
            return new BuilderProduct(this);
        }
    }
}
