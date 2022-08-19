/* Rangos de edades  0 a 5 años -> Niño pequeño
                      6 a 12 años -> Niño grande
                      13 a 17 -> adolescente
                      18 a 65 -> Es un adulto
                      66 a 100-> Es un adulto mayor*/ 


let edad;
edad=parseInt(prompt("Digite la edad "));
if(edad>=0 && edad<=100){
    
    if(edad<=5){
    alert("Es un niño peqeño");
    }
    else if(edad<=12){
        alert("Es uh niño grande");
    }
    else if(edad<=17){
        alert("Ed un adolescente");
    }
    else if(edad<=65){
        alert("Es un adulto");
    }
    else if(edad<=100){
        alert("Es una adulto mayo");
    }

}
else{
    alert("Recuerde el rango de edadades debe estar entre 0 y100")
}
