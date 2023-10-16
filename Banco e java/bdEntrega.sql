



USE agencia;

CREATE TABLE Destino (
    cepDestino VARCHAR(10) PRIMARY KEY,
    cidadeDestino VARCHAR(50),
    paisDestino VARCHAR(50),
    cnpjAgencia VARCHAR(10),
    FOREIGN KEY (cnpjAgencia) REFERENCES Agencia (cnpjAgencia)
);













