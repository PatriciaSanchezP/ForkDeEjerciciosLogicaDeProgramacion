let str1 = prompt("Ingresa un número entero");
var num1 = parseFloat(str1);


function fibonacci(num1) {
    let array = [0, 1]; // Inicializar el array con los primeros dos números de Fibonacci: 0 y 1

    for (let i = 2; i < num1; i++) {
        let resultado = array[i - 1] + array[i - 2]; // Calcular el siguiente número de Fibonacci sumando los dos anteriores
        array.push(resultado);
    }

    console.log(array);
    let serie = document.getElementById("serie");
    serie.innerHTML = "Serie de Fibonacci de " + num1 + " elementos: " + array;
}

fibonacci(num1);
