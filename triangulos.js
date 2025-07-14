let a = parseFloat(prompt("Primeira reta"));
let b = parseFloat(prompt("Segunda reta"));
let c = parseFloat(prompt("Terceira reta"));

if (a < b + c && b < a + c && c < a + b) {
    alert("As retas podem formar um triangulo!");
    if (a == b && b == c) {
        alert("Equilátero!");
    } else if ((a == b && b != c) || (a != b && b == c) || (a == c && c != b)) {
        alert("Isosceles");
    } else {
        alert("Escaleno!");
    }
} else {
    alert("As retas não podem formar um triangulo!");
}
