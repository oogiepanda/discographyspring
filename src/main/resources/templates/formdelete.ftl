<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <title>Example</title>
        <link href="/css/main.css" rel="stylesheet">
    </head>
    <body>
        <h2>SongList: Delete</h2>
    <#if songlist?? >
        Data Deleted<br>
        <#else>
            <form action="/formdelete" method="post">
                Id: <br>
                <input type="text" name="id" maxlength="50"><br>
                <input type="submit" value="Delete Entry">
            </form>
    </#if>
    <script src="/js/main.js"></script>
    </body>
</html>