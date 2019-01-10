<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Freemarker体验</title>
</head>
<body>
<div>
    <h1>插值 获取数据</h1>
    <p>数字：${num1}</p>
    <p>字符串：${str1}</p>
    <p>对象：${work.name+"---"+work.city}</p>
    <h1>指令的应用</h1>
    <p>
    <h3>循环指令 list</h3>
    <table width="500px" align="center" border="1">
    <tr>
        <th>序号</th>
        <th>姓名</th>
        <th>城市</th>
    </tr>
    <tbody>
    <#list works as w>
        <tr>
            <td align="center">${w.id}</td>
            <td align="center">${w.name}</td>
            <td align="center">${w.city}</td>
        </tr>
    </#list>
    </tbody>
</table>
    </p>

    <p>
    <h3>分支指令 if</h3>
<#--如果user不为null显示-->
    <#if user?? && user!=''>
        <a href="#">我的账号</a>
    </#if>
<#--如果user为null显示-->
    <#if !user?? || user==''>
        <a href="#">登录</a>
    </#if>
    </p>

   <#--<#if user!=null>

   </#if>-->
    <h1>内建函数</h1>
    <p>${str2?lower_case}</p>
    <p>日期：${date1?string["yyyy-MM-dd, HH:mm"]}</p>
</div>
</body>
</html>