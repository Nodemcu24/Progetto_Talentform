/*
let a = 5;  
console.log(a);
if (a > 0) {
    console.log("positivo");
}


let a = 5;
console.log(a);
let b = a;
console.log(b);

 // Esercizi con i costrutti condizionali if/ else
let numero = 5;
if (numero >= 0) {
    console.log("il numero è positivo");
} else {
    console.log("il numero è negativo");
}


let num = 4;
if (num % 2 == 0) {
    console.log("il numero è pari");
} else {
    console.log("il numero è dispari");
}


let age = 20;
if (age >= 18) {
    console.log("L'utente è maggiorenne");
} else {
    console.log("L'utente è minorenne");
}


let n = 15;
if (n % 5 == 0) {
    console.log("il numero è multiplo di 5");
} else {
    console.log("il numero non è multiplo di 5");
}


let char = 'a';
if (char == 'a' || char == 'e' || char == 'i' || char == 'o' || char == 'u') {
    console.log("il carattere è una vocale");
} else {
    console.log("il carattere è una consonante");
}


let number = 35;
if (number >= 10 && number <= 100) {
    console.log("il numero è compreso tra 10 e 100");
} else {
    console.log("il numero non è compreso tra 10 e 100");
}


let voto = 5.5;
if (voto >= 6) {
    console.log("promosso");
} else {
    console.log("bocciato");
}


let x = 10;
let y = 20;
if (x == y) {
    console.log("i numeri sono uguali");
} else {
    console.log("i numeri non sono uguali");
}


let m = 22;
let p = 18;
if (m > p) {
    console.log("m è maggiore di p");
} else {
    console.log("p è maggiore di m");
}


let str = "";
if (str.length == 0) {
    console.log("la stringa è vuota");
} else {
    console.log("la stringa non è vuota");
}

   // Esercizi con i cicli for
for (let i = 1; i <= 10; i++) {
    console.log(i);
}

let somma = 0;
for (let j = 1; j <= 100; j++) {
    somma += j;
}
console.log(somma);

for (let k = 1; k <= 10; k++) {
    console.log(k * 7);
}

for (let z = 2; z <= 20; z += 2) {
    console.log(z);
}

for (let h = 1; h <= 50; h++) {
    if (h % 3 == 0) {
        console.log(h);
    }
}

for (let q = 1; q <= 10; q++) {
    console.log(q * q);
}

let n2 = 5;
let sum = 0;
for (let r = 0; r < n2; r++) {
    sum += 2 * r + 1;
}
console.log(sum);

let base = 2;
let esponente = 5;
let risultato = 1;
for (let t = 0; t < esponente; t++) {
    risultato *= base;
}
console.log(risultato);

for (let num = 2; num <= 100; num++) {
    let primo = true;
    for (let i = 2; i <= num / 2; i++) {
        if (num % i == 0) {
            primo = false;
            break;
        }
    }
    if (primo) {
        console.log(num);
    }
}
    // esercizi con i cicli while
    let sumwhile = 0;
let count = 1;
while (count <= 100) {
    sumwhile += count;
    count++;
}
console.log("La somma dei numeri da 1 a 100 è:", sumwhile);

let number2 = 1;
while (number2 <= 10) {
    console.log(number2);
    number2++;
}

let num8 = 1;
while (num8 <= 20) {
    if (num8 % 2 == 0) {
        console.log(num8);
    }
    num8++;
}

let fattoriale = 1;
let num9 = 5;
let i = 1;
while (i <= num9) {
    fattoriale *= i;
    i++;
}
console.log(fattoriale);

let tabellina = 1;
while (tabellina <= 10) {
    console.log(tabellina * 4);
    tabellina++;
}

let numero = 3456;
let cifre = 0;
while (numero > 0) {
    numero = Math.floor(numero / 10);
    cifre++;
}
console.log("Numero di cifre: " + cifre);

let number = 50;
let sommaCifre = 0;
while (number > 0) {
    sommaCifre += number % 10;
    number = Math.floor(number / 10);
}
console.log(sommaCifre);

let numero2 = 1234;
let numeroInvertito = 0;
while (numero2 > 0) {
    let cifra = numero2 % 10;
    numeroInvertito = numeroInvertito * 10 + cifra;
    numero2 = Math.floor(numero2 / 10);
}
console.log(numeroInvertito);

let n3 = 12;
let count2 = 1;
while (count2 <= n3) {
    if (n3 % count2 == 0) {
        console.log(count2);
    }
    count2++;
}

let nu = 17;
let primo = true;
let j = 2;
while (j <= nu / 2) {
    if (nu % j === 0) {
        primo = false;
        break;
    }
    j++;
}
if (primo) {
    console.log(nu + " è primo.");
} else {
    console.log(nu + " non è primo.");
}

 // Esercizi con do while
 let num10 = 1;
do {
    console.log(num10);
    num10++;
} while (num10 <= 10);

let sum2 = 0;
let count3 = 1;
do {
    sum2 += count3;
    count3++;
} while (count3 <= 100);
console.log(sum2);

let tab = 1;
do {
    console.log(tab * 5);
    tab++;
} while (tab <= 10);

let numero3 = 2;
do {
    console.log(numero3);
    numero3 += 2;
} while (numero3 <= 20);

let numero4 = 12345;
let cifre2 = 0;
do {
    numero4 = Math.floor(numero4 / 10);
    cifre2++;
} while (numero4 > 0);
console.log(cifre2);

 // Esercizi con switch case
 let giorno = 5;
switch (giorno) {
    case 1:
        console.log("lunedì");
        break;
    case 2:
        console.log("martedì");
        break;
    case 3:
        console.log("mercoledì");
        break;
    case 4:
        console.log("giovedì");
        break;
    case 5:
        console.log("venerdì");
        break;
    case 6:
        console.log("sabato");
        break;
    case 7:
        console.log("domenica");
        break;
    default:
        console.log("giorno non valido");
}

let month = 8;
let season;
switch (month) {
    case 12:
    case 1:
    case 2:
        season = "Inverno";
        break;
    case 3:
    case 4:
    case 5:
        season = "Primavera";
        break;
    case 6:
    case 7:
    case 8:
       season = "esate";

 season = "Estate";
        break;
    case 9:
    case 10:
    case 11:
        season = "Autunno";
        break;
    default:
        season = "Mese non valido";
        break;
}

console.log(`Il mese ${month} corrisponde alla stagione: ${season}`);

// Dato un codice prodotto, usa uno switch per mostrare nome e prezzo.

let codiceProdotto = 2;
let nomeProdotto;
let prezzo;

switch (codiceProdotto) {
    case 1:
        nomeProdotto = "Libro";
        prezzo = 16.99;
        break;
    case 2:
        nomeProdotto = "Penna";
        prezzo = 0.99;
        break;
    case 3:
        nomeProdotto = "Quaderno";
        prezzo = 3.50;
        break;
    default:
        nomeProdotto = "Prodotto non trovato";
        prezzo = 0;
        break;
}

console.log(nomeProdotto + " " + prezzo); */

// Scrivi un programma che usa if per verificare l'età, e switch per decidere il tipo di biglietto (es. junior, adulti, senior).

 /* let voto = "C";

switch(voto) {

    case "A":
        console.log("Il voto preso rientra tra 80 e 100");
        break;

    case "B":
        console.log("Il voto preso rientra tra 60 e 80");
        break;

    case "C":
        console.log("Rimandato, il voto è al di sotto dei 60");
        break;

    case "D":
        console.log("Bocciato");
        break;

    default:
        console.log("Test non ancora eseguito");

}

// Usa uno switch per stampare il nome del mese e con if stampa se ha 31 o 30 giorni.
let mese = 4;

switch(mese) {

    case 4: case 6: case 9: case 11:
        console.log("Il mese è di 30 giorni");
        break;

    case 1: case 3: case 5: case 7: case 8: case 10: case 12:
        console.log("Il mese è da 31 giorni");
        break;
    default:
        console.log("Siamo a Febbraio");
}
  //Dato un voto in lettere (A, B, C, ecc.), stampa con switch il valore numerico equivalente.

   let eta = 35;
let biglietto;

if(eta <= 18) {

    biglietto = "junior";

} else if(eta <= 45) {

    biglietto = "adulto";

} else {

    biglietto = "senior";
}

switch(biglietto) {

    case "junior":
        console.log("Biglietto junior: 5,99€");
        break;

    case "adulto":
        console.log("Biglietto per adulti: 10,50€");
        break;

    case "senior":
        console.log("Biglietto per senior: 7,80€");
        break;

    default:
        console.log("Biglietto invalido");
} */

      //Dato un segno zodiacale ("Ariete", "Toro", ecc.), usa switch per stampare il mese corrispondente.

 /*let s = "Toro";

switch (s) {
  case "Acquario":
    console.log("gennaio");
    console.log("febbraio");
    break;

  case "Pesci":
    console.log("febbraio");
    console.log("marzo");
    break;

  case "Ariete":
    console.log("marzo");
    console.log("aprile");
    break;

  case "Toro":
    console.log("aprile");
    console.log("maggio");
    break;

  case "Gemelli":
    console.log("maggio");
    console.log("giugno");
    break;

  case "Cancro":
    console.log("giugno");
    console.log("luglio");
    break;

  case "Leone":
    console.log("luglio");
    console.log("agosto");
    break;

  case "Vergine":
    console.log("agosto");
    console.log("settembre");
    break;

  case "Bilancia":
    console.log("settembre");
    console.log("ottobre");
    break;

  case "Scorpione":
    console.log("ottobre");
    console.log("novembre");
    break;

  case "Saggitario":
    console.log("novembre");
    console.log("dicembre");
    break;

  case "Capricorno":
    console.log("dicembre");
    console.log("gennaio");
    break;

  default:
    console.log("non trovato");
    break;
}
//Crea una simulazione bancomat: con if verifica il PIN, con switch scegli l’operazione.
/*
let saldo = 6000;
let pin = 1234;
let ope = 2;
let cifra;
let ultima_operazione = 2;

if (pin == 1234) {
  switch (ope) {
    case 1:
      console.log("hai scelto prelievo");
      cifra = 50;
      saldo -= cifra;
      ultima_operazione = 1;
      console.log(`saldo: ${saldo}`);
      if (ultima_operazione != 0) {
        if (ultima_operazione == 1) {
          console.log("ultima operazione: prelievo");
        } else {
          console.log("ultima operazione: deposito");
        }
      }
      break;

    case 2:
      console.log("hai scelto deposito");
      cifra = 100;
      saldo += cifra;
      ultima_operazione = 2;
      console.log(`saldo: ${saldo}`);
      if (ultima_operazione != 0) {
        if (ultima_operazione == 1) {
          console.log("ultima operazione: prelievo");
        } else {
          console.log("ultima operazione: deposito");
        }
      }
      break;

    case 3:
      console.log(`saldo: ${saldo}`);
      if (ultima_operazione != 0) {
        if (ultima_operazione == 1) {
          console.log("ultima operazione: prelievo");
        } else {
          console.log("ultima operazione: deposito");
        }
      }

    default:
      break;
  }
} else {
  console.log("pin non valido!"); */

  // Esercizi con stringhe e tipi di dato

  /* let stringa = "abcdef";
    console.log(stringa.length); */

   /* let stringa = "HELLO";
     console.log( stringa.toLowerCase());

     let stringa1 = "ciao";
      console.log( stringa1.toUpperCase()); */

     /* let stringa = "Hello";
      let  stringa1 ="world";
       console.log( stringa.concat(" ", stringa1));

     let str = "Hello, world!";
     str = str.replace("Hello", "Hi");
     console.log(str); */

     // Esercizi con Math

    // Dato un numero intero, stampa il suo valore assoluto.

     /*let numero = 35;
      console.log( Math.abs( numero));

      //Calcola 2 elevato alla 5 utilizzando Math.pow.

       let base = 2;
        let esponente =5;
         console.log( Math.pow(base, esponente));

     // Trova la radice quadrata di 49.
     
       let n =49;
        console.log ( Math.sqrt(n));

      // Arrotonda il numero 3.6. 
      let num = 3.6;
       console.log ( Math.round(num));
       
      // Stampa il maggiore tra 15 e 27.

        let a = 15;
        let b = 27;
        console.log ( Math.max(a,b)); */

       // Stampa il minore tra 23 e 12.
       /* let x =23;
        let y =12;
         console.log (Math.min( x,y));

        // Stampa la differenza assoluta tra 20 e 35.

         let m =20;
          let p = 35;
           console.log( Math.abs(m-p));

        //Stampa il floor e il ceil di 3.7. 
         let a = 3.7;
          console.log( Math.floor(a));
          console.log( Math.ceil(a)); */

       // esercizi con date
       /* let data = new Date();
        console.log( data.getHours());
        console.log( data.getFullYear());
        console.log( data.getDay()); */

        // Data Odierna
//let oggi = new Date();
//console.log("La data odierna e': " + oggi);

// // Set Data 24 Dicembre
// let data = new Date("December 24, 2025 18:30:00");
// console.log("Data: " + data);

// //Aggiungi 7 giorni alla data precedentemente settata
// data.setDate(data.getDate() + 7);
// console.log("La nuova data e': " + data);

 // Array esercizi

 /* let prodotti = [ " matita", "libro", "quaderno" ];
   console.log( prodotti);
   console.log( prodotti[0]);
   console.log( prodotti.length);

   for ( let i =0; i< prodotti.length; i++) {
     console.log(prodotti[i]);
   }
 
 
  let frutta =[ "mela", "banana", "kiwi"];
   frutta.push( " uva", " pera"); // aggiungo un nuovo elemento nell'ultima posizione
    console.log( frutta);

     frutta.pop()
     console.log ( frutta);
     frutta.pop()
     console.log ( frutta); */

      /* let frutta = ["Banane", "Pere", "Susine", "Albicocche"];
       frutta.unshift( "Arancia"); // aggiungo un elemento alla prima posizione
        console.log(colori);
       frutta.splice(3,0," Fragola", "Cocomero"); // aggiungo 2 elementi all'indice 3
       console.log( frutta); */
     
          
       /*let numeri= [ 10,20,30,40,50];
      numeri.forEach( function(item,index) {
        console.log(item +" " + index);
      })
      numeri.splice(2,2);
      console.log( numeri);

      let number = [ 1,1,2,2,3,4];
       let set = new Set(number);
        console.log(set); */

       //Calcola la somma di tutti gli elementi di un array.
       
       /* let n = [ 20,30,40,50];
        let sum = 0;
        for( let i =0; i< n.length; i++){
            sum= sum+n [i];
            
        }
             console.log(sum);

     // Calcola la media aritmetica degli elementi di un array.   
     
    let array = [ 10,20,30,40];
     let somma = 0;
    array.forEach( function (item){
           somma += item;
         })

          let media = somma / array.length;
            console.log(media); */

     //Trova il valore massimo in un array di interi.
     
      /*  let arr = [ 2,3,8,5,10];
         let max = arr[0];
         
           for( let i =1; i< arr.length; i++) {
               if ( arr[i]> max){
                 max = arr[i];

               }
        }
       console.log( "il valore massimo è " +max);

 //Trova il valore minimo in un array di interi.
             
        
// const numeri2 = [10, 20, 30, 40, 50];
// let min = numeri2[0];

// for(let i = 1; i < numeri.length; i++){
//     if(numeri2[i] < min){
//         min = numeri2[i];
//     }
// }

// console.log("Il numero minimo e': " + min); */
                 
 // Conta il numero di elementi pari in un array

 /*let numeri = [ 1,2,3,4,5,6];
  let countPari = 0;

 for(let i = 0; i < numeri.length; i++) {

    if(numeri[i] % 2 == 0) {

        countPari++;
    }
}

console.log("La quantità di numeri pari nell'array é: " + countPari);

// Controlla se un numero dato (es. 10) è presente nell’array 

let number =[ 5,10,15,20];
 let num =10;
  let trovato = false;
 for ( let i=0; i< number.length; i++) {
     if ( number[i] ==10){
        trovato = true;
        break;
     }
    }   
       if (trovato){
         console.log( " il numero è presente nell'array");
       } else{
         console.log (" il numero non è presente nell'array");
       }

   //Conta quanti elementi nell’array sono maggiori di 10.
 let num1 = [5,6,7,8,9,10,11,12,13,14,15];
 let count = 0;
  for(let i = 0; i < num1.length; i++){
    if (num1[i] > 10) {
        count++
    }
}
  console.log("trovati: "+ count); */

 // Copia tutti gli elementi di un array in un secondo array e stampalo.

 /* let array = [ 1,2,3,4,5];
   let copia = [];
    for ( let i= 0; i< array.length; i++) {
         copia [i] = array [i];

    }
      for ( let i=0; i< copia.length; i++){
         console.log( copia[i]);
      }
       
  console.log("Numeri copiati nel secondo array:"); */

  // Dato un array, calcola la differenza tra il valore massimo e minimo.

 /* let array = [10, 20, 30, 40, 50];
 let max = array[0];
 let min = array[0];

for (let i = 1; i < array.length; i++) {
  if (array[i] > max) {
    max = array[i];
  }
  if (array[i] < min) {
    min = array[i];
  }
}

console.log(max - min); // Output: 40



//Scrivi un programma che trova la posizione del numero 9 nell’array.
let arr1 = [1,2,3,4,5,9, 6,7,8,11,10];
let find = 0;
for(let i=0; i < arr1.length; i++){
  if (arr1[i] == 9){
    find = i;
    console.log("Il 9 è nella posizione " + find );
  }  
}      */

   //Calcola la somma dei numeri pari e quella dei numeri dispari separatamente.

  /*  let numeri = [ 10,20,30,11,33,55];
     let sumPari = 0;
      let sumDisp = 0;

      for ( let i = 0; i < numeri.length; i++){
         if ( numeri [i] %2 ==0){
            sumPari += numeri[i]; 
    }  else {
     
    sumDisp += numeri[i]; 
  }
}
   console.log("SOMMA PARI: " + sumPari + " SOMMA DISPARI: " + sumDisp);*/ 
             
       //array bidimensionali
       
     /*let matrice = [
        [" Fabio", 35, "Milano"],
        [" Paolo,", 31, "Roma"],
     ]
        
      for(let j = 0; j < matrice.length; j++) {

      for(let x = 0; x < matrice[j].length; x++) {

        console.log(matrice[j][x]);
    }
}
 // Somma tutti gli elementi di una matrice 3x3.

      let matrice1 = [
        [1,2,3],
        [4,5,6],
        [7,8,9]
      ]
       let somma = 0;
       for ( let i = 0; i < matrice1.length; i++) {
          for ( let j =0; j < matrice1[i].length; j++){
        somma += matrice1[i][j];
     }
 }

 console.log("La somma totale e': " + somma); */

  //Stampa la seconda riga di una matrice 3x3.

    /*let matrice = [
        [1,2,3],
        [4,5,6],
        [7,8,9]
      ];
        for( let i =0; i < matrice.length; i++){
          console.log(matrice[1][i]);
        } */
     //Stampa la terza colonna di una matrice 3x3
     /* let matrice = [
        [1,2,3],
        [4,5,6],
        [7,8,9]
      ];
        for( let i =0; i < matrice.length; i++){
          console.log(matrice[i][2]);
        } */

         // Calcola la somma di ogni riga in una matrice 3x3.

         /*let matrice = [
        [1,2,3],
        [4,5,6],
        [7,8,9]
        ]
          for ( let i=0; i < matrice.length; i++) {
             let somma = 0;
           for ( let j = 0; j < matrice[i].length; j++){
               somma+= matrice[i][j];
           } 
            console.log( somma);
        } */

       // Calcola la somma di ogni colonna in una matrice 3x3.

      /* let matrice = [
        [1,2,3],
        [4,5,6],
        [7,8,9]
        ]
      for (let i = 0; i < matrice[0].length; i++) {
      let somma = 0;
     for (let j = 0; j < matrice.length; j++) {
     somma += matrice[j][i];
       }
      console.log(somma);
     } */

      //Trova il valore massimo in una matrice 3x3 e stampa la sua posizione (riga e colonna)

      //Trova la riga con la somma più alta e stampa l’indice della riga.

  /*let m = [];
  m.push([1,2,3]); //0
  m.push([1,1,1]); //1
  m.push([7,8,9]); //2

  let maxValue = 0;
  let indexRigaValue = 0;
  let indexColonnaValue = 0;

  let rigaSommaMaxIndex = -1;
  let rigaSommaMaxValue = 0;

  m.forEach(function(e, i) {
    let rigaIesimaIndex = i;
    let sommaRigaIesima = 0;
    e.forEach(function(h, j) {
        if (rigaSommaMaxIndex != rigaIesimaIndex) {
            sommaRigaIesima += h;
        }
        if (h > maxValue) {
            maxValue = h;
            indexRigaValue = i;
            indexColonnaValue = j;
        }
    }); // e = riga
    if (rigaSommaMaxValue < sommaRigaIesima) {
        rigaSommaMaxIndex = rigaIesimaIndex;
        rigaSommaMaxValue = sommaRigaIesima;
    }
  }); // h = elemento della riga

  console.log("il valore dell'elemento max è ".concat(maxValue));
  console.log("la riga dell'elemento max è ".concat(indexRigaValue));
  console.log("la colonna dell'elemento max è ".concat(indexColonnaValue));
  console.log("***********************");
  console.log(rigaSommaMaxIndex);
  console.log(rigaSommaMaxValue); */

  // Esercizi con funzioni

    // funzione che restituisca nome e cognome

     /*function anagrafe( nome, cognome){
        
        return nome + "  " +cognome
    }
      console.log( anagrafe( " Marco", "Rossi"));

     //Scrivi una funzione che prende due numeri e ritorna la loro somma.
        
      
       function numeri( a, b){
         return a + b;
       }
          console.log(numeri(4,5));


        // Scrivi una funzione che dato un numero ritorna il suo quadrato. 
        
      
        function num( c){

          return c * c;
        }
           console.log(num(8));


      // Scrivi una funzione che riceve un numero e stampa se è pari o dispari
           
        function number( d){
                
             if ( d %2 ==0){
                 console.log (" il numero è pari");
            } else {
                console.log ( " il numero è dispari");
              }
           }
             number(5); */

 // Scrivi una funzione che prende una stringa e la ritorna in maiuscolo.
  
  /*  function maiuscolo ( stringa ){

      return stringa.toUpperCase ();
}

      console.log(maiuscolo(" ciao mondo")); */

       //Scrivi una funzione che ritorna il primo carattere di una stringa.

       /*  console.log(maiusc("ciao a tutti"));

        function primoCarattere(stringa) { //posso farlo anche con stringa[0];

          return stringa.charAt(0); 
     } */


//Traccia: Scrivi una funzione che somma tutti i numeri in un array.
 /*let v = [2,3,4];

function getSommaArray(u) {
    let s = 0;
    for (let i=0; i<u.length; i++) {
        s += u[i];
    }
    return s;
}

console.log(getSommaArray(v));
                  
   //funzione maiuscolo
function getMaiuscolo(parola) {
    return parola.toUpperCase();
}

function getPrimoCarattere(parola) {
    return parola[0];
}

//Traccia: Scrivi una funzione che ritorna l’ultimo carattere di una stringa.
function getUltimoCarattere(stringa) {
    return stringa[stringa.length - 1];
}

console.log(getUltimoCarattere("ciao")); */        

 //Scrivi una funzione che ritorna il numero di elementi in un array.

   /* function  lunghezzaArray( array){

      return array.length;
    }
       console.log(lunghezzaArray([1,2,3,4]));

     //Scrivi una funzione che somma tutti i numeri in un array.  

       function sommaArray( arr){
            let somma = 0;
       for( let num of arr) {
           somma +=num;
       }
         return somma;
    
     }
       console.log(sommaArray([1, 2, 3, 4, 5, 6, 7, 8, 9])); */
   
      // Scrivi una funzione che ritorna il maggiore tra due numeri.
      /* function maggiore( a,b){
         if ( a > b) {
             return a;
         } else  {
           return b;
         }
       }
           console.log( maggiore( 5, 7));

          
  // Scrivi una funzione che ritorna la stringa al contrario.
   function invertiStringa(str){
    return str.split("").reverse().join();
   }

console.log(invertiStringa("Nicola Narducci")); */
    
   // Scrivi una funzione che calcola il fattoriale di un numero.   
   
  /*  function getFattoriale ( numero) {
         let f= numero
       for (let i=1; i < numero; i++){
         f *=i;
       }
          return f;
    }   
          console.log( getFattoriale( 5));

    
//Traccia: Scrivi una funzione che conta quante vocali ci sono in una stringa.
function getNumeroVocali(stringa) {
    let n = 0;
    for(let c of stringa) {
        switch (c) {
            case 'a': case 'e': case 'i': case 'o': case 'u':
                n++;
                break;
            default:
                break;
        }
    }
    return n;
}
    console.log(getNumeroVocali("prova")); */

   //Traccia: Scrivi una funzione che controlla se un numero è primo.
//un numero è primo quando è divisibile solo per se stesso e per 1
  /*function getCheckPrimo(numero) {
    let check = true;
    for (let i=2; i<numero; i++) {
        if (numero % i == 0) { 
            check = false;
            break;
        }
    }
    return check;
} 
     console.log(getCheckPrimo(7) ? "primo" : "non primo"); */

     // Scrivi una funzione che stampa la tabellina di un numero fino a 10
     
      /*function tabellina() {
         
         for( let i = 1;  i<=10; i++){

              console.log( 10 *i);
         }
     }
          tabellina()

     // Scrivi una funzione che controlla se un valore è presente in un array
     
       function check( arr, value) {
         return arr.includes( value)
       }
         console.log(check([1,2,3,4,5],2)); */


       // Esercizi con oggetti   
       
       
       /*let astuccio = {
       
        matite: 2,
        gommaPerCancellare: 1,
        temperino:1,
        colore: "nero",
        penna: 2,
         lista : function(){

             console.log (this.matita + this.gommaPerCancellare + this.temperino +
             this.colore + this.penna);

         }

        }
           
        astuccio.evidenziatore = "giallo";
        console.log(astuccio.evidenziatore);
           astuccio.lista();

          console.log("");

           console.log(astuccio);
           */

        /* let cellulare = {

          schedaSim: 1,
          batteria: 1,
          memoryCard:1,
          fotocamera: 3,
           cuffie: 1,

           accessori : function(){

           return  this.batteria + this.cuffie + this.schedaSim + this.memoryCard +this.fotocamera
            }
          } 
             console.log( cellulare);*/

    // Gestione delle eccezioni

    // Esempio Eccezione
  /* function dividi(a, b){
    try{
        if(b === 0){
            console.log("Divisione per 0 non consentita");
        }
        return a / b;
    } catch(error) {
        return "Errore " + error;
    }
}

console.log(dividi(2,0)); */
  
  /*let array = [10,20,30,40,50];

   try {
      
       console.log(arr[6]);
    
   } catch (error) {
      console.log(errore)
   } finally  {
    console.log("Esecuzione completata."); // Questo viene eseguito sempre
}
           

  // nullpointer exception */
  
  // let stringa = "prova";
   //let stringa = null;
   //let stringa = undefined

   /* try {
    if(! stringa && stringa.length > 0) {
       throw new Error (" nullpointer exception");

    }
       console.log(stringa);
   } catch (error) {   console.log(error);
} finally {
    console.log("eccezione gestita");
} */
    
 
      
    
       