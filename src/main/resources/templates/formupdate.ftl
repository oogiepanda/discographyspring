<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <title>Example</title>
        <link href="/css/main.css" rel="stylesheet">
    </head>
    <body>
        <h2>SongList</h2>
    <#if songlist?? >
        Your updated data<br>
        Id: ${songlist.id}<br>
        Song Name: ${songlist.songname}<br>
        Musician: ${songlist.musician}<br>
        Year: ${songlist.year}<br>
        Album: ${songlist.album}<br>
        Genre: ${songlist.genre}<br>
        <#else>
            <form action="/form" method="post">
                Id: <br>
                <input type="number" name="id" min="1"><br>
                Song Name: <br>
                <input type="text" name="songname" maxlength="50"><br>
                Musician: <br>
                <input type="text" name="musician" maxlength="50"><br>
                Year: <br>
                <input type="number" name="year" min="1"><br>
                Album: <br>
                <input type="text" name="album" maxlength="50"><br>
                Genre<br>
                <input type="text" name="genre" maxlength="15"><br>
                <input type="submit" value="Update Entry">
                <input type="reset" value="Clear Values">
            </form>
    </#if>
    <script src="/js/main.js"></script>
    </body>
</html>