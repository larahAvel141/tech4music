Questões 1 e 2 da Avaliação:

########################################################################################
Please enter a MongoDB connection string (Default: mongodb://localhost/):

Current Mongosh Log ID: 622a1b4daa0c009be57b3fa2
Connecting to:          mongodb://127.0.0.1:27017/?directConnection=true&serverSelectionTimeoutMS=2000&appName=mongosh+1.1.9
Using MongoDB:          5.0.6
Using Mongosh:          1.1.9

For mongosh info see: https://docs.mongodb.com/mongodb-shell/


   The server generated these startup warnings when booting:
   2022-02-26T13:43:40.543-03:00: Access control is not enabled for the database. Read and write access to data and configuration is unrestricted


test> use tech4musicmongosh

switched to db tech4musicmongosh

tech4musicmongosh> db.musicas.insertOne({"titulo":"Forever", "artista":"Kiss", "album":"Hot in the Shade", "genero":"Rock", "anoLancamento": 1989, "compositor": "Paul Stanley"})

{
  acknowledged: true,
  insertedId: ObjectId("622a1e45714e3840a972cbe7")
}

tech4musicmongosh> db.musicas.insertOne({"titulo":"Algo parecido", "artista":"Skank", "album":"Os três primeiros", "genero":"Pop", "anoLancamento": 2018, "compositor": "Samuel Rosa"})

{
  acknowledged: true,
  insertedId: ObjectId("622a1ed2714e3840a972cbe8")
}

tech4musicmongosh> db.musicas.insertOne({"titulo":"O que me importa", "artista":"Marisa Monte", "album":"Memórias, crônicas e declarações de amor", "genero":"MPB", "anoLancamento": 2000, "compositor": "Jose de Ribamar Cury"})
{
  acknowledged: true,
  insertedId: ObjectId("622a1f68714e3840a972cbe9")
}

tech4musicmongosh> db.musicas.find()
[
  {
    _id: ObjectId("622a1e45714e3840a972cbe7"),
    titulo: 'Forever',
    artista: 'Kiss',
    album: 'Hot in the Shade',
    genero: 'Rock',
    anoLancamento: 1989,
    compositor: 'Paul Stanley'
  },
  
  {
    _id: ObjectId("622a1ed2714e3840a972cbe8"),
    titulo: 'Algo parecido',
    artista: 'Skank',
    album: 'Os três primeiros',
    genero: 'Pop',
    anoLancamento: 2018,
    compositor: 'Samuel Rosa'
  },
  
  {
    _id: ObjectId("622a1f68714e3840a972cbe9"),
    titulo: 'O que me importa',
    artista: 'Marisa Monte',
    album: 'Memórias, crônicas e declarações de amor',
    genero: 'MPB',
    anoLancamento: 2000,
    compositor: 'Jose de Ribamar Cury'
  }
]
tech4musicmongosh>

########################################################################################
