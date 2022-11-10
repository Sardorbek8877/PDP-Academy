package lesson7.homework.vazifa_7_7;

public class Foo extends Bar implements Fizz{

    private String order;
    private String menu;
    private int money;

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    public String getMenu() {
        return menu;
    }

    public void setMenu(String menu) {
        this.menu = menu;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    @Override
    public String getCoolDrink() {
        return super.getCoolDrink();
    }

    @Override
    public void setCoolDrink(String coolDrink) {
        super.setCoolDrink(coolDrink);
    }

    @Override
    public String getHotDrink() {
        return super.getHotDrink();
    }

    @Override
    public void setHotDrink(String hotDrink) {
        super.setHotDrink(hotDrink);
    }

    @Override
    public String getCocktails() {
        return super.getCocktails();
    }

    @Override
    public void setCocktails(String cocktails) {
        super.setCocktails(cocktails);
    }

    @Override
    public void drink() {

    }
}
