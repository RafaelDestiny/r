create table endereco(

    id bigint not null auto_increment,

    estado varchar(100)  not null,
    cidade varchar(100) not null,
    bairro varchar(100)not null,
    rua varchar(100) not null,
    numero varchar(100)  not null,
    cep varchar(100) not null,
    complemento varchar(100) not null,
    usuario_Id bigint not null,

    FOREIGN KEY (usuario_Id) REFERENCES usuario (id) ,

    primary key(id)






);