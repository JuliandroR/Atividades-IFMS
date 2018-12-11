import { Component } from '@angular/core';
import { NavController } from 'ionic-angular';

@Component({
  selector: 'page-home',
  templateUrl: 'home.html'
})
export class HomePage {

  constructor(public navCtrl: NavController) {

  }

  consumo = 0.0;
  tempo = 0.0;
  tarifa = 0.0;
  total = 0.0;
  status = true;

  definirTarifa(valor: any) {

    if (valor == 0.54500) {
      this.removeClassInvisible("residencial")
      this.adcionaClassInvisible("rural");
      this.adcionaClassInvisible("industrial")
      this.zeraTudo()
      this.tarifa = parseFloat(valor)

    } else if (valor == 0.38151) {
      this.removeClassInvisible("rural");
      this.adcionaClassInvisible("residencial")
      this.adcionaClassInvisible("industrial")
      this.zeraTudo()
      this.tarifa = parseFloat(valor)
    } else if (valor == 0.54501) {
      this.removeClassInvisible("industrial")
      this.adcionaClassInvisible("rural")
      this.adcionaClassInvisible("residencial")
      this.zeraTudo()
      this.tarifa = parseFloat(valor);
    } else { }
    console.log(`Tarifa: ${this.tarifa}`);
    // let teste = document.getElementsByTagName('select').options[document.getElementsByTagName('option').selectedIndex].innerHTML
    // console.log(teste);



  }

  definirConsumo(valor: any) {
    if (valor == "000") {
      this.removeClassInvisible('consumo_insert');
    } else {
      this.consumo = parseFloat(valor);
      console.log(`Consumo: ${this.consumo}`);

      this.adcionaClassInvisible('consumo_insert')
    }
  }

  setValorTempo(valor: any) {
    this.tempo = parseFloat(valor.value);
    console.log(`Tempo ${valor.value}`);

  }

  setValorConsumoOutro(valor: any) {
    this.consumo = valor.value
    console.log(`Consumo Através do Outro ${this.consumo}`);

  }

  definirValor() {
    let custo = this.tarifa * (this.consumo * this.tempo)
    this.total += custo
    this.devolveForHtml(this.consumo, this.tempo, custo)
    this.altera_total(this.total);
    console.log(this.total);

  }

  devolveForHtml(consumo: any, tempo: any, custo: any) {
    var pNova = document.createElement('li');
    var addc = document.createTextNode(`O consumo do produto em KhW é: ${consumo}. Foi utilizado por: ${tempo} horas. O custo foi: R$ ${custo}`);
    pNova.appendChild(addc);
    var div = document.getElementById('inserido')
    div.appendChild(pNova)
  }

  altera_total(valor) {
    let valor_fixed = valor.toFixed(2)
    var x = document.getElementById('total').innerHTML = `${valor_fixed}`
    console.log(x);
  }

  removeClassInvisible(elemento) {
    var element = document.getElementById(elemento);
    element.classList.remove("invisible");
  }

  adcionaClassInvisible(elemento) {
    var element = document.getElementById(elemento);
    element.classList.add("invisible");
  }

  remover_todos(elemento) {
    var element = document.getElementById(elemento);
    while (element.firstChild) {
      element.removeChild(element.firstChild);
    }
  }

  zeraTudo() {
    this.consumo = 0;
    this.tempo = 0;
    this.tarifa = 0;
    this.altera_total(0.00);
    this.remover_todos('inserido')
  }
}
