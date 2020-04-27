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
                    <th>订单id</th>
                    <th>姓名</th>
                    <th>手机号</th>
                    <th>地址</th>
                    <th>金额</th>
                    <th>订单状态</th>
                    <th>支付状态</th>
                    <th>创建时间</th>
                    <th colspan="2">操作</th>
                </tr>
                </thead>
                <tbody>
                <#list orderDTOPage.content as orderDTO>
                <tr>
                    <td>${orderDTO.orderId}</td>
                    <td>${orderDTO.buyerName}</td>
                    <td>${orderDTO.buyerPhone}</td>
                    <td>${orderDTO.buyerAddress}</td>
                    <td>${orderDTO.orderAmount}</td>
                    <td>${orderDTO.getOrderStatusEnum().getMsg()}</td>
                    <td>${orderDTO.getPayStatusEnum().getMsg()}</td>
                    <td>${orderDTO.createTime}</td>
                    <td>
                        <a href="/sell/seller/order/detail?orderId=${orderDTO.orderId}">详情</a>
                    </td>

                    <td>
                        <#if orderDTO.getOrderStatusEnum().msg == "新订单">
                            <a href="/sell/seller/order/cancel?orderId=${orderDTO.orderId}">取消</a>
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
                                                 href="/sell/seller/order/list?page=${currentPage - 1}&size=${size}">上一页</a>
                        </li>
                    </#if>

                <#--<#list 1..orderDTOPage.getTotalPages() as index>-->

                <#--<li class="page-item"><a class="page-link"  href="/sell/seller/order/list?page=1&size=${size}">1</a></li>-->
                <#--<li class="page-item disabled"><a class="page-link"  href="#">...</a></li>-->
                <#--<li class="page-item disabled"><a class="page-link"  href="#">${currentPage}</a></li>-->
                <#--<li class="page-item disabled"><a class="page-link"  href="#">...</a></li>-->
                <#--<li class="page-item"><a class="page-link"  href="/sell/seller/order/list?page=${orderDTOPage.getTotalPages()}&size=${size}">${orderDTOPage.getTotalPages()}</a></li>-->

                <#--</#list>-->

                <#--页码-->
                    <#list 1..orderDTOPage.getTotalPages() as index>

                        <#if currentPage == index>
                            <li class="page-item disabled"><a class="page-link" href="#">${index}</a></li>
                        <#else>
                            <li class="page-item"><a class="page-link"
                                                     href="/sell/seller/order/list?page=${index}&size=${size}">${index}</a>
                            </li>
                        </#if>
                    </#list>



                <#--下一页-->
                    <#if currentPage gte orderDTOPage.getTotalPages()>
                        <li class="page-item disabled"><a class="page-link" href="#">下一页</a></li>
                    <#else>
                        <li class="page-item"><a class="page-link"
                                                 href="/sell/seller/order/list?page=${currentPage + 1}&size=${size}">下一页</a>
                        </li>
                    </#if>

                </ul>
            </div>
        </div>


    </div>
</div>

    <!-- 模态框 -->
    <div class="modal fade" id="myModal">
        <div class="modal-dialog">
            <div class="modal-content">

                <!-- 模态框头部 -->
                <div class="modal-header">
                    <h4 class="modal-title">提醒</h4>
                    <button type="button" class="close" data-dismiss="modal">&times;</button>
                </div>

                <!-- 模态框主体 -->
                <div class="modal-body">
                    你有新的订单
                </div>

                <!-- 模态框底部 -->
                <div class="modal-footer">
                    <button onclick="javascript:document.getElementById('notice').pause();" type="button" class="btn btn-secondary" data-dismiss="modal">关闭</button>
                    <button onclick="location.reload()" type="button" class="btn btn-primary">查看新的订单</button>
                </div>

            </div>
        </div>
    </div>

<#--播放音乐-->
<audio id="notice" loop="loop">
    <source src="/sell/mp3/song.mp3" type="audio/mpeg" />
</audio>



<script>
    var websocket = null;
    if ('WebSocket' in window) {
        websocket = new WebSocket('ws://192.168.0.110:8080/sell/webSocket');
    } else {
        alert("该浏览器不支持WebSocket!");
    }
    websocket.onopen=function (ev) {
        console.log("建立连接");
    }

    websocket.onclose = function (ev) {
        console.log("关闭连接");
    }

    websocket.onmessage = function (ev) {
        console.log("收到消息: " + ev.data);
        //弹窗提醒,播放音乐
        $('#myModal').modal('show');

        document.getElementById('notice').play();
    }

    websocket.onerror = function (ev) {
        alert("websocket通讯发生错误!");
    }

    window.onbeforeunload = function (ev) {
        websocket.close();
    }



</script>


</body>
</html>