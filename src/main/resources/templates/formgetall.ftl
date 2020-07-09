<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <title>Example</title>
        <link href="/css/main.css" rel="stylesheet">
    </head>
    <body>
        <h2>SongList: Get</h2>
        <#list songlists as songlistentities>
            Id: ${songlistentities.getId()}<br>
            Song Name: ${songlistentities.getSongname()}<br>
            Musician: ${songlistentities.getMusician()}<br>
            Year: ${songlistentities.getYear()}<br>
            Album: ${songlistentities.getAlbum()}<br>
            Genre: ${songlistentities.getGenre()}<br><br>
        </#list>
    <script src="/js/main.js"></script>
    </body>
</html>