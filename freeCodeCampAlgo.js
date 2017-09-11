//Reverse the provided string
//You may need to turn the string into an array before you can reverse it
//Your result must be a string.

function reverseString(str) {
	var newStr = str.split("");
	newStr.reverse();
	var joinedStr = newStr.join("");
	return joinedStr;
}
reverseString("Greetings from Earth");

// ---------------------------------------------------------

// Return the factorial of the provided integer

function factorialize(num) {
	var factorial = 1;

	for (var i = num; i > 0; i--) {
		factorial *= i;
	}
	return factorial;
}

factorialize(0);

// -----------------------------------------------------------

// Return True if palindrome, else return false
// /[\W_]/g ANY NON NUMBER AND _
function palindrome(str) {

	var newStr = str.split("");
	newStr.reverse();
	var joinedStr = newStr.join("");
	if (joinedStr.replace(/[\W_]/g, "").toLowerCase() == str.replace(/[\W_]/g, "").toLowerCase()) {
		return true;
	}
	return false;
}
palindrome("");

// ------------------------------------------------------------

// FIND THE LONGEST WORD IN THE PROVIDED SENTENCE

function findLongestWord(str) {

	var words = str.split(" ");
	var count = 0;
	for (var i = 0; i < words.length; i++) {
		if (words[i].length > count) {
			count = words[i].length;
			// console.log(count);
		}
	}
	// console.log("Biggest word is => " + count);
	return count;
}
findLongestWord("What if we try a super-long word such as otorhinolaryngology");

// -----------------------------------------------------------

// CAPITALIZE THE FIRST LETTER OF EVERY WORD

function titleCase(str) {

	var lowerStr = str.toLowerCase(); // Bring all to Lower case
	var arr = lowerStr.split(" "); // Split the string
	var newStr = "";
	for (var i = 0; i < arr.length; i++) {
		// console.log(arr[i][0].toUpperCase() + arr[i].substring(1));
		newStr += (arr[i][0].toUpperCase() + arr[i].substring(1) + " ");
	}
	// console.log(newStr.replace(/[ ]$/m, ""));
	return newStr.trim();
}

titleCase("HERE IS MY HANDLE HERE IS MY SPOUT");

// ---------------------------------------------------------------
// Return an array consisting of the largest number from each provided sub-array.
// For simplicity, the provided array will contain exactly 4 sub-arrays.

// Remember, you can iterate through an array with a simple for loop,
// and access each member with array syntax arr[i].

function largestOfFour(arr) {

	var newArr = [];
	var num = 0;
	for (var i = 0; i < arr.length; i++) {
		for (var j = 0; j < arr[i].length; j++) {
			if (arr[i][j] > num) {
				num = arr[i][j];
			}
		}
		newArr.push(num);
		num = 0;
	}
	// console.log(newArr);
	return newArr;
}

largestOfFour([
	[13, 27, 18, 26],
	[4, 5, 1, 3],
	[32, 35, 37, 39],
	[1000, 1001, 857, 1]
]);


// ---------------------------------------------------------------------
// Check if a string (first argument, str) ends with the given target string (second argument, target).

// This challenge can be solved with the .endsWith() method, which was introduced in ES2015.
// But for the purpose of this challenge, we would like you to use one of the JavaScript substring methods instead.

function confirmEnding(str, target) {
	var targetSize = target.length;
	var strSize = str.length;
	if (str.substring(strSize - targetSize) == target) {
		// console.log("True");
		return true;
	}
	// console.log("False");
	return false;
}
confirmEnding("He has to give me a new name", "name");

// --------------------------------------------------------------------
// Repeat a given string (first argument) num times (second argument). 
// Return an empty string if num is not a positive number.

function repeatStringNumTimes(str, num) {
	// repeat after me
	var newStr = "";
	while (num > 0) {
		newStr += str;
		num--;
	}
	// console.log(newStr);
	return newStr;
}
repeatStringNumTimes("abc", -2);

// ------------------------------------------------------------------
// Truncate a string (first argument) if it is longer than the given maximum string length (second argument).
// Return the truncated string with a ... ending.

// Note that inserting the three dots to the end will add to the string length.

// However, if the given maximum string length num is less than or equal to 3, then the addition of the three dots does not add to the string length in determining the truncated string.

function truncateString(str, num) {
	// Clear out that junk in your trunk
	var trunc = "...";
	if (num >= str.length) {
		// console.log(str);
		return str;
	} else if (num >= 3) {
		// console.log(str.slice(0, num - 3) + trunc);
		return str.slice(0, num - 3) + trunc;
	}
	// console.log(str.slice(0, num) + trunc);
	return str.slice(0, num) + trunc;
}
truncateString("A-tisket a-tasket A green and yellow basket", "A-tisket a-tasket A green and yellow basket".length);

// --------------------------------------------------------------------

// Write a function that splits an array (first argument) into groups the length of size (second argument) and returns them as a two-dimensional array.

function chunkArrayInGroups(arr, size) {
	// Break it up.
	var times = arr.length / size;
	var newArr = [];
	var pos = size;
	for (var i = 0; i < times; i++) {
		newArr.push(arr.slice(pos - size, pos));
		pos += size;
	}
	// console.log(newArr);
	return newArr;
}
chunkArrayInGroups([0, 1, 2, 3, 4, 5], 2); // should return [[0, 1], [2, 3], [4, 5]]

// ------------------------------------------------------------------------

// Return the remaining elements of an array after chopping off n elements from the head.

// The head means the beginning of the array, or the zeroth index.

function slasher(arr, howMany) {
	// it doesn't always pay to be first
	arr.splice(0, howMany);
	// console.log(arr);
	return arr;
}
slasher([1, 2, 3], 2);

// --------------------------------------------------------------------------


// Return true if the string in the first element of the array contains all of the letters of the string in the second element of the array.

// For example, ["hello", "Hello"], should return true because all of the letters in the second string are present in the first, ignoring case.

// The arguments ["hello", "hey"] should return false because the string "hello" does not contain a "y".

// Lastly, ["Alien", "line"], should return true because all of the letters in "line" are present in "Alien".

function mutation(arr) {
	var arr2 = arr.map(function (e) {
		return e.toLowerCase();
	});
	// console.log(arr2);
	for (var i = 0; i < arr2[1].length; i++) {
		if (arr2[0].indexOf(arr2[1][i]) == -1) {
			// console.log("False");
			return false;
		}
	}
	// console.log("True");
	return true;
}
mutation(["hello", "Hello"]);

// --------------------------------------------------------------------------

// Remove all falsy values from an array.

// Falsy values in JavaScript are false, null, 0, "", undefined, and NaN.

function bouncer(arr) {
	// Don't show a false ID to this bouncer.
	// console.log(typeof(null));
	var arr2 = arr.filter(function (e) {
		return e !== "false" && e !== undefined && e !== 0 && e !== null; // NAO RESOLVIDO
	});
	// console.log(arr2);
	return arr2;
}

bouncer([false, null, 0, NaN, undefined, "", "dede"]);



// -------------------------------------------------------------------------


// You will be provided with an initial array (the first argument in the destroyer function), followed by one or more arguments.
//  Remove all elements from the initial array that are of the same value as these arguments.


function destroyer(arr) {
	// Remove all the values
	var remove = [];
	for (var i = 1; i < arguments.length; i++) {
		remove.push(arguments[i]);
	}
	var newArr = arr.filter(function (e) {
		return remove.indexOf(e) < 0;
	});
	// console.log(newArr);
	return newArr;
}

destroyer([1, 2, 3, 1, 2, 3], 2, 3);

// ----------------------------------------------------------------------------


// Return the lowest index at which a value (second argument) should be inserted into an array (first argument) once it has been sorted. The returned value should be a number.

// For example, getIndexToIns([1,2,3,4], 1.5) should return 1 because it is greater than 1 (index 0), but less than 2 (index 1).

// Likewise, getIndexToIns([20,3,5], 19) should return 2 because once the array has been sorted it will look like [3,5,20] and 19 is less than 20 (index 2) and greater than 5 (index 1).


function getIndexToIns(arr, num) {
	// Find my place in this sorted array.

	arr.push(num);
	arr.sort(function (a, b) {
		return a - b;
	});
	// console.log(arr);
	// console.log(arr.indexOf(num));
	return arr.indexOf(num);
}

getIndexToIns([3, 10, 5], 3);

// -----------------------------------------------------------------------------

// One of the simplest and most widely known ciphers is a Caesar cipher, also known as a shift cipher. In a shift cipher the meanings of the letters are shifted by some set amount.

// A common modern use is the ROT13 cipher, where the values of the letters are shifted by 13 places. Thus 'A' ↔ 'N', 'B' ↔ 'O' and so on.

// Write a function which takes a ROT13 encoded string as input and returns a decoded string.

// All letters will be uppercase. Do not transform any non-alphabetic character (i.e. spaces, punctuation), but do pass them on.

function rot13(str) { // LBH QVQ VG!
	// code >= 65 && <= 90
	// console.log(str.charCodeAt(1) );
	// console.log(String.fromCharCode());
	var newStr = "";
	var letter;
	for (var i = 0; i < str.length; i++) {
		var currentChar = str.charCodeAt(i);
		if (str[i].match(/\w/g)) {
			if ((currentChar - 13) < 65) {
				letter = String.fromCharCode(((currentChar - 13) - 65) + 90 + 1);
				newStr += letter;
			} else if ((currentChar - 13) >= 65) {
				letter = String.fromCharCode(currentChar - 13);
				newStr += letter;
			}
		} else {
			newStr += str[i];
		}
		console.log(newStr);
	}
	return newStr;
}

// Change the inputs below to test
rot13("SERR PBQR PNZC");

// ------------------------------------------------------------------------------

