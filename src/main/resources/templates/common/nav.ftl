<!--Logo-->
<div class="container bg-dark">
    <nav class="navbar navbar-default bg-dark navbar-dark" role="navigation">
        <div class="navbar-header">
            <a class="center-block navbar-brand" href="#">卖家管理系统</a>
        </div>
    </nav>
    <br>
    <nav class="navbar navbar-default bg-dark navbar-dark" role="navigation">

        <div class="panel-group" id="accordion">
            <ul class="nav navbar-nav navbar-right">
                <li>
                    <h4 class="panel-title">
                        <a href="/sell/seller/order/list">
                            订单
                        </a>
                    </h4>


                </li>
                <li>
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            <h4 class="panel-title">
                                <a data-toggle="collapse" data-parent="#accordion"
                                   href="#collapseTwo">
                                    商品
                                </a>
                            </h4>
                        </div>
                        <div id="collapseTwo" class="panel-collapse collapse">
                            <div class="panel-body">
                                <a href="/sell/seller/product/list">列表</a><br>
                                <a href="/sell/seller/product/index">新增</a>
                            </div>
                        </div>
                    </div>
                </li>
                <li>
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            <h4 class="panel-title">
                                <a data-toggle="collapse" data-parent="#accordion"
                                   href="#collapseThree">
                                    类目
                                </a>
                            </h4>
                        </div>
                        <div id="collapseThree" class="panel-collapse collapse">
                            <div class="panel-body">
                                <a href="/sell/seller/category/list">列表</a><br>
                                <a href="/sell/seller/category/index">新增</a>
                            </div>
                        </div>
                    </div>
                </li>
                <li>
                    <a class="nav-link" href="/sell/seller/logout">登出</a>
                </li>
            </ul>
        </div>

    </nav>

</div>
