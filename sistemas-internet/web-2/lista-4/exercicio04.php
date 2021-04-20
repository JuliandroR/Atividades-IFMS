<?php

    echo "<h3> Anos não bissexto </h3>";
    for($i = 1; $i <= 2020; $i++){
        if($i % 4 === 0){
            continue;
        }else{
            echo "<span> $i </span>";

            if( $i % 10 === 0){
                echo "<br />";
            }

            if($i !== 2019 && $i % 10 !== 0){
                echo "<span> - </span>";
            }
        }
    };

?>