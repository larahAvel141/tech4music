<h3><i>Questão 1:</h3> use tech4musicmongosh


<h3><i>Questão 2:</h3>

tech4musicmongosh> **db.musicas.insertOne**({"titulo":"Forever", "artista":"Kiss", "album":"Hot in the Shade", "genero":"Rock", "anoLancamento": 1989, "compositor": "Paul Stanley"})<br />

{
  acknowledged: true,
  insertedId: ObjectId("622a1e45714e3840a972cbe7")
}<br />

tech4musicmongosh> **db.musicas.insertOne**({"titulo":"Algo parecido", "artista":"Skank", "album":"Os três primeiros", "genero":"Pop", "anoLancamento": 2018, "compositor": "Samuel Rosa"})<br />

{
  acknowledged: true,
  insertedId: ObjectId("622a1ed2714e3840a972cbe8")
}<br />

tech4musicmongosh> **db.musicas.insertOne**({"titulo":"O que me importa", "artista":"Marisa Monte", "album":"Memórias, crônicas e declarações de amor", "genero":"MPB", "anoLancamento": 2000, "compositor": "Jose de Ribamar Cury"})<br />

{
  acknowledged: true,
  insertedId: ObjectId("622a1f68714e3840a972cbe9")
}<br />

tech4musicmongosh> **db.musicas.find()**<br />
[<br />
  {<br />
    _id: ObjectId("622a1e45714e3840a972cbe7"),<br />
    titulo: 'Forever',<br />
    artista: 'Kiss',<br />
    album: 'Hot in the Shade',<br />
    genero: 'Rock',<br />
    anoLancamento: 1989,<br />
    compositor: 'Paul Stanley'<br />
  },<br />
  
  {<br />
    _id: ObjectId("622a1ed2714e3840a972cbe8"),<br />
    titulo: 'Algo parecido',<br />
    artista: 'Skank',<br />
    album: 'Os três primeiros',<br />
    genero: 'Pop',<br />
    anoLancamento: 2018,<br />
    compositor: 'Samuel Rosa'<br />
  },<br />
  
  {<br />
    _id: ObjectId("622a1f68714e3840a972cbe9"),<br />
    titulo: 'O que me importa',<br />
    artista: 'Marisa Monte',<br />
    album: 'Memórias, crônicas e declarações de amor',<br />
    genero: 'MPB',<br />
    anoLancamento: 2000,<br />
    compositor: 'Jose de Ribamar Cury'<br />
  }<br />
]<br />



