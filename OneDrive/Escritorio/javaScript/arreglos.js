/*let arreglo=["pepe","luis","Lucas"]
console.log(arreglo)*/

let arreglo=[];
for(let i=0; i<10; i++){
    numero=prompt("Digite un número");
    arreglo.push(numero);
}
datoabuscar=prompt("Digite el núemro a buscar");
x=0;
for(let i=0;i<10;i++){
  
        
   if(arreglo[i]==datoabuscar){
    x=1;
    document.write("Dato encontrado");
   }
  

}

if(x!=1){
    document.write("Dato no encontrado")
    
   }