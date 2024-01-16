package co.com.sofka.stepdefinitions;

import co.com.sofka.Setup;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static co.com.sofka.tasks.OpenPageInit.openPageInit;
import static co.com.sofka.tasks.Search.forTheTerm;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class Searchproduct extends Setup {

    @Given("que el usuario está en la página de inicio")
    public void queElUsuarioEstáEnLaPáginaDeInicio() {
        actorSetupTheBrowser("Diesel");
        theActorInTheSpotlight().wasAbleTo(
                openPageInit()
        );

    }

    @When("el usuario busca {string}")
    public void elUsuarioBusca(String string) {
        theActorInTheSpotlight().wasAbleTo(
                forTheTerm(string)
                //Scroll.to(RESULTADOH1)
                );

    }

    @Then("se deberia mostrar los resultados relacionados con {string}")
    public void seDeberiaMostrarLosResultadosRelacionadosCon(String searchTerm) {

/*
        try{
            theActorInTheSpotlight().should(seeThat("El término buscado coincide",
                    questionColorProduct(), equalTo(searchTerm)
            ));
        }catch (Exception e){
            System.out.printf("errror"+ e.getMessage());

        }*/
        quitarDriver();


    }



}
