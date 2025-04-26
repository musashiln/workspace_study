package atguigu04.compare;

/**
 * ClassName: Product
 * Package: atguigu04.compare.comparable
 * Description:
 *
 * @Author gxy
 * @Create 2025/4/25 20:50
 * @Version 1.0
 */
public class Product implements Comparable{
    private String name;
    private int price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    /**
     * 当前的类需要实现Comparable中的抽象方法:compareTo(0bject o)
     * 在此方法中,指明如何判断当前类的对象的大小。比如:按照价格的高低进行大小的比较。(或从低到高排序)
     *
     * 如果返回值是正数:当前对象大。
     * 如果返回值是负数:当前对象小。
     * 如果返回值是0,一样大。
     * @param o the object to be compared.
     * @return
     */
    @Override
    public int compareTo(Object o) {
        if (o == this){
            return 0;
        }

        if(o instanceof Product){
            Product p = (Product) o;
            int value = Double.compare(this.price, p.price);
            if (value != 0){
                //return value;
                //价格从大到小
                return -value;
            }
            return this.name.compareTo(p.name);
        }

        throw new RuntimeException("类型不匹配");

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
