<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>成功提示</title>
    <link href="https://cdn.bootcss.com/twitter-bootstrap/4.3.1/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>

<div class="container-fluid">
    <div class="row-fluid">
        <div class="col-md-12 column">
            <div class="alert alert-success alert-dismissible">
                <button type="button" class="close" data-dismiss="alert">&times;</button>
                <h4>
                    成功!
                </h4> <strong>${msg!""}</strong><a href="${url}" class="alert-link">3秒后自动跳转</a>
            </div>
        </div>
    </div>
</div>

<script>
    setTimeout("location.href='${url}'",3000);
</script>

</body>
</html>