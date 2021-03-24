function exibeNumeros(){
    let result = []

    for (let i = 200; i < 500; i++) {
        if(i % 2 === 0 && i % 8 !== 0){
            result.push(i);
        }
    }

    document.getElementById("retorno").innerHTML = ""
    for (const num of result) {
        let p = document.createElement("p")
        p.innerHTML = ` ${num} `
        document.getElementById("retorno").appendChild(p)
    }

    return false;
}