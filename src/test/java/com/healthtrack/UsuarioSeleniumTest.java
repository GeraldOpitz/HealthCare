package com.healthtrack;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UsuarioSeleniumTest {

    private WebDriver driver;

    @BeforeEach
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @Test
    public void testActualizarPeso() {
        driver.get("http://localhost:8080");

        WebElement inputPeso = driver.findElement(By.id("nuevoPeso"));
        inputPeso.clear();
        inputPeso.sendKeys("75");

        WebElement boton = driver.findElement(By.tagName("button"));
        boton.click();

        WebElement mensaje = driver.findElement(By.tagName("p"));

        assertTrue(mensaje.getText().contains("75.0"), "El peso no se actualizó correctamente, se esperaba 75.0");
    }
}
