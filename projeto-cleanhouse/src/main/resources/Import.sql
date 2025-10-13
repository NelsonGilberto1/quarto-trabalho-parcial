#Clientes

INSERT INTO Cliente (id,cpf,email,endereco,nome,telefone) VALUES ('01', '123.456.789-10', 'Antonio@email.com', 'Rua Tatu Bola numero 08', 'Antonio da Silva', '14 98203787');
INSERT INTO Cliente (cpf,email,endereco,nome,telefone) VALUES ('23.456.7891-10', 'Bob@email.com', 'Rua Tamandua bandeira numero 02', 'Bob Luiz', '14 20938023');
INSERT INTO Cliente (cpf,email,endereco,nome,telefone) VALUES ('3.456.78912-10', 'Carlinhos@email.com', 'Rua Macaco Prego 06', 'Carlinhos Cavalo', '14 293823329');
INSERT INTO Cliente (cpf,email,endereco,nome,telefone) VALUES ('456.789.123-10', 'Daniel@email.com', 'Rua Onça pintada 07', 'Daniel Ficada', '14 392820938');
INSERT INTO Cliente (cpf,email,endereco,nome,telefone) VALUES ('567.891.234-10', 'Enock@email.com', 'Rua Mico leão dorado 28', 'Enock Pereira', '14 29832802');

#Empregada

INSERT INTO Empregada (dataCadastro, dataNascimento, id, status, descricao, email, endereco, nome, telefone) VALUES ('2025-09-01 10:00:00', '1999-02-05','001', true, 'Empregada domestica especialisada em trabalhos pesados', 'AnaLuiza@gmail.com', 'Rua Anaconda numero 99', 'Ana Luiza', '273926273');
INSERT INTO Empregada (dataCadastro, dataNascimento,status, descricao, email, endereco, nome, telefone) VALUES ('2025-08-21 10:00:00', '1988-12-25',false, 'Empregada especialisada em polimento', 'BiancaGames@gmail.com', 'Rua Besouro numero 02', 'Bianca Almeida', '328322038');
INSERT INTO Empregada (dataCadastro, dataNascimento,status, descricao, email, endereco, nome, telefone) VALUES ('2025-03-22 10:00:00', '1998-08-29',true, 'jardineira proficional', 'CleideSilva@gmail.com', 'Rua Canguru numero 102', 'Cleide da Silva', '202303289');
INSERT INTO Empregada (dataCadastro, dataNascimento,status, descricao, email, endereco, nome, telefone) VALUES ('2025-05-30 10:00:00', '1997-02-19',false, 'Cozinheira de restaurante', 'DaniFicada@gmail.com', 'Rua Doninha numero 72', 'Dani Ficada', '232092382');
INSERT INTO Empregada (dataCadastro, dataNascimento,status, descricao, email, endereco, nome, telefone) VALUES ('2025-07-01 10:00:00', '1999-01-28',false, 'Empregada domestica especialisada em trabalhos pesados', 'EloisaMosk@gmail.com', 'Rua Elefante numero 23', 'Eloisa Souza', '9238i2038');


#Avaliacao
INSERT INTO Avaliacao (dataAvaliacao, id, nota, comentarios) VALUES ('2025-07-01 10:00:00','10','8','Muito boa é educada ');
INSERT INTO Avaliacao (dataAvaliacao,nota, comentarios) VALUES ('2025-08-12 12:30:00','2','Muito boa é educada ');
INSERT INTO Avaliacao (dataAvaliacao,nota, comentarios) VALUES ('2025-06-21 10:37:00','7','muito aceitavel ');
INSERT INTO Avaliacao (dataAvaliacao,nota, comentarios) VALUES ('2025-02-17 10:43:00','10','exelente muito proficional ');
INSERT INTO Avaliacao (dataAvaliacao,nota, comentarios) VALUES ('2025-01-27 09:52:00','3','Chegou muito atrazada ');

#Mensagem

INSERT INTO Mensagem (dataMensagem,id,status,mensagem) VALUES ('2025-08-12 12:30:00','100',true,'Você consegue vir em casa hoje?');
INSERT INTO Mensagem (dataMensagem,status,mensagem) VALUES ('2025-09-13 13:20:00',false,'Como funciona o pagamento?');
INSERT INTO Mensagem (dataMensagem,status,mensagem) VALUES ('2025-07-11 14:22:00',true,'exelente trabalho!');
INSERT INTO Mensagem (dataMensagem,status,mensagem) VALUES ('2025-02-06 16:45:00',false,'Um otimo app');
INSERT INTO Mensagem (dataMensagem,status,mensagem) VALUES ('2025-01-22 09:21:00',true,'Você consegue vir em casa hoje?');

#Trabalho
INSERT INTO Trabalho (dataInicio, dataServico, horas,id,valor) VALUES ('2025-01-22 09:21:00','2025-01-22 16:10:00','7',1000,'120');
INSERT INTO Trabalho (dataInicio, dataServico, horas,valor) VALUES ('2025-02-12 08:22:00','2025-02-12 15:11:00','7','160');
INSERT INTO Trabalho (dataInicio, dataServico, horas,valor) VALUES ('2025-03-15 09:23:00','2025-03-15 16:12:00','7','180');
INSERT INTO Trabalho (dataInicio, dataServico, horas,valor) VALUES ('2025-04-16 10:24:00','2025-04-16 17:13:00','7','150');
INSERT INTO Trabalho (dataInicio, dataServico, horas,valor) VALUES ('2025-05-17 11:25:00','2025-05-17 18:14:00','7','110');

#Pagamento
INSERT INTO Pagamento (data,id,valor,comprovante,metodo) VALUES ('2025-01-22 09:21:00','10000','120','239209370327','Cartão');
INSERT INTO Pagamento (data,valor,comprovante,metodo) VALUES ('2025-02-14 08:22:00','160','2037320323202','Pix');
INSERT INTO Pagamento (data,valor,comprovante,metodo) VALUES ('2025-03-14 09:23:00','180','208303283280','Cartão');
INSERT INTO Pagamento (data,valor,comprovante,metodo) VALUES ('2025-04-15 10:24:00','150','23892327823023','Pix');
INSERT INTO Pagamento (data,valor,comprovante,metodo) VALUES ('2025-05-16 11:25:00','110','23032723702320','Cartão');
