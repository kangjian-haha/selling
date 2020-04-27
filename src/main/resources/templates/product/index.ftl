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
            <form method="post" action="/sell/seller/product/save">
                <div class="form-group">
                    <label>名称:</label>
                    <input type="text" class="form-control" name="productName" value="${(productInfo.productName)!''}">
                </div>
                <div class="form-group">
                    <label>价格:</label>
                    <input type="text" class="form-control" name="productPrice"
                           value="${(productInfo.productPrice)!''}">
                </div>
                <div class="form-group">
                    <label>库存:</label>
                    <input type="number" class="form-control" name="productStock"
                           value="${(productInfo.productStock)!''}">
                </div>
                <div class="form-group">
                    <label>描述:</label>
                    <input type="text" class="form-control" name="productDescription"
                           value="${(productInfo.productDescription)!''}">
                </div>
                <div class="form-group">
                    <label>图片:</label>
                    <img src="${(productInfo.productIcon)!''}" alt="">
                    <input type="text" class="form-control" name="productIcon" value="${(productInfo.productIcon)!''}">
                </div>
                <div class="form-group">
                    <label>类目:</label>
                    <select name="categoryType" class="form-control">
                        <#list categoryList as category>
                            <option value="${category.categoryType}"
                                <#if (productInfo.categoryType)?? && productInfo.categoryType == category.categoryType>
                                    selected
                                </#if>
                            >
                                ${category.categoryName}
                            </option>
                        </#list>
                    </select>
                </div>
                <input hidden type="text" name="productId" value="${(productInfo.productId)!''}">
                <button type="submit" class="btn btn-primary">提交</button>
            </form>


        </div>


    </div>
</div>


</body>
</html>