create table usuarios (
    id_usuario int primary key auto_increment,
    nombre varchar(50) not null,
    password_usuario varchar(50) not null 
);

create table proveedores (
    id_proveedor int primary key auto_increment,
    nombre varchar(50) not null,
    telefono varchar(50),
    direccion varchar(50),
    email varchar(50),
    sitio_web varchar(50),
    estado int not null
);
