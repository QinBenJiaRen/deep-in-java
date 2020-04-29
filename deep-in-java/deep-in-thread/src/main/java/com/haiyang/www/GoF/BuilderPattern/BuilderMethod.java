package com.haiyang.www.GoF.BuilderPattern;

/**
 * Builder模式
 * */
public class BuilderMethod {

    private String name;
    private Integer maxIdle;
    private Integer minIdle;
    private Integer maxTotal;

    @Override
    public String toString() {
        return "BuilderMethod{" +
                "name='" + name + '\'' +
                ", maxIdle=" + maxIdle +
                ", minIdle=" + minIdle +
                ", maxTotal=" + maxTotal +
                '}';
    }

    private BuilderMethod(Builder builder) {
        this.name = builder.name;
        this.maxIdle = builder.maxIdle;
        this.minIdle = builder.minIdle;
        this.maxTotal = builder.maxTotal;
    }

    public static class Builder {
        private static final Integer DEFAULT_MAX_IDLE = 8;
        private static final Integer DEFAULT_MIN_IDLE = 4;
        private static final Integer DEFAULT_MAX_TOTAL = 15;

        private String name;
        private int maxIdle = DEFAULT_MAX_IDLE;
        private int minIdle = DEFAULT_MIN_IDLE;
        private int maxTotal = DEFAULT_MAX_TOTAL;

        public BuilderMethod build(){
            return new BuilderMethod(this);
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setMaxIdle(Integer maxIdle) {
            if (maxIdle <= 0) {
                throw new IllegalArgumentException("1111");
            }
            this.maxIdle = maxIdle;
            return this;
        }

        public Builder setMinIdle(Integer minIdle) {
            if (minIdle <= 0) {
                throw new IllegalArgumentException("22222");
            }
            this.minIdle = minIdle;
            return this;
        }

        public Builder setMaxTotal(Integer maxTotal) {
            if (maxTotal < (minIdle + maxIdle)) {
                throw new IllegalArgumentException("33333");
            }
            this.maxTotal = maxTotal;
            return this;
        }
    }



    public static void main(String[] args) {
        BuilderMethod method = new BuilderMethod.Builder()
                .setName("1111")
                .setMaxIdle(-1)
                .setMinIdle(4)
                .setMaxTotal(15)
                .build();
        System.out.println(method);
    }
}
