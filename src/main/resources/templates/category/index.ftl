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
            <form method="post" action="/sell/seller/category/save">
                <div class="form-group">
                    <label>名字:</label>
                    <input type="text" class="form-control" name="categoryName" value="${(productCategory.categoryName)!''}">
                </div>
                <div class="form-group">
                    <label>type:</label>
                    <input type="number" class="form-control" name="categoryType" value="${(productCategory.categoryType)!''}">
                </div>
                <input hidden type="text" name="categoryId" value="${(productCategory.categoryId)!''}">
                <button type="submit" class="btn btn-primary">提交</button>
            </form>

        </div>


    </div>
</div>


</body>
</html>