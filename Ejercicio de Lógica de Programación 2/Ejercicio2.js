var temperaturaCelsiusStr = prompt("Ingresa una temperatura en grados Celsius");
var temperaturaCelsiusNum = parseFloat(temperaturaCelsiusStr);
console.log(typeof(temperaturaCelsiusNum));

function conversionFahrenheit (temperaturaCelsiusNum){
    let resultado = document.getElementById("resultado");
    if (isNaN(temperaturaCelsiusNum)){
        console.log("Por favor ingresa un valor numérico");
        resultado.innerHTML = "Por favor ingresa un valor numérico";
    } else {
        console.log("Temperatura ingresada: " + temperaturaCelsiusNum + "°C");
        resultado.innerHTML = "Temperatura ingresada: " + temperaturaCelsiusNum + "°C";

        temperaturaFahrenheit = temperaturaCelsiusNum*9/5 + 32;
        temperaturaKelvin = temperaturaCelsiusNum + 273.15;

        let fahrenheit = document.getElementById("fahrenheit");
        let kelvin = document.getElementById("kelvin");
        console.log("Su conversión a Fahrenheit es: " + temperaturaFahrenheit + "°F");
        fahrenheit.innerHTML = "Su conversión a Fahrenheit es: " + temperaturaFahrenheit + "°F";
        console.log("Su conversión a Kelvin es: " + temperaturaKelvin + "K");
        kelvin.innerHTML = "Su conversión a Kelvin es: " + temperaturaKelvin + "K";
    }
}

conversionFahrenheit(temperaturaCelsiusNum);