package com.test.practicamarket.domain;

public class Category {

        private int categoryId;
        private String category;
        private boolean Active;

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public boolean isEnable() {
        return Active;
    }

    public void setEnable(boolean enable) {
        this.Active = enable;
    }
}
