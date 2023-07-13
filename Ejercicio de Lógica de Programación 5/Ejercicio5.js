const numSecreto = 5;
function numeroSecreto(numSecreto) {
    let dato = document.getElementById("dato").value;
    console.log("Dato ingresado:", dato);
    let datoNumero = parseInt(dato); // Se convierte el dato a número
    console.log(typeof datoNumero);

    // Se verifica que sí sea un número y está dentro del rango de 1 a 100
    if (!isNaN(datoNumero) && datoNumero >= 1 && datoNumero <= 100) {
        console.log("Número correcto");

        if (datoNumero === numSecreto) {
            let mensaje = document.getElementById("mensaje");
        mensaje.innerHTML = "Felicidades, adivinaste el número secreto.";
            console.log("Felicidades, adivinaste el número secreto.");
        } else {
            console.log("Ups, el número secreto es incorrecto, vuelve a intentarlo.")
            mensaje.innerHTML = "Ups, el número secreto es incorrecto, vuelve a intentarlo.";
        }

        } else {
            console.log("Por favor ingresa un número válido del 1 al 100");
            alert("Por favor ingresa un número válido del 1 al 100");
        }
    }


    numeroSecreto(numSecreto);
