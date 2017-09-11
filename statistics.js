// Formulas basicas
// NAO FUNCIONA COM INTERVALOS.
// Media
function media(arr) {
	var sum = 0;
	for(var i = 0; i < arr.length; i++) {
		sum += arr[i];
	}
	sum = sum / arr.length;
	console.log("A media eh => " + sum);
	return sum;
	
}
// media([18, 19, 20, 21, 21, 22, 24, 24, 25, 27, 30, 33]);

// Variancia 
function variancia(arr) {
	
	var m = media(arr);
	var v = 0;

	for(var i = 0; i < arr.length; i++) {
		v += Math.pow((arr[i] - m), 2);
		// console.log(arr[i] - m);
	}
	v = v / (arr.length - 1);
	console.log("A variancia eh => " + v);
	return v;
}

variancia([18, 19, 20, 21, 21, 22, 24, 24, 25, 27, 30, 33]);


// Desvio padrao

function desvio(variancia) {
	return Math.sqrt(variancia);
}