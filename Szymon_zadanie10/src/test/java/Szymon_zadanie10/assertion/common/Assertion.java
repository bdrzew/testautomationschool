package Szymon_zadanie10.assertion.common;

import Szymon_zadanie10.page.common.Page;

/*
DO NOT MODIFY THIS CLASS
 */
public abstract class Assertion<T extends Page> {
    protected T page;

    public void setPage(T page) {
        this.page = page;
    }

    public T endCheck() {
        return page;
    }
}