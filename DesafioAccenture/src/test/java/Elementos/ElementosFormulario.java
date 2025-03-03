package Elementos;

import org.openqa.selenium.By;

public class ElementosFormulario {

	private By opcaoForms = By.cssSelector("#app > div > div > div.home-body > div > div:nth-child(2)");
	private By PracticeForm = By.cssSelector(":nth-child(2) > .element-list > .menu-list > #item-0");
	private By campoFirstName = By.id("firstName");
	private By campoLastName = By.id("lastName");
	private By campoUserEmail = By.id("userEmail");
	private By opcaoGen = By.cssSelector("#genterWrapper > .col-md-9 > :nth-child(1) > .custom-control-label");
	private By campoUserNumber = By.id("userNumber");
	private By campoDateOfBirthInput = By.id("dateOfBirthInput");
	private By selecaoMes = By.cssSelector(".react-datepicker__month-select");
	private By selecaoAno = By.cssSelector(".react-datepicker__year-select");
	private By selecaoDia = By.cssSelector(".react-datepicker__day.react-datepicker__day--024");
	private By campoSubjects = By.cssSelector(".subjects-auto-complete__value-container");
	private By english = By.cssSelector("#subjectsContainer > div");
	private By opcaoSports = By.cssSelector("#hobbiesWrapper > div.col-md-9.col-sm-12 > div:nth-child(1) > label");
	private By campoUploadPicture = By
			.cssSelector("#userForm > div:nth-child(8) > div.col-md-9.col-sm-12 > div > label");
	private By campoCurrentAddress = By.id("currentAddress");
	private By selecaoEstado = By.cssSelector("#stateCity-wrapper > :nth-child(2)");
	private By selecaoCidade = By.cssSelector("#stateCity-wrapper > :nth-child(3)");
	private By botaoSubmit = By.id("submit");
	private By botaoFecharPopup = By.id("closeLargeModal");

	public By getOpcaoForms() {
		return opcaoForms;
	}

	public By getPracticeForm() {
		return PracticeForm;
	}

	public By getCampoFirstName() {
		return campoFirstName;
	}

	public By getCampoLastName() {
		return campoLastName;
	}

	public By getCampoUserEmail() {
		return campoUserEmail;
	}

	public By getOpcaoGen() {
		return opcaoGen;
	}

	public By getCampoUserNumber() {
		return campoUserNumber;
	}

	public By getCampoDateOfBirthInput() {
		return campoDateOfBirthInput;
	}

	public By getSelecaoMes() {
		return selecaoMes;
	}

	public By getSelecaoAno() {
		return selecaoAno;
	}

	public By getSelecaoDia() {
		return selecaoDia;
	}

	public By getCampoSubjects() {
		return campoSubjects;
	}

	public By getOpcaoSports() {
		return opcaoSports;
	}

	public By getCampoUploadPicture() {
		return campoUploadPicture;
	}

	public By getCampoCurrentAddress() {
		return campoCurrentAddress;
	}

	public By getSelecaoEstado() {
		return selecaoEstado;
	}

	public By getSelecaoCidade() {
		return selecaoCidade;
	}

	public By getBotaoSubmit() {
		return botaoSubmit;
	}

	public By getBotaoFecharPopup() {
		return botaoFecharPopup;
	}

	public By getEnglish() {
		return english;
	}
}
