<!DOCTYPE html>
<html lang="en">
<#include "../common/header.ftl">
<body>

<div class="container-fluid">
    <div class="row">

        <div class="col-2" id="nav-left">
        <#--边栏sidebar-->
        <#include "../common/nav.ftl">
        </div>

        <div class="col-10">
        <#--主要内容content-->
            <table class="table table-bordered table-sm table-hover">
                <thead>
                <tr>
                    <th>类目id</th>
                    <th>名字</th>
                    <th>type</th>
                    <th>创建时间</th>
                    <th>修改时间</th>
                    <th>操作</th>
                </tr>
                </thead>
                <tbody>
                <#list categoryList as category>
                <tr>
                    <td>${category.categoryId}</td>
                    <td>${category.categoryName}</td>
                    <td>${category.categoryType}</td>
                    <td>${category.createTime}</td>
                    <td>${category.updateTime}</td>
                    <td>
                        <a href="/sell/seller/category/index?categoryId=${category.categoryId}">修改</a>
                    </td>
                </tr>
                </#list>

                </tbody>
            </table>

        </div>


    </div>
</div>


</body>
</html>