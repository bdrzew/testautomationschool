package zadanie10.assertion.common;

import zadanie10.page.common.Page;

public abstract class Assertion<T extends Page> {
    protected T page;

    public void setPage(T page){
        this.page = page;
    }

    public T endCheck(){ return page;}
}
