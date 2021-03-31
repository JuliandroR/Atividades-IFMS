<!DOCTYPE html>
<html lang="pt">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6" crossorigin="anonymous">
    <link rel="stylesheet" href="./css/index.css">
    <title>Lista 02</title>
</head>

<body>
    <div class="container">
        <div class="row">
        <div class="col-sm-5">
            <h1 class="fs-1 fw-bold">Adicionar nova tarefa</h1>
            <form class="row g-3">
                <div class="col-md-4">
                    <label for="deliveryDate" class="form-label">Data de Entrega</label>
                    <input type="date" class="form-control" id="deliveryDate">
                </div>
                <div class="col-md-8">
                    <label for="discipline" class="form-label">Selecione a Disciplina</label>
                    <select id="discipline" class="form-select">
                        <option selected>Escolha um disciplina...</option>
                        <option>Sistemas Web</option>
                        <option>Redes de Computadores</option>
                        <option>Desenvolvimento Web</option>
                        <option>Linguagem de Programação</option>
                    </select>
                </div>
                <div class="col-12">
                    <label for="homework" class="form-label">Digite a tarefa</label>
                    <input type="text" class="form-control" id="homework" placeholder="Lista de exercícios 1234">
                </div>
                <div class="col-md-12">
                    <label for="urlHomework" class="form-label">Link da atividade</label>
                    <input type="text" class="form-control" id="urlHomework" placeholder="https://google.com.br">
                </div>
                <div class="col-12">
                    <label class="form-label">Selecione a dificuldade</label>
                    <div class="form-check">
                        <input class="form-check-input" type="radio" id="baixa" value="baixa" name="difficulty">
                        <label class="form-check-label" for="baixa">
                            Baixa
                        </label>
                    </div>
                    <div class="form-check">
                        <input class="form-check-input" type="radio" id="media" value="media" name="difficulty">
                        <label class="form-check-label" for="media">
                            Média
                        </label>
                    </div>
                    <div class="form-check">
                        <input class="form-check-input" type="radio" id="alta" value="alta" name="difficulty">
                        <label class="form-check-label" for="alta">
                            Alta
                        </label>
                    </div>
                </div>
                <div class="col-12">
                    <button type="submit" class="btn btn-primary">Adicionar tarefa</button>
                </div>
            </form>
        </div>
        <div class="col-sm-7">
            <table class="table table-striped">
                <thead>
                    <tr>
                        <th scope="col">Data de Entrega</th>
                        <th scope="col">Tarefa</th>
                        <th scope="col">Disciplina</th>
                        <th scope="col">Dificuldade</th>
                        <th scope="col">Link</th>
                    </tr>
                </thead>
                <tbody id="tarefas">
                    <!-- <tr>
                        <th scope="row">1</th>
                        <td>Mark</td>
                        <td>Otto</td>
                        <td>@mdo</td>
                    </tr> -->
                </tbody>
            </table>
        </div>
    </div>
    </div>
</body>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/js/bootstrap.bundle.min.js"
    integrity="sha384-JEW9xMcG8R+pH31jmWH6WWP0WintQrMb4s7ZOdauHnUtxwoG2vI5DkLtS3qm9Ekf" crossorigin="anonymous">
</script>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.1/dist/umd/popper.min.js"
    integrity="sha384-SR1sx49pcuLnqZUnnPwx6FCym0wLsk5JZuNx2bPPENzswTNFaQU1RDvt3wT4gWFG" crossorigin="anonymous">
</script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/js/bootstrap.min.js"
    integrity="sha384-j0CNLUeiqtyaRmlzUHCPZ+Gy5fQu0dQ6eZ/xAww941Ai1SxSY+0EQqNXNE6DZiVc" crossorigin="anonymous">
</script>

<script src="./js/index.js"></script>

</html>