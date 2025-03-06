package pages;

public class principal extends basePage {

    public principal() {
        super(driver);
    }

    // Método para navegar a página web

    public void navigateToAmazon() {
        navigateTo("https://www.amazon.com");
    }
}
