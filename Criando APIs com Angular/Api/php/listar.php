<?php

    //Incluir a conexao
    include("conexao.php");

    //SQL
    $sql = "SELECT * FROM cursos";

    //Executar
    $executar = mysqli_query($conexao, $sql);


    //Vetor
    $cursos = [];

    //Índice
    $indice = 0;

    //Laço
    while($linha = mysqli_fetch_assoc($executar)){
        $cursos[$indice]["idCurso"] = $linha['idCurso'];
        $cursos[$indice]["nomeCurso"] = $linha['nomeCurso'];
        $cursos[$indice]["valorCurso"] = $linha['valorCurso'];

        $indice++;
    }

    //JSON
    json_encode(['cursos =>$cursos']);

?>