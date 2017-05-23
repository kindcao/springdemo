<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml"
>
<head>
    <title>Hello World!</title>
</head>
<style type="text/css">
    table.imagetable {
        font-family: verdana, arial, sans-serif;
        font-size: 11px;
        color: #333333;
        border-width: 1px;
        border-color: #999999;
        border-collapse: collapse;
    }

    table.imagetable th {
        background: #b5cfd2 url('cell-blue.jpg');
        border-width: 1px;
        padding: 8px;
        border-style: solid;
        border-color: #999999;
    }

    table.imagetable td {
        background: #dcddc0 url('cell-grey.jpg');
        border-width: 1px;
        padding: 8px;
        border-style: solid;
        border-color: #999999;
    }
</style>
<body>
<#include "./header.ftl" >

<p>
    welcome ${name} to freemarker!
</p>

<h4>列表数据：</h4>
<table class="imagetable" width="50%">
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>state</th>
        <th>country</th>
    </tr>
<#list cityList as item>
    <tr>
        <td>${item.id}</td>
        <td>${item.name}</td>
        <td>${item.state}</td>
        <td>${item.country}</td>
    </tr>
</#list>
</table>

<#include "./footer.ftl" >
</body>
</html>