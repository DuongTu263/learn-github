
package entity;

import java.util.List;


public class Pagination<T> {
     /**
     * Total item of result
     */
    private int totalItem;
    /**
     * Item per will show on page
     */
    private int itemPerPage;
    /**
     * Total page of result calculator by function (totalItem/itemPerPage)
     */
    private int totalPage;
    /**
     * The page number was displayed
     */
    private int currentPage;
    /**
     * Items will show on page
     */
    private List<T> data;

    /**
     * Initial function
     */
    public Pagination() {
    }

    /**
     * Get value of totalItem attribute in <code>Pagination</code> object
     *
     * @return Total item of result
     */
    public int getTotalItem() {
        return totalItem;
    }

    /**
     * Set value of totalItem attribute in <code>Pagination</code> object
     *
     * @param totalItem Total item of result
     */
    public void setTotalItem(int totalItem) {
        this.totalItem = totalItem;
        this.totalPage = (int) Math.ceil((float) totalItem / (float) this.itemPerPage);
    }

    /**
     * Get value of totalPage attribute in <code>Pagination</code> object
     *
     * @return Total page of result
     */
    public int getTotalPage() {
        return totalPage;
    }

    /**
     * Set value of totalPage attribute in <code>Pagination</code> object
     *
     * @param totalPage Total page of result
     */
    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    /**
     * Get value of currentPage attribute in <code>Pagination</code> object
     *
     * @return The current page number
     */
    public int getCurrentPage() {
        return currentPage;
    }

    /**
     * Set value of currentPage attribute in <code>Pagination</code> object
     *
     * @param currentPage The current page number
     */
    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    /**
     * Get value of itemPerPage attribute in <code>Pagination</code> object
     *
     * @return Item per page
     */
    public int getItemPerPage() {
        return itemPerPage;
    }

    /**
     * Set value of itemPerPage attribute in <code>Pagination</code> object
     *
     * @param itemPerPage Item per page
     */
    public void setItemPerPage(int itemPerPage) {
        this.itemPerPage = itemPerPage;
    }

    /**
     * Get value of data attribute in <code>Pagination</code> object
     *
     * @return Item show on the current page
     */
    public List<T> getData() {
        return data;
    }

    /**
     * Set value of data attribute in <code>Pagination</code> object
     *
     * @param data Item show on the curent page
     */
    public void setData(List<T> data) {
        this.data = data;
    }

    /**
     * Convert to readable string
     *
     * @return Readable string
     */
    @Override
    public String toString() {
        return "Pagination{" + "totalItem=" + totalItem + ", totalPage=" + totalPage + ", currentPage=" + currentPage + ", itemPerPage=" + itemPerPage + ", data=" + data + '}';
    }
}
