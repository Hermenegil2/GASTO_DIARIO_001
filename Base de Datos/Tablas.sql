CREATE TABLE compra (
  id serial primary key NOT NULL,
  idproducto integer references producto(id) not null,
  cantidad integer not null,
  precio integer not null,
  tipo character varying(20),
  fecha timestamp without time zone DEFAULT now()
  
);

CREATE TABLE ingreso
(
  id serial primary key NOT NULL,
  monto integer NOT NULL,
  fecha date DEFAULT now()

);

CREATE TABLE producto
(
  id serial primary key NOT NULL,
  descripcion character varying(90) NOT NULL,
  fecha date default now()
);