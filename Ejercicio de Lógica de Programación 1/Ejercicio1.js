
var str1 = prompt("Ingresa un número entero");
var str2 = prompt("Ingresa otro número entero");
var str3 = prompt("Ingresa un último número entero");
var num1 = parseInt(str1);
var num2 = parseInt(str2);
var num3 = parseInt(str3);

function numerosMayorAMenor(num1, num2, num3) {
    let parrafo = document.getElementById("numeros");
    console.log(typeof (num2));
    // Corregir el nombre del segundo parámetro en la condición
    if (isNaN(num1) || isNaN(num2) || isNaN(num3)) {
        console.log("Un dato no es un número. Por favor ingresa sólo números");
        parrafo.innerHTML = "Un dato no es un número. Por favor ingresa sólo números";
    } else {
        console.log("Números ingresados: " + num1 + ", " + num2 + ", " + num3);
        parrafo.innerHTML = "Números ingresados: " + num1 + ", " + num2 + ", " + num3;

        if (num1 === num2 && num2 === num3) {
            let igual = document.getElementById("iguales");
            console.log("Los números son iguales.");
            igual.innerHTML = "Los números son iguales.";
        } else {
            var mayor, medio, menor;

            if (num1 >= num2 && num1 >= num3) {
                mayor = num1;
                if (num2 >= num3) {
                    medio = num2;
                    menor = num3;
                } else {
                    medio = num3;
                    menor = num2;
                }
            } else if (num2 >= num1 && num2 >= num3) {
                mayor = num2;
                if (num1 >= num3) {
                    medio = num1;
                    menor = num3;
                } else {
                    medio = num3;
                    menor = num1;
                }
            } else {
                mayor = num3;
                if (num1 >= num2) {
                    medio = num1;
                    menor = num2;
                } else {
                    medio = num2;
                    menor = num1;
                }
            }

            console.log("Ordenados de mayor a menor: " + mayor + ", " + medio + ", " + menor);
            console.log("Ordenados de menor a mayor: " + menor + ", " + medio + ", " + mayor);
            let mayoramenor = document.getElementById("mayoramenor");
            let menoramayor = document.getElementById("menoramayor");
            mayoramenor.innerHTML = "Ordenados de mayor a menor: " + mayor + ", " + medio + ", " + menor;
            menoramayor.innerHTML = "Ordenados de menor a mayor: " + menor + ", " + medio + ", " + mayor;
        }
    }


}




numerosMayorAMenor(str1, str2, str3);






