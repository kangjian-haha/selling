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
                    <th>商品id</th>
                    <th>名称</th>
                    <th>图片</th>
                    <th>单价</th>
                    <th>库存</th>
                    <th>描述</th>
                    <th>类目</th>
                    <th>创建时间</th>
                    <th>修改时间</th>
                    <th colspan="2">操作</th>
                </tr>
                </thead>
                <tbody>
                <#list productInfoPage.content as productInfo>
                <tr>
                    <td>${productInfo.productId}</td>
                    <td>${productInfo.productName}</td>
                    <td><img height="100" width="100" src="${productInfo.productIcon}" alt=""></td>
                    <td>${productInfo.productPrice}</td>
                    <td>${productInfo.productStock}</td>
                    <td>${productInfo.productDescription}</td>
                    <td>${productInfo.categoryType}</td>
                    <td>${productInfo.createTime}</td>
                    <td>${productInfo.updateTime}</td>
                    <td>
                        <a href="/sell/seller/product/index?productId=${productInfo.productId}">修改</a>
                    </td>

                    <td>
                        <#if productInfo.getProductStatusEnum().message == "在架">
                            <a href="/sell/seller/product/off_sale?productId=${productInfo.productId}">下架</a>
                        <#else>
                            <a href="/sell/seller/product/on_sale?productId=${productInfo.productId}">上架</a>
                        </#if>

                    </td>
                </tr>
                </#list>

                </tbody>
            </table>
        <#--分页-->
            <div class="col-md-12 column">
                <ul class="pagination">

                <#--上一页-->
                    <#if currentPage lte 1>
                        <li class="page-item disabled"><a class="page-link" href="#">上一页</a></li>
                    <#else>
                        <li class="page-item"><a class="page-link"
                                                 href="/sell/seller/product/list?page=${currentPage - 1}&size=${size}">上一页</a>
                        </li>
                    </#if>

                <#--页码-->
                    <#list 1..productInfoPage.getTotalPages() as index>

                        <#if currentPage == index>
                            <li class="page-item disabled"><a class="page-link" href="#">${index}</a></li>
                        <#else>
                            <li class="page-item"><a class="page-link"
                                                     href="/sell/seller/product/list?page=${index}&size=${size}">${index}</a>
                            </li>
                        </#if>
                    </#list>



                <#--下一页-->
                    <#if currentPage gte productInfoPage.getTotalPages()>
                        <li class="page-item disabled"><a class="page-link" href="#">下一页</a></li>
                    <#else>
                        <li class="page-item"><a class="page-link"
                                                 href="/sell/seller/product/list?page=${currentPage + 1}&size=${size}">下一页</a>
                        </li>
                    </#if>

                </ul>
            </div>
        </div>


    </div>
</div>


</body>
</html>