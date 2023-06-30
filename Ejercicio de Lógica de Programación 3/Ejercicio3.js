var str1 = prompt("Ingresa un número entero");
var num1 = parseInt(str1);

function factorial(num1) {
    let factorial = document.getElementById("factorial");
    numeros = [];
    if (isNaN(num1)) {
        console.log("Por favor ingresa un número entero");
        factorial.innerHTML = "Por favor ingresa un número entero";
    } else if (num1 < 0) {
        console.log("El factorial no está definido para números negativos");
    } else {
        let resultado = 1;
        for (let i = 2; i <= num1; i++) {
            resultado *= i;
        }
        console.log("El factorial de " + num1 + " es " + resultado);
        factorial.innerHTML = "El factorial de " + num1 + " es " + resultado;
    }

}

factorial(num1);