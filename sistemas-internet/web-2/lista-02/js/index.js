let formulario = document.querySelector("form");

let dateNow = new Date();

const day = `${dateNow.getDate()}`.padStart(2, 0);
const month = `${dateNow.getMonth() + 1}`.padStart(2, 0);
const year = `${dateNow.getFullYear()}`.padStart(2, 0);

formulario.onsubmit = () => {
  let initalInvalidInput = "Os seguintes campos precisam de atenção :";
  let invalidInput = initalInvalidInput;

  if (
    new Date(formulario.deliveryDate.value) <
      new Date(`${year}-${month}-${day}`) ||
    formulario.deliveryDate.value == ""
  ) {
    invalidInput += "\n - Data de Entrega";
    formulario.deliveryDate.classList.add("border", "border-danger");
  } else {
    formulario.deliveryDate.classList.remove("border", "border-danger");
  }

  if (formulario.discipline.value == "Escolha um disciplina...") {
    invalidInput += "\n - Disciplina";
    formulario.discipline.classList.add("border", "border-danger");
  } else {
    formulario.discipline.classList.remove("border", "border-danger");
  }

  if (formulario.homework.value.length < 5) {
    invalidInput += "\n - Título da tarefa";
    formulario.homework.classList.add("border", "border-danger");
  } else {
    formulario.homework.classList.remove("border", "border-danger");
  }

  try {
    new URL(formulario.urlHomework.value);
    formulario.urlHomework.classList.remove("border", "border-danger");
  } catch (_) {
    invalidInput += "\n - Link da tarefa";
    formulario.urlHomework.classList.add("border", "border-danger");
  }

  let difficultyRadios = document.querySelectorAll(".form-check-input");
  if (formulario.difficulty.value === "") {
    invalidInput += "\n - Nível de dificuldade da tarefa";
    difficultyRadios[0].classList.add("border", "border-danger");
    difficultyRadios[1].classList.add("border", "border-danger");
    difficultyRadios[2].classList.add("border", "border-danger");
  } else {
    difficultyRadios[0].classList.remove("border", "border-danger");
    difficultyRadios[1].classList.remove("border", "border-danger");
    difficultyRadios[2].classList.remove("border", "border-danger");
  }

  if (invalidInput !== initalInvalidInput) {
    alert(invalidInput);
  } else {
    let linha = document.createElement("tr");
    let dataEntrega = document.createElement("td");
    let tarefa = document.createElement("td");
    let disciplina = document.createElement("td");
    let dificuldade = document.createElement("td");
    let link = document.createElement("td");


    let deliveryDate = (formulario.deliveryDate.value).split("-")
    dataEntrega.innerHTML = `${deliveryDate[2]}/${deliveryDate[1]}/${deliveryDate[0]}`
    linha.appendChild(dataEntrega)

    tarefa.innerHTML = formulario.homework.value
    linha.appendChild(tarefa)

    disciplina.innerHTML = formulario.discipline.value
    linha.appendChild(disciplina)

    let span = document.createElement("span")
    span.classList.add("badge")

    if(formulario.difficulty.value === "baixa"){
      span.classList.add("bg-primary")
      span.innerHTML = "baixa"
    }else if(formulario.difficulty.value === "media"){
      span.classList.add("bg-warning", "text-dark")
      span.innerHTML = "média"
    }else{
      span.classList.add("bg-danger")
      span.innerHTML = "alta"
    }

    dificuldade.append(span)
    linha.appendChild(dificuldade)

    let button = document.createElement("button")
    button.addEventListener("click", () => {
      window.open(formulario.urlHomework.value, "_blank");
    })
    button.classList.add("btn", "btn-link")
    button.innerHTML = "Acessar"


    link.appendChild(button)
    linha.appendChild(link)

    document.querySelector("#tarefas").appendChild(linha)
  }

  return false;
};
