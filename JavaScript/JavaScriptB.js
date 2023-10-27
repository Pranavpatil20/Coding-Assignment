// Perform sorting of an array in descending order.
const Arr1 = ['a', 'd', 'x', 'p'];
const Arr2 = [78, 23, 90, 12, 55]

function Array_Sort_String(Arr1)
{
    Arr1.sort((a,b)=> (a > b ? - 1 : 1));
    return Arr1;
}

function Array_Sort(Arr2)
{
    Arr2.sort((a,b)=> b - a);
    return Arr2
}

console.log(Array_Sort_String(Arr1));
console.log(Array_Sort(Arr2));