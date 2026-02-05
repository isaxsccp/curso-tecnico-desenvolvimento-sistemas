//import
import express from 'express'
import path from 'path'

//iniciar express
const app = express()

app.use(express.static("public"));
app.use(express.static("node_modules"));


//primeira rota
app.get('/', function (req, res) {
    res.send('Hello World')
})

//segunda rota
app.get('/html', function (req, res) {
    let end = path.resolve("./view/index.html")
    res.sendFile(end)
})

app.listen(3000, () => { console.log("rodando na porta 3000") })
