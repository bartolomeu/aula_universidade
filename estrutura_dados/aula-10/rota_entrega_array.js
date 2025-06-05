cid = [
    { "nome": 'São Paulo' },
    { "nome": 'Rio de Janeiro', },
    { "nome": 'Belo Horizonte', },
    { "nome": 'Curitiba', },
    { "nome": 'Brasília', },
    { "nome": 'Salvador', },
]

distancias = [
    [0, 430, 586, 408, 1015, 1960],  // São Paulo
    [430, 0, 434, 852, 1160, 1638],  // Rio de Janeiro
    [586, 434, 0, 995, 716, 1372],  // Belo Horizonte
    [408, 852, 995, 0, 1365, 2210],  // Curitiba
    [1015, 1160, 716, 1365, 0, 1450],  // Brasília
    [1960, 1638, 1372, 2210, 1450, 0]   // Salvador
]
// ||
const allrotas=[]
function calcularRotasPossiveis(cidInicial, rotas=[{ cidId: cidInicial, distancia: 0, nome: cid[cidInicial].nome }]) {
    // console.log('cidInicial', cidInicial);
    // console.log(rotas);

    const numeroMaximoDeCidades = cid.length;
    
    if(rotas.length >= numeroMaximoDeCidades){
        allrotas.push(rotas)
        return
    } 

    distancias.forEach((kms, ind) => {
        if(ind == cidInicial) return; // Ignora o ponto inicial
        if(rotas.every((rota) => rota.cidId != ind)) {
            novaArray = [...rotas];
            novaArray.push({ cidId: ind, distancia: kms[cidInicial], nome: cid[ind].nome });
            calcularRotasPossiveis(ind, novaArray)
        }
    })
}


// arvore ={
//     cidId: 0,
//     subrotas: [
//         { 
//             cidId: 1, 
//             distancia: 430,
//             subrotas: [] 
//         },
//     ]
// }

//calcula(cidInicial, rotas)
//return [[{cidId, distancia}]]



calcularRotasPossiveis(0)
console.log('allrotas', allrotas);

distancias = allrotas.map((rota) => {
    const distanciaTotal = rota.reduce((acc, curr) => acc + curr.distancia, 0);
    return distanciaTotal;
})
const indexMenor = distancias.indexOf(Math.min(...distancias));
console.log('indexMenor', indexMenor);
console.log('menor rota', allrotas[indexMenor]);
console.log('menor rota distancia', distancias[indexMenor]);