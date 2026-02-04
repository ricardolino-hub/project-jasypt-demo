<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Jasypt Dual Secret Demo</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="container mt-5">
    <div class="card shadow border-primary">
        <div class="card-header bg-primary text-white"><h3>Jasypt Secret Distribution</h3></div>
        <div class="card-body">
            <p><strong>Secret A (from Docker-compose):</strong>${dbStatus}</p>
            <p><strong>Secret B (from Dockerfile):</strong> Decrypted Internal Key: <span class="badge bg-success">${internalKey}</span></p>
        </div>
    </div>
</body>
</html>