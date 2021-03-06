package cloud.autotests.tests;

import cloud.autotests.helpers.DriverUtils;
import io.qameta.allure.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.title;
import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.Assertions.assertThat;


public class GeneratedTests extends TestBase {
    @Test
    @Description("Soon to be implemented by you (or QA.GURU engineers)")
    @DisplayName("Отправка заявки")
    void generatedTest() {
        step("Открыть \"https://resheno56.me/servisy-kompanii/shinomontazh\"", () -> {
            step("// todo: just add selenium action");
        });

        step("Ввести имя \"Тест\"", () -> {
            step("// todo: just add selenium action");
        });

        step("Ввести номер телефона \"9785642323\"", () -> {
            step("// todo: just add selenium action");
        });

        step("Ввести ИНН \"500100732259\"", () -> {
            step("// todo: just add selenium action");
        });

        step("Ввести почту \"test@test.ru\"", () -> {
            step("// todo: just add selenium action");
        });

        step("Нажать кнопку \"Оставить заявку\"", () -> {
            step("// todo: just add selenium action");
        });
    }

    @Test
    @Description("Autogenerated test")
    @DisplayName("Page title should have header text")
    void titleTest() {
        step("Open url 'https://resheno56.me/servisy-kompanii/shinomontazh'", () ->
            open("https://resheno56.me/servisy-kompanii/shinomontazh"));

        step("Page title should have text 'Оплата шиномонтажа'", () -> {
            String expectedTitle = "Оплата шиномонтажа";
            String actualTitle = title();

            assertThat(actualTitle).isEqualTo(expectedTitle);
        });
    }

    @Test
    @Description("Autogenerated test")
    @DisplayName("Page console log should not have errors")
    void consoleShouldNotHaveErrorsTest() {
        step("Open url 'https://resheno56.me/servisy-kompanii/shinomontazh'", () ->
            open("https://resheno56.me/servisy-kompanii/shinomontazh"));

        step("Console logs should not contain text 'SEVERE'", () -> {
            String consoleLogs = DriverUtils.getConsoleLogs();
            String errorText = "SEVERE";

            assertThat(consoleLogs).doesNotContain(errorText);
        });
    }
}